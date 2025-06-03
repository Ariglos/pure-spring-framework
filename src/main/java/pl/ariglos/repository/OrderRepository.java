package pl.ariglos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import pl.ariglos.model.Order;

@Repository
public class OrderRepository implements CrudRepository<Order> {

  @Override
  public List<Order> findAll() {
    var orders = new ArrayList<Order>();
    var order = new Order(1, "Order", "Description");
    orders.add(order);
    return orders;
  }
}
