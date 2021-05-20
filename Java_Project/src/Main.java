import java.util.Scanner;

public class Main {
	private String colorChoice;
	private String storageChoice;
	
	public String getColorChoice() {
		return colorChoice;
	}
	public void setColorChoice(String colorChoice) {
		this.colorChoice = colorChoice;
	}
	public String getStorageChoice() {
		return storageChoice;
	}
	public void setStorageChoice(String storageChoice) {
		this.storageChoice = storageChoice;
	}
	
	
	 public void options() {
		Scanner keyboard1 = new Scanner(System.in);
		System.out.println("Select Option");
		System.out.println("Choose your color: (string)");
		this.colorChoice = keyboard1.nextLine();
		System.out.println("Choose your capacity: (string) ");
		this.storageChoice = keyboard1.nextLine();
		keyboard1.close();
	 }
	 
	 
	 
	 
	 static int countMobile1;
	 static int countMobile2;
	 static int countMobile3;
	 
	 static int countLaptop1;
	 static int countLaptop2;
	 
	 static int countTablet1;
	 static int countTablet2;
	 
	 static int countKeyboard;
	 
	 static int countMouse;
	 
	 static int countEarphone1;
	 static int countEarphone2;
	 
	 
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
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		
		Tablet t1 = new Tablet();
		Tablet t2 = new Tablet();
		
		Keyboard k1 = new Keyboard();
		
		Mouse mse1 = new Mouse();
		
		Earphone e1 = new Earphone();
		Earphone e2 = new Earphone();
		
		/*
		// modify needed
		 
		System.out.println(m1.total_order);
		System.out.println(m2.total_order);
		System.out.println(m3.total_order);
		
		System.out.println(l1.total_order);
		System.out.println(l2.total_order);
		
		System.out.println(t1.total_order);
		System.out.println(t2.total_order);
		
		System.out.println(k1.total_order);
		
		System.out.println(mse1.total_order);
		
		System.out.println(e1.total_order);
		System.out.println(e2.total_order);
		
		
		System.out.println(Mobile.total_order);
		System.out.println(Laptop.total_order);
		System.out.println(Tablet.total_order);
		System.out.println(Keyboard.total_order);
		System.out.println(Mouse.total_order);
		System.out.println(Earphone.total_order);
		*/
		
		///////////////////////////////////
		///////////* Program */////////////
		///////////////////////////////////
		
		
		
		/* Home type */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Select the type.");
		System.out.println("1. User. 2. Seller: ");
		
		int type = keyboard.nextInt();
		
		
		if(type==2)
		{
		
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
		
		
		
		}//if type==2 ends
		
		/////////////////////////////////////////////
		/////////////////* User *////////////////////
		/////////////////////////////////////////////
		
		
		/* User, type == 1 */
		
		
		
