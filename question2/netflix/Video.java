package netflix;

public class Video {
    private int netflixId;
    private String contentCategory;

    public int getNexflixId(){
        return this.netflixId;
    }

    public String getContentCategory() {
        return this.contentCategory;
    }

    public void setNetflixId(int netflixId){
        this.netflixId = netflixId;
    }

    public void setContentCategory(String contentCategory){
        this.contentCategory = contentCategory;
    }
}