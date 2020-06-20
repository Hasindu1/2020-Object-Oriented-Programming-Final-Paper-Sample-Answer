//Developed by Hasindu Dahanayake
package QUESTION3;

import java.util.Scanner;
//Main Thread
public class Main {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Texttile Pattern 1 = ");//Getting the user inputs
		String pattern1 = input.nextLine();
		System.out.println("Enter Texttile Pattern 2 = ");
		String pattern2 = input.nextLine();
		System.out.println("Enter Pattern Width = ");
	    int  width = input.nextInt();
		System.out.println("Enter Pattern Count = ");
		 int  count = input.nextInt();
		 
		 System.out.println("=========Thread Start printing patterns.===========");
		 
		 Object lock = new Object(); //Passing a object as the lock to threads
		 PatternThread1 p1 = new PatternThread1(pattern1,count,width,lock);
		 PatternThread2 p2= new PatternThread2(pattern2,count,width,lock);
		 p1.setName("Pattern 01 Thread ");//Setting the Thread names
		 p2.setName("Pattern 02 Thread");
		 p1.start();//Starting the Threads
		 p2.start();

	    
         input.close();//Closing the Scanner object reference to avoid memory leaks
		 
		
		 
		 
	}

}
