
public class ForTest01_s {

	public static void main(String[] args) {
		
		//int i;
		for(int i =1;i<=10;i=i+1) {          // 초기값 조건식 증감값
			
			System.out.println(i);
			
		}
		
		for(int j=1;j<=100;j++) {
			System.out.println(j);
			
		}
		
		for(int k=100;k>=0;k--) {
			System.out.println(k);
		}
		
		//1~100까지 합을 출력하는 반복문을 작성하시오.
		
		int sum = 0;   // sum 정수 변수를 선언과 동시에 0으로 초기화
		for(int i=1;i<=100;i++) {
			sum = sum + i;		
		}
		System.out.println("sum의 값:"+ sum);
		
		// for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오.
		
		int sum1 = 0;
		for(int i=3;i<=100;i=i+3) {
			sum1 = sum1 + i; 	
		}
		System.out.println("1~100사이의 3의 배수 총합의 값"+sum1);
		
		int sum2 = 0;
		for(int i=1;i<=100;i++) {
			if  (i % 3 == 0) {
				sum2 = sum2 + i;
				}
			}
		System.out.println("1~100사이의 3의 배수 총합의 값"+sum2);
		
		
	}

}
