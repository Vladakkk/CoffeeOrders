package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
    }

    public void add(Order order){
        order.setNumber(orders.size() + 1);
        orders.add(order);
    }

    public Order deliver(){
        if (orders.isEmpty()){
            System.out.println("No orders in the queue ");
        }
        return orders.remove(0);
    }

    public Order deliver(int orderNum){
        for (Order order : orders){
            if (order.getNumber() == orderNum){
                orders.remove(order);
                return order;
            }
        }

        System.out.println("Order with number " + orderNum + " not found");
        return null;
    }

    public void draw(){
        System.out.println("==============");
        System.out.println("Num  |  Name");
        for (Order order : orders){
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}
