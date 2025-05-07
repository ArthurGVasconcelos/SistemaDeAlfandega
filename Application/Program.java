package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int rep = sc.nextInt();
        for(int i = 0; i < rep; i++) {
            System.out.println("Product #" + (i + 1) + " Data");
            System.out.print("Commom, used or Imported (c/u/i)? ");
            char choose = sc.next().charAt(0);
            sc.nextLine();
            if (choose == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                productList.add(new Product(price, name));
            } else if(choose == 'u'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                productList.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, fee));
            }
        }
        sc.close();
        System.out.println("Price Tags");
        for (Product product : productList){
            System.out.println(product.priceTag());
        }
    }
}
