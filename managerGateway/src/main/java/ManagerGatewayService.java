import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.movietime.manager"})
@EntityScan("com.movietime.manager.entity")
public class ManagerGatewayService {
    public static void main(String[] args) {
        SpringApplication.run(ManagerGatewayService.class, args);
    }
}
