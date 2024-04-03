import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add(new Order("Mary"));
        board.add(new Order("Bob"));
        board.add(new Order("Karl"));
        board.add(new Order("Charlie"));
        board.add(new Order("Oliver"));
        board.add(new Order("Emma"));
        board.add(new Order("Mia"));
        board.add(new Order("Lily"));
        board.add(new Order("James"));

        System.out.println("Current orders: ");
        board.draw();

        System.out.println("Delivering the next order: ");
        Order nextOrder = board.deliver();
        if (nextOrder != null){
            System.out.println("Delivered: " + nextOrder.getName());
        }

        System.out.println("Current orders after delivery: ");
        board.draw();

        System.out.println("Delivering order with number 5: ");
        Order order5 = board.deliver(5);
        if (order5 != null){
            System.out.println("Delivered: " + order5.getName());
        }

        System.out.println("Current orders after delivery of order 5: ");
        board.draw();
    }
}