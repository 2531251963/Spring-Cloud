package app.service;

import com.alibaba.fastjson.JSON;
import app.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @ClassName GoodsService
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 上午11:48
 * @Version 1.0
 */
@Service
public class GoodsService {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    GoodsDao goodsDao;


    public String getGoodsInfo(){
       return JSON.toJSONString(goodsDao.searchGoodsInfo());
    }

    /**
     * 购买商品(减库存) -> 订单服务(增加订单)-> 短信服务
     */
    public String buyGoods(String id,String phonenumer){
        goodsDao.removeGoods(id);
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("goodsid",id);
        map.put("phonenumber",phonenumer);
        ServiceInstance serviceInstance = loadBalancerClient.choose("order-service");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/addorder";
        System.out.println(url);
        return restTemplate.postForObject(url,map,String.class);
    }
}
