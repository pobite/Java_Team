import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Maximum is 100 */
		
	
		/* Mobile */
		Mobile[] mobile1 = new Mobile[100];	
		Mobile[] mobile2 = new Mobile[100];		
		Mobile[] mobile3 = new Mobile[100];
		
		/* Lap top */
		Laptop[] laptop1 = new Laptop[100];
		Laptop[] laptop2 = new Laptop[100];
		
		/* Tablet */
		Tablet[] tablet1 = new Tablet[100];
		Tablet[] tablet2 = new Tablet[100];
		
		
		/* Keyboard */
		Keyboard[] Gkeyboard = new Keyboard[100];

			
		/* Mouse */
		Mouse[] Gmouse =  new Mouse[100];
		
		
		/* Earphone */
		Earphone[] earphone1 = new Earphone[100];
		Earphone[] earphone2 = new Earphone[100];
		
 	
		
		/* seller who manages this program, set default PW as 1234 */
		Seller master = new Seller(1234);
		
	
		
		
		
		
		
		
		
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		Mobile m4 = new Mobile();
		
		
		System.out.println(m1.total_order);
		System.out.println(m2.total_order);
		System.out.println(Mobile.total_order);
		System.out.println(Laptop.total_order);
		System.out.println(Earphone.total_order);
		
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
			
			
			// 원래 품목, 전체주문 수량, 수량(추가하는 거)로 이뤄져 있었으나
			// 재고 수량도 추가함
			
			System.out.println("================ Stock =================");
			System.out.println("   Product   /  Total order quantity   /  Stock  /  Quantity  ");
			
			
			
		}
		
		
		/* 비밀번호 변경 selType == 3 */
		
		if (selType == 3) {
			
			
			/* Show the seller's default AccessKey */
			System.out.println("default pw: " + master.getAccessKey() );
			
			
			System.out.println("Enter the new PW: OOOO");
			int newPW = keyboard.nextInt();
			
			/* new PW setting */
			master.setAccessKey(newPW);
			
			System.out.println("You enter: " + master.getAccessKey() );
			
			
		}
		
		
		
		
		
		/////////////////////////////////////////////
		/////////////////* User *////////////////////
		/////////////////////////////////////////////
		
		
		/* User, type == 1 */
		
		
		
		
		
		
		//To show User, Set All Value 
		
		//GPhone
		Mobile gMobile1 = new Mobile();
		
		gMobile1.setName("GPhone13 cutie");
		gMobile1.setPrice(899.99);
		gMobile1.setWeight(130.77);		
		gMobile1.setSpec("G13 Bionic","4GB RAM" ,"LED 4.7-inch display");
		gMobile1.setColor("Space Gray, Emerald Green, Bad Red");
		gMobile1.setStorage("64GB, 256GB");
		
		
		
		Mobile gMobile2 = new Mobile();
		
		gMobile2.setName("GPhone13 standard");
		gMobile2.setPrice(1299.99);
		gMobile2.setWeight(162.77);		
		gMobile2.setSpec("G13X Bionic", "8GB RAM", "OLED 6.1-inch display");
		gMobile2.setColor("Space Gray, Emerald Green, Bad Red, Woody Brown");	
		gMobile1.setStorage("64GB, 256GB, 512GB");
		
		
		
		Mobile gMobile3 = new Mobile();
		
		gMobile2.setName("GPhone13 Maximus");
		gMobile2.setPrice(2599.99);
		gMobile2.setWeight(238.77);		
		gMobile2.setSpec("G14 Bionic","32GB RAM" ,"OLED 6.7-inch display");
		gMobile2.setColor("Space Gray, Emerald Green, Bad Red, Woody Brown, Sunny Gold");
		gMobile1.setStorage("64GB, 256GB, 512GB, 3TB");
		
		
		
		
	
		
		//GBook
		Laptop gLaptop1 = new Laptop();
		
		gLaptop1.setName("GacBook Air");
		gLaptop1.setPrice(2499.99);
		gLaptop1.setWeight(130.77);		
		gLaptop1.setSpec("Gapple G1 Chip","16GB DDR4" ,"OLED 13.3-inch display");
		gLaptop1.setColor("Space Gray, Silver, Sunny Gold");
		gLaptop1.setStorage("256GB, 512GB, 1TB, 2TB");
		
		Laptop gLaptop2 = new Laptop();
		
		gLaptop2.setName("GacBook Pro");
		gLaptop2.setPrice(7700.00);
		gLaptop2.setWeight(130.77);		
		gLaptop2.setSpec("Gapple G1X Chip","64GB DDR4" ,"OLED 16-inch display");
		gLaptop2.setColor("Space Gray, Silver, Sunny Gold");
		gLaptop2.setStorage("1TB, 4TB, 8TB");
		
		
		
		
		
		
		
		//GPad
		Tablet gTablet1 = new Tablet();
		
		gTablet1.setName("GPad Air");
		gTablet1.setPrice(1099.99);
		gTablet1.setWeight(457.77);		
		gTablet1.setSpec("G13X Bionic","4GB RAM" ,"OLED 10-inch display");
		gTablet1.setColor("Space Gray, Silver, Woody Brown");
		gTablet1.setStorage("128GB, 256GB");
		
		Tablet gTablet2 = new Tablet();
		
		gTablet2.setName("GPad Pro");
		gTablet2.setPrice(2799.99);
		gTablet2.setWeight(647.77);		
		gTablet2.setSpec("Gapple G1 Chip","8GB RAM" ,"OLED 11-inch display");
		gTablet2.setColor("Space Gray, Silver, Woody Brown");
		gTablet2.setStorage("1TB, 2TB");
		
		
		
		
		//Set Accessories
		
		
		//GKeyboard
		Keyboard gKeyboard = new Keyboard();
		
		gKeyboard.setName("G-Keyboard");
		gKeyboard.setPrice(59.99);
		gKeyboard.setWeight(1100.00);		
		gKeyboard.setColor("White");
		
		
		
		
		
		//GMouse
		Mouse gMouse = new Mouse();
		
		gMouse.setName("G-Mouse");
		gMouse.setPrice(29.99);
		gMouse.setWeight(85.00);		
		gMouse.setColor("White");
		
		
		
		
		
		
		//GEarphone
		Earphone gEarphone1 = new Earphone();
		
		gMouse.setName("GPod");
		gMouse.setPrice(156.75);
		gMouse.setWeight(35.55);		
		gMouse.setColor("White");
		
		Earphone gEarphone2 = new Earphone();
		
		gMouse.setName("GPod Pro");
		gMouse.setPrice(320.25);
		gMouse.setWeight(37.77);		
		gMouse.setColor("White");
		
		//End Set
		
		
		
		
		
		
		
		//menu choice
		
		int choiceMenu = keyboard.nextInt();
		int choiceDevice = keyboard.nextInt();
		String colorChoice;
		String storageChoice;
		System.out.println("1.GPhone 2.GBook 3.GPad"+"\n"
				+ "4.Keyboard 5.Mouse 6.Gpod");
		
		int count = 0;
		
		switch(choiceMenu)
		{
			case 1:
				System.out.println("1." + gMobile1);	
				System.out.println("2." + gMobile2);
				System.out.println("3" + gMobile3);
				
				
				
				
				
				//고른 기종따라 다르게 출력 
				//Mobile
				if ( choiceDevice == 1 ) {	
//method로 만들기						
					System.out.println("Select Option");
					System.out.println("Choose your color: ");
					colorChoice = keyboard.nextLine();
					System.out.println("Choose your capacity: ");
					storageChoice = keyboard.nextLine();
					
					mobile1[count] = new Mobile(colorChoice, storageChoice);
					count++;		
				}
				
				if ( choiceDevice == 2 ) {
					System.out.println("Select Option");
					System.out.println("Choose your color: ");
					colorChoice = keyboard.nextLine();
					System.out.println("Choose your capacity: ");
					storageChoice = keyboard.nextLine();
											
					mobile2[count] = new Mobile(colorChoice, storageChoice);
					count++;		
				}
				
				if ( choiceDevice == 3 ) {
					System.out.println("Select Option");
					System.out.println("Choose your color: ");
					colorChoice = keyboard.nextLine();
					System.out.println("Choose your capacity: ");
					storageChoice = keyboard.nextLine();
											
					mobile3[count] = new Mobile(colorChoice, storageChoice);
					count++;		
				}
				
				
				
				
				break;
				
				
				
				
				
				//Laptop
			case 2:
				System.out.println("1." + gLaptop1);	
				System.out.println("2." + gLaptop2);
				
				
				
				
				if ( choiceDevice == 1 ) {
					System.out.println("Select Option");
					System.out.println("Choose your color: ");
					colorChoice = keyboard.nextLine();
					System.out.println("Choose your capacity: ");
					storageChoice = keyboard.nextLine();
											
					laptop1[count] = new Laptop(colorChoice, storageChoice);
					count++;		
				}
				
				if ( choiceDevice == 2 ) {
					System.out.println("Select Option");
					System.out.println("Choose your color: ");
					colorChoice = keyboard.nextLine();
					System.out.println("Choose your capacity: ");
					storageChoice = keyboard.nextLine();
											
					laptop2[count] = new Laptop(colorChoice, storageChoice);
					count++;		
				}
				
				
				
				
				break;
				
				
				
				//Tablet
			case 3:
				System.out.println("1." + gTablet1);	
				System.out.println("2." + gTablet2);
				
				
				
				
				
				if ( choiceDevice == 1 ) {
					System.out.println("Select Option");
					System.out.println("Choose your color: ");
					colorChoice = keyboard.nextLine();
					System.out.println("Choose your capacity: ");
					storageChoice = keyboard.nextLine();
											
					tablet1[count] = new Tablet(colorChoice, storageChoice);
					count++;		
				}
				
				if ( choiceDevice == 2 ) {
					System.out.println("Select Option");
					System.out.println("Choose your color: ");
					colorChoice = keyboard.nextLine();
					System.out.println("Choose your capacity: ");
					storageChoice = keyboard.nextLine();
											
					tablet2[count] = new Tablet(colorChoice, storageChoice);
					count++;		
				}
				
				
				
				break;
				
				
				
				
				//Keyboard
			case 4:
				
				System.out.println(gKeyboard);	
				System.out.println("Select Option");						
				Gkeyboard[count] = new Keyboard();
				count++;
				
				break;
				
				
				
				
//option in accessories??
				
				//Mouse
			case 5:
				System.out.println(gMouse);	
				System.out.println("Select Option");					
				Gmouse[count] = new Mouse();
				count++;
				
				
				break;
				
				
				//Earphone
			case 6:
				System.out.println("1." + gEarphone1);	
				System.out.println("2." + gEarphone2);
				
				
				if ( choiceDevice == 1 ) {
					System.out.println("Select Option");						
					earphone1[count] = new Earphone();
					count++;		
				}
				
				if ( choiceDevice == 2 ) {
					System.out.println("Select Option");
					earphone2[count] = new Earphone();
					count++;		
				}
				
				
				break;
				
			default:
				System.out.println("Choose between menu");
				break;
				
		}//end switch
		
		
		
		
		
		
		
		
	}//end main

}//end Main
