import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
	
	
		
	
			private static String userName;
			private static String userTel;
			private static String userAddress;
			private static String userEmail;
			 
			 
			private static String colorChoice;
			private static String storageChoice;
			
			
			/* for file write */
			static PrintWriter outputStream = null;
			static PrintWriter outputStream_stock = null;
			
			
		
			
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
			 
			 
			 /* for Date */
			 SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
			 Date time = new Date();
			 
			 String time1 = format1.format(time);
			 System.out.println("DATE: " + time1);
			 outputStream.println("DATE: " + time1);
			 
			 
			 /* main order list */
			 
			 System.out.println("\n======================== Gapple order list =================================");
			 System.out.println("   Product    /    Name   /    TEL    /  Price   /   Color   /    Storage    /");
			 
			 outputStream.println("\n======================== Gapple order list =================================");
			 outputStream.println("   Product    /    Name   /    TEL    /  Price   /   Color   /    Storage    /");
			 
			 String[] class_name = {"Mobile_first", "Mobile_second", " Mobile_third"};
			 String[] obj_name = {"mobile1", "mobile2", "mobile3"};
			 
			 
			 /* print all of data in the arrays */
			 
			 for(int i = 0; i < Mobile_first.total; i++) {
				
				 mobile1[i].writeOutput(); 
				 
				 outputStream.println(mobile1[i].writeFileOutput());
				 
			 }
			 
			 for(int i = 0; i < Mobile_second.total; i++) {
					
				 mobile2[i].writeOutput(); 
				 outputStream.println(mobile2[i].writeFileOutput());
				 
			 }
			 
			 for(int i = 0; i < Mobile_third.total; i++) {
					
				 mobile3[i].writeOutput(); 
				 outputStream.println(mobile3[i].writeFileOutput());
				 
			 }
			 
			 for(int i = 0; i< Laptop_first.total; i++) {
				 
				 laptop1[i].writeOutput(); 
				 outputStream.println(laptop1[i].writeFileOutput());
			 }
						 
			 
			 for(int i = 0; i< Laptop_second.total; i++) {
							 
				 laptop2[i].writeOutput(); 
				 outputStream.println(laptop2[i].writeFileOutput());
			 }


			 for(int i = 0; i< Tablet_first.total; i++) {
				 
				 tablet1[i].writeOutput(); 
				 outputStream.println(tablet1[i].writeFileOutput());
			 }
			 
			 
			 for(int i = 0; i< Tablet_second.total; i++) {
				 
				 tablet2[i].writeOutput(); 
				 outputStream.println(tablet2[i].writeFileOutput());
			 }
			 
			 
			 
			 for(int i=0; i < Keyboard_first.total; i++) {
				 
				 Gkeyboard[i].writeOutput();
				 outputStream.println(Gkeyboard[i].writeFileOutput());
				 
			 }

			 
			 
			 for(int i=0; i < Mouse_first.total; i++) {
				 
				 Gmouse[i].writeOutput();
				 outputStream.println(Gmouse[i].writeFileOutput());
				 
			 }
			 
			
			 for(int i=0; i < Earphone_first.total; i++) {
				 
				 earphone1[i].writeOutput();
				 outputStream.println(earphone1[i].writeFileOutput());
				 
			 }


			 for(int i=0; i < Earphone_second.total; i++) {
	 
				 earphone2[i].writeOutput();
				 outputStream.println(earphone2[i].writeFileOutput());
	 
			 }
			
			 
			 
			 double Mobile_sales = gMobile1.getSales() + gMobile2.getSales() + gMobile3.getSales();
			 double Laptop_sales =  gLaptop1.getSales() + gLaptop2.getSales();
			 double Tablet_sales = gTablet1.getSales() + gTablet2.getSales();
			 double Acc_sales =  gKeyboard.getSales() + gMouse.getSales() + gEarphone1.getSales() + gEarphone2.getSales();
			 
			 double All_sales = Mobile_sales + Laptop_sales + Tablet_sales + Acc_sales;
			 All_sales = Double.parseDouble(String.format("%.2f",All_sales));


			 System.out.println("\nSales of mobile is " + Mobile_sales );
			 System.out.println("Sales of laptop is " + Laptop_sales);
			 System.out.println("Sales of tablet is " + Tablet_sales);	 
			 System.out.println("Sales of acc is " + Acc_sales);
			 System.out.println("** Sales of all item is " + All_sales + "\n");
		 
			 
			 outputStream.println("\nSales of mobile is " + Mobile_sales );
			 outputStream.println("Sales of laptop is " + Laptop_sales);
			 outputStream.println("Sales of tablet is " + Tablet_sales);	 
			 outputStream.println("Sales of acc is " + Acc_sales);
			 outputStream.println("** Sales of all item is " + All_sales + "\n");
			 
			 
		 } 
		 
		 
		 
		 
		 public static void printInventory() {
			 
			 
			 /* for Date */
			SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
			Date time = new Date();
			 
			String time2 = format2.format(time);
			System.out.println("DATE: " + time2);
			outputStream_stock.println("DATE: " + time2);
			 
			 
			/* print in the console */
			System.out.println("\n================ Stock =================");
			System.out.println("   Product   /  Total order quantity   /  Stock  ");
			System.out.println(gMobile1.getName() + " / " + Mobile_first.total + " / " + Mobile_first.stock);  
			System.out.println(gMobile2.getName() + " / " + Mobile_second.total + " / " + Mobile_second.stock);
			System.out.println(gMobile3.getName() + " / " + Mobile_third.total + " / " + Mobile_third.stock);
			
			
			System.out.println(gLaptop1.getName() + " / " + Laptop_first.total + " / " + Laptop_first.stock);
			System.out.println(gLaptop2.getName() + " / " + Laptop_second.total + " / " + Laptop_second.stock);
			
			System.out.println(gTablet1.getName() + " / " + Tablet_first.total + " / " + Tablet_first.stock);
			System.out.println(gTablet2.getName() + " / " + Tablet_second.total + " / " + Tablet_second.stock);
			
			System.out.println(gKeyboard.getName() + " / " + Keyboard_first.total + " / " + Keyboard_first.stock);
			System.out.println(gMouse.getName() + " / " + Mouse_first.total + " / " + Mouse_first.stock);
			
			System.out.println(gEarphone1.getName() + " / " + Earphone_first.total + " / " + Earphone_first.stock);
			System.out.println(gEarphone2.getName() + " / " + Earphone_second.total + " / " + Earphone_second.stock);
			
			
			System.out.println("\nTotal mobile is " + Measurable.getTotal_mobile() );
			System.out.println("Total laptop is " + Measurable.getTotal_laptop() );
			System.out.println("Total tablet is " + Measurable.getTotal_tablet() );
			System.out.println("Total acc is " + Measurable.getTotal_acc() );
			System.out.println("** All order item is " + Measurable.getAll() +"\n");
			
			
			
			/* File outputStream */
			
			outputStream_stock.println("\n================ Stock =================");
			outputStream_stock.println("   Product   /  Total order quantity   /  Stock  ");
			outputStream_stock.println(gMobile1.getName() + " / " + Mobile_first.total + " / " + Mobile_first.stock);  
			outputStream_stock.println(gMobile2.getName() + " / " + Mobile_second.total + " / " + Mobile_second.stock);
			outputStream_stock.println(gMobile3.getName() + " / " + Mobile_third.total + " / " + Mobile_third.stock);
			
			
			outputStream_stock.println(gLaptop1.getName() + " / " + Laptop_first.total + " / " + Laptop_first.stock);
			outputStream_stock.println(gLaptop2.getName() + " / " + Laptop_second.total + " / " + Laptop_second.stock);
			
			outputStream_stock.println(gTablet1.getName() + " / " + Tablet_first.total + " / " + Tablet_first.stock);
			outputStream_stock.println(gTablet2.getName() + " / " + Tablet_second.total + " / " + Tablet_second.stock);
			
			outputStream_stock.println(gKeyboard.getName() + " / " + Keyboard_first.total + " / " + Keyboard_first.stock);
			outputStream_stock.println(gMouse.getName() + " / " + Mouse_first.total + " / " + Mouse_first.stock);
			
			outputStream_stock.println(gEarphone1.getName() + " / " + Earphone_first.total + " / " + Earphone_first.stock);
			outputStream_stock.println(gEarphone2.getName() + " / " + Earphone_second.total + " / " + Earphone_second.stock);
			
			
			outputStream_stock.println("\nTotal mobile is " + Measurable.getTotal_mobile() );
			outputStream_stock.println("Total laptop is " + Measurable.getTotal_laptop() );
			outputStream_stock.println("Total tablet is " + Measurable.getTotal_tablet() );
			outputStream_stock.println("Total acc is " + Measurable.getTotal_acc() );
			outputStream_stock.println("** All order item is " + Measurable.getAll() +"\n");
			
			
		 
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
				
				
					/* order list, selType == 1 */
				
					if (selType == 1) {
						
						/* function call for order list */
						printOrder();
						
						
							
					}
					
					/* stock, selType == 2 */
					
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
							
							mobile1[Mobile_first.total++] = new Mobile_first(getColorChoice(), getStorageChoice(), userName, userTel, userAddress, userEmail);
						}
						
						if ( choiceDevice == 2 ) {
							options();
													
							mobile2[Mobile_second.total++] = new Mobile_second(getColorChoice(), getStorageChoice(), userName, userTel, userAddress, userEmail);
						}
						
						if ( choiceDevice == 3 ) {
							options();
													
							mobile3[Mobile_third.total++] = new Mobile_third(getColorChoice(), getStorageChoice(), userName, userTel, userAddress, userEmail);
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
													
							laptop1[Laptop_first.total++] = new Laptop_first(getColorChoice(), getStorageChoice(), userName, userTel, userAddress, userEmail);
						}
						
						if ( choiceDevice == 2 ) {
							options();
													
							laptop2[Laptop_second.total++] = new Laptop_second(getColorChoice(), getStorageChoice(), userName, userTel, userAddress, userEmail);
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
													
							tablet1[Tablet_first.total++] = new Tablet_first(getColorChoice(), getStorageChoice(), userName, userTel, userAddress, userEmail);
						}
						
						if ( choiceDevice == 2 ) {
							options();
													
							tablet2[Tablet_second.total++] = new Tablet_second(getColorChoice(), getStorageChoice(), userName, userTel, userAddress, userEmail);
						}
						
						
						break;
						
						
						
				//Accessories	
						//Keyboard
					case 4:
						System.out.println("\n\nProgrammer's Identity. G-Keyboard." + "\n");
						System.out.println(gKeyboard);	
						clientInfo();
						Gkeyboard[Keyboard_first.total++] = new Keyboard_first(userName, userTel, userAddress, userEmail);
						
						break;
						
						
						
						//Mouse
					case 5:
						System.out.println("\n\nMagic. G-Mouse." + "\n");
						System.out.println(gMouse);	
						clientInfo();
						Gmouse[Mouse_first.total++] = new Mouse_first(userName, userTel, userAddress, userEmail);
						
						break;
						
						
						//Ear phone
					case 6:
						System.out.println("\n\nLive Concert. GPod." + "\n");
						System.out.println("No.1" + "\n" + gEarphone1);	
						System.out.println("No.2" + "\n" + gEarphone2);
						System.out.print("=====>>Choose Your Device(int): ");
						choiceDevice = keyboard.nextInt();
						
						if ( choiceDevice == 1 ) {
							System.out.println("Selected GPod\n");		
							clientInfo();
							earphone1[Earphone_first.total++] = new Earphone_first(userName, userTel, userAddress, userEmail);
						}
						
						if ( choiceDevice == 2 ) {
							System.out.println("Selected GPod Pro\n");
							
							clientInfo();
							earphone2[Earphone_second.total++] = new Earphone_second(userName, userTel, userAddress, userEmail);
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
	
			
			/* file name */
			String fileName_order = "order_list.txt";
			String fileName_stock = "stock.txt";
			
			File outfileobject_order = new File(fileName_order);
			File outfileobject_stock = new File(fileName_stock);
			
			/* file outputStream */
			try {
				
				
				/* for order list */
				if( outfileobject_order.exists() ) {
					
					/* overwrite */
					outputStream = new PrintWriter(new FileOutputStream(fileName_order, true));
					
				}
				else {
					
					/* not exists, just write */
					outputStream = new PrintWriter(new FileOutputStream(fileName_order));
				}
				
				
				/* for stock */
				if( outfileobject_stock.exists() ) {
					
					/* overwrite */
					outputStream_stock = new PrintWriter(new FileOutputStream(fileName_stock, true));
					
				}
				else {
					
					/* not exists, just write */
					outputStream_stock = new PrintWriter(new FileOutputStream(fileName_stock));
				}
				
				
								
			}
			/* file exception */
			catch (FileNotFoundException e) {
				
				System.out.println("Error opening the file " + fileName_order + " or " + fileName_stock);
				System.exit(0);
				
			}
			
			
			/* program start */
			simulate();
			
			
			/* file outputStream close */
			outputStream.close();
			outputStream_stock.close();
			
			System.out.println("===================== End, Thank you for using our system. =====================");

		}
		
}
