package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Book {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(new File("C://Users//Lenovo//Desktop//Books.xml"));
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element book:elements) {
            Element name = book.element("name");
            String s = name.getText();
            String author = book.elementText("author");
            String price = book.elementText("price");
            String sn = book.attributeValue("sn");
            System.out.println(s+sn+author+Double.parseDouble(price));

        }
    }
}
