import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ainw {

	public static void main(String[] args) {
		String xmlParameters = "";

        xmlParameters = xmlParameters + "<SP_Parameter>";
        xmlParameters = xmlParameters + "<Parameter>";
        xmlParameters = xmlParameters + "<Name></Name>";
        xmlParameters = xmlParameters + "<Type>varchar2</Type>";
        xmlParameters = xmlParameters + "<Direction>Returnvalue</Direction>";
        xmlParameters = xmlParameters + "</Parameter>";
        xmlParameters = xmlParameters + "<Parameter>";
        xmlParameters = xmlParameters + "<Name>po_sysdate</Name>";
        xmlParameters = xmlParameters + "<Type>varchar2</Type>";
        xmlParameters = xmlParameters + "<Direction>Output</Direction>";
        xmlParameters = xmlParameters + "</Parameter>";
        xmlParameters = xmlParameters + "<Parameter>";
        xmlParameters = xmlParameters + "<Name>po_sysdate_hh</Name>";
        xmlParameters = xmlParameters + "<Type>varchar2</Type>";
        xmlParameters = xmlParameters + "<Direction>Output</Direction>";
        xmlParameters = xmlParameters + "</Parameter>";
        xmlParameters = xmlParameters + "<Parameter>";
        xmlParameters = xmlParameters + "<Name>po_sysdate_mm</Name>";
        xmlParameters = xmlParameters + "<Type>varchar2</Type>";
        xmlParameters = xmlParameters + "<Direction>Output</Direction>";
        xmlParameters = xmlParameters + "</Parameter>";
        xmlParameters = xmlParameters + "<Parameter>";
        xmlParameters = xmlParameters + "<Name>po_sysdate_ss</Name>";
        xmlParameters = xmlParameters + "<Type>varchar2</Type>";
        xmlParameters = xmlParameters + "<Direction>Output</Direction>";
        xmlParameters = xmlParameters + "</Parameter>";
        xmlParameters = xmlParameters + "</SP_Parameter>";
        System.out.println(xmlParameters);
	}

}
