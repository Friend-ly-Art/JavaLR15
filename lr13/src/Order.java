import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Order {
    private final int orderId;
    private final String customerName;
    private final double totalAmount;
    private String status;
    private final List<String> items;

    public Order(int orderId, String customerName, double totalAmount, List<String> items)
            throws InvalidOrderDataException {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new InvalidOrderDataException("Имя покупателя не должно быть пустым.");
        }
        if (!Double.isFinite(totalAmount) || totalAmount <= 0) {
            throw new InvalidOrderDataException("Сумма заказа должна быть больше нуля.");
        }
        if (items == null || items.isEmpty()) {
            throw new InvalidOrderDataException("В заказе должен быть хотя бы один товар.");
        }
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = "Создан";
        this.items = new ArrayList<>(items);
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void processOrder() throws OrderProcessingException {
        if (!status.equals("Создан")) {
            throw new OrderProcessingException("Обработать можно только созданный заказ. Текущий статус: " + status);
        }
        status = "Обработан";
    }

    public void cancelOrder() throws OrderProcessingException {
        if (!status.equals("Создан")) {
            throw new OrderProcessingException("Отменить можно только созданный заказ. Текущий статус: " + status);
        }
        status = "Отменён";
    }

    @Override
    public String toString() {
        return String.format("Заказ №%d, покупатель: %s, сумма: %.2f руб., товары: %s, статус: %s",
                orderId, customerName, totalAmount, items, status);
    }
}

class OrderService {
    private final Map<Integer, Order> orders = new LinkedHashMap<>();

    public void addOrder(Order order) throws InvalidOrderDataException {
        if (orders.containsKey(order.getOrderId())) {
            throw new InvalidOrderDataException("Заказ с таким номером уже существует: " + order.getOrderId());
        }
        orders.put(order.getOrderId(), order);
    }

    public Order findOrder(int orderId) throws OrderNotFoundException {
        Order order = orders.get(orderId);
        if (order == null) {
            throw new OrderNotFoundException("Заказ №" + orderId + " не найден.");
        }
        return order;
    }

    public void processOrder(int orderId) throws OrderNotFoundException, OrderProcessingException {
        findOrder(orderId).processOrder();
    }

    public void cancelOrder(int orderId) throws OrderNotFoundException, OrderProcessingException {
        findOrder(orderId).cancelOrder();
    }

    public void printAllOrders() {
        for (Order order : orders.values()) {
            System.out.println(order);
        }
    }
}