		if(type == 1)
		{
			
			keyboard.nextLine();
			
		System.out.println("Type your Name: ");
		String userName = keyboard.nextLine();
		
		System.out.println("Type your TEL: ");
		String userTel = keyboard.nextLine();
		
		
		
		//To show User, Set All Value 
		
		//GPhone
		Mobile gMobile1 = new Mobile();
//////////////////////////////////////////////////////////////test		
		gMobile1.setUserName(userName);
		gMobile1.setUserNumber(userTel);
//////////////////////////////////////////////////////////////////
		
		
		gMobile1.setName("GPhone13 cutie");
		gMobile1.setPrice(899.99);
		gMobile1.setWeight(130.77);		
		gMobile1.setSpec("G13 Bionic","4GB RAM" ,"LED 4.7-inch display");
		gMobile1.setColor("Space Gray, Emerald Green, Bad Red");
		gMobile1.setStorage("64GB, 256GB");
		
		
		
		Mobile gMobile2 = new Mobile();
		
		gMobile2.setUserName(userName);
		gMobile2.setUserNumber(userTel);
		
		gMobile2.setName("GPhone13 standard");
		gMobile2.setPrice(1299.99);
		gMobile2.setWeight(162.77);		
		gMobile2.setSpec("G13X Bionic", "8GB RAM", "OLED 6.1-inch display");
		gMobile2.setColor("Space Gray, Emerald Green, Bad Red, Woody Brown");	
		gMobile1.setStorage("64GB, 256GB, 512GB");
		
		
		
		Mobile gMobile3 = new Mobile();
		
		gMobile3.setUserName(userName);
		gMobile3.setUserNumber(userTel);
		
		gMobile3.setName("GPhone13 Maximus");
		gMobile3.setPrice(2599.99);
		gMobile3.setWeight(238.77);		
		gMobile3.setSpec("G14 Bionic","32GB RAM" ,"OLED 6.7-inch display");
		gMobile3.setColor("Space Gray, Emerald Green, Bad Red, Woody Brown, Sunny Gold");
		gMobile3.setStorage("64GB, 256GB, 512GB, 3TB");
		
		
		
		
	
		
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
		
		gEarphone1.setName("GPod");
		gEarphone1.setPrice(156.75);
		gEarphone1.setWeight(35.55);		
		gEarphone1.setColor("White");
		
		Earphone gEarphone2 = new Earphone();
		
		gEarphone2.setName("GPod Pro");
		gEarphone2.setPrice(320.25);
		gEarphone2.setWeight(37.77);		
		gEarphone2.setColor("White");
		
		//End Set
		
		
		
		int choiceMenu;
		int choiceDevice;
		Main myOption = new Main();
	
		
		while(true)
		{
			
			
			
		
		//menu choice
		
		
		System.out.println("1.GPhone 2.GBook 3.GPad"+"\n"
				+ "4.Keyboard 5.Mouse 6.Gpod"+"\n"+"\n");
		choiceMenu = keyboard.nextInt();
		keyboard.nextLine();
		
		
		
		switch(choiceMenu)
		{
			case 1:
				System.out.println("1." + gMobile1);	
				System.out.println("2." + gMobile2);
				System.out.println("3." + gMobile3);
				System.out.println("Choose Device: ");
				choiceDevice = keyboard.nextInt();
				keyboard.nextLine();
				
				
				
				
				//고른 기종따라 다르게 출력 
				//Mobile
				if ( choiceDevice == 1 ) {	
//method로 만들기						
					myOption.options();
					
					mobile1[countMobile1] = new Mobile(myOption.getColorChoice(), myOption.getStorageChoice());
					countMobile1++;		
				}
				
				if ( choiceDevice == 2 ) {
					myOption.options();
											
					mobile2[countMobile2] = new Mobile(myOption.getColorChoice(), myOption.getStorageChoice());
					countMobile2++;		
				}
				
				if ( choiceDevice == 3 ) {
					myOption.options();
											
					mobile3[countMobile3] = new Mobile(myOption.getColorChoice(), myOption.getStorageChoice());
					countMobile3++;		
				}
				
				
				
				
				break;
				
				
				
				
				
				//Laptop
			case 2:
				System.out.println("1." + gLaptop1);	
				System.out.println("2." + gLaptop2);
				choiceDevice = keyboard.nextInt();
				
				
				
				if ( choiceDevice == 1 ) {
					myOption.options();
											
					laptop1[countLaptop1] = new Laptop(myOption.getColorChoice(), myOption.getStorageChoice());
					countLaptop1++;		
				}
				
				if ( choiceDevice == 2 ) {
					myOption.options();
											
					laptop2[countLaptop2] = new Laptop(myOption.getColorChoice(), myOption.getStorageChoice());
					countLaptop2++;		
				}
				
				
				
				
				break;
				
				
				
				//Tablet
			case 3:
				System.out.println("1." + gTablet1);	
				System.out.println("2." + gTablet2);
				choiceDevice = keyboard.nextInt();
				if ( choiceDevice == 1 ) {
					myOption.options();
											
					tablet1[countTablet1] = new Tablet(myOption.getColorChoice(), myOption.getStorageChoice());
					countTablet1++;		
				}
				
				if ( choiceDevice == 2 ) {
					myOption.options();
											
					tablet2[countTablet2] = new Tablet(myOption.getColorChoice(), myOption.getStorageChoice());
					countTablet2++;		
				}
				
				
				
				break;
				
				
				
				
				//Keyboard
			case 4:
				
				System.out.println(gKeyboard);	
				System.out.println("Select Option");	
				
				Gkeyboard[countKeyboard] = new Keyboard();
				countKeyboard++;
				
				break;
				
				
				
	
				
				//Mouse
			case 5:
				System.out.println(gMouse);	
				System.out.println("Select Option");
				
				Gmouse[countMouse] = new Mouse();
				countMouse++;
				
				
				break;
				
				
				//Earphone
			case 6:
				
				
				//GOAL: 'wireless' access and set by option
				/////////////////////////////////////////////////
				Earphone obj = new Earphone();
				obj.methodBluetooth();
				/////////////////////////////////////////////////
				
				
				
				
				
				
				
				
				System.out.println("1." + gEarphone1);	
				System.out.println("2." + gEarphone2);
				choiceDevice = keyboard.nextInt();
				
				if ( choiceDevice == 1 ) {
					System.out.println("Select Option");						
					earphone1[countEarphone1] = new Earphone();
					countEarphone1++;		
				}
				
				if ( choiceDevice == 2 ) {
					System.out.println("Select Option");
					earphone2[countEarphone2] = new Earphone();
					countEarphone2++;		
				}
				
				break;
				
			default:
				System.out.println("Choose between menu");
				break;
				
		}//end switch
			
	}//end while
		
	}//end if type ==1
	
	}//end main

}//end Main
