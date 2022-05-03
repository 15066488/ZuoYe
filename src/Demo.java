import DOm.Dome427;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.awt.print.Book;
import java.io.File;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws DocumentException {


        SAXReader saxReader = new SAXReader();

        Document read = saxReader.read(new File("C://Users//Lenovo//Desktop//新建文本文档.xml"));
        Element rootElement = read.getRootElement();
        List<Element> bookEles = rootElement.elements();
        for (Element book : bookEles) {
            Element name = book.element("name");
            String text = name.getText();
            String author = book.elementText("author");
            String price = book.elementText("price");
            String sn = book.attributeValue("sn");
            System.out.println(new Dome427(sn, text, author, Double.parseDouble(price)));

        }






    }

}