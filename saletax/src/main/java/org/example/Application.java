package org.example;

import org.example.item.Item;
import org.example.item.ItemType;
import org.example.item.Price;
import org.example.item.PurchaseCart;
import org.example.tax.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    static final Tax bst = new Tax(TaxType.BASIC_SALE_TAX, "0.10", new BSTTaxExemptionPolicy(ItemType.Book, ItemType.Food, ItemType.Medical));
    static final Tax importedTax = new Tax(TaxType.IMPORT_TAX, "0.5", new ImportedTaxExemptionPolicy());

    static final AppliedTaxPolicy policy = new AppliedTaxPolicy(bst, importedTax);
    static final PurchaseCart cart = new PurchaseCart(policy);


    public static void main(String[] args) {

        boolean more = true;
        Scanner sc = new Scanner(System.in);

        while (more) {
            System.out.println("Enter item name: ");
            String itemName = sc.next();
            System.out.println("Enter item price: ");
            String itemPrice = sc.next();
            System.out.println("Enter item type [ Book, Food, Medical, Others ] : ");
            String itemType = sc.next();
            System.out.println("Is item imported [ true, false ] : ");
            boolean imported = sc.nextBoolean();
            System.out.println("Quantity of item : ");
            int quantity = sc.nextInt();
            System.out.println(quantity + " " + itemName + " at " + itemPrice);

            Item item = (new Item(itemName, new Price(itemPrice), ItemType.valueOf(itemType), imported));
            cart.add(item, quantity);

            System.out.println("Do you want to add more [ Y / Yes ] ?");
            String addMore = sc.next();
            if ("Y".equalsIgnoreCase(addMore) || "Yes".equalsIgnoreCase(addMore))
                more = true;
            else
                more = false;
        }
        GenerateInvoice.generate(cart);

    }
}
