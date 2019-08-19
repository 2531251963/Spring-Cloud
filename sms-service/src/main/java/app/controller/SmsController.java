package app.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SmsController
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午3:10
 * @Version 1.0
 */
@RestController
public class SmsController {

    @RequestMapping(value = "/sendsms",method = RequestMethod.POST)
    public String sendSms(@RequestBody String phonenumber){
        System.out.println("发送短信"+phonenumber);
        return "ok";
    }
}
