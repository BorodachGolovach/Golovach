package les14;

import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
@XmlType(propOrder = {"cds"}, name = "Catalog")

public class Catalog {
    private List<CD> cds = new ArrayList<CD>();

    public List<CD> getCds(){
        return cds;
    }

    public void setCds (List<CD> cds){
        this.cds = cds;
    }

}
