package day07;

import java.awt.*;
import java.util.HashMap;

public class Order {

    private static int orderCount = 1000;
    private int orderCode;
    private HashMap<MenuItem, Integer> items = new HashMap<>();
    private double totalAmount = 0.0;

    public Order() {
        orderCode = orderCount++;
    }

    public void addItem(MenuItem item, int amount) {

        items.put(item, amount);
        totalAmount += item.getPrice()*amount;

    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
