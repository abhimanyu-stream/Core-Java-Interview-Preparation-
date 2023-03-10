package com.core.java8.online.factorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 * Default capacity of ArrayList is 10.once the max size is reached,new capacity will be:

   new capacity=(currentcapacity*3/2)+1.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // List<String> listString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //int inputInt = scanner.nextInt();
        Integer inputInt = scanner.nextInt();
        System.out.println(findFactorial(inputInt));
        List<String> listString = new ArrayList<>();
        System.out.println(  listString.size());
        listString.add("a");
        listString.add("a");
        listString.add("a");
        listString.add("a");
        listString.add("a");
        listString.add("a");
        listString.add("a");
        listString.add("a");
        listString.add("a");
        listString.add("a");
        System.out.println(  listString.size());
        listString.add("a");
        System.out.println(  listString.size());
    }

	private static Object findFactorial(Integer inputInt) {
		int factorialSum = 1;

		if (inputInt == null) {

			return new NullPointerException();
		}

		if (inputInt == 0) {
			return 1;

		}
		if (inputInt == 1) {
			return 1;
		}
		for (int i = 1; i <= inputInt; i++) {

			factorialSum = factorialSum * i;
		}
		
	return factorialSum;	
	}
	
}
