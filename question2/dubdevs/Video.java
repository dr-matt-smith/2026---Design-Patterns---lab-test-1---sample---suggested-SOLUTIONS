package dubdevs;

public class Video {
    private String format;
    private int sizeMegabytes;

    public String getFormat(){
        return this.format;
    }

    public int getSizeMegabytes() {
        return this.sizeMegabytes;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public void setSizeMegabytes(int sizeMegabytes){
        this.sizeMegabytes = sizeMegabytes;
    }
}