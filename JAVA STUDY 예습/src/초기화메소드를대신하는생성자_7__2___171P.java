/*
 * 생성자의 이름은 클래스의 이름과 동일해야한다.
 * 생성자는 값을 반환하지 않고 반한형도 표시하지않는다.
 * 생성자도 메소드중 하나이다 ,성격이좀 다르다.
 * 인스턴스 생성--> 뱅크어카운트 옆()안에있는 참조값 전달 
 * 생성자를 활용하자 인스턴스 사용시
 * 
 * 
 */
class BankAccount34 {
	String accNumber;	//계좌번호
	String ssNumber;	//주민번호
	int balance;		// 예금잔액
	
		// TODO Auto-generated method stub
	public BankAccount34(String acc,String ss, int bal) { // 생성자 ,,,, 초기화를 위한 생성자,,return이 안들어간다.
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMybalance() {
		System.out.println("계좌번호 :" +accNumber);
		System.out.println("주민번호 :" + ssNumber);
		System.out.println(" 잔 액 :"+ balance + '\n');
		return balance;
	}
}

class BankAccontConstructor{
	public static void main(String[] args) {
		BankAccount34 hwang = new BankAccount34("12-34-89","990990-9090990",10000);
		BankAccount34 jang =  new BankAccount34 ("33-55-09","770588-5959007",10000);
		
		hwang.deposit(5000);
		jang.deposit(3000);
		hwang.withdraw(2000);
		jang.withdraw(2000);
		hwang.checkMybalance();
		jang.checkMybalance();
	}
}