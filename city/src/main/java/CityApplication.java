import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.function.Function;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.movietime.cityservice"})
@EnableJpaRepositories("com.movietime.cityservice.repository")
@EntityScan("com.movietime.cityservice.entity")
public class CityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CityApplication.class, args);
    }

}
