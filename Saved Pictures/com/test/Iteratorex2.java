package com.test;

import java.util.ArrayList;

public class Iteratorex2 {
	public static void main(String []args) {
		ArrayList<E> original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i < 10; i++
				original.add(i+"");
		iterator it = original.iterator();
		while(it.hasNext())
			copy1.add(it.next());
		System.out.println("= Original���� copy1�� ����(copy) =");
		System.out.println("original:"+original);
		System.out.println();
		
		it = original.iterator(); // Iterator�� ������ �ȵǹǷ�, �ٽ� ���;��Ѵ�.
	}

}
