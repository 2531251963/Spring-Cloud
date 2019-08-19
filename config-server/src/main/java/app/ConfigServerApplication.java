package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigServerApplication
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午6:41
 * @Version 1.0
 */

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }

}
