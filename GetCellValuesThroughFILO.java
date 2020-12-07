package CommonJavaPack;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class getCellValue {
	
	public static List<String> getValue(List<String> listname) throws FilloException {
	Fillo fl=new Fillo();
	Connection connection= fl.getConnection("D:\\Parallel-Cucumber-Testng\\JavaPrograms\\Resources\\Filo.xlsx.xlsx");
	String featuresName=("Select * from FeatureDetails where Status='Yes'");
	Recordset recordset=connection.executeQuery(featuresName);
	System.out.println(recordset);
	while(recordset.next()){
		System.out.println(recordset.getField("Features"));
		
	ArrayList<String> lsEle=new ArrayList<String>();
	lsEle.add(recordset.getField("Features"));
	System.out.println(lsEle);
	@SuppressWarnings("unchecked")
	Map<String, String> hm=  new HashMap<String, String>();
	for(String i:lsEle) {
		hm.put("Feature1",i );
		hm.put("Feature2",i );
		hm.put("Feature3",i );
		hm.put("Feature4",i );
		System.out.println(hm.get("Feature3"));
		
	}
	}
	recordset.close();
	connection.close();
	
	return listname;
	}
		
	
	
	public static void main(String[] args) {
		try {
			
			getCellValue.getValue(null);
			
			
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
