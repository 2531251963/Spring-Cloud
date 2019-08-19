package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import app.pojo.RequestObject;
import app.service.GoodsService;

/**
 * @ClassName GoodsController
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 上午11:47
 * @Version 1.0
 */
@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/goodsinfo",method = RequestMethod.GET)
    public String getGoodsInfo(){
        return goodsService.getGoodsInfo();
    }
    @RequestMapping(value = "/buygoods",method = RequestMethod.POST)
    public String getGoodsInfo(@RequestBody RequestObject requestObject){
        System.out.println(requestObject);
        return goodsService.buyGoods(requestObject.getGoodsid(),requestObject.getPhonenumber());
    }

}
