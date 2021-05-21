package com.test;

import java.util.ArrayList;

public class Sample03 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add("ÀÌ¼ø½Å");
		a1.add(12.3);
		
		for(int inx=0; inx < a1.size()); intx++) {
			System.out.println(a1.get(inx).getClass().getName());
			System.out.println(a1.get(intx).tostring());
		}
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
