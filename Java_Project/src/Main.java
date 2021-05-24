import java.util.Scanner;
import java.io.*;

public class Main {
	
	
		
			private static String userName;
			private static String userTel;
			 
			 
			 
			private static String colorChoice;
			private static String storageChoice;
				
			
			
		   	public static int countMobile1;
			 public static int countMobile2;
			 public static int countMobile3;
			 
			 public static int countLaptop1;
			 public static int countLaptop2;
			 
			 public static int countTablet1;
			 public static int countTablet2;
			 
			 public static int countKeyboard;
			 
			 public static int countMouse;
			 
			 public static int countEarphone1;
			 public static int countEarphone2;
			
			
			
			
			public static String getColorChoice() {
					return colorChoice;
			}
			public static void setColorChoice(String color_Choice) {
					colorChoice = color_Choice;
			}
			public static String getStorageChoice() {
					return storageChoice;
			}
			public static void setStorageChoice(String storage_Choice) {
					storageChoice = storage_Choice;
			}
			 
		 
		 
			
		 /* default setting items */
			
		 public static Mobile_first gMobile1 = new Mobile_first();
		 public static Mobile_second gMobile2 = new Mobile_second();
		 public static Mobile_third gMobile3 = new Mobile_third();
		 
		 public static Laptop_first gLaptop1 = new Laptop_first();
		 public static Laptop_second gLaptop2 = new Laptop_second();
		 
		 public static Tablet_first gTablet1 = new Tablet_first();
		 public static Tablet_second gTablet2 = new Tablet_second();
		 
		 
		 public static Keyboard_first gKeyboard = new Keyboard_first();
		 public static Mouse_first gMouse = new Mouse_first();
		 
		 public static Earphone_first gEarphone1 = new Earphone_first();
		 public static Earphone_second gEarphone2 = new Earphone_second();
	
		 
		 
		 
		 
		/////////////////////////////////////////////////////////////
		////////////////////// /*   Array    *///////////////////////
		/////////////////////////////////////////////////////////////
		 
		 /* Maximum is 100 */
		
		 
		
		/* Mobile */
		public static Mobile_first[] mobile1 = new Mobile_first[100];	
		public static Mobile_second[] mobile2 = new Mobile_second[100];		
		public static Mobile_third[] mobile3 = new Mobile_third[100];
		
		/* Lap top */
		public static Laptop_first[] laptop1 = new Laptop_first[100];
		public static Laptop_second[] laptop2 = new Laptop_second[100];
		
		/* Tablet */
		public static Tablet_first[] tablet1 = new Tablet_first[100];
		public static Tablet_second[] tablet2 = new Tablet_second[100];
		

		/* Keyboard */
		public static Keyboard_first[] Gkeyboard = new Keyboard_first[100];

			
		/* Mouse */
		public static Mouse_first[] Gmouse =  new Mouse_first[100];
		
		
		/* Earphone */
		public static Earphone_first[] earphone1 = new Earphone_first[100];
		public static Earphone_second[] earphone2 = new Earphone_second[100];
		
		
		/* seller who manages this program, set default PW as 1234 */
		public static Seller master = new Seller(1234);
		
		
		
		/////////////////////////////////////////////////////////////
		////////////////////// /*   Method    *//////////////////////
		/////////////////////////////////////////////////////////////
		
		
		
	
		 /* To select an option */
		 public static void options() {
			Scanner keyboard1 = new Scanner(System.in);
			System.out.println("Select Option");
			System.out.print("Choose your color(string): ");
			String color_Choice = keyboard1.nextLine();
			setColorChoice(color_Choice);
			System.out.print("Choose your capacity(string): ");
			String storage_Choice = keyboard1.nextLine();
			setStorageChoice(storage_Choice);
			
			clientInfo();
		 }
		 
		 
		 /* to get info from user */
		 public static void clientInfo() {
			Scanner keyboard2 = new Scanner(System.in);
			System.out.print("\nEnter your Name: ");
			userName = keyboard2.nextLine();
			System.out.print("Your TEL: ");
			userTel = keyboard2.nextLine();
			System.out.println("loading...\n");
			System.out.println("[Orderer Details]");
			System.out.println("[Name] " + userName);
			System.out.println("[TEL] " + userTel);
			System.out.println("Ordered Successfully!!\n\n");
		 }
		 
		 
		 
		 /* for order list */
		 
