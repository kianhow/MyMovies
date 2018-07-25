package sg.edu.rp.c346.mymovies;

/**
 * Created by 17001227 on 25/7/2018.
 */

public class MovieItem {

    private String title;
    private String dateGenre;
    private String desc;
    private String watch;
    private String theatre;
    private String rating;
    private boolean isG;
    private boolean isPG;
    private boolean isPG13;
    private boolean isNC16;
    private boolean isM18;

    public MovieItem(String title, String dateGenre, String desc, String watch, String theatre, String rating, boolean isG, boolean isPG, boolean isPG13, boolean isNC16, boolean isM18) {
        this.title = title;
        this.dateGenre = dateGenre;
        this.desc = desc;
        this.watch = watch;
        this.theatre = theatre;
        this.rating = rating;
        this.isG = isG;
        this.isPG = isPG;
        this.isPG13 = isPG13;
        this.isNC16 = isNC16;
        this.isM18 = isM18;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateGenre() {
        return dateGenre;
    }

    public void setDateGenre(String dateGenre) {
        this.dateGenre = dateGenre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getWatch() {
        return watch;
    }

    public void setWatch(String watch) {
        this.watch = watch;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public boolean isG() {
        return isG;
    }

    public void setG(boolean g) {
        isG = g;
    }

    public boolean isPG() {
        return isPG;
    }

    public void setPG(boolean PG) {
        isPG = PG;
    }

    public boolean isPG13() {
        return isPG13;
    }

    public void setPG13(boolean PG13) {
        isPG13 = PG13;
    }

    public boolean isNC16() {
        return isNC16;
    }

    public void setNC16(boolean NC16) {
        isNC16 = NC16;
    }

    public boolean isM18() {
        return isM18;
    }

    public void setM18(boolean m18) {
        isM18 = m18;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "title='" + title + '\'' +
                ", dateGenre='" + dateGenre + '\'' +
                ", desc='" + desc + '\'' +
                ", watch='" + watch + '\'' +
                ", theatre='" + theatre + '\'' +
                ", rating='" + rating + '\'' +
                ", isG=" + isG +
                ", isPG=" + isPG +
                ", isPG13=" + isPG13 +
                ", isNC16=" + isNC16 +
                ", isM18=" + isM18 +
                '}';
    }
}
