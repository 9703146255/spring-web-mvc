package in.thiru;

import java.util.Arrays;

public class Employee {

	public static void main(String[] args) {

		int[] array = { 13, 17, 14, 35, 79 };

		int temp;

		for (int i = 0; i < array.length; i++)
		{

			for (int j = i+1; j < array.length; j++) 
			{

				if (array[i] > array[j]) 
				{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
				}

			}
			
			
			
		}
		
		

	}

}
