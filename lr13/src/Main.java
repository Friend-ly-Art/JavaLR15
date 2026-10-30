//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

void main() {
    OrderService service = new OrderService();
    try {
        service.addOrder(new Order(1001, "Анна Иванова", 2590.00,
                Arrays.asList("Клавиатура", "Мышь")));
        service.addOrder(new Order(1002, "Иван Петров", 1499.50,
                Arrays.asList("Наушники")));

        service.processOrder(1001);
        service.cancelOrder(1002);

        try {
            service.processOrder(9999);
        } catch (OrderNotFoundException | OrderProcessingException e) {
            System.out.println("Ошибка операции: " + e.getMessage());
        }

        System.out.println("\nСписок заказов:");
        service.printAllOrders();
    } catch (InvalidOrderDataException e) {
        System.out.println("Некорректные данные заказа: " + e.getMessage());
    } catch (OrderNotFoundException | OrderProcessingException e) {
        System.out.println("Ошибка операции: " + e.getMessage());
    }
}
