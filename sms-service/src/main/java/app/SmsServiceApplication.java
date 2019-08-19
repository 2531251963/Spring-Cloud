package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SmsServiceApplication
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午3:10
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SmsServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SmsServiceApplication.class).web(true).run(args);
    }
}
