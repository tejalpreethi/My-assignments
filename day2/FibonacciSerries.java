package week1.day2;

public class FibonacciSerries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int range= 8;
		int firstnum= 0;
		int secnum=1;
	
		for(int i=1;i<=range;i++) {
			System.out.println(firstnum+", ");
			int sum= firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			
		}
		
		
		
		
		
		
		
		
	}
}