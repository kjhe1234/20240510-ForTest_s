
public class WhileTest01_s {

	public static void main(String[] args) {
		int i =1;
		while(i<=100) {
			System.out.println(i);
			i++;  // i = i+1
			
		}
		
		int j =1;
		while(true) {  // 무한 루프
			j++;
			System.out.println(j);
			if (j == 10000) {
				break;
			}
		}
		
		do {  // 1번은 무조건 실행되고 그 다음에 조건에 따라 반복여부를 결정
               System.out.println("안녕!");
		}  while(false);
				
		for(int k=1;k<=10;k++) {   // 1 2 4 5 7 8 10
			if (k%3==0) {
				continue;
			}
			System.out.println(k);
		}
			
			
		
			}
		

}
