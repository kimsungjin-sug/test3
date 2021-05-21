package com.test;
class MyData {
	private int a;
	MyData(T a){
		this.a = a;
	}
	public Object getA() {
		return this.a;
	}
}
public class Sample11 {

	public static void main(String[] args) {
		MyData m = new MyData(11);
		Object o = m.getA();
		MyData m1 = new MyData(new String("ÀÌ¼ø½Å"));
		Object o1 = m1.getA();
		String s = (String)o1;
		MyData<Integer> m2 = new MyData<Integer>();
		Integger i = m2.getA();
		MyData<String> m3 = new MyData<String>();
		String s2 = m2.getA();
	}

}
