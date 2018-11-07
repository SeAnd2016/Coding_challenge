package core;

/*
Remove duplicates and print numbers in acceding order"
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class test {
	
	public static void main(String[] a) {
	
	Integer[] numbers = {1, 1, 2, 1, 3, 4, 5};
	
	Set<Integer> uniqKeys = new TreeSet<Integer>();
	
	uniqKeys.addAll(Arrays.asList(numbers));
	
	System.out.println("uniqKeys: " + uniqKeys);
	
	
	
	
	String names[] = {
	        "Avinash",
	        "Amol",
	        "John",
	        "Peter"
	    };

	    List < String > listObject = Arrays.asList(names);
	    ArrayList < String > list1 = new ArrayList < > (listObject);
	    for (String string: list1) {
	        System.out.println("   " + string);
	   }
	    list1.add("Alex"); //Added without any exception
	    list1.remove("Avinash"); //Added without any exception will not make any changes in original list in this case temp object.

	    System.out.println("");

	    for (String string: list1) {
	        System.out.println("   " + string);
	    }
	    String existingNames[] = new String[] {
	        "Avinash",
	        "Amol",
	        "John",
	        "Peter"
	    };
	    java.util.List < String > namesList = Arrays.asList(existingNames);
	    ArrayList <String> list2 = new ArrayList (namesList);
	    list2.add("Bob"); // UnsupportedOperationException occur
	    list2.remove("Avinash"); //UnsupportedOperationException
	    
	    System.out.println("");
	    
	    for (String string: list2) {
	    	System.out.println(" " + string);
	    }
	    
	    //case 1
	    Integer [] ia1 = {1,2,3,4};
	    System.out.println("Array : "+Arrays.toString(ia1));
	    List<Integer> list1_2 = new ArrayList<Integer>(Arrays.asList(ia1));  // new ArrayList object is created , no connection between existing Array Object
	    list1_2.add(5);
	    list1_2.add(6);
	    list1_2.remove(0);
	    list1_2.remove(0);
	    System.out.println("list1_2 : "+list1_2);
	    System.out.println("Array1_2 : "+Arrays.toString(ia1));
	    
	    //case 2
	    Integer [] ia2 = {1,2,3,4};
	    System.out.println("Array : "+Arrays.toString(ia2));
	    List<Integer> list2_2 = Arrays.asList(ia2); // creates only a (new ) List reference to existing Array object (and NOT a new ArrayList Object)
	    //  list2.add(5); //  it will throw java.lang.UnsupportedOperationException - invalid operation (as Array size is fixed)
	    list2_2.set(0,10);  // making changes in existing Array object using List reference - valid 
	    list2_2.set(1,11); 
	    ia2[2]=12;     // making changes in existing Array object using Array reference - valid
	    System.out.println("list2_2 : "+list2_2);
	    System.out.println("Array2_2 : "+Arrays.toString(ia2));

}
}

