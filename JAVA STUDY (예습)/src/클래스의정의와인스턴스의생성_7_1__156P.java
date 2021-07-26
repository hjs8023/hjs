
public class 클래스의정의와인스턴스의생성_7_1__156P {
	/*
	 *  클래스, 인스턴스, 참조변수 
	 *  데이터: 프로그램상에서 유지하고 관리해야할 데이터
	 *  기능(메소드) : 데이터를 처리하고 조작 하는 기능
	 *  가급적이면 구분이되는게 좋은 프로그래밍이다.
	 *  
	
		데이터와 여러메소드들이 하나의 묶음을 이룬다.  클래스= 데이터,메소드 묶음
		연관 있는 애들끼리 묶어야함
		클래스라는 틀을가지고 사본을 만들어내는것이 인스턴스라함
		
	 */
	public static	int balance = 0; 	// 예금 잔액 , 변수선언 , 예를 참조해서 밑에 3메소드를 진행 
		// TODO Auto-generated method stub
	public static void main(String args[]) {
		deposit(10000); // 입금진행
		checkMybalance(); // 잔액 확인
		withdraw(4000); // 출금 진행
		checkMybalance(); // 잔액확인
	}
		
		public static int deposit(int amount) { // 입금  기능
			balance += amount;
			return balance;
			}
		public static int withdraw(int amount) {   // 출금 기능
			balance -= amount;
			return balance;
		}
		public static int	checkMybalance() { // 예금조회
			System.out.println("잔액 : " + balance);
			return balance;
			
		}
	}


