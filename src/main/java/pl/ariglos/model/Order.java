package pl.ariglos.model;

public class Order {

  private int orderId;
  private String name;
  private String description;

  public Order(int orderId, String name, String description) {
    this.orderId = orderId;
    this.name = name;
    this.description = description;
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Order{"
        + "orderId="
        + orderId
        + ", name='"
        + name
        + '\''
        + ", description='"
        + description
        + '\''
        + '}';
  }
}
