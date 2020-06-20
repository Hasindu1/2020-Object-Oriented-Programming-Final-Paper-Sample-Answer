//Developed by Hasindu Dahanayake
package QUESTION2;

import java.util.HashMap;

public class MyMain {
	public static void main(String[] args) {

		MyMathClass<String, Double> myMathClass = new MyMathClass<>();
		HashMap<String, Double> hm = new HashMap<String, Double>();

		HashMap<String, String> hm1 = new HashMap<String, String>();/*
																	 * To demonstrate the compile time error in a case
																	 * of invalid generic type args
																	 */

		hm.put("Hasindu", 100.0);
		hm.put("Pasindu", 200.0);
		hm.put("Manuli", 300.0);
		hm.put("Chamath", 400.0);
		hm.put("Yuvin", 600.0);

		myMathClass.average(hm);/*
								 * Calling the average method of MyMathClass to calculate the average of hash
								 * map
								 */
		/*
		 * myMathClass.average(hm1); //Compile time error to invalid generic type
		 * arguments
		 */

		System.out.println(myMathClass.covertTo(hm));// calling and displaying the converted arraylist

	}

}
