package Entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, double price, double customsFee){
        super(price, name);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")");
        return sb.toString();
    }
}
