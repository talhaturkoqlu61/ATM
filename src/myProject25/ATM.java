package myProject25;
import java.util.Scanner;

public class ATM {
	public static void main(String []args) {
		String userName,password;
		int selection,balance=1500,right=3;
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Talha Türkoğlu BANK");
	
			do {
				System.out.print("Please enter your username:");
				userName=input.nextLine();
				System.out.print("Please enter your password:");
				password=input.nextLine();
				if(userName.equals("Patika")&&password.equals("Dev")) {
					System.out.println("You logged in the system successfully");
					right=0;
				}
				else {
					right--;
					System.out.println("Your existing right:"+right);
					if(right==0) {
						System.out.println("Your account was blocked!");
					}
				}
			}
			while(right>0);
			if(userName.equals("Patika")&&password.equals("Dev")){
				System.out.println("1-Deposit money\n"+"2-Withdraw money\n"+"3-Balance inquiry\n"+"4-Log out");
				System.out.print("Please choose process you want to do:");
				selection=input.nextInt();
				switch(selection) {
				case 1:
					System.out.print("Please enter how much money you want to deposit:");
					int depoamount=input.nextInt();
					balance+=depoamount;
					System.out.println("Your existing balance:"+balance);
					break;
				
				case 2:
					System.out.print("Please enter how much money you want to withdraw:");
					int withamount=input.nextInt();
					if(withamount>balance) {
						System.out.println("Insufficient balance");
					}
					else {
						balance-=withamount;
						System.out.println("Your existing balance:"+balance);
					}
					break;
					
				case 3:
					System.out.println("Your existing balance:"+balance);
					break;
				case 4:
					System.out.println("You logged out successfully");
					
				}
			
		
		
	
	}
		



}
}



			  