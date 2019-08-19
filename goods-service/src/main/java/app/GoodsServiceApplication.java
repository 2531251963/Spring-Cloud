package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName app.GoodsServiceApplication
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 上午11:48
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GoodsServiceApplication {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(GoodsServiceApplication.class).web(true).run(args);
    }

}
