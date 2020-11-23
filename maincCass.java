# Bank-Management-System
package clg;
import java.util.*;

public class BankManagement  {
  static Scanner sc = null;
  protected static  Map<String, BankAccount> bankId = new HashMap<>();
  protected static  Map<String, String> bankId1 = new HashMap<>();
  public static boolean y = true;
   
	public static void main(String[] args) {
		
		 sc = new Scanner(System.in);
	BankAccount RA13022001 = new BankAccount("Rakshit Khullar","RA13022001","rakshitkhullar1331@gmail.com");
    BankAccount SA23082000 = new BankAccount("Sahil Yadav","SA23082000","sahilyadav96000@gmail.com");
			
    
			bankId.put("RakshitKhullar",RA13022001);
			bankId.put("SahilYadav",SA23082000);
			
			bankId1.put("RakshitKhullar","RA13022001");
			bankId1.put("SahilYadav","SA23082000");
			
		    System.out.println("============ WELCOME TO OUR BANK ============");
		    System.out.println();
			loop();
			System.out.println();
			System.out.println("============ THANKS FOR USING OUR SERVICES :) ============");
			
	}
	
	
	 static void loop() {
		sc = new Scanner(System.in);
		String name  = "";
	      String Id  = "";
	      
		
		 do {
			if( y == false) break;	
				System.out.println("=========ENTER 1 FOR NEW CUSTOMER ENTER ANY LETTER AND PRESS ENTER FOR OLD ONE=========");
				String ca = sc.next();
				System.out.println();
				if(ca.charAt(0) == '1') {
					data d = new data();
					d.newLogin();
					System.out.println("============ PLEASE LOGIN ONCE TO CONFIRM YOUR DETAILS ============");
				}
				System.out.println();
			    System.out.println("Enter Your Name ============");
			    name = sc.next();
			    
			    System.out.println();
			    System.out.println("Enter Your BankId ============");
			    Id = sc.next();
			    
			    
			    if( bankId1.containsKey(name) && bankId1.get(name).equals(Id) ) {
			             bankId.get(name).menu();
			    	 
			    	
			   }else {System.out.println();
				   System.out.println("============ SORRY WE CAN'T LOGIN AS YOU HAVE ENTERED WRONG ENTITES, PLEASE TRY AGAIN! ============");
				   System.out.println();
			   }
			    
				
			}while(!( bankId1.containsKey(name) && bankId1.get(name).equals(Id)));
			
	}
	
	
	 void bbb() {
		sc = new Scanner(System.in);
		
		System.out.println("============ IF YOU WANT TO LOGIN AGAIN THEN PLS ENTER Y OTHERWISE N ============");
		
    	do {
    		String r = sc.next();
    		System.out.println();
    	char r1 = r.charAt(0);
    	if(r1 == 'Y') {
    		loop();
    		break;
    	}else if(r1 == 'N'){
    		y = false;
    		break;
    	}else {
      y = false;
      System.out.println("============ YOU HAVE ENTERED WRONG ENTITY PLEASE ENTER AGAIN ============");
    	}
    	}while(y != true);
	}

	
}
		
		
	 
