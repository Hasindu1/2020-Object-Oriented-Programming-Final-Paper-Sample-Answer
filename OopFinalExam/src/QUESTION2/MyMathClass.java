//Developed by Hasindu Dahanayake
package QUESTION2;

import java.util.*;
import java.util.stream.Collectors;

public class MyMathClass<T, V extends Number> {

	public void average(HashMap<T, V> map) {//Calculating the average of HashMap values
		double total = 0;
		double avg = 0;

		for (HashMap.Entry<T, V> m : map.entrySet()) {

			total += (double) m.getValue();//Calculating the total of values in HashMap

		}
		avg = (total / map.size());//Calculating the average of values by dividing the total by map size

		System.out.println("Average is " + avg);

	}

	public ArrayList<V> covertTo(HashMap<T, V> map) {//Converting the given HashMap to an ArrayList
		ArrayList<V> arrayList = new ArrayList<>();

		List<V> tempList = map.values().stream().collect(Collectors.toList());

		arrayList.addAll(tempList);

		return arrayList;

	}
}
