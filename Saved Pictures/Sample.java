
public class Sample {

	class ScannerEx {
		public static void main (String[] args ) {
			Scanner scanner = new scanner(System.in);
			System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
			String input = scanner.nextLine();
			int num = Integer.parsemeInt(input); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ
			
			System.out.println("�Է³��� : " );
			System.out.printf("num=%d$n", num);
		}
	}

}
