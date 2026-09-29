public class Main {
    private static Book book1;
    private static HotelRoom hotelRoom1;

    public static void main(String[] args){
        book1 = new Book();
        hotelRoom1 = new HotelRoom();

        book1.setTitle("Life of Pi");
        book1.setPrice(10);

        hotelRoom1.setName("Radison Green");
        hotelRoom1.setPrice(200);        
    }
}