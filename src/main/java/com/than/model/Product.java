package com.than.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String nxs;

    public Product(int id, String name, double price, String nxs) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.nxs = nxs;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNxs() {
        return nxs;
    }

    public void setNxs(String nxs) {
        this.nxs = nxs;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", nxs='" + nxs + '\'' +
                '}';
    }
}
