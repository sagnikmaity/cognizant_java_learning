/**
* Name : Sagnik Maity
* Description : Display command line from url
* Date : 3/13/2021 
*/
package StringPackage;

public class StringAssignment2 {
    public static void main(String[] args) {
    	String url1= "https://www.cognizant.com/admin/policy/index.html";
    	String url2= "https://www.cognizant.com/service.jsp";
    	String url3= "https://www.cognizant.com/customer/products/local/showProducts.asp";
    	
    	String command1=(getCommand(url1));
    	String command2=(getCommand(url2));
    	String command3=(getCommand(url3));
    	
    	System.out.println("Command 1 : "+command1);
    	System.out.println("Command 2 : "+command2);
    	System.out.println("Command 3 : "+command3);
    }

	private static String getCommand(String url1) {
		
		int commandStartIndex= url1.lastIndexOf("/")+1;
		int commandEndIndex= url1.lastIndexOf(".");
		String commandLine= url1.substring(commandStartIndex,commandEndIndex);
		return commandLine;
		
	}
}
