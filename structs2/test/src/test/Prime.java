package test;

public class Prime {
	public static void main(String args[]) {
	
		int array [] = {1,2,7,3};
		int sum = 0;
		boolean flag= false;
		for(int i=0;i<array.length;i++) {
				if(array[i]%2!=0) {
					sum=sum+array[i];
				}
			
			
		}
		System.out.println(sum);
		for(int i=2;i<sum;i++) {
			if(sum%i==0) {
				
			flag = true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("not prime");
		}
		else 
			System.out.println(" prime");
	
	}
}
