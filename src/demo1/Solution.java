package demo1;

public class Solution {
	
	static void countApplesAndOranges(int s,int t,int a,int b,int[] apples,int[] oranges) {
		int	count=0;
		for (int i = 0; i < oranges.length; i++) {
		
			if(oranges[i]+b) {
				count++;
				System.out.println(count);
			}
		
		}
		int count1=0;
		for (int i = 0; i < apples.length; i++) {
			
			if((s-a+apples[i])>(s-a)) {
				count1++;
				
				System.out.println(count);
			}
			else if(((s-a-apples[i])<(s-a))) {
				System.out.println("no apple falls");
			}
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=7;
		int t=11;
		int a= 5;
		int b=15;
		int[] apples= {-6,2,9};
		int[] oranges= {15,-6};
		
 countApplesAndOranges(s,t,a,b,apples,oranges);
	}
	
	
 
}
