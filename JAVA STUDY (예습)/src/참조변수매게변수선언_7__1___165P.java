class Bankac{
	int balance = 0;  //예금잔액
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyAccount() {
		System.out.println("잔액 :" + balance);
		return balance;
	}
}

class PassingRef{
	public static void main(String[] args) {
		Bankac ref = new Bankac();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);	// '참조 값'의 전
	}
		public static void check(Bankac acc) {   // acc가 위 ref 인스턴스를 같이 사용하게된다. 
			acc.checkMyAccount();
		}
		/*
		 * 참조 변수 null 대입
		 * 1. bankaccount ref = new bankaccount();
		 * 2. ,,,,
		 * 3. ref = null;   //ref가 참조하는 인스턴스와의 관계를 끊음
		 * 
		 * 
		 * 1.bankaccount ref = null;
		 * 2. ,,,,
		 * 3. if(ref == null)   // ref가 참조하는 인스턴스가 없다면,, 저장되어있는 데이터가없다면
		 * 4. ... nill 저장 유무에 대한 비교 연산가능!
		 * 
		 * null 은 청소부기능 
		 */
}