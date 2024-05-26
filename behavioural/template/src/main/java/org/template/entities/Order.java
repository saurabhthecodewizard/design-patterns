package org.template.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private String id;
    private LocalDate date;
    private Double total;
    private Map<String, Double> items;

    public Order(String id) {
        this.id = id;
        this.date = LocalDate.now();
        this.total = 0.0;
        this.items = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String name, Double price) {
        items.put(name, price);
        this.total += price;
    }
}
