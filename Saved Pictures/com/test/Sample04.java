package com.test;

import java.util.*;

public class Sample04 {
	
	public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(1);
	ll.add("�̼���");
	ll.add(30);
	for(Object o : ll) {
		System.out.println(o);
	}
	System.out.println();
	ll.add(0,"�������");
	ll.addFirst("��������");
	ll.addLast("����");
	Iterator ltr = ll.iterator();
	while(ltr.hasNext()) {
		System.out.println(ltr.next());
	}
	}

}
