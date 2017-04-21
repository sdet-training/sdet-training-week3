package sdettraining.week3.day4;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class ReadDataFromXML_OR {
	
	private Document doc;
    private String fileName;

    public ReadDataFromXML_OR(String fileName) {
              this.fileName = fileName;
    }

    public String getData(String locator) {
              SAXReader reader = new SAXReader();
               try {
                      doc = reader.read(fileName);
              } catch (DocumentException e) {
                      // e.printStackTrace();
             }
            String data = doc.selectSingleNode("//" + locator.replace('.', '/')).getText();                                 return data;
    }
    
 }
