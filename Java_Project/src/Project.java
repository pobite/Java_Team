import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Project {

	private JFrame frame;
	private JTextField txtSellerMode;
	private JTextField txtOrderList;
	private JTable table;
	private JTextField txtInventory;
	private JTable table_1;
	private JTextField txtMode;
	private JTextField txtMobile;
	private JTextField txtTablet;
	private JTextField txtLaptop;
	private JTextField txtAccessorie;
	private JTextField textField_name;
	private JTextField textField_number;
	private JTextField textField_address;
	private JTextField textField_email;
	private JTextField txtOrderForm;
	private JTextField txtMenu;
	private JTextField textField_7;
	   private JTextField cutie13_b;
	   private JTextField standard13_b;
	   private JTextField maximus13_b;
	   private JTextField padair_b;
	   private JTextField padpro_b;
	   private JTextField bookair_b;
	   private JTextField bookpro_b;
	   private JTextField podstand_b;
	   private JTextField podpro_b;
	   private JTextField mouse_b;
	   private JTextField keyboard_b;


	private JTextArea textArea;

	private String itemColor;
	private String itemCapacity;
	private String itemQuantity;
	private String userName;
	private String userNumber;
	private String userAddress;
	private String userEmail;

	/* for check type */
	boolean check_Mobile_first = false;
	boolean check_Mobile_second = false;
	boolean check_Mobile_third = false;

	/* Lap top */
	boolean check_Laptop_first = false;
	boolean check_Laptop_second = false;

	/* Tablet */
	boolean check_Tablet_first = false;
	boolean check_Tablet_second = false;

	/* Keyboard */
	boolean check_Keyboard_first = false;

	/* Mouse */
	boolean check_Mouse_first = false;

	/* Earphone */
	boolean check_Earphone_first = false;
	boolean check_Earphone_second = false;

	String sellerPassword = "1234"; ////

	/* for file write */
	static PrintWriter outputStream = null;
	static PrintWriter outputStream_stock = null;

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
	////////////////////// /* Array *///////////////////////
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
	public static Mouse_first[] Gmouse = new Mouse_first[100];

	/* Earphone */
	public static Earphone_first[] earphone1 = new Earphone_first[100];
	public static Earphone_second[] earphone2 = new Earphone_second[100];

	/* seller who manages this program, set default PW as 1234 */
	public static Seller master = new Seller(1234);

	/* getter and setter */

	public String getItemColor() {
		return itemColor;
	}

	public void setItemColor(String itemColor) {
		this.itemColor = itemColor;
	}

	public String getItemCapacity() {
		return itemCapacity;
	}

	public void setItemCapacity(String itemCapacity) {
		this.itemCapacity = itemCapacity;
	}

	public String getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/* for order list */

	public static void printOrder(JTextArea textArea) {

		/* for Date */
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();

		String time1 = format1.format(time);
		outputStream.println("DATE: " + time1);
		textArea.append("DATE: " + time1 +"\n");

		/* main order list */

		outputStream.println("\n==================================== Gapple order list =========================================");
		outputStream.println("   Product    /    Name   /       TEL       /           Address           /            Email           /      Price     /   Color   /    Storage    /");

		textArea.append("\n==================================== Gapple order list =========================================" +"\n");
		textArea.append("   Product    /    Name   /       TEL       /           Address           /            Email           /      Price     /   Color   /    Storage    /"+"\n");
		  
		
		String[] class_name = { "Mobile_first", "Mobile_second", " Mobile_third" };
		String[] obj_name = { "mobile1", "mobile2", "mobile3" };

		/* print all of data in the arrays */

		for (int i = 0; i < Mobile_first.total; i++) {

			outputStream.println(mobile1[i].writeFileOutput());
			textArea.append(mobile1[i].writeFileOutput()+"\n");

		}

		for (int i = 0; i < Mobile_second.total; i++) {

			outputStream.println(mobile2[i].writeFileOutput());
			textArea.append(mobile2[i].writeFileOutput()+"\n");

		}

		for (int i = 0; i < Mobile_third.total; i++) {

			outputStream.println(mobile3[i].writeFileOutput());
			textArea.append(mobile3[i].writeFileOutput()+"\n");

		}

		for (int i = 0; i < Laptop_first.total; i++) {

			outputStream.println(laptop1[i].writeFileOutput());
			textArea.append(laptop1[i].writeFileOutput()+"\n");
		}

		for (int i = 0; i < Laptop_second.total; i++) {

			outputStream.println(laptop2[i].writeFileOutput());
			textArea.append(laptop2[i].writeFileOutput()+"\n");
		}

		for (int i = 0; i < Tablet_first.total; i++) {

			outputStream.println(tablet1[i].writeFileOutput());
			textArea.append(tablet1[i].writeFileOutput()+"\n");
			
		}

		for (int i = 0; i < Tablet_second.total; i++) {

			outputStream.println(tablet2[i].writeFileOutput());
			textArea.append(tablet2[i].writeFileOutput()+"\n");
		}

		for (int i = 0; i < Keyboard_first.total; i++) {

			outputStream.println(Gkeyboard[i].writeFileOutput());
			textArea.append(Gkeyboard[i].writeFileOutput()+"\n");

		}

		for (int i = 0; i < Mouse_first.total; i++) {

			outputStream.println(Gmouse[i].writeFileOutput());
			textArea.append(Gmouse[i].writeFileOutput()+"\n");

		}

		for (int i = 0; i < Earphone_first.total; i++) {

			outputStream.println(earphone1[i].writeFileOutput());
			textArea.append(earphone1[i].writeFileOutput()+"\n");

		}

		for (int i = 0; i < Earphone_second.total; i++) {

			outputStream.println(earphone2[i].writeFileOutput());
			textArea.append(earphone2[i].writeFileOutput()+"\n");

		}

		double Mobile_sales = gMobile1.getSales() + gMobile2.getSales() + gMobile3.getSales();
		double Laptop_sales = gLaptop1.getSales() + gLaptop2.getSales();
		double Tablet_sales = gTablet1.getSales() + gTablet2.getSales();
		double Acc_sales = gKeyboard.getSales() + gMouse.getSales() + gEarphone1.getSales() + gEarphone2.getSales();

		double All_sales = Mobile_sales + Laptop_sales + Tablet_sales + Acc_sales;
		All_sales = Double.parseDouble(String.format("%.2f", All_sales));

		outputStream.println("\nSales of mobile is " + Mobile_sales);
		outputStream.println("Sales of laptop is " + Laptop_sales);
		outputStream.println("Sales of tablet is " + Tablet_sales);
		outputStream.println("Sales of acc is " + Acc_sales);
		outputStream.println("** Sales of all item is " + All_sales + "\n");
		
		textArea.append("\nSales of mobile is " + Mobile_sales +"\n");
		textArea.append("Sales of laptop is " + Laptop_sales +"\n");
		textArea.append("Sales of tablet is " + Tablet_sales +"\n");
		textArea.append("Sales of acc is " + Acc_sales +"\n");
		textArea.append("** Sales of all item is " + All_sales + "\n");
		
	
	}

	public static void printInventory() {

		/* for Date */
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();

		String time2 = format2.format(time);
		outputStream_stock.println("DATE: " + time2);

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
		outputStream_stock
				.println(gEarphone2.getName() + " / " + Earphone_second.total + " / " + Earphone_second.stock);

		outputStream_stock.println("\nTotal mobile is " + Measurable.getTotal_mobile());
		outputStream_stock.println("Total laptop is " + Measurable.getTotal_laptop());
		outputStream_stock.println("Total tablet is " + Measurable.getTotal_tablet());
		outputStream_stock.println("Total acc is " + Measurable.getTotal_acc());
		outputStream_stock.println("** All order item is " + Measurable.getAll() + "\n");

	}


	/**
	 * Create the application.
	 */
	
	
	
	public Project() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Gapple Online Platform");
		frame.setBounds(100, 100, 813, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon gi12 = new ImageIcon("gimages/iphone12.jpg");
		Image chgi12 = gi12.getImage();
		Image sGi12 = chgi12.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gi12Icon = new ImageIcon(sGi12);

		ImageIcon gi12pro = new ImageIcon("gimages/iphone12pro.jpg");
		Image chgi12pro = gi12pro.getImage();
		Image sGi12pro = chgi12pro.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gi12proIcon = new ImageIcon(sGi12pro);

		ImageIcon gi12mini = new ImageIcon("gimages/iphone12mini.jpg");
		Image chgi12mini = gi12mini.getImage();
		Image sGi12mini = chgi12mini.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gi12miniIcon = new ImageIcon(sGi12mini);

		ImageIcon gip4 = new ImageIcon("gimages/ipadair4.jpg");
		Image chgip4 = gip4.getImage();
		Image sGip4 = chgip4.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gip4Icon = new ImageIcon(sGip4);

		ImageIcon gip5 = new ImageIcon("gimages/ipadpro5.jpg");
		Image chgip5 = gip5.getImage();
		Image sGip5 = chgip5.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gip5Icon = new ImageIcon(sGip5);

		ImageIcon gima = new ImageIcon("gimages/imacair.jpg");
		Image chgima = gima.getImage();
		Image sGima = chgima.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gimaIcon = new ImageIcon(sGima);

		ImageIcon gimp = new ImageIcon("gimages/imacpro.jpg");
		Image chgimp = gimp.getImage();
		Image sGimp = chgimp.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gimpIcon = new ImageIcon(sGimp);

		ImageIcon giear = new ImageIcon("gimages/iearphone.jpg");
		Image chgiear = giear.getImage();
		Image sGiear = chgiear.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon giearIcon = new ImageIcon(sGiear);

		ImageIcon giear2 = new ImageIcon("gimages/iearphonepro.jpg");
		Image chgiear2 = giear2.getImage();
		Image sGiear2 = chgiear2.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon giear2Icon = new ImageIcon(sGiear2);

		ImageIcon gikey = new ImageIcon("gimages/ikeyboard.jpg");
		Image chgikey = gikey.getImage();
		Image sGikey = chgikey.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gikeyIcon = new ImageIcon(sGikey);

		ImageIcon gimou = new ImageIcon("gimages/imouse.jpg");
		Image chgimou = gimou.getImage();
		Image sGimou = chgimou.getScaledInstance(172, 150, Image.SCALE_SMOOTH);
		ImageIcon gimouIcon = new ImageIcon(sGimou);

		// ¡÷πÆ ªÛºº ¡§∫∏ ¿€º∫∆‰¿Ã¡ˆ
		JPanel order = new JPanel();
		order.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(order);
		order.setLayout(null);
		order.setVisible(false);

		textField_name = new JTextField();
		textField_name.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		textField_name.setBounds(297, 187, 160, 31);
		order.add(textField_name);
		textField_name.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(207, 186, 120, 33);
		order.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Number");
		lblNewLabel_2_1.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(207, 229, 120, 33);
		order.add(lblNewLabel_2_1);

		textField_number = new JTextField();
		textField_number.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		textField_number.setColumns(10);
		textField_number.setBounds(297, 230, 265, 31);
		order.add(textField_number);

		JLabel lblNewLabel_2_2 = new JLabel("Address");
		lblNewLabel_2_2.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(207, 272, 120, 33);
		order.add(lblNewLabel_2_2);

		textField_address = new JTextField();
		textField_address.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		textField_address.setColumns(10);
		textField_address.setBounds(297, 272, 310, 31);
		order.add(textField_address);

		JLabel lblNewLabel_2_4 = new JLabel("Email");
		lblNewLabel_2_4.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(207, 315, 120, 33);
		order.add(lblNewLabel_2_4);

		textField_email = new JTextField();
		textField_email.setColumns(10);
		textField_email.setBounds(297, 316, 265, 31);
		order.add(textField_email);

		txtOrderForm = new JTextField();
		txtOrderForm.setText("ORDER FORM");
		txtOrderForm.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrderForm.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtOrderForm.setColumns(10);
		txtOrderForm.setBackground(SystemColor.inactiveCaption);
		txtOrderForm.setBounds(63, 75, 669, 59);
		order.add(txtOrderForm);

		JButton btnNewButton_6 = new JButton("TO PAY");
		btnNewButton_6.setFont(new Font("±º∏≤", Font.PLAIN, 16));
		btnNewButton_6.setBounds(320, 390, 137, 31);
		order.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				userName = textField_name.getText();
				userNumber = textField_number.getText();
				userAddress = textField_address.getText();
				userEmail = textField_email.getText();

				if (check_Mobile_first == true) {
					
					
					mobile1[Mobile_first.total++] = new Mobile_first(getItemColor(), getItemCapacity(), userName,
							userNumber, userAddress, userEmail);
					
									
					check_Mobile_first = false;
				} else if (check_Mobile_second == true) {

					mobile2[Mobile_second.total++] = new Mobile_second(getItemColor(), getItemCapacity(), userName,
							userNumber, userAddress, userEmail);
					check_Mobile_second = false;
				} else if (check_Mobile_third == true) {

					mobile3[Mobile_third.total++] = new Mobile_third(getItemColor(), getItemCapacity(), userName,
							userNumber, userAddress, userEmail);
					check_Mobile_third = false;
				} else if (check_Laptop_first == true) {

					laptop1[Laptop_first.total++] = new Laptop_first(getItemColor(), getItemCapacity(), userName,
							userNumber, userAddress, userEmail);
					check_Laptop_first = false;

				} else if (check_Laptop_second == true) {

					laptop2[Laptop_second.total++] = new Laptop_second(getItemColor(), getItemCapacity(), userName,
							userNumber, userAddress, userEmail);
					check_Laptop_second = false;

				} else if (check_Tablet_first == true) {

					tablet1[Tablet_first.total++] = new Tablet_first(getItemColor(), getItemCapacity(), userName,
							userNumber, userAddress, userEmail);
					check_Tablet_first = false;
				} else if (check_Tablet_second == true) {

					tablet2[Tablet_second.total++] = new Tablet_second(getItemColor(), getItemCapacity(), userName,
							userNumber, userAddress, userEmail);
					check_Tablet_second = false;

				} else if (check_Keyboard_first == true) {

					Gkeyboard[Keyboard_first.total++] = new Keyboard_first(userName, userNumber, userAddress,
							userEmail);
					check_Keyboard_first = false;
				} else if (check_Mouse_first == true) {

					Gmouse[Mouse_first.total++] = new Mouse_first(userName, userNumber, userAddress, userEmail);
					check_Mouse_first = false;
				} else if (check_Earphone_first == true) {
					earphone1[Earphone_first.total++] = new Earphone_first(userName, userNumber, userAddress,
							userEmail);
					check_Earphone_first = false;
				} else if (check_Earphone_second == true) {
					earphone2[Earphone_second.total++] = new Earphone_second(userName, userNumber, userAddress,
							userEmail);
					check_Earphone_second = false;
				} else {

					JOptionPane.showMessageDialog(null, "ERROR: Try again!", "Message",
							JOptionPane.ERROR_MESSAGE);

				}
				
				textField_name.setText("");
				textField_number.setText("");
				textField_email.setText("");
				textField_address.setText("");

			}
		});

		JButton btnNewButton_9 = new JButton("HOME");
		btnNewButton_9.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		btnNewButton_9.setForeground(Color.BLUE);
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_9.setBounds(686, 431, 80, 46);
		order.add(btnNewButton_9);

		// phone12 cutie ªÛºº∆‰¿Ã¡ˆ
		JPanel phone1 = new JPanel();
		phone1.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(phone1);
		phone1.setLayout(null);
		ImageIcon gApplemini = new ImageIcon("gimages/iphone12mini.jpg");
		Image chGapplemini = gApplemini.getImage();
		Image sGapplemini = chGapplemini.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gAppleminiicon = new ImageIcon(sGapplemini);

		String[] colors1 = { "choose the color", "Space Gray", "Emerald Green", "Bad Red" };
		JComboBox<String> color1 = new JComboBox<String>(colors1);
		color1.setBounds(568, 100, 107, 23);
		phone1.add(color1);

		String[] capacities1 = { "choose the capacity", "64GB", "256GB" };
		JComboBox<String> capacity1 = new JComboBox<String>(capacities1);
		capacity1.setBounds(568, 170, 107, 23);
		phone1.add(capacity1);

		String[] quantities1 = { "1"};
		JComboBox<String> quantity1 = new JComboBox<String>(quantities1);
		quantity1.setBounds(568, 240, 107, 23);
		phone1.add(quantity1);

		JLabel gphoneCutie = new JLabel(gAppleminiicon);
		gphoneCutie.setBounds(72, 75, 300, 300);
		phone1.add(gphoneCutie);
		JLabel colorLabel1 = new JLabel("Color:");
		colorLabel1.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel1.setBounds(434, 102, 82, 15);
		phone1.add(colorLabel1);

		JLabel capacityLabel1 = new JLabel("Capacity:");
		capacityLabel1.setFont(new Font("±º∏≤", Font.BOLD, 14));
		capacityLabel1.setBounds(434, 174, 82, 15);
		phone1.add(capacityLabel1);

		JLabel quantityLabel1 = new JLabel("Quantity:");
		quantityLabel1.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel1.setBounds(434, 246, 82, 15);
		phone1.add(quantityLabel1);

		JLabel nameLabel1 = new JLabel("G-Phone 13 Cutie - $899.99");
		nameLabel1.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel1.setBounds(80, 360, 370, 100);
		phone1.add(nameLabel1);

		JButton orderBtn1 = new JButton("Order");
		orderBtn1.setBackground(SystemColor.text);
		orderBtn1.setForeground(SystemColor.desktop);
		orderBtn1.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn1.setBounds(459, 337, 176, 44);
		phone1.add(orderBtn1);
		orderBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phone1.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color1.getSelectedItem().toString();
				itemCapacity = capacity1.getSelectedItem().toString();
				itemQuantity = quantity1.getSelectedItem().toString();
				check_Mobile_first = true;
			

			}
		});

		phone1.setVisible(false);

		// phone12 standard ªÛºº∆‰¿Ã¡ˆ
		JPanel phone2 = new JPanel();
		phone2.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(phone2);

		ImageIcon gApple = new ImageIcon("gimages/iphone12.jpg");
		Image chGapple = gApple.getImage();
		Image sGapple = chGapple.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gAppleicon = new ImageIcon(sGapple);
		phone2.setLayout(null);
		JLabel gphoneStandard = new JLabel(gAppleicon);
		gphoneStandard.setBounds(72, 75, 300, 300);
		phone2.add(gphoneStandard);

		String[] colors2 = { "choose the color", "Space Gray", "Emerald Green", "Bad Red", "Woody Brown" };
		JComboBox<String> color2 = new JComboBox<String>(colors2);
		color2.setBounds(568, 100, 107, 23);
		phone2.add(color2);

		String[] capacities2 = { "choose the capacity", "64GB", "256GB", "512GB" };
		JComboBox<String> capacity2 = new JComboBox<String>(capacities2);
		capacity2.setBounds(568, 170, 107, 23);
		phone2.add(capacity2);

		String[] quantities2 = { "1"};
		JComboBox<String> quantity2 = new JComboBox<String>(quantities2);
		quantity2.setBounds(568, 240, 107, 23);
		phone2.add(quantity2);

		JLabel colorLabel2 = new JLabel("Color:");
		colorLabel2.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel2.setBounds(434, 102, 82, 15);
		phone2.add(colorLabel2);

		JLabel capacityLabel2 = new JLabel("Capacity:");
		capacityLabel2.setFont(new Font("±º∏≤", Font.BOLD, 14));
		capacityLabel2.setBounds(434, 174, 82, 15);
		phone2.add(capacityLabel2);

		JLabel quantityLabel2 = new JLabel("Quantity:");
		quantityLabel2.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel2.setBounds(434, 246, 82, 15);
		phone2.add(quantityLabel2);

		JLabel nameLabel2 = new JLabel("G-Phone 13 Standard - $1299.99");
		nameLabel2.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel2.setBounds(80, 360, 370, 100);
		phone2.add(nameLabel2);

		JButton orderBtn2 = new JButton("Order");
		orderBtn2.setBackground(SystemColor.text);
		orderBtn2.setForeground(SystemColor.desktop);
		orderBtn2.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn2.setBounds(459, 337, 176, 44);
		phone2.add(orderBtn2);
		orderBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phone2.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color1.getSelectedItem().toString();
				itemCapacity = capacity1.getSelectedItem().toString();
				itemQuantity = quantity1.getSelectedItem().toString();
				check_Mobile_second = true;
			}
		});
		phone2.setVisible(false);

		// phone12 pro ªÛºº∆‰¿Ã¡ˆ
		JPanel phone3 = new JPanel();
		phone3.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(phone3);

		ImageIcon gApplePro = new ImageIcon("gimages/iphone12pro.jpg");
		Image chGapplePro = gApplePro.getImage();
		Image sGapplePro = chGapplePro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gAppleProicon = new ImageIcon(sGapplePro);
		phone3.setLayout(null);

		JLabel gphonePro = new JLabel(gAppleProicon);
		gphonePro.setBounds(72, 75, 300, 300);
		phone3.add(gphonePro);

		String[] colors = { "choose the color", "Space Gray", "Emerald Green", "Bad Red", "Woody Brown", "Sunny Gold" };
		JComboBox<String> color = new JComboBox<String>(colors);
		color.setBounds(568, 100, 107, 23);
		phone3.add(color);

		String[] capacitys = { "choose the capacity", "64GB", "256GB", "512GB", "1TB" };
		JComboBox<String> capacity = new JComboBox<String>(capacitys);
		capacity.setBounds(568, 170, 107, 23);
		phone3.add(capacity);

		String[] quantities = { "1"};
		JComboBox<String> quantity = new JComboBox<String>(quantities);
		quantity.setBounds(568, 240, 107, 23);
		phone3.add(quantity);

		JLabel colorLabel = new JLabel("Color:");
		colorLabel.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel.setBounds(434, 102, 82, 15);
		phone3.add(colorLabel);

		JLabel capacityLabel = new JLabel("Capacity:");
		capacityLabel.setFont(new Font("±º∏≤", Font.BOLD, 14));
		capacityLabel.setBounds(434, 174, 82, 15);
		phone3.add(capacityLabel);

		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel.setBounds(434, 246, 82, 15);
		phone3.add(quantityLabel);

		JLabel nameLabel = new JLabel("G-Phone 13 Maximus - $2599.99");
		nameLabel.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel.setBounds(80, 360, 370, 100);
		phone3.add(nameLabel);

		JButton orderBtn = new JButton("Order");
		orderBtn.setBackground(SystemColor.text);
		orderBtn.setForeground(SystemColor.desktop);
		orderBtn.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn.setBounds(459, 337, 176, 44);
		phone3.add(orderBtn);
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phone3.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color.getSelectedItem().toString();
				itemCapacity = capacity.getSelectedItem().toString();
				itemQuantity = quantity.getSelectedItem().toString();
				check_Mobile_third = true;
			}
		});
		phone3.setVisible(false);

		// ipad air ªÛºº∆‰¿Ã¡ˆ
		JPanel pad1 = new JPanel();
		pad1.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(pad1);

		ImageIcon gapplePad = new ImageIcon("gimages/ipadair4.jpg");
		Image chGpadAir = gapplePad.getImage();
		Image sGpadAir = chGpadAir.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gpadAiricon = new ImageIcon(sGpadAir);
		pad1.setLayout(null);
		JLabel gPadAir = new JLabel(gpadAiricon);
		gPadAir.setBounds(72, 75, 300, 300);
		pad1.add(gPadAir);

		String[] colors7 = { "choose the color", "Space Gray", "Silver", "Woody Brown" };
		JComboBox<String> color7 = new JComboBox<String>(colors7);
		color7.setBounds(568, 100, 107, 23);
		pad1.add(color7);

		String[] capacities7 = { "choose the capacity", "128GB", "256GB" };
		JComboBox<String> capacity7 = new JComboBox<String>(capacities7);
		capacity7.setBounds(568, 170, 107, 23);
		pad1.add(capacity7);

		String[] quantities7 = { "1"};
		JComboBox<String> quantity7 = new JComboBox<String>(quantities7);
		quantity7.setBounds(568, 240, 107, 23);
		pad1.add(quantity7);

		JLabel colorLabel7 = new JLabel("Color:");
		colorLabel7.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel7.setBounds(434, 102, 82, 15);
		pad1.add(colorLabel7);

		JLabel capacityLabel7 = new JLabel("Capacity:");
		capacityLabel7.setFont(new Font("±º∏≤", Font.BOLD, 14));
		capacityLabel7.setBounds(434, 174, 82, 15);
		pad1.add(capacityLabel7);

		JLabel quantityLabel7 = new JLabel("Quantity:");
		quantityLabel7.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel7.setBounds(434, 246, 82, 15);
		pad1.add(quantityLabel7);

		JLabel nameLabel7 = new JLabel("GPad Air -$1099.99");
		nameLabel7.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel7.setBounds(80, 360, 370, 100);
		pad1.add(nameLabel7);

		JButton orderBtn7 = new JButton("Order");
		orderBtn7.setBackground(SystemColor.text);
		orderBtn7.setForeground(SystemColor.desktop);
		orderBtn7.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn7.setBounds(459, 337, 176, 44);
		pad1.add(orderBtn7);
		orderBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pad1.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color7.getSelectedItem().toString();
				itemCapacity = capacity7.getSelectedItem().toString();
				itemQuantity = quantity7.getSelectedItem().toString();
				check_Tablet_first = true;
			}
		});
		pad1.setVisible(false);

		// ipad pro ªÛºº∆‰¿Ã¡ˆ
		JPanel pad2 = new JPanel();
		pad2.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(pad2);

		ImageIcon gapplePadPro = new ImageIcon("gimages/ipadair4.jpg");
		Image chGpadPro = gapplePadPro.getImage();
		Image sGpadPro = chGpadPro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gpadProicon = new ImageIcon(sGpadPro);
		pad2.setLayout(null);
		JLabel gPadPro = new JLabel(gpadProicon);
		gPadPro.setBounds(72, 75, 300, 300);
		pad2.add(gPadPro);

		String[] colors6 = { "choose the color", "Space Gray", "Silver", "Woody Brown" };
		JComboBox<String> color6 = new JComboBox<String>(colors6);
		color6.setBounds(568, 100, 107, 23);
		pad2.add(color6);

		String[] capacities6 = { "choose the capacity", "1TB", "2TB" };
		JComboBox<String> capacity6 = new JComboBox<String>(capacities6);
		capacity6.setBounds(568, 170, 107, 23);
		pad2.add(capacity6);

		String[] quantities6 = { "1"};
		JComboBox<String> quantity6 = new JComboBox<String>(quantities6);
		quantity6.setBounds(568, 240, 107, 23);
		pad2.add(quantity6);

		JLabel colorLabel6 = new JLabel("Color:");
		colorLabel6.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel6.setBounds(434, 102, 82, 15);
		pad2.add(colorLabel6);

		JLabel capacityLabel6 = new JLabel("Capacity:");
		capacityLabel6.setFont(new Font("±º∏≤", Font.BOLD, 14));
		capacityLabel6.setBounds(434, 174, 82, 15);
		pad2.add(capacityLabel6);

		JLabel quantityLabel6 = new JLabel("Quantity:");
		quantityLabel6.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel6.setBounds(434, 246, 82, 15);
		pad2.add(quantityLabel6);

		JLabel nameLabel6 = new JLabel("GPad Pro - $2799.99");
		nameLabel6.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel6.setBounds(80, 360, 370, 100);
		pad2.add(nameLabel6);

		JButton orderBtn6 = new JButton("Order");
		orderBtn6.setBackground(SystemColor.text);
		orderBtn6.setForeground(SystemColor.desktop);
		orderBtn6.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn6.setBounds(459, 327, 176, 44);
		pad2.add(orderBtn6);
		orderBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pad2.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color6.getSelectedItem().toString();
				itemCapacity = capacity6.getSelectedItem().toString();
				itemQuantity = quantity6.getSelectedItem().toString();
				check_Tablet_second = true;
			}
		});
		pad2.setVisible(false);

		// ∏∆∫œ ø°æÓ ªÛºº∆‰¿Ã¡ˆ
		JPanel book1 = new JPanel();
		book1.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(book1);

		ImageIcon gBook = new ImageIcon("gimages/imacair.jpg");
		Image chGbook = gBook.getImage();
		Image sGbook = chGbook.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gBookAiricon = new ImageIcon(sGbook);
		book1.setLayout(null);
		JLabel gBookAir = new JLabel(gBookAiricon);
		gBookAir.setBounds(72, 75, 300, 300);
		book1.add(gBookAir);

		String[] colors4 = { "choose the color", "Space Gray", "Silver", "Sunny Gold" };
		JComboBox<String> color4 = new JComboBox<String>(colors4);
		color4.setBounds(568, 100, 107, 23);
		book1.add(color4);

		String[] capacities4 = { "choose the capacity", "64GB", "256GB" };
		JComboBox<String> capacity4 = new JComboBox<String>(capacities4);
		capacity4.setBounds(568, 170, 107, 23);
		book1.add(capacity4);

		String[] quantities4 = { "1"};
		JComboBox<String> quantity4 = new JComboBox<String>(quantities4);
		quantity4.setBounds(568, 240, 107, 23);
		book1.add(quantity4);

		JLabel colorLabel4 = new JLabel("Color:");
		colorLabel4.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel4.setBounds(434, 102, 82, 15);
		book1.add(colorLabel4);

		JLabel capacityLabel4 = new JLabel("Capacity:");
		capacityLabel4.setFont(new Font("±º∏≤", Font.BOLD, 14));
		capacityLabel4.setBounds(434, 174, 82, 15);
		book1.add(capacityLabel4);

		JLabel quantityLabel4 = new JLabel("Quantity:");
		quantityLabel4.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel4.setBounds(434, 246, 82, 15);
		book1.add(quantityLabel4);

		JLabel nameLabel4 = new JLabel("Gac Book Air - $2499.99");
		nameLabel4.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel4.setBounds(80, 360, 370, 100);
		book1.add(nameLabel4);

		JButton orderBtn4 = new JButton("Order");
		orderBtn4.setBackground(SystemColor.text);
		orderBtn4.setForeground(SystemColor.desktop);
		orderBtn4.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn4.setBounds(459, 337, 176, 44);
		book1.add(orderBtn4);
		orderBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				book1.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color4.getSelectedItem().toString();
				itemCapacity = capacity4.getSelectedItem().toString();
				itemQuantity = quantity4.getSelectedItem().toString();
				check_Laptop_first = true;
			}
		});
		book1.setVisible(false);

		// ∏∆∫œ «¡∑Œ ªÛºº ∆‰¿Ã¡ˆ
		JPanel book2 = new JPanel();
		book2.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(book2);

		ImageIcon gmacBook = new ImageIcon("gimages/imacpro.jpg");
		Image chGbookPro = gmacBook.getImage();
		Image sGbookPro = chGbookPro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gBookProicon = new ImageIcon(sGbookPro);
		book2.setLayout(null);
		JLabel gBookPro = new JLabel(gBookProicon);
		gBookPro.setBounds(72, 75, 300, 300);
		book2.add(gBookPro);

		String[] colors5 = { "choose the color", "Space Gray", "Silver", "Sunny Gold" };
		JComboBox<String> color5 = new JComboBox<String>(colors5);
		color5.setBounds(568, 100, 107, 23);
		book2.add(color5);

		String[] capacities5 = { "choose the capacity", "1TB", "2TB" };
		JComboBox<String> capacity5 = new JComboBox<String>(capacities5);
		capacity5.setBounds(568, 170, 107, 23);
		book2.add(capacity5);

		String[] quantities5 = { "1"};
		JComboBox<String> quantity5 = new JComboBox<String>(quantities5);
		quantity5.setBounds(568, 240, 107, 23);
		book2.add(quantity5);

		JLabel colorLabel5 = new JLabel("Color:");
		colorLabel5.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel5.setBounds(434, 102, 82, 15);
		book2.add(colorLabel5);

		JLabel capacityLabel5 = new JLabel("Capacity:");
		capacityLabel5.setFont(new Font("±º∏≤", Font.BOLD, 14));
		capacityLabel5.setBounds(434, 174, 82, 15);
		book2.add(capacityLabel5);

		JLabel quantityLabel5 = new JLabel("Quantity:");
		quantityLabel5.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel5.setBounds(434, 246, 82, 15);
		book2.add(quantityLabel5);

		JLabel nameLabel5 = new JLabel("Gac Book Pro - $7700.00");
		nameLabel5.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel5.setBounds(80, 360, 370, 100);
		book2.add(nameLabel5);

		JButton orderBtn5 = new JButton("Order");
		orderBtn5.setBackground(SystemColor.text);
		orderBtn5.setForeground(SystemColor.desktop);
		orderBtn5.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn5.setBounds(459, 337, 176, 44);
		book2.add(orderBtn5);
		orderBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				book2.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color5.getSelectedItem().toString();
				itemCapacity = capacity5.getSelectedItem().toString();
				itemQuantity = quantity5.getSelectedItem().toString();
				check_Laptop_second = true;
			}
		});
		book2.setVisible(false);

		// ø°æÓ∆Ã ªÛºº∆‰¿Ã¡ˆ
		JPanel pod1 = new JPanel();
		pod1.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(pod1);

		ImageIcon gapplePod = new ImageIcon("gimages/iearphone.jpg");
		Image chGpod = gapplePod.getImage();
		Image sGpod = chGpod.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gpodicon = new ImageIcon(sGpod);
		pod1.setLayout(null);
		JLabel gPodStandard = new JLabel(gpodicon);
		gPodStandard.setBounds(72, 75, 300, 300);
		pod1.add(gPodStandard);

		String[] colors8 = { "choose the color", "White" };
		JComboBox<String> color8 = new JComboBox<String>(colors8);
		color8.setBounds(568, 154, 107, 23);
		pod1.add(color8);

		String[] quantities8 = { "1"};
		JComboBox<String> quantity8 = new JComboBox<String>(quantities8);
		quantity8.setBounds(568, 220, 107, 23);
		pod1.add(quantity8);

		JLabel colorLabel8 = new JLabel("Color:");
		colorLabel8.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel8.setBounds(434, 154, 82, 15);
		pod1.add(colorLabel8);

		JLabel quantityLabel8 = new JLabel("Quantity:");
		quantityLabel8.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel8.setBounds(434, 220, 82, 15);
		pod1.add(quantityLabel8);

		JLabel nameLabel8 = new JLabel("GPod Standard - $156.75");
		nameLabel8.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel8.setBounds(80, 360, 370, 100);
		pod1.add(nameLabel8);

		JButton orderBtn8 = new JButton("Order");
		orderBtn8.setBackground(SystemColor.text);
		orderBtn8.setForeground(SystemColor.desktop);
		orderBtn8.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn8.setBounds(459, 337, 176, 44);
		pod1.add(orderBtn8);
		orderBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pod1.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color8.getSelectedItem().toString();
				itemQuantity = quantity8.getSelectedItem().toString();
				check_Earphone_first = true;
			}
		});
		pod1.setVisible(false);

		// ø°æÓ∆Ã «¡∑Œ ªÛºº∆‰¿Ã¡ˆ
		JPanel pod2 = new JPanel();
		pod2.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(pod2);

		ImageIcon gapplePodPro = new ImageIcon("gimages/iearphonepro.jpg");
		Image chGpodPro = gapplePodPro.getImage();
		Image sGpodPro = chGpodPro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gpodProicon = new ImageIcon(sGpodPro);
		pod2.setLayout(null);
		JLabel gPodPro = new JLabel(gpodProicon);
		gPodPro.setBounds(72, 75, 300, 300);
		pod2.add(gPodPro);

		String[] colors9 = { "choose the color", "White" };
		JComboBox<String> color9 = new JComboBox<String>(colors9);
		color9.setBounds(568, 154, 107, 23);
		pod2.add(color9);

		String[] quantities9 = { "1"};
		JComboBox<String> quantity9 = new JComboBox<String>(quantities9);
		quantity9.setBounds(568, 220, 107, 23);
		pod2.add(quantity9);

		JLabel colorLabel9 = new JLabel("Color:");
		colorLabel9.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel9.setBounds(434, 154, 82, 15);
		pod2.add(colorLabel9);

		JLabel quantityLabel9 = new JLabel("Quantity:");
		quantityLabel9.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel9.setBounds(434, 220, 82, 15);
		pod2.add(quantityLabel9);

		JLabel nameLabel9 = new JLabel("GPod Pro - $320.25");
		nameLabel9.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel9.setBounds(80, 360, 370, 100);
		pod2.add(nameLabel9);

		JButton orderBtn9 = new JButton("Order");
		orderBtn9.setBackground(SystemColor.text);
		orderBtn9.setForeground(SystemColor.desktop);
		orderBtn9.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn9.setBounds(459, 337, 176, 44);
		pod2.add(orderBtn9);
		orderBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pod2.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color9.getSelectedItem().toString();
				itemQuantity = quantity9.getSelectedItem().toString();
				check_Earphone_second = true;
			}
		});
		pod2.setVisible(false);

		// ∏∂øÏΩ∫ ªÛºº∆‰¿Ã¡ˆ
		JPanel mouse = new JPanel();
		mouse.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(mouse);

		ImageIcon gapplemouse = new ImageIcon("gimages/imouse.jpg");
		Image chGmouse = gapplemouse.getImage();
		Image sGmouse = chGmouse.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gmouseicon = new ImageIcon(sGmouse);
		mouse.setLayout(null);
		JLabel gMouse = new JLabel(gmouseicon);
		gMouse.setBounds(72, 75, 300, 300);
		mouse.add(gMouse);

		String[] colors10 = { "choose the color", "White" };
		JComboBox<String> color10 = new JComboBox<String>(colors10);
		color10.setBounds(568, 154, 107, 23);
		mouse.add(color10);

		String[] quantities10 = { "1"};
		JComboBox<String> quantity10 = new JComboBox<String>(quantities10);
		quantity10.setBounds(568, 220, 107, 23);
		mouse.add(quantity10);

		JLabel colorLabel10 = new JLabel("Color:");
		colorLabel10.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel10.setBounds(434, 154, 82, 15);
		mouse.add(colorLabel10);

		JLabel quantityLabel10 = new JLabel("Quantity:");
		quantityLabel10.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel10.setBounds(434, 220, 82, 15);
		mouse.add(quantityLabel10);

		JLabel nameLabel10 = new JLabel("G-Mouse - $29.99");
		nameLabel10.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel10.setBounds(80, 360, 370, 100);
		mouse.add(nameLabel10);

		JButton orderBtn10 = new JButton("Order");
		orderBtn10.setBackground(SystemColor.text);
		orderBtn10.setForeground(SystemColor.desktop);
		orderBtn10.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn10.setBounds(459, 337, 176, 44);
		mouse.add(orderBtn10);
		orderBtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mouse.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color10.getSelectedItem().toString();
				itemQuantity = quantity10.getSelectedItem().toString();
				check_Mouse_first = true;
			}
		});
		mouse.setVisible(false);

		// ≈∞∫∏µÂ ªÛºº∆‰¿Ã¡ˆ
		JPanel keyboard = new JPanel();
		keyboard.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(keyboard);

		ImageIcon gapplekeyboard = new ImageIcon("gimages/ikeyboard.jpg");
		Image chGkeyboard = gapplekeyboard.getImage();
		Image sGkeyboard = chGkeyboard.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gkeyboardicon = new ImageIcon(sGkeyboard);
		keyboard.setLayout(null);
		JLabel gKeyboard = new JLabel(gkeyboardicon);
		gKeyboard.setBounds(72, 75, 300, 300);
		keyboard.add(gKeyboard);

		String[] colors11 = { "choose the color", "White" };
		JComboBox<String> color11 = new JComboBox<String>(colors11);
		color11.setBounds(568, 154, 107, 23);
		keyboard.add(color11);

		String[] quantities11 = { "1"};
		JComboBox<String> quantity11 = new JComboBox<String>(quantities11);
		quantity11.setBounds(568, 220, 107, 23);
		keyboard.add(quantity11);

		JLabel colorLabel11 = new JLabel("Color:");
		colorLabel11.setFont(new Font("±º∏≤", Font.BOLD, 14));
		colorLabel11.setBounds(434, 154, 82, 15);
		keyboard.add(colorLabel11);

		JLabel quantityLabel11 = new JLabel("Quantity:");
		quantityLabel11.setFont(new Font("±º∏≤", Font.BOLD, 14));
		quantityLabel11.setBounds(434, 220, 82, 15);
		keyboard.add(quantityLabel11);

		JLabel nameLabel11 = new JLabel("G-Keyboard - $59.99");
		nameLabel11.setFont(new Font("«—ƒƒ ∞ÌµÒ", Font.BOLD, 20));
		nameLabel11.setBounds(80, 360, 370, 100);
		keyboard.add(nameLabel11);

		JButton orderBtn11 = new JButton("Order");
		orderBtn11.setBackground(SystemColor.text);
		orderBtn11.setForeground(SystemColor.desktop);
		orderBtn11.setFont(new Font("±º∏≤", Font.BOLD, 18));
		orderBtn11.setBounds(459, 337, 176, 44);
		keyboard.add(orderBtn11);
		orderBtn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				keyboard.setVisible(false);
				order.setVisible(true);
			}
		});
		orderBtn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				itemColor = color11.getSelectedItem().toString();
				itemQuantity = quantity11.getSelectedItem().toString();
				check_Keyboard_first = true;
			}
		});
		keyboard.setVisible(false);

		// æ«ººªÁ∏Æ ∏ﬁ¥∫ ∆‰¿Ã¡ˆ
		JPanel accessorie = new JPanel();
		accessorie.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(accessorie);
		accessorie.setLayout(null);
		accessorie.setVisible(false);

		txtAccessorie = new JTextField();
		txtAccessorie.setText("ACCESSORIE");
		txtAccessorie.setHorizontalAlignment(SwingConstants.CENTER);
		txtAccessorie.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtAccessorie.setColumns(10);
		txtAccessorie.setBackground(SystemColor.inactiveCaption);
		txtAccessorie.setBounds(64, 74, 669, 59);
		accessorie.add(txtAccessorie);

		JButton btnNewButton_5_3_1_1 = new JButton("G-AIRPODS PRO");
		btnNewButton_5_3_1_1.setBounds(240, 364, 142, 41);
		accessorie.add(btnNewButton_5_3_1_1);
		btnNewButton_5_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accessorie.setVisible(false);
				pod2.setVisible(true);
			}
		});

		JButton btnNewButton_5_1_1_1_1 = new JButton("G-KEYBOARD");
		btnNewButton_5_1_1_1_1.setBounds(411, 364, 140, 41);
		accessorie.add(btnNewButton_5_1_1_1_1);
		btnNewButton_5_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accessorie.setVisible(false);
				keyboard.setVisible(true);
			}
		});

		JButton btnNewButton_5_2_1_1_1 = new JButton("G-MOUSE");
		btnNewButton_5_2_1_1_1.setBounds(580, 364, 153, 41);
		accessorie.add(btnNewButton_5_2_1_1_1);
		btnNewButton_5_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accessorie.setVisible(false);
				mouse.setVisible(true);
			}
		});

		JButton btnNewButton_8 = new JButton("G-AIRPODS");
		btnNewButton_8.setBounds(64, 364, 142, 41);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accessorie.setVisible(false);
				pod1.setVisible(true);
			}
		});
		accessorie.add(btnNewButton_8);

		JLabel lblNewLabel_9 = new JLabel(giearIcon);
		lblNewLabel_9.setBounds(65, 196, 141, 150);
		accessorie.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel(gikeyIcon);
		lblNewLabel_10.setBounds(412, 196, 139, 150);
		accessorie.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel(gimouIcon);
		lblNewLabel_11.setBounds(581, 196, 152, 150);
		accessorie.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel(giear2Icon);
		lblNewLabel_12.setBounds(240, 196, 142, 150);
		accessorie.add(lblNewLabel_12);

		// ƒƒ«ª≈Õ ∏ﬁ¥∫ ∆‰¿Ã¡ˆ
		JPanel labtop = new JPanel();
		labtop.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(labtop);
		labtop.setLayout(null);
		labtop.setVisible(false);

		txtLaptop = new JTextField();
		txtLaptop.setText("LAPTOP");
		txtLaptop.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaptop.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtLaptop.setColumns(10);
		txtLaptop.setBackground(SystemColor.inactiveCaption);
		txtLaptop.setBounds(63, 75, 669, 59);
		labtop.add(txtLaptop);

		JButton btnNewButton_5_1_1_1 = new JButton("G-IMAC AIR");
		btnNewButton_5_1_1_1.setBounds(169, 365, 172, 41);
		labtop.add(btnNewButton_5_1_1_1);
		btnNewButton_5_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labtop.setVisible(false);
				book1.setVisible(true);
			}
		});

		JButton btnNewButton_5_2_1_1 = new JButton("G-IMAC PRO");
		btnNewButton_5_2_1_1.setBounds(464, 365, 172, 41);
		labtop.add(btnNewButton_5_2_1_1);
		btnNewButton_5_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labtop.setVisible(false);
				book2.setVisible(true);
			}
		});

		JLabel lblNewLabel_7 = new JLabel(gimaIcon);
		lblNewLabel_7.setBounds(169, 196, 172, 150);
		labtop.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel(gimpIcon);
		lblNewLabel_8.setBounds(464, 196, 172, 150);
		labtop.add(lblNewLabel_8);

		// ≈¬∫Ì∏¥ ∏ﬁ¥∫∆‰¿Ã¡ˆ
		JPanel tablet = new JPanel();
		tablet.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(tablet);
		tablet.setLayout(null);
		tablet.setVisible(false);

		txtTablet = new JTextField();
		txtTablet.setText("TABLET");
		txtTablet.setHorizontalAlignment(SwingConstants.CENTER);
		txtTablet.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtTablet.setColumns(10);
		txtTablet.setBackground(SystemColor.inactiveCaption);
		txtTablet.setBounds(65, 74, 669, 59);
		tablet.add(txtTablet);

		JButton btnNewButton_5_1_1 = new JButton("G-IPAD AIR 4");
		btnNewButton_5_1_1.setBounds(169, 364, 172, 41);
		tablet.add(btnNewButton_5_1_1);
		btnNewButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablet.setVisible(false);
				pad1.setVisible(true);
			}
		});

		JButton btnNewButton_5_2_1 = new JButton("G-IPAD PRO 5");
		btnNewButton_5_2_1.setBounds(464, 364, 172, 41);
		tablet.add(btnNewButton_5_2_1);
		btnNewButton_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablet.setVisible(false);
				pad2.setVisible(true);
			}
		});

		JLabel lblNewLabel_1_4 = new JLabel(gip4Icon);
		lblNewLabel_1_4.setBounds(169, 196, 172, 150);
		tablet.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel(gip5Icon);
		lblNewLabel_1_5.setBounds(464, 196, 172, 150);
		tablet.add(lblNewLabel_1_5);

		// «⁄µÂ∆˘ ∏ﬁ¥∫ ∆‰¿Ã¡ˆ
		JPanel mobile = new JPanel();
		mobile.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(mobile);
		mobile.setLayout(null);
		mobile.setVisible(false);

		txtMobile = new JTextField();
		txtMobile.setText("MOBILE");
		txtMobile.setHorizontalAlignment(SwingConstants.CENTER);
		txtMobile.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtMobile.setColumns(10);
		txtMobile.setBackground(SystemColor.inactiveCaption);
		txtMobile.setBounds(65, 74, 669, 59);
		mobile.add(txtMobile);

		JButton btnNewButton_5 = new JButton("G-PHONE 13");
		btnNewButton_5.setBounds(84, 364, 172, 41);
		mobile.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mobile.setVisible(false);
				phone2.setVisible(true);
			}
		});

		JButton btnNewButton_5_1 = new JButton("G-PHONE 13 PRO");
		btnNewButton_5_1.setBounds(311, 364, 172, 41);
		mobile.add(btnNewButton_5_1);
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mobile.setVisible(false);
				phone3.setVisible(true);
			}
		});

		JButton btnNewButton_5_2 = new JButton("G-PHONE 13 MINI");
		btnNewButton_5_2.setBounds(537, 364, 172, 41);
		mobile.add(btnNewButton_5_2);
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mobile.setVisible(false);
				phone1.setVisible(true);
			}
		});

		JLabel lblNewLabel_1 = new JLabel(gi12Icon);
		lblNewLabel_1.setBounds(84, 169, 172, 150);
		mobile.add(lblNewLabel_1);
		JLabel lblNewLabel_1_1 = new JLabel(gi12proIcon);
		lblNewLabel_1_1.setBounds(311, 169, 172, 150);
		mobile.add(lblNewLabel_1_1);
		JLabel lblNewLabel_1_2 = new JLabel(gi12miniIcon);
		lblNewLabel_1_2.setBounds(537, 169, 172, 150);
		mobile.add(lblNewLabel_1_2);

		// ¿Ø¿˙¿¸øÎ ∏ﬁ¥∫ ∆‰¿Ã¡ˆ
		JPanel menu = new JPanel();
		menu.setForeground(SystemColor.desktop);
		menu.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(menu);
		menu.setLayout(null);
		menu.setVisible(false);

		JButton btnNewButton_7 = new JButton("MOBLIE");
		btnNewButton_7.setBounds(91, 215, 136, 222);
		menu.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				mobile.setVisible(true);
			}
		});

		JButton btnNewButton_7_1 = new JButton("TABLET");
		btnNewButton_7_1.setBounds(252, 215, 136, 222);
		menu.add(btnNewButton_7_1);
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				tablet.setVisible(true);
			}
		});

		JButton btnNewButton_7_2 = new JButton("LABTOP");
		btnNewButton_7_2.setBounds(415, 215, 136, 222);
		menu.add(btnNewButton_7_2);
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				labtop.setVisible(true);
			}
		});

		JButton btnNewButton_7_3 = new JButton("ACCESSORIE");
		btnNewButton_7_3.setBounds(577, 215, 136, 222);
		menu.add(btnNewButton_7_3);
		btnNewButton_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				accessorie.setVisible(true);
			}
		});

		txtMenu = new JTextField();
		txtMenu.setText("MENU");
		txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenu.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtMenu.setColumns(10);
		txtMenu.setBackground(SystemColor.inactiveCaption);
		txtMenu.setBounds(64, 74, 669, 59);
		menu.add(txtMenu);
		menu.setVisible(false);

		// ºø∑Ø¿¸øÎ ¡÷πÆ¡§∫∏ ∏ÆΩ∫∆Æ ∆‰¿Ã¡ˆ
		JPanel orderlist = new JPanel();
		orderlist.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(orderlist);
		orderlist.setLayout(null);
		orderlist.setVisible(false);

		txtOrderList = new JTextField();
		txtOrderList.setText("ORDER LIST");
		txtOrderList.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrderList.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtOrderList.setColumns(10);
		txtOrderList.setBackground(SystemColor.inactiveCaption);
		txtOrderList.setBounds(65, 74, 669, 59);
		orderlist.add(txtOrderList);



		/* text Area */
		JTextArea textArea = new JTextArea(7, 20);
		textArea.setBounds(65, 165, 669, 287);
		
		/*
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(65, 165, 669, 287);
		*/
		orderlist.add(textArea);
		
		
		//orderlist.add(new JScrollPane(textArea)); // »Æ¿Œ« ø‰!!!!!!!!!!!
		
		orderlist.add(textArea);

		JButton btnNewButton = new JButton("EXPORT FILES");
		btnNewButton.setBounds(608, 33, 126, 23);
		orderlist.add(btnNewButton);

		JButton orderlistHome = new JButton("HOME");
		orderlistHome.setForeground(Color.BLUE);
		orderlistHome.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		orderlistHome.setBackground(Color.LIGHT_GRAY);
		orderlistHome.setBounds(717, 455, 80, 46);
		orderlist.add(orderlistHome);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arge) {
				printOrder(textArea);
				outputStream.flush();
				

			}
		});

		//ºø∑Ø¿¸øÎ ¿Œ∫•≈‰∏Æ ∆‰¿Ã¡ˆ


        JPanel inventory = new JPanel();
        inventory.setBounds(0, 0, 797, 501);
        frame.getContentPane().add(inventory);
        inventory.setLayout(null);
        inventory.setVisible(false);
        
	      txtInventory = new JTextField();
	      txtInventory.setText("INVENTORY");
	      txtInventory.setHorizontalAlignment(SwingConstants.CENTER);
	      txtInventory.setFont(new Font("±º∏≤", Font.PLAIN, 20));
	      txtInventory.setColumns(10);
	      txtInventory.setBackground(SystemColor.inactiveCaption);
	      txtInventory.setBounds(65, 74, 669, 59);
	      inventory.add(txtInventory);
	            	
	      
	      JButton inventoryHome = new JButton("HOME");
	      inventoryHome.setForeground(Color.BLUE);
	      inventoryHome.setFont(new Font("±º∏≤", Font.PLAIN, 14));
	      inventoryHome.setBackground(Color.LIGHT_GRAY);
	      inventoryHome.setBounds(717, 455, 80, 46);
	      inventory.add(inventoryHome);
	      
              
              
	      JButton btnNewButton_10 = new JButton("EXPORT FILES");
	      btnNewButton_10.setBounds(608, 33, 126, 23);
	      inventory.add(btnNewButton_10);
	      
	      btnNewButton_10.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent arge) {
	             printInventory();
	             outputStream_stock.flush();
	          }
	       });
	      
	      
	      JLabel cutie13 = new JLabel("G-phone 13 cutie");
	      cutie13.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      cutie13.setBounds(130, 172, 151, 28);
	      inventory.add(cutie13);
	      
	      JLabel standard13 = new JLabel("G-phone 13 standard");
	      standard13.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      standard13.setBounds(130, 197, 167, 28);
	      inventory.add(standard13);
	      
	      JLabel maximus13 = new JLabel("G-phone 13 maximus");
	      maximus13.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      maximus13.setBounds(130, 223, 160, 28);
	      inventory.add(maximus13);
	      
	      cutie13_b = new JTextField();
	      cutie13_b.setBounds(330, 175, 190, 23);
	      inventory.add(cutie13_b);
	      cutie13_b.setColumns(10);
	      
	      JButton cutie13_p = new JButton("+");
	      cutie13_p.setBounds(554, 175, 44, 23);
	      inventory.add(cutie13_p);
	      
	      JButton cutie13_m = new JButton("-");
	      cutie13_m.setBounds(608, 175, 44, 23);
	      inventory.add(cutie13_m);
	      
	      standard13_b = new JTextField();
	      standard13_b.setColumns(10);
	      standard13_b.setBounds(330, 200, 190, 23);
	      inventory.add(standard13_b);
	      
	      JButton standard13_p = new JButton("+");
	      standard13_p.setBounds(554, 201, 44, 23);
	      inventory.add(standard13_p);
	      
	      JButton standard13_m = new JButton("-");
	      standard13_m.setBounds(608, 201, 44, 23);
	      inventory.add(standard13_m);
	      
	      JLabel padair = new JLabel("G-pad air");
	      padair.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      padair.setBounds(130, 249, 160, 28);
	      inventory.add(padair);
	      
	      JLabel padpro = new JLabel("G-pad pro");
	      padpro.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      padpro.setBounds(130, 275, 160, 28);
	      inventory.add(padpro);
	      
	      JLabel bookair = new JLabel("G-acbook air");
	      bookair.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      bookair.setBounds(130, 302, 160, 28);
	      inventory.add(bookair);
	      
	      JLabel bookpro = new JLabel("G-acbook pro");
	      bookpro.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      bookpro.setBounds(130, 328, 160, 28);
	      inventory.add(bookpro);
	      
	      JLabel podstand = new JLabel("G-pod standard");
	      podstand.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      podstand.setBounds(130, 354, 160, 28);
	      inventory.add(podstand);
	      
	      JLabel podpro = new JLabel("G-pod pro");
	      podpro.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      podpro.setBounds(130, 378, 160, 28);
	      inventory.add(podpro);
	      
	      JLabel mouse_a = new JLabel("G-mouse");
	      mouse_a.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      mouse_a.setBounds(130, 402, 160, 28);
	      inventory.add(mouse_a);
	      
	      JLabel keyboard_a = new JLabel("G-keyboard");
	      keyboard_a.setFont(new Font("±º∏≤", Font.PLAIN, 15));
	      keyboard_a.setBounds(130, 426, 160, 28);
	      inventory.add(keyboard_a);
	      
	      maximus13_b = new JTextField();
	      maximus13_b.setColumns(10);
	      maximus13_b.setBounds(330, 227, 190, 23);
	      inventory.add(maximus13_b);
	      
	      JButton maximus13_p = new JButton("+");
	      maximus13_p.setBounds(554, 228, 44, 23);
	      inventory.add(maximus13_p);
	      
	      JButton maximus13_m = new JButton("-");
	      maximus13_m.setBounds(608, 228, 44, 23);
	      inventory.add(maximus13_m);
	      
	      padair_b = new JTextField();
	      padair_b.setColumns(10);
	      padair_b.setBounds(330, 253, 190, 23);
	      inventory.add(padair_b);
	      
	      JButton padair_p = new JButton("+");
	      padair_p.setBounds(554, 254, 44, 23);
	      inventory.add(padair_p);
	      
	      JButton padair_m = new JButton("-");
	      padair_m.setBounds(608, 254, 44, 23);
	      inventory.add(padair_m);
	      
	      padpro_b = new JTextField();
	      padpro_b.setColumns(10);
	      padpro_b.setBounds(330, 279, 190, 23);
	      inventory.add(padpro_b);
	      
	      JButton padpro_p = new JButton("+");
	      padpro_p.setBounds(554, 280, 44, 23);
	      inventory.add(padpro_p);
	      
	      JButton padpro_m = new JButton("-");
	      padpro_m.setBounds(608, 280, 44, 23);
	      inventory.add(padpro_m);
	      
	      bookair_b = new JTextField();
	      bookair_b.setColumns(10);
	      bookair_b.setBounds(330, 306, 190, 23);
	      inventory.add(bookair_b);
	      
	      JButton bookair_p = new JButton("+");
	      bookair_p.setBounds(554, 307, 44, 23);
	      inventory.add(bookair_p);
	      
	      JButton bookair_m = new JButton("-");
	      bookair_m.setBounds(608, 307, 44, 23);
	      inventory.add(bookair_m);
	      
	      bookpro_b = new JTextField();
	      bookpro_b.setColumns(10);
	      bookpro_b.setBounds(330, 332, 190, 23);
	      inventory.add(bookpro_b);
	      
	      JButton bookpro_p = new JButton("+");
	      bookpro_p.setBounds(554, 333, 44, 23);
	      inventory.add(bookpro_p);
	      
	      JButton bookpro_m = new JButton("-");
	      bookpro_m.setBounds(608, 333, 44, 23);
	      inventory.add(bookpro_m);
	      
	      podstand_b = new JTextField();
	      podstand_b.setColumns(10);
	      podstand_b.setBounds(330, 358, 190, 23);
	      inventory.add(podstand_b);
	      
	      JButton podstand_p = new JButton("+");
	      podstand_p.setBounds(554, 359, 44, 23);
	      inventory.add(podstand_p);
	      
	      JButton podstand_m = new JButton("-");
	      podstand_m.setBounds(608, 359, 44, 23);
	      inventory.add(podstand_m);
	      
	      podpro_b = new JTextField();
	      podpro_b.setColumns(10);
	      podpro_b.setBounds(330, 382, 190, 23);
	      inventory.add(podpro_b);
	      
	      JButton podpro_p = new JButton("+");
	      podpro_p.setBounds(554, 383, 44, 23);
	      inventory.add(podpro_p);
	      
	      JButton podpro_m = new JButton("-");
	      podpro_m.setBounds(608, 383, 44, 23);
	      inventory.add(podpro_m);
	      
	      mouse_b = new JTextField();
	      mouse_b.setColumns(10);
	      mouse_b.setBounds(330, 406, 190, 23);
	      inventory.add(mouse_b);
	      
	      JButton mouse_p = new JButton("+");
	      mouse_p.setBounds(554, 407, 44, 23);
	      inventory.add(mouse_p);
	      
	      JButton mouse_m = new JButton("-");
	      mouse_m.setBounds(608, 407, 44, 23);
	      inventory.add(mouse_m);
	      
	      keyboard_b = new JTextField();
	      keyboard_b.setColumns(10);
	      keyboard_b.setBounds(330, 431, 190, 23);
	      inventory.add(keyboard_b);
	      
	      JButton keyboard_p = new JButton("+");
	      keyboard_p.setBounds(554, 431, 44, 23);
	      inventory.add(keyboard_p);
	      
	      JButton keyboard_m = new JButton("-");
	      keyboard_m.setBounds(608, 431, 44, 23);
	      inventory.add(keyboard_m);
	      
	      
	      /* plus & minus button listener */
	      
	      cutie13_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					cutie13_b.setText(Integer.toString(++Mobile_first.stock));
				}
			});
	      
	      cutie13_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					cutie13_b.setText(Integer.toString(--Mobile_first.stock));
				}
			});
	      
	      
	      standard13_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					standard13_b.setText(Integer.toString(++Mobile_second.stock));
				}
			});
	      
	      standard13_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					int num = Integer.parseInt(standard13_b.getText().trim());
					standard13_b.setText(Integer.toString(--Mobile_second.stock));
				}
			});
	      
	      
	      maximus13_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					maximus13_b.setText(Integer.toString(++Mobile_third.stock));
				}
			});
	      
	      maximus13_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					maximus13_b.setText(Integer.toString(--Mobile_third.stock));
				}
			});
	      
	      
	      padair_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					padair_b.setText(Integer.toString(++Tablet_first.stock));
				}
			});
	      
	      padair_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					padair_b.setText(Integer.toString(--Tablet_first.stock));
				}
			});
	      
	      
	      padpro_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					padpro_b.setText(Integer.toString(++Tablet_second.stock));
				}
			});
	      
	      padpro_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					padpro_b.setText(Integer.toString(--Tablet_second.stock));
				}
			});
	      
	      
	      bookair_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					bookair_b.setText(Integer.toString(++Laptop_first.stock));
				}
			});
	      
	      bookair_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					bookair_b.setText(Integer.toString(--Laptop_first.stock));
				}
			});
	      
	      
	      bookpro_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					bookpro_b.setText(Integer.toString(++Laptop_second.stock));
				}
			});
	      
	      bookpro_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					bookpro_b.setText(Integer.toString(--Laptop_second.stock));
				}
			});
	      
	      
	      podstand_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					podstand_b.setText(Integer.toString(++Earphone_first.stock));
				}
			});
	      
	      podstand_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					podstand_b.setText(Integer.toString(--Earphone_first.stock));
				}
			});
	      
	      
	      podpro_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					podpro_b.setText(Integer.toString(++Earphone_second.stock));
				}
			});
	      
	      podpro_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					podpro_b.setText(Integer.toString(--Earphone_second.stock));
				}
			});
	      
	      
	      mouse_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					mouse_b.setText(Integer.toString(++Mouse_first.stock));
				}
			});
	      
	      mouse_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					mouse_b.setText(Integer.toString(--Mouse_first.stock));
				}
			});
	      
	      
	      keyboard_p.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					keyboard_b.setText(Integer.toString(++Keyboard_first.stock));
				}
			});
	      
	      keyboard_m.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arge) {
					
					keyboard_b.setText(Integer.toString(--Keyboard_first.stock));
				}
			});
	      
	      
	      
	      
	      
	      
	     
		// ºø∑Ø¿¸øÎ ∏ﬁ¥∫ ∆‰¿Ã¡ˆ
		JPanel sellermode = new JPanel();
		sellermode.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(sellermode);
		sellermode.setLayout(null);
		sellermode.setVisible(false);

		JButton btnNewButton_1 = new JButton("ORDER LIST");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		btnNewButton_1.setBounds(65, 194, 293, 232);
		sellermode.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sellermode.setVisible(false);
				orderlist.setVisible(true);
				
		
				
			}
		});

		JButton btnNewButton_3 = new JButton("INVENTORY");
		btnNewButton_3.setBackground(SystemColor.activeCaption);
		btnNewButton_3.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		btnNewButton_3.setBounds(441, 194, 293, 232);
		sellermode.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sellermode.setVisible(false);
				inventory.setVisible(true);
				
				  cutie13_b.setText(Integer.toString(Mobile_first.stock));
				  standard13_b.setText(Integer.toString(Mobile_second.stock));
				  maximus13_b.setText(Integer.toString(Mobile_third.stock));
				  padair_b.setText(Integer.toString(Tablet_first.stock));
				  padpro_b.setText(Integer.toString(Tablet_second.stock));
				  bookair_b.setText(Integer.toString(Laptop_first.stock));
				  bookpro_b.setText(Integer.toString(Laptop_second.stock));
				  podstand_b.setText(Integer.toString(Earphone_first.stock));
				  podpro_b.setText(Integer.toString(Earphone_second.stock));
				  mouse_b.setText(Integer.toString(Mouse_first.stock));;
				  keyboard_b.setText(Integer.toString(Keyboard_first.stock));;
				
				
				
			}
		});

		txtSellerMode = new JTextField();
		txtSellerMode.setHorizontalAlignment(SwingConstants.CENTER);
		txtSellerMode.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		txtSellerMode.setText("SELLER MODE");
		txtSellerMode.setBackground(SystemColor.inactiveCaption);
		txtSellerMode.setBounds(65, 74, 669, 59);
		sellermode.add(txtSellerMode);
		txtSellerMode.setColumns(10);

		// ºø∑Ø¿¸øÎ ∆–Ω∫øˆµÂ ºˆ¡§ ∆‰¿Ã¡ˆ
		JPanel password = new JPanel();
		password.setBounds(0, 0, 797, 501);
		frame.getContentPane().add(password);
		password.setLayout(null);
		password.setVisible(false);

		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 18));
		lblNewLabel.setBounds(163, 215, 342, 53);
		password.add(lblNewLabel);

		textField_7 = new JPasswordField();
		textField_7.setBounds(288, 220, 321, 38);
		password.add(textField_7);
		textField_7.setColumns(10);

		JButton paswordOK = new JButton("OK");
		paswordOK.setFont(new Font("±º∏≤", Font.PLAIN, 15));

		paswordOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputPw = textField_7.getText();
				if (inputPw.equals(sellerPassword)) {
					textField_7.setText("");
					password.setVisible(false);
					sellermode.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Your password is wrong!", "Message",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		paswordOK.setBounds(379, 278, 91, 45);
		password.add(paswordOK);

		
		//Ω√¿€∆‰¿Ã¡ˆ(∏ﬁ¿Œ∆‰¿Ã¡ˆ)
        JPanel main = new JPanel();
        main.setBounds(0, 0, 797, 501);
        frame.getContentPane().add(main);
        main.setLayout(null);
        
          JButton userBtn = new JButton("USER");
          userBtn.setFont(new Font("±º∏≤", Font.PLAIN, 17));
          userBtn.setBounds(87, 192, 294, 235);
          main.add(userBtn);
          userBtn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg1) {
                main.setVisible(false);
                menu.setVisible(true);
             }
          });
          
        JButton btnNewButton_2 = new JButton("SELLER");
        btnNewButton_2.setFont(new Font("±º∏≤", Font.PLAIN, 17));
        btnNewButton_2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	   main.setVisible(false);
               password.setVisible(true);
           }
        });
        btnNewButton_2.setBounds(412, 192, 294, 235);
        main.add(btnNewButton_2);
	        
          txtMode = new JTextField();
          txtMode.setText("MODE");
          txtMode.setHorizontalAlignment(SwingConstants.CENTER);
          txtMode.setFont(new Font("±º∏≤", Font.PLAIN, 20));
          txtMode.setColumns(10);
          txtMode.setBackground(SystemColor.inactiveCaption);
          txtMode.setBounds(65, 74, 669, 59);
          main.add(txtMode);
          
          JButton EXIT = new JButton("EXIT");
          EXIT.setForeground(Color.GRAY);
          EXIT.setBounds(671, 456, 97, 23);
          main.add(EXIT);

	       btnNewButton_9.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             order.setVisible(false);
	             main.setVisible(true);
	          }
	       });
	       inventoryHome.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             inventory.setVisible(false);
	             main.setVisible(true);
	          }
	       });
	       orderlistHome.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  
	        	  /* reset */
				 textArea.setText("");
	             orderlist.setVisible(false);
	             main.setVisible(true);
	          }
	       });
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
			if (outfileobject_order.exists()) {

				/* overwrite */
				outputStream = new PrintWriter(new FileOutputStream(fileName_order, true));

			} else {

				/* not exists, just write */
				outputStream = new PrintWriter(new FileOutputStream(fileName_order));
			}

			/* for stock */
			if (outfileobject_stock.exists()) {

				/* overwrite */
				outputStream_stock = new PrintWriter(new FileOutputStream(fileName_stock, true));

			} else {

				/* not exists, just write */
				outputStream_stock = new PrintWriter(new FileOutputStream(fileName_stock));
			}

		}
		/* file exception */
		catch (FileNotFoundException e) {

			System.out.println("Error opening the file " + fileName_order + " or " + fileName_stock);
			System.exit(0);

		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

	
		

	}

}