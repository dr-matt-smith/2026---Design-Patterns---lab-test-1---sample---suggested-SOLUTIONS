public class HotelRoom implements VatCalculated {
    private String name;
    private double price;

    // VAT @ 3%
     public double priceIncludingVat() {
        return 1.03 * this.price;
     }

     public String getName(){
        return this.name;
     }

     public void setName(String name){
        this.name = name;
     }

     public double getPrice(){
        return this.price;
     }

     public void setPrice(double price){
        this.price = price;
     }
}