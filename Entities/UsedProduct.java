package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, double price, LocalDate manufactureDate){
        super(price, name);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getName() + " (Used) " + "$ " + String.format("%.2f", getPrice()) + " (Manucfature date: " + manufactureDate.format(dateTimeFormatter)) + ")");
        return sb.toString();
    }
}
