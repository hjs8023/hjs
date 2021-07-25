class BankAccount{
				int balance = 0 ; // 예금 잔액 ㅇㅇ
				
				public int deposit(int amount) {
					balance += amount;
					return  balance;
				}
				public int  withdraw(int amount) {
					balance -= amount;
					return balance;
				}
				public int  checkMybalance() {
					System.out.println("잔액 : " + balance);
					return balance;
				}			
			}
			class BankAccountOO{
				public void main(String[] args) {
					//두개의 인스턴스 생성
					BankAccount hwang = new BankAccount();
					BankAccount jang = new BankAccount();
					
					// 각 인스턴스를 대상으로 예금을 진행
					hwang.deposit(5000);
					jang.deposit(3000);
					
					// 각 인스턴스를 대상으로 출금을 진행
					hwang.withdraw(1000);
					jang.withdraw(1000);
					
					// 각 인스턴스를 대상으로 잔액을 조회
					hwang.checkMybalance();
					jang.checkMybalance();

	}

}
