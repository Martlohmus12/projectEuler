import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
//Find the greatest product of five consecutive digits in the 1000-digit number.

public class Problem08 {

	static String numbers = "316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
	
	public static void main(String[] args) {
	ArrayList<Integer> digits = new ArrayList<Integer>();
	List<Integer> newDigits = new ArrayList<Integer>();
	int length = 5;
	int nextTempSum = 0;
	
	for(int i = 0; i < 994; i++){
		nextTempSum = Integer.parseInt(numbers.substring(i, i + length));
		digits.add(nextTempSum);
	}
	Iterator itr =  digits.iterator(); 
	while(itr.hasNext()){
		Object number = itr.next();
		if(number.toString().contains("0") || number.toString().length() < 5){
			itr.remove();
	    }
	
}
	int currentHighest = 0;
	for(int i = 0; i < digits.size(); i++){
		
		int num = digits.get(i);
		String number =Integer.toString(num);

		String num1 = number.substring(0,1);
		int intNum1 = Integer.parseInt(num1);

		String num2 = number.substring(1,2);
		int intNum2 = Integer.parseInt(num2);

		String num3 = number.substring(2,3);
		int intNum3 = Integer.parseInt(num3);

		String num4 = number.substring(3,4);
		int intNum4 = Integer.parseInt(num4);

		String num5 = number.substring(4,5);
		int intNum5 = Integer.parseInt(num5);
		
		int holdValue = (intNum1 * intNum2 * intNum3 * intNum4* intNum5);
		if(holdValue > currentHighest){
			currentHighest = holdValue;
		}
	} 
		System.out.println(currentHighest);

}
}