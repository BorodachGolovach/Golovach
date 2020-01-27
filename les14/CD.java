package les14;

import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlType(propOrder = {"title", "person", "year", "price"}, name = "CD")
public class CD {
    private String title;
    private List<Artist> person = new ArrayList<Artist>();
    private int year;
    private int price;

    public String getTitle() {
        return title;
    }

    public List<Artist> getPerson() {
        return person;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPerson(List<Artist> getPerson) {
        this.person = person;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
