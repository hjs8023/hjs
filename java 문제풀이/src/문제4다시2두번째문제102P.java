
public class 문제4다시2두번째문제102P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인트형 정수 15678의 오른쪽 끝에서 세번째 비트와 다섯번째 비트가 각각 어떻게 되는지 확인하여 출력하는 프로그램을 만들어보자.
		int  num = 15678;
		System.out.println(Integer.toBinaryString(num)); // 11110100111110  (Integer.toBinaryString(num))정수 -> 이진수로 바꾸는 명령어
		
		int num2 = 15678;
        System.out.println((num2>>2) & 1);
        System.out.println((num2>>4) & 1); // 정답안 
        
        /*
        위 코드의 기본 원리는 이렇다. 
        확인하고자 하는 비트를 오른쪽 끝으로 보낸다. 
        그리고 이어서 & 연산을 통해 1인지 0인지 확인한다. 
    */
	}

}
