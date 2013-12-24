
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class XmlTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        People people1 = new People();

        people1.setId(1);
        people1.setName("<zhang'san'>");
        people1.setAge(30);
        people1.setAddress(">bei\"jing<");

        Document document = DocumentHelper.createDocument();

        Element rootElement = document.addElement("persons");


        Element e = rootElement.addElement("person");

        Element idElement = e.addElement("id");
        Element nameElement = e.addElement("name");
        Element ageElement = e.addElement("age");
        Element addressElement = e.addElement("address");
        idElement.setText(people1.getId() + "");
        nameElement.setText(people1.getName());
        ageElement.setText(people1.getAge() + "");
        addressElement.setText(people1.getAddress());
        System.out.println(document.asXML());
    }

}
