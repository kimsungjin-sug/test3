package co;
class BBSItem {
	static int seqNO;
	//static �� �� ��� 1 1 ����
	 BBSItem() {
		 seqNO++;
		 System.out.println(seqNO);
	 }
}

public class Sample02 {

	public static void main(String[] args) {
		BBSItem b = new BBSItem();
		BBSItem b1 = new BBSItem();
	}

}
