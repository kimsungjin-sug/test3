package co;

public class Doctor {
	private String name;
	private String department;
	public Doctor(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public void treatPatient() {
		System.out.println( "ȯ�ڸ� �����մϴ�.");
	}
	@Over
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
