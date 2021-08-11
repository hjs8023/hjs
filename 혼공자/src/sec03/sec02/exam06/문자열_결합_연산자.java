package sec03.sec02.exam06;

public class 문자열_결합_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
	}

}
