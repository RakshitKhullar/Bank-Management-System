package clg;

import java.util.*;

class BankAccount extends BankManagement{
	
	Scanner sc = new Scanner(System.in);
	private int balance; 
	private int previousTransection;
	 private String customerName ;
	 private String customerId, Email;
	private boolean cda = false;
	private Stack<Integer> previousTransections = new Stack<>();
	BankAccount(String customerName,String customerId,String Email){
		
			this.customerName = customerName;
			this.customerId = customerId;
			this.Email = Email;
			
	}
	
		
	void deposit(int amount){
	
		if(amount >= 0) {
			
			balance += amount;
			
			previousTransection = amount;
			
			previousTransections.push(previousTransection);
			
		}else {
			System.out.println("INVALID ENTRY");
		}
	}
	
    void withdraw(int amount){
    
		if( balance - amount >= 0) {
			
			balance -= amount;
			
			previousTransection = -amount;
			
			previousTransections.push(previousTransection);
			
		}else {
			System.out.println("===== YOU HAVE INSUFFECIENT BALANCE SO YOU CAN'T WITHDRAW MONEY =====");
		}
	}
    
    
    void getPreviousTransaction() {
    	
    	if(previousTransection >0)  System.out.println("Depoited : "+ previousTransection);
    	
    	
    	else if(previousTransection<0)  System.out.println("Withdrawn : "+ Math.abs(previousTransection));
    	
    	
    	else System.out.println("No Transection occur");
    }
    
     void getPreviousTransaction(int n) {
    	if(previousTransections.isEmpty()) {
    		
    		System.out.println("========== No Transection Occur ==========");
    		
    	}else {
    		Stack<Integer> m = new Stack();
    		
    		m.addAll(previousTransections);
    		
    		while(!m.isEmpty()){
    		
    			System.out.println(m.pop());
    		}
    	}
    	
    }
    
    void deleteAccount(){
    	System.out.println("!!!!!!!!TAKING CONFIRMATION!!!!!!!!");
    	System.out.println("===== ARE YOU SURE THAT YOU WANT TO DELETE YOUR ACCOUNT =====");
    	System.out.println();
    	System.out.println("===== IF YES ENTER 1 ELSE 0 =====");

    	int takeConfirmation = sc.nextInt();
    	
    	if(takeConfirmation == 0) {
    	
    		System.out.println("===== YOUR ACCOUNT IS RETAINED =====");
    		
    		return;
    	}
    	else if(takeConfirmation == 1) {
    	
    		cda = true;
    		System.out.println();
    	bankId1.remove(customerName,customerId);
    
    	bankId.remove(customerName,bankId.get(customerName));
    	
    	System.out.println("========== YOUR ACCOUNT HAS BEEN DELETED ==========");}
    	else {
    		System.out.println("===== INVALID ENTRY =====");
    	}
    }
    
    
    void menu(){
    	char option = '\0';
    	
    	
    	System.out.println("Welcome " +  customerName);System.out.println();
    	
    	System.out.println("Your Id is "+ customerId);System.out.println();

    	
    	do {
    		System.out.println();
    		
    		System.out.println();
        	
        	System.out.println("A : Check Balance");
        	
        	System.out.println("B : Deposit");
        	
        	System.out.println("C : Withdraw");
        	
        	System.out.println("D : Previous Transaction");
        	
        	System.out.println("E : Delete Account");
        	
        	System.out.println("F : Exit");System.out.println();
    		
    		
    		System.out.println("==================================================================");
    		
    		System.out.println("Enter an option");
    		
    		System.out.println("==================================================================");
    		
    		option = sc.next().charAt(0);
    		
    		System.out.println();
    		
    		
    		switch(option) {
    		case 'A' :
    			if(cda == true) {
    				System.out.println("YOUR ACCOUNT HAS ALREADY BEEN DELETED , PRESS F TO EXIT");
    				break;
    			}
    			
    			System.out.println("=======================================");
        		
        		System.out.println("Balance = " + balance);
        		
        		System.out.println("=======================================");
        		
        		System.out.println();
        		break;
    			
    		case 'B' :
    			
    			if(cda == true) {
    				System.out.println("YOUR ACCOUNT HAS ALREADY BEEN DELETED , PRESS F TO EXIT");
    				break;
    			}
    			
                System.out.println("=======================================");
        		
        		System.out.println("Enter amount to be deposited");
        		
        		System.out.println("=======================================");
        		
        		int amountd = sc.nextInt();
        		deposit(amountd);
        		
        		System.out.println();
        		break;
    			
    		case 'C' :
    			if(cda == true) {
    				System.out.println("YOUR ACCOUNT HAS ALREADY BEEN DELETED , PRESS F TO EXIT");
    				break;
    			}
    			
                System.out.println("=======================================");
        		
        		System.out.println("Enter amount to be withdrawn");
        		
        		System.out.println("=======================================");
        		
        		int amountw = sc.nextInt(); 
        		withdraw(amountw);
        		
        		System.out.println();
        		break;
    			
    		case 'D' :
    			if(cda == true) {
    				System.out.println("YOUR ACCOUNT HAS ALREADY BEEN DELETED , PRESS F TO EXIT");
    				break;
    			} 
    			
    			 System.out.println("=======================================");
    			 System.out.println();
    			System.out.println("======== PRESS 1 TO SEE ALL PREVIOUS TRANSECTIONS ELSE PRESS 0 FOR THE LAST ONE ========");
    			
    			int a = sc.nextInt();
    			 if(a == 1 ) {
    				 System.out.println("=======================================");
    	        		
    	                getPreviousTransaction(1);
    	        		
    	        		System.out.println("=======================================");
    	        		System.out.println();
    			 }else if(a == 0) {
                System.out.println("=======================================");
        		
                getPreviousTransaction();
        		
        		System.out.println("=======================================");
        		
        		System.out.println();}
    			 else {
    				 System.out.println("=======================================");
    	        		
    	                System.out.println("===== !!!!WRONG ENTRY!!!! =====");
    	        		
    	        		System.out.println("=======================================");
    	        		System.out.println();
    			 }
        		break;
    			
    		case 'E':
    			if(cda == true) {
    				System.out.println("YOUR ACCOUNT HAS ALREADY BEEN DELETED , PRESS F TO EXIT");
    				break;
    			} 
    			
    			
    			 System.out.println("=======================================");
         		
                 deleteAccount();
         		
         		System.out.println("=======================================");
         		
         		System.out.println();
         		break;
    			
        		
    		case 'F' :
    			break;
    			
    			default :
    				System.out.println("INVALID ENTRY!! Pls enter again");
    				break;
    		}
    		
    	}while(option != 'F');
    	
    	bbb();
    	
    	
    }
	
}



class data extends BankManagement{
	     void newLogin() {
		 sc = new Scanner(System.in);
	  	System.out.println("ENTER YOUR NAME , DOB(DDMMYYYY) AND EMAIL ADDRESS");
	  	String name = sc.next();
	  	String dob = sc.next();
	  	String email = sc.next();
	  	
	  	String Id = "";
	  	for(int i = 0;i<2;i++) {

	  		Id = Id + name.charAt(i);
	  	}
	  	Id = Id.concat(dob);
	
	     BankAccount nn = new BankAccount(name,Id,email);

	     bankId.put(name,nn);
	     bankId1.put(name,Id);
}
	
}