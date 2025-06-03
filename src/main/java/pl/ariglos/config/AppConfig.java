package pl.ariglos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.ariglos.repository.OrderRepository;
import pl.ariglos.service.OrderService;

@Configuration
@ComponentScan("pl.ariglos")
public class AppConfig {

//    @Bean("orderRepository")
//    public OrderRepository getOrderRepository() {
//        return new OrderRepository();
//    }
//
//    @Bean("orderService")
//    public OrderService getOrderService() {
//        return new OrderService(getOrderRepository());
//    }
}
