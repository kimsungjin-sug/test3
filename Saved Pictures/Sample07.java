
public class Sample07 {

	public static void main(String[] args) {
		int a = 10;
		do {
		System.out.println(a);
		a++;
		System.out.println();
		}while(a < 20);
		
		//break
		for(int i = 1; i <= 10; i ++) {
			if(i == 2) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		//2�� ����� ���Ͻÿ�.(1...10���� ������)
		int j = 0;
		while(j<=10) {
			if(j == 2) {
				break;
			}
			System.out.println(j);
			j++;
		}
		//continue
	}
}

