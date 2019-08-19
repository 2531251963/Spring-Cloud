package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import app.service.OrderService;

import java.util.HashMap;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午2:07
 * @Version 1.0
 */
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "/addorder",method = RequestMethod.POST)
    public String order(@RequestBody HashMap<String,String> map){
        System.out.println(map);
        return orderService.orderservice(map);
    }
}
