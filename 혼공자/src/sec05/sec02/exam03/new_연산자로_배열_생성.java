package sec05.sec02.exam03;

public class new_연산자로_배열_생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+i + "] : " + arr1[i]);		// new연산자 설정후 값안넣어서 int형 초기값인 0을 각 [0],[1],[2], 에 반환
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for(int i =0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);	// 값을추가해서 각 arr1[0],[1],[2] 에 10,20,30 반환
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i =0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
	
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);		//new연산자 설정후 값안넣어서 String형 초기값인 null을 각 [0],[1],[2], 에 반환
		}
		arr3[0]	= "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
		System.out.println("arr3[" + i + "] :" + arr3[i]);	
		}
	}
}
