package les14;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
@XmlType (propOrder = {"name", "instruments"}, name = "Artist")
public class Artist {
   private String name;
    private String instruments;


        public String getName(){
        return name;
    }
    public String getInstruments(){
        return instruments;
    }
    public void setName(){
        this.name = name;
    }
    public void setInstruments(){
        this.instruments = instruments;
    }
}
