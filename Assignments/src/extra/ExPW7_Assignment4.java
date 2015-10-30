package extra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ExPW7_Assignment4 {
	public static void main(String args[]) 
	   {
		int StreetNumber,ZipCode;
	    String StreetName,CityName,  StateName, line, addrWithLine; 
	    int count = 0;
	   StringTokenizer st;
	   ArrayList<String> addressList = new ArrayList<String>();
	   try    {
	          FileReader f = new FileReader("/tmp/ExP3_input.txt");
	          BufferedReader in = new BufferedReader(f);
	          while ((line = in.readLine()) != null)
	             {
	        	  count++;
	             st = new StringTokenizer(line,",");
	             StreetNumber = Integer.valueOf(st.nextToken().trim());
	             StreetName = st.nextToken().trim();
	             CityName = st.nextToken().trim();
	             StateName = st.nextToken().trim();
	             ZipCode = Integer.valueOf(st.nextToken().trim());
	             addrWithLine = count + " " + StreetNumber +" " + StateName +" "+CityName +" " + StateName +" " + ZipCode ;
	             addressList.add(addrWithLine);
	             }
	          Iterator<String> itr = addressList.iterator();
	          int lineNumber;
	          while(itr.hasNext()) {
	        	 String addr =(String) itr.next();
	        	 st = new StringTokenizer(addr, " ");
	        	 
	        	 lineNumber = Integer.valueOf(st.nextToken().trim());	        	 
	        	 StreetNumber = Integer.valueOf(st.nextToken().trim());
	             StreetName = st.nextToken().trim();
	             CityName = st.nextToken().trim();
	             StateName = st.nextToken().trim();
	             ZipCode = Integer.valueOf(st.nextToken().trim());
	        	  
	             System.out.println(StreetNumber + " line "+ lineNumber + " Position " + addr.indexOf(Integer.toString(StreetNumber) ));
	             System.out.println(StreetName + " line "+ lineNumber + " Position " + addr.indexOf(StateName)) ;
	             System.out.println(CityName + " line "+ lineNumber + " Position " + addr.indexOf(CityName)  );
	             System.out.println(StateName + " line "+ lineNumber + " Position " + addr.indexOf(StateName) );
	             System.out.println(ZipCode + " line "+ lineNumber + " Position " + addr.indexOf(Integer.toString(ZipCode)) );
	            
	             } // loop until the end of file
	          in.close(); 
	          f.close();
	          }
	           catch (Exception e) {  e.printStackTrace(); };
	    } // main

}
