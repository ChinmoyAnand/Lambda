package com.test.string;

import java.util.Arrays;
import java.util.HashMap;

public class StringTest {

	public static void main(String[] args) {
		String str = "Butterlllllyrr";
	    char[] chararray = str.toCharArray();
	    int[] array = {1,2,3,4,5,6,7,8};
	    int[] rev = reverseArray(array);
	    System.out.println("Array Reverse "+ Arrays.toString(rev));
	    HashMap<Character,Integer> map = new HashMap<>();
	    
	    for(char c:chararray){
	      if(map.containsKey(c)){
	        map.put(c,map.get(c)+1);
	      }
	      else
	    	  map.put(c,1);
	}
	    //map.forEach((k,v) ->System.out.println("Key "+k+"  Value "+v));

}

	private static int[] reverseArray(int[] array) {
		for(int i =0;i<array.length/2;i++) {
			int temp = array[i];
			array[i] = array[array.length-1];
			array[array.length-1-i] = temp;
		}
		return array;
	}
}