		 public static void printOrder() {
			 
			 
			 
			 /*
			 String[] category = {"Mobile_first, Mobile_second, Mobile_third, Laptop_first, Laptop_second, Tablet_first, Tablet_second, Keyboard_first, Mouse_first, Earphone_first, Earphone_second"}; 
			 
			 
			 String[] category2 = {"gMobile1", "gMobile2", "gMobile3", "gLaptop1", "gLaptop2", "gTablet1",
					 "gTablet2", "gKeyboard", "gMouse", "gEarphone1", "gEarphone2"}; 
			 */
			 
			 
			 System.out.println("\n==================================== Gapple order list =============================================");
			 System.out.println("   Product    /    Name   /    TEL    /  Price   /   Color   /    Storage    /    Date   /");
			 
			 
			 
			 
			 String[] category = {"Mobile_first, Mobile_second, Mobile_third"};  // class 이름
			 
			 String[] category2 = {"mobile1", "mobile2", "mobile3"};    // 배열 이름
			
			 
			 int j = 0;
			 try {
				
				 for (String clas : category) {
					 
					 for (String obj : category2) {      // for (category[j] obj : category2 ) 도 오류
						 
						 obj.writeOutput();
						 
						 
					 } 
					 
				 }
				 
				 
				 
			 }
			 
			 catch(NullPointerException e){
				 
				 System.out.println("There is no order at this time.\r\n" + ".\n\n");
				 
			 }
				 
		 }
		 
		 
		 
		 
		 public static void printInventory() {
			 
			 
			 
						
			System.out.println("\n================ Stock =================");
			System.out.println("   Product   /  Total order quantity   /  Stock  ");
			System.out.println(gMobile1.getName() + " / " + countMobile1);  // 상속 정의 되면 수량이랑 재고 출력할 예정.
			System.out.println(gMobile2.getName() + " / " + countMobile2);
			System.out.println(gMobile3.getName() + " / " + countMobile3);
			
			System.out.println(gLaptop1.getName() + " / " + countLaptop1);
			System.out.println(gLaptop2.getName() + " / " + countLaptop2);
			
			System.out.println(gTablet1.getName() + " / " + countTablet1);
			System.out.println(gTablet2.getName() + " / " + countTablet2);
			
			System.out.println(gKeyboard.getName() + " / " + countKeyboard);
			System.out.println(gMouse.getName() + " / " + countMouse);
			
			System.out.println(gEarphone1.getName() + " / " + countEarphone1);
			System.out.println(gEarphone2.getName() + " / " + countEarphone2);
			
			
			
		 }
		 
		 
		 
		 
		 
