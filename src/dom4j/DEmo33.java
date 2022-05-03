package dom4j;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

public class DEmo33 {
    public static void main(String[] args) throws IOException {
        Element root2 = DocumentHelper.createElement("bookstore");

        Document document2 = DocumentHelper.createDocument(root2);



        // 添加一级子节点:add之后就返回这个元素

        Element book1 = root2.addElement("book");

        book1.addAttribute("id", "1");

        book1.addAttribute("name", "第一本书");

        // 添加二级子节点

        book1.addElement("name").setText("遇见未知的自己");

        book1.addElement("author").setText("张德芬");

        book1.addElement("year").setText("2014");

        book1.addElement("price").setText("109");

        // 添加一级子节点

        Element book2 = root2.addElement("book");

        book2.addAttribute("id", "2");

        book2.addAttribute("name", "第二本书");

        // 添加二级子节点

        book2.addElement("name").setText("双城记");

        book2.addElement("author").setText("狄更斯");

        book2.addElement("year").setText("2007");

        book2.addElement("price").setText("29");



        // 设置缩进为4个空格，并且另起一行为true

        OutputFormat format = new OutputFormat("  ", true);



        // 另一种输出方式，记得要调用flush()方法,否则输出的文件中显示空白

        XMLWriter xmlWriter3 = new XMLWriter(new FileWriter("book.xml"),format);

        xmlWriter3.write(document2);

        xmlWriter3.flush();

        // close()方法也可以



    }

}
