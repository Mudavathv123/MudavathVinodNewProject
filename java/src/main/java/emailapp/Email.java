package emailapp;

import java.util.Scanner;
public class Email {

	private String firstName;
	private String secondName;
	private String departmanet;
	private String email;
	private String alternetEmail;
	private int mailBoxCapacity;
	private String password;
	private int defaultLength = 8;
	private String companySurffix = "anycompany.com";
	
	// Constructor to receive firstName and secondName
	public Email(String firstName,String secondName) {
		
		this.firstName = firstName;
		this.secondName = secondName;
		this.departmanet = setDepartment();
		
		this.password = randomPassword(defaultLength);
		
		email = firstName.toLowerCase() +"." +secondName.toLowerCase() +"@" +departmanet +"." +companySurffix;
		
	}
	
	// Ask for a Department
	private String setDepartment() {
		System.out.print("New worker : " +firstName +". Departmet codes  \n1 for Admin\n2 for Developer\n3 "
				+ "for Tester\n4 for Account\n0 for none\nEnter your code : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		switch(number) {
		case 1: return "admin";
		case 2: return "developer";
		case 3: return "tester";
		case 4: return "account";
		case 0:return "";
		}
		return "";
	}
	
	//set randomPassword
	
	private String randomPassword(int length) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
		char[] ch = new char[length];
		
		
		for(int i=0;i<length;i++) {
			int r = (int)(Math.random()*str.length());
			ch[i] = str.charAt(r);
		}
		return new String(ch);
	}
	
	// set the mailbox capacity
	
	public void setmailBoxCapacity(int capacity) {
		mailBoxCapacity = capacity;
	}
	//set the alternetEamil
	public void setAlternetEmail(String alternetEmail) {
		this.alternetEmail = alternetEmail;
	}
	// change the password
	
	public void setPassword(String password) {
		this.password = password;
		System.out.println("password changin sucssesful" +password);
	}
	
	public String showInfo() {
		return "DISPLAY NAME : " +firstName +" " +secondName
				+"\nEMAIL : " +email
				+"\nMAILBOX CAPACITY : "+mailBoxCapacity +"mb"
				+"\nDEFAUTPASSWORD : " +password;
	}
	
	public String getAlternetEmail() {
		return alternetEmail;
	}
}
