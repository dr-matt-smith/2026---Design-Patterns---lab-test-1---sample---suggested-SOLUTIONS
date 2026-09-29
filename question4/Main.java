public class Main {
    private static Calculator add;
    private static Calculator multiply;

    public static void main(String[] args){

        /*
        calculate(int a, int b){
            return a + b;
        }

        (int a, int b) -> a + b
        */
        
        add = (int a, int b) -> a + b;
        multiply = (int a, int b) -> a * b;

        System.out.println(add.calculate(1, 2));
    }
}