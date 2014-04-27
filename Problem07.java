/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/

public class Problem07 {

	private static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		
		 Problem07 pr = new Problem07();
		 pr.findPrime();
	
	long endTime = System.currentTimeMillis();
	System.out.println("It took " + (endTime - startTime) + " milliseconds");
	
	}
	public void findPrime(){
		
		int n = 1;
		int count = 0;
		while(count < 10002){
		
			if(check(n) == true){
				count++;
			}
		n++;	
	} 
	System.out.println(n-1);		
}
	
	public boolean check(int n)
    {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
