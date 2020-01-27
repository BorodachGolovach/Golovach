package les14;

import jdk.nashorn.internal.runtime.ParserException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Converter {

    private static final String fileName = "C:/Users/User/ideaProjects/untitled2";
    private Object List;

    public void convertToXml(Catalog catalog, String fileName) throws JAXBException {

            JAXBContext context = JAXBContext.newInstance(CD.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createJavaObjectExample1(), System.out);

        }

        public void readFromXml (String fileName){

        }
        public void convertToJson (Catalog catalog, String fileName){

        }
        public void readFromJson (String fileName){

        }


        public Catalog createJavaObjectExample1 () {
            Catalog catalog = new Catalog();

            try {

                catalog.getCds().add(createCD("Born a devil", , 2020, 1400));
                catalog.getCds().add(createCD("Born a angel", "Max Power", 2016, 1000));
                catalog.getCds().add(createCD("Potato god", "Rick Sanches", 2125, 100000));
            } catch (ParserException exception) {
                Logger.getLogger(Converter.class.getName()).
                        log(Level.ALL, "createJavaObjectExample threw ParseException");
            }
            return catalog;
        }
        public CD createCD (String title, List < Artist > person,int year, int price ) throws ParserException {
            CD cd = new CD();
            cd.setTitle(title);
            cd.setPrice(price);
            cd.setYear(year);
            cd.setPerson(person);
            return cd;
        }
    }