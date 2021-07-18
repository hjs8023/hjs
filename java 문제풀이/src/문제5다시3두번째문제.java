
public class 문제5다시3두번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 아래의 코드를 if ~else문이아닌 switch문을 이용하는 형태로 변경해보자
		 * int n =24;
		 * if(n >=0 && n < 10
		 * 		System.out.println("0이상 10미만의 수");
		 *	else if (n >= 10 && n < 20)
		 *			System.out.println("10이상 20미만의수");
		 * else if(n>= 20 && n < 30)
		 * 			System.out.println("20이상 30 미만의수 ");
		 * 	else
		 * 			System.out.println("음수 혹은 30 이상의수);	
		 */
				int n = 24;
				
				switch(n / 10) {
				case 0:
					System.out.println("0이상 10미만의수");
					break;
				case 1:
					System.out.println("10이상 20미만의수");
					break;
				case 2:
					System.out.println("20이상 30미만의수");
					break;
				default : 
					System.out.println(" 음수 혹은 30 이상의수");
				}
	/*int n = 24;
        
        switch(n / 10) {
        case 0:
            System.out.println("0이상 10미만의 수");
            break;
        case 1:
            System.out.println("10이상 20미만의 수");
            break;
        case 2:
            System.out.println("20이상 30미만의 수");
            break;
        default:
            System.out.println("음수 혹은 30 이상의 수");
            */
				
           
	
	}

}
