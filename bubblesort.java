package com.perry.school;

public class Bubble {

	int[] array;
	
	int length;
	
	public static void main(String[] args) {

		int[] arr = {47,23,11,57,36,4,85};
						
		Bubble b = new Bubble();
		
		b.sort(arr);
		
		}
	
	

	public void sort(int[] inputarray)
	{
		if(inputarray == null||inputarray.length==0)
		{
			return;
		}
		
		this.array=inputarray;
	     
		length = array.length;
		
		QuickSort(0,length-1);
		
	}
	
	public void QuickSort(int low,int high)
	{
		int i=low;
			
		int j=high;
		
		int pivot= array[(low+high)/2];
		
		while(i<=j)
		{
		   while(array[i]<pivot)
		   {
	           i++;
			   
		   }
		   
		   while(array[j]<pivot)
		   {
			   j--;
		   }
		
		
		   
		}
		
	}
	
}
