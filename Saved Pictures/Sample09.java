
public class Sample09 {

//	public static void main(String[] args) {
//		int[]arr;
//		arr = new int [3];
//		
//		int[] arr2 = new int[4];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		arr2[2] = 100;
//		arr2[3] = 300;
//		//arr2[4]= 3000;
//	for(int i = 0; i < arr2.length; i ++) {
//		System.out.println(arr2[i]);
//	}
//	
//	int[]arr3 = {10,20,100,300};
//	for(int j = 0; j < arr3.length; j++) {
//		System.out.println(arr3[j]);
//	}
//String [] names = new String[3] ;
//names[0] = "ÀÌ¼ø½Å";
//names[1] = "À»Áö¹®´ö";
//names[2] = "¼¼Á¾´ë¿Õ";
//
//for(int k = 0; k < names.length; k++) {
//	System.out.println(names[k]);
//}
//for (String name : names ) {
//	System.out.println(name);
//	

class ArrayEx18 {
	public static void main (String [] args) {
		int [][]score = {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
		};
	int sum = 0;
	
	for (int i = 0;i < score.length;i++) {
		for(int j=0;j < score[j].length;j++) {
			System.out.printf("score[%d][%d]=%d%n", i , j , score[i] [j]);
			
			
		}
	}
	for (int[] tmp : score) {
		for (int i : tmp) {
			sum+=i;
			
		}
	}
	System.out.println("sum=0"+sum); 
	}
	
}




