import java.util.Scanner;

public class Sample08 {
public static void main(String[]args) {
	
//	int a = 10;
//	while(a == 10) {}
	Scanner scaner = new Scanner(System.in);
	Scanner scanner = null;
	String inputString = scanner.nextLine();
	int num = Integer.parseInt(inputString);
	System.out.println("#1.메뉴          #");
	System.out.println("#2.종류          #");
	System.out.println("#####메뉴#####");
	switch(num) {
	case 1:
		System.out.println("메뉴입니다.");
		break;
	case 2:
		System.out.println("종류입니다.");
		
	}
	for(;;) {
		
	}
	
}

}
