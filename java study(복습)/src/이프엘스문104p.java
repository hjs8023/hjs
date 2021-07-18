
public class 이프엘스문104p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 5;
		int n2 = 7;
		
		// if 문
		if(n1 < n2) {  //(true)
			System.out.println("n1 < n2 is true");
		}
		//if else문  // (false) 여서 건너
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");
			
		}
		else {   // 건너뛰고 다음문장 실
			System.out.println("n1 == n2 is false");
		}
		
		// if(true or false)
		// if  오른 편에 위치한 소괄호를 보자. 이부분에 true 또는 false가 오게 되어있다.
		//true가 오면 이어서 등장하는 중괄호의 내부가 실행되고,false가등장하면 이부분을 건너뛰게된다.
		
	}

}
