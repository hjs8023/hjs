package sec02.sec04.exam05;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;		// import문 스캐너가 자바 유틸 패키지에 있다는것을 컴파일러에게 알려주는 역할
public class 키보드에서_입력된_내용을_문자열로_얻기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		// Scanner 타입의 변수 scanner선언  ,,,  new Scanner(System.in) = 시스템 입력장치로부터 일는 Scanner를 생성한코드
		String inputdata;
		
		while(true) {
			inputdata = scanner.nextLine();  // nextline = 스캐너 변수에 저장했다가 언제든지 키보드에서 읽고싶을때 nextLine메소드사용 엔터키입력하면 입력된 모든 내용 문자열 읽음
			System.out.println("입력된 문자열:\""+inputdata + "\"");
			if(inputdata.equals("q")) {		// 기본타입 값동일한지 비교할때는 == 문자열이 동일한지 비교할때는 equals()메소드사용
				break;
				
				
			}
			
		}
		System.out.println("종료");
		}

}
  