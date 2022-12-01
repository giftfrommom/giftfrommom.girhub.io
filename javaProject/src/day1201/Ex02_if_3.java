package day1201;

public class Ex02_if_3 {

	public static void main(String[] args) {
		// 삼항연산자
		/*
		 * if(){
		 * 
		 * }
		 * else{
		 * 
		 * }
		 * 
		 * 삼항연산자
		 * 자료형 결과를 저장할 변수 = (조건 ) ? 참에 대한 결과 : 거짓에 대한 결과
		 * * 결과는 데이터, 값이 나오고 그 값을 변수에 저장하는 연산자
		 * 
		 * 
		 */
		
		int num1 = 5;
		int num2 = 8;
		int result;
		
		if (num1>num2) {
			result = num1;
			System.out.println(" 두 숫자 중에 더 큰 숫자는 " + result + " 입니다.");
		}else {
			result = num2;
			System.out.println(" 두 숫자 중에 더 큰 숫자는 " + result + " 입니다.");
		}
		
		
	}

}
