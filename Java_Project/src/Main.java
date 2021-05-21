import java.util.Scanner;
import java.io.*;

public class Main {
	
	
		
			private static String userName;
			private static String userTel;
			 
			 
			 
			private static String colorChoice;
			private static String storageChoice;
				
			
			
			
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
		 
		 ////////////////////////////
		 // 하단 수정해야 함 클래스 만든 것처럼 */
		 
	
		 
		 public static Keyboard gKeyboard = new Keyboard_first();
		 public static Mouse gMouse = new Mouse_first();
		 
		 public static Earphone gEarphone1 = new Earphone_first();
		 public static Earphone gEarphone2 = new Earphone_second();
	
		 
		 
		 
		 //////////////////////////
		 
		 /* Array */
		 
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
		

		
		////////////////////////////
		// 클래스 만드시고 위처럼 클래스 이름 수정하셔야 됩
		
		

		
		
		/* Keyboard */
		public static Keyboard[] Gkeyboard = new Keyboard_first[100];

			
		/* Mouse */
		public static Mouse[] Gmouse =  new Mouse_first[100];
		
		
		/* Earphone */
		public static Earphone[] earphone1 = new Earphone_first[100];
		public static Earphone[] earphone2 = new Earphone_second[100];
		
		
		/* seller who manages this program, set default PW as 1234 */
		public static Seller master = new Seller(1234);
		
	
		
		
		 public static void options() {
			Scanner keyboard1 = new Scanner(System.in);
			System.out.println("Select Option");
			System.out.println("Choose your color: (string)");
			String color_Choice = keyboard1.nextLine();
			setColorChoice(color_Choice);
			System.out.println("Choose your capacity: (string) ");
			String storage_Choice = keyboard1.nextLine();
			setStorageChoice(storage_Choice);
			keyboard1.close();
		 }
		 
		 
		 
		 
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
		 
		 
		 public static void printOrder() {
			 
			 /*
			 String[] category = {"mobile1", "mobile2", "mobile3", "Laptop1", "Laptop2", "tablet1", "tablet2",
					 "Gkeyboard", "Gmouse", "earphone1", "earphone2"}; 
			 
			 String[] category2 = {"Mobile", "mobile2", "mobile3", "Laptop1", "Laptop2", "tablet1", "tablet2",
					 "Gkeyboard", "Gmouse", "earphone1", "earphone2"}; 
			 */
			 
			 System.out.println("=============================== Gapple order list ================================");
			 System.out.println("   Product    /    Name   /    TEL    /  Price   /   Color   /    Storage    /    Date   /");
			 
			 
			 try {
				 
				 for (Mobile_first f : mobile1) {
					 
					 f.writeOutput();
					 
				 } 
				 
			 }
			 catch(NullPointerException e){
				 
				 System.out.println("ERROR: array is null.\n\n");
				 
			 }
				 
		 }
		 
		 
		 public static void printInventory() {
			 
			 
			 
			// 원래 품목, 전체주문 수량, 수량(추가하는 거)로 이뤄져 있었으나
						// 재고 수량도 추가함
						
			System.out.println("================ Stock =================");
			System.out.println("   Product   /  Total order quantity   /  Stock  ");
			System.out.println(gMobile1.getName() );  // 상속 정의 되면 수량이랑 재고 출력할 예정.
			System.out.println(gMobile2.getName() );
			System.out.println(gMobile3.getName() );
			
			System.out.println(gLaptop1.getName() );
			System.out.println(gLaptop2.getName() );
			
			System.out.println(gTablet1.getName() );
			System.out.println(gTablet2.getName() );
			
			//System.out.println(gMobile1.getName() );
			//System.out.println(gMobile1.getName() );
			//System.out.println(gMobile1.getName() );
		 }
		 
		 
		 
		 
		 
		 public static void simulate() {
			 
			 
			 
				////////////////////////////////////////////////////////////////
				//////////////*        Program Start       *///////////////////
				///////////////////////////////////////////////////////////////
				
				
				
			 /* Home type */
				
			 
			 Scanner keyboard = new Scanner(System.in);	
			 int type = 0;
			 
			 while(true) {
			 		
			 		
			 		
				System.out.println("Select the type.");
				System.out.println("1. User. 2. Seller. 3. exit: ");
				
				
				/* it's for user or seller */
				
				type = keyboard.nextInt();
				keyboard.nextLine();
				
				if(type==3) {
					
					System.out.println("Thank your. Program is exit.");
					break;
				}
				
				
				
				
				
				/////////////////////////////////////////////
				/////////////////* Seller *////////////////////
				/////////////////////////////////////////////
				if(type==2) {				
				
				
					
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
					
					System.out.println("1. 주문내역 2. 재고관리 3. 비밀번호 변경 4. 뒤로가기: ");
					
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
					
				System.out.println("Type your Name: ");
				userName = keyboard.nextLine();
				
				System.out.println("Type your TEL: ");
				userTel = keyboard.nextLine();
				
				
				System.out.println("Your name is " + userName);
				System.out.println("Your number is " + userTel + "\n");

				
				
				
				
		
				//End Set
				
				
				
				int choiceMenu;
				int choiceDevice;
				//Main  = new Main();
			
				
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
						System.out.println("1." + gLaptop1);	
						System.out.println("2." + gLaptop2);
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
						
						System.out.println("1." + gTablet1);	
						System.out.println("2." + gTablet2);
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
						
						
						
						
						//Keyboard
					case 4:
						System.out.println("Selected GKeyboard\n");	
						System.out.println(gKeyboard);	
						//System.out.println("Select Option");	
						
						
						Gkeyboard[countKeyboard] = new Keyboard_first(userName, userTel);
						countKeyboard++;
						
						break;
						
						
						
			
						
						//Mouse
					case 5:
						System.out.println("Selected GMouse\n");
						System.out.println(gMouse);	
						//System.out.println("Select Option");
							
						
						Gmouse[countMouse] = new Mouse_first(userName, userTel);
						countMouse++;
						
						
						break;
						
						
						//Ear phone
					case 6:
						
						
						//GOAL: 'wireless' access and set by option
						/*
						Earphone obj = new Earphone();
						obj.methodBluetooth();
						*/
						
						
						
						System.out.println("1." + gEarphone1);	
						System.out.println("2." + gEarphone2);
						choiceDevice = keyboard.nextInt();
						
						if ( choiceDevice == 1 ) {
							System.out.println("Selected GPod\n");
							//System.out.println("Select Option");						
							earphone1[countEarphone1] = new Earphone_first(userName, userTel);
							countEarphone1++;		
						}
						
						if ( choiceDevice == 2 ) {
							System.out.println("Selected GPod Pro\n");
							//System.out.println("Select Option");
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
