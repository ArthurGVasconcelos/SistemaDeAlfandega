package Entities;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }

    public Product(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " $ " + String.format("%.2f", price));
        return sb.toString();
    }
}
