import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.movietime.theater"})
@EnableJpaRepositories("com.movietime.theater.repository")
@EntityScan("com.movietime.theater.entity")
public class TheaterApplication {
    public static void main(String[] args) {
        SpringApplication.run(TheaterApplication.class, args);
    }
}
