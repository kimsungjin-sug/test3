package com.test;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {return "Fruit";}
}
class Apple extends Fruit {public String toString() {return "Apple"; }}
class Grape extends Fruit {public String toString() {return "Grape"; }}
class Toy				  {public String toString() {return "Toy"; }}

interface Eatable {}


	


	class FruitBoxEx2 {
	
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //����. Ÿ�� ����ġ
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); //����.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple()); 
	  //appleBox.add(new Grape()); // ����. Grape�� Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape());
	}
	
		
	
	
	class FruitBox<T extends Fruit & Eatable> extends Box<T> {

		public void add(Grape grape) {
			// TODO Auto-generated method stub
			
		}

		public void add(Fruit fruit) {
			// TODO Auto-generated method stub
			
		}

		public void add(Apple apple) {
			// TODO Auto-generated method stub
			
		}}
	
	class Box<T> {
		ArrayList<T> list = new ArrayList<T>();
		void add(T item) {list.add(item); }
		T get(int i) {return list.get(i);}
		int size() 	 {return list.size();}
		public String toString() {return list.toString();
		}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
