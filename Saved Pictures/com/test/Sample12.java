package com.test;

import java.util.ArrayList;

interface MyData<T> {
	T add(T a);

}
class MyData2<T> implements MyData<T> {
	@Override
	public T add(T a) {
		return null;
		
}
}
class MyDataType{}
public class Sample12 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("1");
		ArrayList<MyDataType> a13 = new
				ArrayList<MyDataType>();

	}

}
