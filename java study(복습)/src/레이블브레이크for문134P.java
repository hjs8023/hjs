
public class 레이블브레이크for문134P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer: for(int i = 1; i <10; i++) {  //바깥쪽 for문에 레이블 outer 명시!	그래야 바깥쪽 for문도 빠져나감
				for(int j = 1; j < 10; j++) {
					if((i*j) == 72) {
							System.out.println(i + "x" + j + "=" + i*j);
							break outer;	//	outer로 명시된 반복문까지 빠져나간다. 
					}
				}
		}
	}

}
