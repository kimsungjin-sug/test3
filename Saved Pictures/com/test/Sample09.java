package com.test;

public class Sample09 {
	public static void main(String[]args) {
		//0123
		int [] arr = {2,1,3,4};
		int temp;
		boolean sorted = false;
		while(!sorted) { 
		//while = 무한루프
		for(int inx = 0; inx < arr.length-1; inx++) {
			System.out.print(arr[inx]);
			if(arr[inx] > arr[inx+1]) {
				temp = arr[inx];
				arr[inx+1] = arr [inx];
				arr[inx] = temp;
				sorted = false;
			}
		}
	}
		for(int a:arr) {
			System.out.println(a);
		}
}
}
