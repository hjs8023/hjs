package sec03.sec02.exam11;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');   //  삼항 연산자에서  1조건식 ? 2값또는 연산식(피연산자2) : 3값또는 연산(피연산자3)      ?앞의 조건식에따라  트루가나오면 결과는 피연산자 2이고 false면 결과가피연산자3
		
		System.out.println(score + "점은" + grade + "등급입니다.");
	}

}
