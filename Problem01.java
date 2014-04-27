/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/
public class Multiplesof3and5 {

	public static void main(String[] args) {
		int[] StoredNum = new int [999];
		int SumNum = 0;
		for (int counter = 1; counter < 999; counter++){
			StoredNum[counter] = counter + 1;
		}
		for (int i = 1; i < StoredNum.length; i++){
			if (StoredNum[i] % 3 == 0 || StoredNum[i] % 5 == 0){
				SumNum += StoredNum[i];
			}
		}
		System.out.println(SumNum);
	}

}
