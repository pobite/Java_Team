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
	
		System.out.println("1. �ֹ����� 2. ������ 3. ��й�ȣ ����: ");
		
		int selType = keyboard.nextInt();
		
		
		/* �ֹ����� selType == 1 */
		
		if (selType == 1) {
			
			
			System.out.println("=============================== Gapple order list ================================");
			System.out.println("   Product    /    Name   /    TEL    /    Color   /    Storage    /    Date   /");
			
			
			
			
			
			
			
			
		}
		
		/* ������ selType == 2 */
		
		if (selType == 2) {
			
			
			
		}
		
		
		/* ��й�ȣ ���� selType == 3 */
		
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
		

		Mobile gmobile1 = new Mobile();
		
		
		gmobile.setName("������8");
		gmobile.setCpu("�����ھ�");
		
		������ �� �� �ְ���
		
		
		
		Mobile gmobile2 = new Mobile();
		
		gmobile.setName("������11");
		gmmobile.setCpu("�����ھ�");
		Mobile gmobile3 = new Mobile();
		
		gmobile.setName("�������̴�");
		gmmobile.setCpu("�����ھ�");
		
		
		3�� ���� ��
		
		
		
		
		
		1. 5�� ǰ���� ��
		
		
		System.out.println("1. �ڵ��� 2. ��Ʈ�� ..");
		
		1. �ڵ���, 2�� ��Ž ..
		
		�ڵ��� ������ ��
		
		2~3���� �ڵ����� ���� ���� ������ �س��ƾ� ��.
		
		
		System.out.println("1." + gmobile);	// ������8
		System.out.println("2." + gmobile2);
		System.out.println("3" + gmobile3);
		
		
		int i= 0;
		
		/* �÷�, �뷮, �̸�, ��ȣ */
		if ( 1���� ����� ) {	// 1���� ������8
			
			
			System.out.println("�ɼ��� �����ϼ���.");
			
			System.out.println("�÷��Է�: ");
			Stirng c1 = keyboard.nextLine();
				
			System.out.println("�뷮: ");
			Stirng c2 = keyboard.nextInt();
			
			
			mobile1[i] = new Mobile3("������8", "�����ھ�", "ram����", "display", c1, c2);
			i++;
			
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
