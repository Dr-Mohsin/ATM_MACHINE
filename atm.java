// IN THIS ATM THERE ARE STILL THREE USER AND THERE PINS ARE GIVEN BELOW
//(sirmuzamil account pin is === 1234)
//(mohsin account pin is ==== 1243)
//(mashooque account pin is ==== 1324)

import java.util.Scanner;

public class atm {
 public void ShowData(){
 
 
            int amount = 0, withdraw, deposit;  
              
      
            Scanner sc = new Scanner(System.in);  
              System.out.println("Enter your pin");
            int pin = sc.nextInt();
            while(true)  
            {  
            if(pin==1234){
                System.out.println("ACCOUNT HOLDER  ********************----->>"+"SIR SAYED MUZAMIL HUSNAIN SHAH");
                System.out.println();
                System.out.println("WELCOME TO ATM MACHINE\n");  
                System.out.println("ENTER 1 for WITHDRAW");  
                System.out.println("ENTER 2 for DEPOSIT");  
                System.out.println("ENTER 3 for CHECK AMOUNT");  
                System.out.println("ENTER 4 for EXIT\n");  
                System.out.println("SELECT ANY OPERATION:");  
                  
                
                int select = sc.nextInt();  
                switch(select)  
                {  
                    case 1
                            :  
            System.out.print("HOW MANY AMOUNT YOUR WANT TO WITHDRAW :");  
                          
              
            withdraw = sc.nextInt();  
                          
              
            if(amount >= withdraw)  
            {  
                
                amount = amount - withdraw;  
                System.out.println("YOU WITHDRAW YOUR AMOUNT SUCCESSFULLY");  
            }  
            else  
            {  
                 
                System.out.println("Insufficient Balance");  
            }  
            System.out.println("");  
            break;  
       
                    case 2:  
                          
            System.out.print("Enter money to be deposited:");  
                          
              
            deposit = sc.nextInt();  
                          
              
            amount = amount + deposit;  
            System.out.println("Your Money has been successfully depsited");  
            System.out.println("");  
            break;  
       
                    case 3:  
                     
            System.out.println("AMOUNT : "+amount);  
            System.out.println("");  
            break;  
       
                    case 4:  
                        System.out.println("THANX FOR USING ATM OWNER OF THIS ATM IS MOHSIN SOOMRO CONTACT NUMBER 03368266989 IN CASE OF ANY QUERY");
                        
            System.exit(0);  
                }
            }
            
            else if(pin==1243){System.out.println("ACCOUNT HOLDER  ********************----->>"+"MOHSIN SOOMRO");
                System.out.println();
                System.out.println("WELCOME TO ATM MACHINE\n");  
                System.out.println("ENTER 1 for WITHDRAW");  
                System.out.println("ENTER 2 for DEPOSIT");  
                System.out.println("ENTER 3 for CHECK AMOUNT");  
                System.out.println("ENTER 4 for EXIT\n");  
                System.out.println("SELECT ANY OPERATION:");  
                  
                
                int select = sc.nextInt();  
                switch(select)  
                {  
                    case 1
                            :  
            System.out.print("HOW MANY AMOUNT YOUR WANT TO WITHDRAW :");  
                          
              
            withdraw = sc.nextInt();  
                          
              
            if(amount >= withdraw)  
            {  
                
                amount = amount - withdraw;  
                System.out.println("YOU WITHDRAW YOUR AMOUNT SUCCESSFULLY");  
            }  
            else  
            {  
                 
                System.out.println("Insufficient Balance");  
            }  
            System.out.println("");  
            break;  
       
                    case 2:  
                          
            System.out.print("Enter money to be deposited:");  
                          
              
            deposit = sc.nextInt();  
                          
              
            amount = amount + deposit;  
            System.out.println("Your Money has been successfully depsited");  
            System.out.println("");  
            break;  
       
                    case 3:  
             
            System.out.println("AMOUNT : "+amount);  
            System.out.println("");  
            break;  
       
                    case 4:  
                        System.out.println("THANX FOR USING ATM OWNER OF THIS ATM IS MOHSIN SOOMRO CONTACT NUMBER 03368266989 IN CASE OF ANY QUERY");
                        
            System.exit(0);  
                }
            }
            else if(pin == 1324){    System.out.println("ACCOUNT HOLDER  ********************----->>"+"MASHOOQUE");
                System.out.println("WELCOME TO ATM MACHINE\n");  
                System.out.println("ENTER 1 for WITHDRAW");  
                System.out.println("ENTER 2 for DEPOSIT");  
                System.out.println("ENTER 3 for CHECK AMOUNT");  
                System.out.println("ENTER 4 for EXIT\n");  
                System.out.println("SELECT ANY OPERATION:");  
                  
                
                int select = sc.nextInt();  
                switch(select)  
                {  
                    case 1
                            :  
            System.out.print("HOW MANY AMOUNT YOUR WANT TO WITHDRAW :");  
                          
              
            withdraw = sc.nextInt();  
                          
              
            if(amount >= withdraw)  
            {  
                
                amount = amount - withdraw;  
                System.out.println("YOU WITHDRAW YOUR AMOUNT SUCCESSFULLY");  
            }  
            else  
            {  
                 
                System.out.println("Insufficient Balance");  
            }  
            System.out.println("");  
            break;  
       
                    case 2:  
                          
            System.out.print("Enter money to be deposited:");  
                          
              
            deposit = sc.nextInt();  
                          
              
            amount = amount + deposit;  
            System.out.println("Your Money has been successfully depsited");  
            System.out.println("");  
            break;  
       
                    case 3:  
             
            System.out.println("AMOUNT : "+amount);  
            System.out.println("");  
            break;  
       
                    case 4:  
                        System.out.println("THANX FOR USING ATM OWNER OF THIS ATM IS MOHSIN SOOMRO CONTACT NUMBER 03368266989 IN CASE OF ANY QUERY");
                        
            System.exit(0);  
                }
            }
            
            
            else{
                System.out.println("your pin is not valid");
                System.exit(0);
            }
            
            }  
                
            
            }
                public static void main(String[] args) {
            
             atm a = new atm();
            
           a.ShowData();
}
   
}
