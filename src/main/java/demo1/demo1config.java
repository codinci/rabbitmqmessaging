package demo1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

public class demo1config {
    @Bean
    public Queue hello() {
        return new Queue("StudentNo:");
    }
}