		 public static void simulate() {
			 
			 
			 
				////////////////////////////////////////////////////////////////
				//////////////*        Program Start       *///////////////////
				///////////////////////////////////////////////////////////////
				
				
				
			 /* Home type */
				
			 
			 Scanner keyboard = new Scanner(System.in);	
			 int type = 0;
			 
			 while(true) {
			 		
			 		
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<G-Apple HOME>>>>>>>>>>>>>>>>>>>>>>>>>");	
				System.out.println("1. User. 2. Seller. 3. exit");
				System.out.print("Enter type: ");
				
				
				/* it's for user or seller */
				
				type = keyboard.nextInt();
				keyboard.nextLine();
				
				if(type==3) {
					
					System.out.println("Thank you. Program is exit.");
					break;
				}
				
				
			
				/////////////////////////////////////////////
				/////////////////* Seller *////////////////////
				/////////////////////////////////////////////
				if(type==2) {				
				
				
					
					/* Seller, type == 2*/
					
					
					
					/* Check PW */
					System.out.println("\n<<<<<<<<<<<<<<<SELLER MODE>>>>>>>>>>>>>>>");
					System.out.print("Enter the PW: ");
					
					int key = keyboard.nextInt();
					
					boolean isEqual = master.samePw(key);
					
					
					/* until the PW is correct */
					while(!isEqual) {
						
						/* if PW is incorrect */
						
						System.out.println("\nWrong PW. Try again.");
						
						
						System.out.println("\nEnter the PW: ");
						
						key = keyboard.nextInt();
						isEqual = master.samePw(key);
					}
					
					
					System.out.println("\nPW is right, Welcome!");
					
					System.out.print("1. 주문내역 2. 재고관리 3. 비밀번호 변경 4. 뒤로가기: ");
					
					int selType = keyboard.nextInt();
					
					
					if (selType == 4) {
						continue;
					}
				
				
					/* 주문내역 selType == 1 */
				
					if (selType == 1) {
						
						/* function call for order list */
						printOrder();
						
						
							
					}
					
					/* 재고관리 selType == 2 */
					
					if (selType == 2) {
						
						/* function call for inventory control */
						printInventory();
							
						
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
					
					
					
				}
				
				
				/* Seller finish */
			
				
			
				 
			 //if type==2 ends
				
				/////////////////////////////////////////////
				/////////////////* User *////////////////////
				/////////////////////////////////////////////
				
				
				/* User, type == 1 */
				
				
				
				if(type == 1)
				{
				System.out.println("\n"+"\n");
				System.out.println("Welcome to G-Apple Store!");	
				int choiceMenu;
				int choiceDevice;
				//Main  = new Main();
			
				
				while(true)
				{
					
					
				
				//menu choice
				System.out.println("<<<<<<<<<<<<<<<G-Apple Line-Up>>>>>>>>>>>>>>>");
				System.out.println(
						"1.GPhone		2.GBook		3.GPad"+"\n"+
						"4.Keyboard		5.Mouse		6.Gpod");
				System.out.println("(0.back to HOME)");
				System.out.print("\nWhat do you want? ");
				choiceMenu = keyboard.nextInt();
				keyboard.nextLine();
				
				//go HOME
				if(choiceMenu==0)
				{
					break;
				}
				
				switch(choiceMenu)
				{
					case 1:
						System.out.println("\n\nWorld Best. Gphone." + "\n");
						System.out.println("No.1" + "\n" + gMobile1);	
						System.out.println("No.2" + "\n" + gMobile2);
						System.out.println("No.3" + "\n" + gMobile3);
						System.out.print("=====>>Choose Your Device(int): ");
						choiceDevice = keyboard.nextInt();
						keyboard.nextLine();
						
						
						
						//고른 기종따라 다르게 출력 
						//Mobile
						if ( choiceDevice == 1 ) {	
							//method로 만들기						
							options();
							
							mobile1[countMobile1] = new Mobile_first(getColorChoice(), getStorageChoice(), userName, userTel);
							countMobile1++;		
						}
						
						if ( choiceDevice == 2 ) {
							options();
													
							mobile2[countMobile2] = new Mobile_second(getColorChoice(), getStorageChoice(), userName, userTel);
							countMobile2++;		
						}
						
						if ( choiceDevice == 3 ) {
							options();
													
							mobile3[countMobile3] = new Mobile_third(getColorChoice(), getStorageChoice(), userName, userTel);
							countMobile3++;		
						}
						
						break;
						
						
						
						//Lap top
					case 2:
						System.out.println("\n\nAlways Fast. GBook." + "\n");
						System.out.println("No.1" + "\n" + gLaptop1);	
						System.out.println("No.2" + "\n" + gLaptop2);
						System.out.print("=====>>Choose Your Device(int): ");
						choiceDevice = keyboard.nextInt();
						
						
						
						if ( choiceDevice == 1 ) {
							options();
													
							laptop1[countLaptop1] = new Laptop_first(getColorChoice(), getStorageChoice(), userName, userTel);
							countLaptop1++;		
						}
						
						if ( choiceDevice == 2 ) {
							options();
													
							laptop2[countLaptop2] = new Laptop_second(getColorChoice(), getStorageChoice(), userName, userTel);
							countLaptop2++;		
						}
						
											
						break;
						
						
						
						//Tablet
					case 3:
						System.out.println("\n\nBrilliant. GPad." + "\n");
						System.out.println("No.1" + "\n" + gTablet1);	
						System.out.println("No.2" + "\n" + gTablet2);
						System.out.print("=====>>Choose Your Device(int): ");
						choiceDevice = keyboard.nextInt();
						if ( choiceDevice == 1 ) {
							options();
													
							tablet1[countTablet1] = new Tablet_first(getColorChoice(), getStorageChoice(), userName, userTel);
							countTablet1++;		
						}
						
						if ( choiceDevice == 2 ) {
							options();
													
							tablet2[countTablet2] = new Tablet_second(getColorChoice(), getStorageChoice(), userName, userTel);
							countTablet2++;		
						}
						
						
						break;
						
						
						
				//Accessories	
						//Keyboard
					case 4:
						System.out.println("\n\nProgrammer's Identity. G-Keyboard." + "\n");
						System.out.println(gKeyboard);	
						clientInfo();
						Gkeyboard[countKeyboard] = new Keyboard_first(userName, userTel);
						countKeyboard++;
						
						break;
						
						
						
						//Mouse
					case 5:
						System.out.println("\n\nMagic. G-Mouse." + "\n");
						System.out.println(gMouse);	
						clientInfo();
						Gmouse[countMouse] = new Mouse_first(userName, userTel);
						countMouse++;
						
						break;
						
						
						//Ear phone
					case 6:
						
						
						//GOAL: 'wireless' access and set by option
						/*
						Ear phone objects = new Ear phone();
						objects.methodBluetooth();
						*/
						
						
						System.out.println("\n\nLive Concert. GPod." + "\n");
						System.out.println("No.1" + "\n" + gEarphone1);	
						System.out.println("No.2" + "\n" + gEarphone2);
						System.out.print("=====>>Choose Your Device(int): ");
						choiceDevice = keyboard.nextInt();
						
						if ( choiceDevice == 1 ) {
							System.out.println("Selected GPod\n");		
							clientInfo();
							earphone1[countEarphone1] = new Earphone_first(userName, userTel);
							countEarphone1++;		
						}
						
						if ( choiceDevice == 2 ) {
							System.out.println("Selected GPod Pro\n");
							clientInfo();
							earphone2[countEarphone2] = new Earphone_second(userName, userTel);
							countEarphone2++;		
						}
						
						break;
						
					default:
						System.out.println("Choose between menu");
						break;
							
							
				}//end switch
					
			}//end while
				
			}//end if type ==1
		 		
			 			
			 		
		 	}
			 
		 }		
			

			 
			 
			 
	
		public static void main(String[] args) {		
	
			
			simulate();
			
			System.out.println("End ");

	
		}
		
}
