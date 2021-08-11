package sec02.sec04.확인문제.exam01;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "감자바";
		int age = 25;
		String tel1="010",tel2 = "123", tel3 = "4567";
		System.out.println("이름:" + name);
		System.out.print("나이:" + age + '\n');
		System.out.printf("번호: %1$s-%2$s-%3$s" ,tel1,tel2,tel3);		// printf로 문자열출력 및 순서 정하는 코드 사용 방법
	}

}
