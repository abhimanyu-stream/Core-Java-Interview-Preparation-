package com.core.java8.online.CodingTest4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
          sum += number;
        }
         // get the total number of elements
        int arrayLength = numbers.length;
        // calculate the average
        // convert the average from int to double
        
        Double result = (double)sum/arrayLength;
        //average =  ((double)sum / (double)arrayLength);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + result);
    }
}
