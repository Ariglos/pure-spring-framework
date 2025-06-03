package pl.ariglos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import pl.ariglos.model.Order;
import pl.ariglos.repository.OrderRepository;

@Service
public class OrderService implements CrudService<Order> {

  private final OrderRepository repository;

  public OrderService(OrderRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Order> list() {
    return repository.findAll();
  }

  @Override
  public Order create(Order order) {
    return null;
  }

  @Override
  public Optional<Order> get(int id) {
    return Optional.empty();
  }

  @Override
  public void update(Order order, int id) {}

  @Override
  public void delete(int id) {}
}
