
public class switch문114P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("Simple java");
		case 2:
			System.out.println("Funny java");
		case 3:     // 이 위치에서 실행을 이어 나간다.
			System.out.println("Fantastic java");
		default : 
			System.out.println("The best programing language");	
			}
		System.out.println("Do you like java?");
	}

	/*  변수 n에는 3이 저장된 상태다. 따라서 case 3으로이동해서 실행을 이어간다.
	 *  switch문을 관찰해보면 case와 default는 들여쓰기를 하지 않았다
	 *  조금이라도 잘 보이도록 들여쓰기 대상에서 제외하는 것이 일방적이다.
	 */
}
