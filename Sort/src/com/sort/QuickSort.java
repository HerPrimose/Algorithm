package com.sort;

public class QuickSort {
	public static void quickSort(int a[],int l,int r){  
	     if(l>=r)  
	       return;  
	  
	     int i = l; int j = r; int key = a[l];//选择第一个数为key  
	  
	     while(i<j){  
	  
	         while(i<j && a[j]>=key)//从右向左找第一个小于key的值  
	             j--;  
	         if(i<j){  
	             a[i] = a[j];  
	             i++;  
	         }  
	  
	         while(i<j && a[i]<key)//从左向右找第一个大于key的值  
	             i++;  
	  
	         if(i<j){  
	             a[j] = a[i];  
	             j--;  
	         }  
	     }  
	     //i == j  
	     a[i] = key;  
	     quickSort(a, l, i-1);//递归调用  
	     quickSort(a, i+1, r);//递归调用  
	 }  
	public static void main(String args[]) {
		int num[]= {72,6,57,48,60,42,83,73,48,85};
		quickSort(num,0,num.length-1);
		for(int elem : num)
			System.out.println(elem);
	}
}
