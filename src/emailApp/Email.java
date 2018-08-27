package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	
	
	private String firstName;
	private String lastName;
	private String passWord;
	private String alternateEmail;
	private int defaultPasswordLength=8;
	private String department ;
	private int mailBoxCapacity=500;
	private String companyName = "I_Tech.com";
	private String email;
	
	
	// Constructor to initial some values 
	public Email (String firstName ,String lastName){
		this.firstName =firstName ;
		this.lastName = lastName;
		
		System.out.println("New Worker :"+ this.firstName);
		
	// call method to get The department  	
		
		this.department = setDepartment();
		
	// call a method to generate rand password 
		
		this.passWord=generateRandPassWord(defaultPasswordLength);
		
	// construct  the email address
		
		this.email = emailAddress();
		
		System.out.println("Your Email address is : "+this.email + " \n The Password is : "+this.passWord);
		
	}
	
	// set the  Department 
	
	private String setDepartment (){
		System.out.print("\n Department codes : \n 1 for Sale \n 2 for Developing \n 3 for Accounting \n 0 for none\n Enter The Department Code : ");
		Scanner choice = new Scanner (System.in);
		int depSelection = choice.nextInt();		
		if(depSelection ==1 ){ return "sale" ;}
		else if (depSelection==2){ return "dev";}
		else if (depSelection==3){ return "Acco"; }
		else return "";		
	}
	
	// generate a random passWord 
	
	private String generateRandPassWord(int passowrdLength){
		String randomPassword ="";
		Random rand = new Random();
		
		String upperCaseletters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = upperCaseletters.toLowerCase();
		String digits = "0123456789";
		
		String characters = upperCaseletters + lowerCaseLetters + digits ;
		char [] randomText = new char[passowrdLength];
		
		for(int i = 0 ; i < passowrdLength ; i++){
			randomText[i]= characters.charAt(rand.nextInt(characters.length()));
		}
		
		for(int i = 0 ; i<passowrdLength ; i++){
			randomPassword+=randomText[i];
		}
		
		return randomPassword;
	}
	
	//  emailAdress 
	
	private String emailAddress(){
		
		return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+this.companyName ;
	}
	
	// set mailBox capacity 
	
	public void setMailBoxCapacity (int capacity){
		
		this.mailBoxCapacity = capacity ;
	}
	// set alternate Email 
	
	public void setAlternateEmail (String altEmail){
	this.alternateEmail = altEmail ;	
	}
	
	// changePassword 
	
	public void changePassword (String password){
		this.passWord = password ;
	}
	
	// get mailBoxCapacity 
	
	public int getMailBoxCapacity (){return this.mailBoxCapacity;}
	
	// get Alternate Email 
	public String getAlternateEmail (){return this.alternateEmail;}

	// get PassWord 
	
	public String getPassword (){return this.passWord;}

	
	
	// Display Method used to printout all the details 
	
	public String showDetails (){
		
		return "Employee Name :"+ this.firstName +" "+this.lastName
				+ "\n Company Email : "+this.email + "\n Mailbox Capacity : "+ this.mailBoxCapacity;
	}



}
