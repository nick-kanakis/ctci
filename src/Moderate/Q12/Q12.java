package Moderate.Q12;


import java.util.ArrayList;

/**
 * Created by Nicolas on 16/1/2018.
 */
public class Q12 {

    public static String encodeToString(Element element){
        StringBuilder sb = new StringBuilder();
        EncodeElement(element, sb);
        return sb.toString();
    }

    private static void EncodeElement(Element element, StringBuilder sb){
        appendToStringBuilder(element.getNameCode(), sb);
        for (Attribute attribute: element.attributes  ) {
            encodeAttribute(attribute, sb);
        }
        appendToStringBuilder("0", sb);
        if(element.value != null){
            appendToStringBuilder(element.value, sb);
        }
        if(element.children.size()>0){
            for (Element nestedElement:element.children ) {
                EncodeElement(nestedElement, sb);
            }
        }
        appendToStringBuilder("0", sb);
    }

    private static void encodeAttribute(Attribute attribute, StringBuilder sb) {
        appendToStringBuilder(attribute.getTagCode(), sb);
        appendToStringBuilder(attribute.value, sb);
    }

    private static void appendToStringBuilder(String nameCode, StringBuilder sb) {
        sb.append(nameCode);
        sb.append(" ");
    }
}
