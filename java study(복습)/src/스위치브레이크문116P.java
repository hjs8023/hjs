
public class 스위치브레이크문116P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		switch(n) {
		case 1 : 
			System.out.println("Simple java");
			break;
		case 2:
			System.out.println("Funny java");
			break;
		case 3:
			System.out.println("Fantastic java");
			break;
		default:
			System.out.println("The best programing language");
		}
		System.out.println("Do you like java?");
	}

	/*
	 * switch문의 특징을 한가지더 언급하자면 둘이상의  레이블을 이어서 둘 수도있다.
	 * case1:
	 * case2:
	 * case3:
	 * System.out.println("case 1, 2, 3);
	 * break;
	 * default:
	 * System.out.println("default");
	 */
}
