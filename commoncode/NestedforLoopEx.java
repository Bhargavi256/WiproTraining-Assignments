package com.commoncode;
 
 
import java.util.Arrays;
 
public class NestedforLoopEx {
 
	public static void main(String[] args) {
		int[] array= new int[5];
		for(int j=5;j>0;j--)
		{			array[5-j]=j;
			}
			Arrays.fill(array,1,5,8);
			
			for(int j=0;j<5;j++)
			{
				System.out.print(array[j]);
		}
		
	}
 
}