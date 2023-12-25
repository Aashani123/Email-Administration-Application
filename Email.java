package EmailAdmin;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int mailBoxCapacity=500;
    private String department;
    private String alternateEmail;
    private int passwordLength=5;
    private String combineEmail;
    private String companyCom="ABCcompany.com";

// Constructor to receive the first and last name
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

// ---------------------------------------------------------------------------------------------------------


        // call a method asking for department and return department;
        this.department=setDepartment();    //here set the class variable to do the ask the department process;

// ---------------------------------------------------------------------------------------------------------------------


        // call a method that returns a random password
        this.password=randomPassword(passwordLength);
        System.out.println("Your password is: "+this.password);

//-------------------------------------------------------------------------------------------------------------------------------


        //combine elements to generate email
        combineEmail=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyCom;
    }

// Ask for the department
private String setDepartment(){
    System.out.println("Department code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter your department code:");
    Scanner scanner=new Scanner(System.in);
    int departmentChoice=scanner.nextInt();
    switch(departmentChoice){
        case 1:
        return "Sales";
    
        case 2:
        return "Development";
       
        case 3:
        return "Account";

        default:
        return " ";
    }
  
}


//Generate a random password
private String randomPassword(int length){
    
    //here can use kind of algorithm. can declare string and generate a random number and compare it's elements are in the string
    String password="ABCDEFGHIJKLMNOPQRSTUVWXYZ@._#$%";
    char[] passWord=new char[length];
    for(int i=0;i<length;i++){
        int rand=(int)(Math.random()*password.length());
        passWord[i]=password.charAt(rand);  //here give facilities to create paswword within the string password range;
    }
    return new String(passWord); 
}

//Set the mailbox capacity
public void setMailBoxCapacity(int capacity){
    this.mailBoxCapacity=capacity;
}

//Set the alternate email
public void setAlternateEmail(String altEmail){
    this.alternateEmail=altEmail; //this is only for coding best practices;
}

//Change the password
public void changePassword(String password){
    this.password=password;
}

//show the mailbox capacity. get method
public int getMailBoxCapacity(){
    return mailBoxCapacity;
}

// these get methods access to the properties. by using those can define in emailApp class using getters and setters.
public String getAlternateEmail(){
    return alternateEmail;
}

public String getPassword(){
    return password;
}

//to display name,email and mailbox capacity
public String showInformation(){
    return "Display name: "+ firstName+" "+lastName+ "\n"+
    " Company email: "+combineEmail + "\n"+
    "Mailbox capacity is:"+ mailBoxCapacity+"mb";

}
}
