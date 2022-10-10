package com.ajay.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GoodiesProblem {
static int minDifference(int arr[], int n, int k) {
	int result1 = Integer.MAX_VALUE;
	//Sorting of an array occurs here
	
	Arrays.sort(arr);
	for (int i=0; i<= n-k;i++)
		result1 = Math.min(result1, arr[i + k - 1] - arr[i]);
	return result1;	
}

static int getElement(int res,int arr[], int n, int k)
{
	int result2 = Integer.MAX_VALUE;
	for(int i=0; i<=n; i++)
	{
		result2 = Math.min(result2, arr[i + k - 1] - arr[i]);
		if (res==result2)
			return i;			
	}
	return 0;
}

public static void main(String[] args) throws IOException  {
	//Initialization of an   array 
    int arr[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
    String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
    int n = arr.length;
    System.out.println("Enter the number of employees");
    Scanner s = new Scanner(System.in);
    int k=s.nextInt();
    int result=minDifference(arr, n, k);  
    System.out.println("Number of the employees:"+k); 
    int startindex=getElement(result,arr,n,k);
    System.out.println("Here the goodies that are selected for distribution are:");
    for(int i=startindex;i<startindex+k;i++)
    System.out.println(items[i]);
      System.out.println("The difference between the choosen goodie with highest price and the lowest price is: "+result);
} //Main method
}//Class
