import netflix.*;
import dubdevs.*;

public class Main {
    private static netflix.Video movie1;
    private static dubdevs.Video file202;

    public static void main(String[] args){
        movie1 = new netflix.Video();
        file202 = new dubdevs.Video();

        movie1.setNetflixId(1009);
        movie1.setContentCategory("movies");

        file202.setFormat("VHS");
    }
}