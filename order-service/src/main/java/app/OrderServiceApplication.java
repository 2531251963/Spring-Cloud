package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderServiceApplication
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午2:06
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderServiceApplication {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderServiceApplication.class).web(true).run(args);
    }
}
