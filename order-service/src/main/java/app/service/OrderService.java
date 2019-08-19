package app.service;

import app.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import app.pojo.Order;

import java.util.HashMap;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午2:08
 * @Version 1.0
 */
@Service
public class OrderService {
    @Autowired
    OrderDao orderDao;
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    public String orderservice(HashMap<String,String> map){
        Order order=new Order();
        order.setId(String.valueOf(System.currentTimeMillis()));
        order.setGoodsid(map.get("goodsid"));
        order.setPhonenumer(map.get("phonenumber"));
        orderDao.putOrder(order);
        ServiceInstance serviceInstance = loadBalancerClient.choose("sms-service");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/sendsms";
        System.out.println(url);
        return restTemplate.postForObject(url,order.getPhonenumer(),String.class);
    }
}
