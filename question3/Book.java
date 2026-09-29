public class Book implements VatCalculated {
    private String title;
    private double price;

    // VAT @ 7%
     public double priceIncludingVat() {
        return 1.07 * this.price;
     }

     public String getTitle(){
        return this.title;
     }

     public void setTitle(String title){
        this.title = title;
     }

     public double getPrice(){
        return this.price;
     }

     public void setPrice(double price){
        this.price = price;
     }
}