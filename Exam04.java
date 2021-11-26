
public class Exam04 {

	public static void main(String[] args) {
		// 여러가지 자료형
		/*
		 * 자바에서 자료형은 크게 두가지로 나뉜다. 
		 *   1.기본형  1) 정수형 (byte, short, int, long)
		 *           byte - 1byte  byte= -128~127
		 *           short - 2byte 
		 *           int - 4byte
		 *           iong - 8byte
		 *           2) 실수형 (float, double)
		 *           float - 4byte
		 *           double - 8byte
		 *           3) 논리형 (boolean)
		 *           boolean - 1byte
		 *           4) 문자형 (char)
		 *           char - 2byte
		 *   2.레퍼런스 자료형        
		 * 
		 * */
		byte num1 = 126;
		short num2 = 5000;
		int num3 = 2000000; 
		long num4 = 22222222;
		float num5 = 10.4f;
		// 자바에서 실수형은 기본적으로 double로 인식한다. float 표시하고싶을경우 -> 1.숫자 뒤에 f표시 2. (float)숫자표시
		double num6 = 222.12345;
		boolean isCheck = true;
		isCheck= false;
		char text = 'A';
		text = '가';
		
		char test = 'A';
		int num10 = test;
		System.out.println(num10);
		String text2 = "ABC";
		text2 = "가나다"; 
		/*
		 * 카멜 표기법 : 첫단어 소문자 다음 문자 대문자
		 * 파스칼 표기법 : 각 단어 대문자
		 * 스네이크 표기법  : 단어 사이마다 언더바 삽입
		 * 헝가리안 표기법 : 접두어에 자료형 넣음
		 * */
		
	}

}
