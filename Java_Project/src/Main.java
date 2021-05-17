import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Maximum is 100 */
		
		
		/* Mobile */
		Mobile[] mobile1 = new Mobile[100];
		Mobile[] mobile2 = new Mobile[100];
		Mobile[] mobile3 = new Mobile[100];
		
		/* Tablet */
		Tablet[] tablet1 = new Tablet[100];
		Tablet[] tablet2 = new Tablet[100];
		Tablet[] tablet3 = new Tablet[100];
		
		/* Lap top */
		Laptop[] laptop1 = new Laptop[100];
		Laptop[] laptop2 = new Laptop[100];
		Laptop[] laptop3 = new Laptop[100];
		
		/* Keyboard */
		Keyboard[] keyboard1 = new Keyboard[100];
		Keyboard[] keyboard2 = new Keyboard[100];
		Keyboard[] keyboard3 = new Keyboard[100];

			
		/* Mouse */
		Mouse[] mouse1 =  new Mouse[100];
		Mouse[] mouse2 =  new Mouse[100];
		Mouse[] mouse3 =  new Mouse[100];
		
		
		/* Earphone */
		Earphone[] earphone1 = new Earphone[100];
		Earphone[] earphone2 = new Earphone[100];
		Earphone[] earphone3 = new Earphone[100];
		
 	
		
		/* seller who manages this program, set default pw as 1234 */
		Seller master = new Seller(1234);
		
	
		
		
		
		
		///////////////////////////////////
		///////////* Program */////////////
		///////////////////////////////////
		
		
		
		/* Home type */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Select the type.");
		System.out.println("1. User. 2. Seller: ");
		
		int type = keyboard.nextInt();
		
		
		
		
		/////////////////////////////////////////////
		/////////////////* Seller *////////////////////
		/////////////////////////////////////////////
		
		
		/* Seller, type == 2*/
		
		
		
		/* Check PW */
		
		System.out.println("Enter the PW: ");
		
		int key = keyboard.nextInt();
		
		boolean isEqual = master.samePw(key);
		
		
		/* until the PW is correct */
		while(!isEqual) {
			
			/* if PW is incorrect */
			
			System.out.println("Wrong PW. Try again.");
			
			
			System.out.println("Enter the PW: ");
			
			key = keyboard.nextInt();
			isEqual = master.samePw(key);
		
		}
		
		
		System.out.println("PW is right, Welcome!");
	
		System.out.println("1. 주문내역 2. 재고관리 3. 비밀번호 변경: ");
		
		int selType = keyboard.nextInt();
		
		
		/* 주문내역 selType == 1 */
		
		if (selType == 1) {
			
			
			System.out.println("=============================== Gapple order list ================================");
			System.out.println("   Product    /    Name   /    TEL    /    Color   /    Storage    /    Date   /");
			
			
			
			
			
			
			
			
		}
		
		/* 재고관리 selType == 2 */
		
		if (selType == 2) {
			
			
			
		}
		
		
		/* 비밀번호 변경 selType == 3 */
		
		if (selType == 3) {
			
			
			/* Show the seller's default AccessKey */
			System.out.println("default pw: " + master.getAccessKey() );
			
			
			System.out.println("Enter the new PW: OOOO");
			int newPW = keyboard.nextInt();
			
			/* new PW setting */
			master.setAccessKey(newPW);
			
			
		}
		
		
		
		
		
		/////////////////////////////////////////////
		/////////////////* User *////////////////////
		/////////////////////////////////////////////
		
		
		/* User, type == 1 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
