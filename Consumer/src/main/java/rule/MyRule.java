package rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类Configuration这个注解是不能被@ComponetScan扫描到
 * */
@Configuration
public class MyRule {
    @Bean
    public IRule getMyRule(){
        return new MyRandom();
    }
}
