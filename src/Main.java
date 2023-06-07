// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double purchasePrice = 12.00;
        double TAX_RATE = 0.050;
        double salesTax = 0.00;
        salesTax = purchasePrice * TAX_RATE;
        System.out.println("The sales tax for a purchase price of $" + purchasePrice + " is $" + salesTax);
    }
}