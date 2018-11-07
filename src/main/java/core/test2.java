package core;

/*
Remove duplicates and print numbers in acceding order"
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class test2 {
	
	public static void main(String[] a) {
	
	    //case 1
	    Integer [] ia1 = {1,2,3,4};
	    System.out.println("Array : "+Arrays.toString(ia1));
	    List<Integer> list1_2 = new ArrayList<Integer>(Arrays.asList(ia1));  // new ArrayList object is created , no connection between existing Array Object
	    list1_2.add(5);
	    list1_2.add(6);
	    list1_2.remove(0);
	    list1_2.remove(0);
	    System.out.println("list1_2 : "+list1_2);
	    System.out.println("Array : "+Arrays.toString(ia1));
	    
	    System.out.println("");
	    
	    //case 2
	    Integer [] ia2 = {1,2,3,4};
	    System.out.println("Array : "+Arrays.toString(ia2));
	    List<Integer> list2_2 = Arrays.asList(ia2); // creates only a (new ) List reference to existing Array object (and NOT a new ArrayList Object)
	    // list2_2.add(5); //  it will throw java.lang.UnsupportedOperationException - invalid operation (as Array size is fixed)
	    list2_2.set(0,10);  // making changes in existing Array object using List reference - valid 
	    list2_2.set(1,11); 
	    ia2[2]=12;     // making changes in existing Array object using Array reference - valid
	    System.out.println("list2_2 : "+list2_2);
	    System.out.println("Array : "+Arrays.toString(ia2));

}
}

