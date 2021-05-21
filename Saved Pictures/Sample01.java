//¿¬»êÀÚ
public class Sample01 {
	
	public static void main(String[] args) {
		int a = 0; //0;=1
		int b = a++;
		System.out.print(b);
		System.out.print(a);
		int c = 0;
		int d = ++c;
		System.out.println(d);
		System.out.println(c);
		int e = a++ + c++;
		System.out.println(e);
		int f = a + c;
		System.out.println(f);
		
		boolean g = (a == c) ? true : false;
		System.out.print(g);
		boolean h = ( a == c) ? true : false ;
		System.out.println(h);
		
		int i = 0;
		boolean j = ( a == c) || (i == 0);
		boolean k = ( a == c)	&&(i == 0);
		
		int l = i+=2;//i= i+2
		
	}

}
