package sec04.exam05;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
public class 키보드에서_입력된_내용을_문자열로_얻기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputdata;
		
		while(true) {
			inputdata = scanner.nextLine();
			System.out.println("입력된 문자열:\""+inputdata + "\"");
			if(inputdata.equals("q")) {
				break;
				
				
			}
			
		}
		System.out.println("종료");
		}

}
  