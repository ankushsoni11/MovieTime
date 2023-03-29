import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.movietime.seat"})
@EnableJpaRepositories("com.movietime.seat.repository")
@EntityScan("com.movietime.seat.entity")
public class SeatApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeatApplication.class, args);
    }
}

