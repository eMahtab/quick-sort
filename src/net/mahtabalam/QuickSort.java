package net.mahtabalam;

import java.util.Arrays;

class QuickSort 
{ 
	public static void main(String args[]) 
	{ 
		int arr[] = {10, 80, 30, 90, 40, 50, 70}; 
//		int arr[] = {10, 7}; 
//		int arr[] = {7, 10}; 
//		int arr[] = {10, 11, 77, 45, 56}; 
		int n = arr.length; 
		sort(arr, 0, n-1); 

		System.out.println("After Sorting"); 
		for(int i: arr) {
			System.out.print(i+" ");
		}
	} 
	
	public static void sort(int arr[], int start, int end) 
	{  System.out.println("QuickSort("+Arrays.toString(arr)+") > ["+start+", "+end+"]");
		if (start < end) 
		{ 
			int pIndex = partition(arr, start, end); 
			sort(arr, start, pIndex-1); 
			sort(arr, pIndex+1, end); 
		} 
	} 
	
	public static int partition(int arr[], int start, int end) 
	{   
		int pivot = arr[end]; 
		int i = start ; 
		for (int j = start; j < end; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
				i++;
			} 
		} 

		int temp = arr[i]; 
		arr[i] = pivot; 
		arr[end] = temp; 

		return i; 
	} 


} 

