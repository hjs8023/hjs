	/*
	 *  인스턴스안에다가 각각의 인스턴스정보를 넣어줘어야한다. 구분할수있게 고유정보넣기.
	 *  인스턴스안에 존재하는 데이터 생성후 초기화 과정 거쳐줘야함
	 *  
	 *  
	 */
 class BankAccount23{
	String accNumber; // 계좌번호
	String ssNumber; // 주민번호
	int balance = 0; 	// 예금잔액
	
		// TODO Auto-generated method stub
		// 초기화를 위한 메소드 
	public void initAccount(String acc, String ss, int bal) {  // 인스턴트 생성후 딱한번 호출하는 메소드임
		accNumber = acc;
		ssNumber = ss;
		balance = bal;	// 계좌 계설시 예금액으로 초기화
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
			System.out.println("계좌번호:" + accNumber);
			System.out.println("주민번호:" + ssNumber);
			System.out.println("잔액 : " + balance + '\n');
			return balance;
		}
}
 
 class BankAccountUniid{
	 public static void main(String[] args) {
		 BankAccount23 hwang = new BankAccount23();	// 계좌생성
		 hwang.initAccount("12-34-89", "990990-9090990",10000); //초기화
		 
		 BankAccount23 jang = new BankAccount23(); // 계좌생성
		 jang.initAccount("33-55-09","770088-595907",10000); //초기화
		 
		 hwang.deposit(5000);
		 jang.deposit(3000);
		 hwang.withdraw(2000);
		 jang.withdraw(2000);
		 hwang.checkMybalance();
		 jang.checkMybalance();
	 }
 }
