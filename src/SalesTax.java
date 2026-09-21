public class SalesTax {
    public static void main(String[] args){
        double itemPrice=10.0;
        final double tax=0.05;
        double salesTax= itemPrice * tax;
        System.out.println("The sales tax of "+ itemPrice +" is "+ salesTax);
    }
}
