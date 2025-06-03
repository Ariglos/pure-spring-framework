package pl.ariglos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.ariglos.config.AppConfig;
import pl.ariglos.service.OrderService;

public class App {

  public static void main(String[] args) {
    var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    var service = applicationContext.getBean("orderService", OrderService.class);
    System.out.println(service.list());
  }
}
