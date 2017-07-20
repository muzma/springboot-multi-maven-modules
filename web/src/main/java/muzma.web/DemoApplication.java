package muzma.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by 12032146 on 7/19/2017.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"muzma"})
@EntityScan(basePackages={"muzma"})
@ComponentScan(basePackages = {"muzma"})
public class DemoApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class);
    }
}
