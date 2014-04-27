
/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers. */


public class LargestPalindromeProduct {
public static void main(String[]args){
    int largestPalindrome = 0;
    
    for(int i = 999; i >= 100; i--)
    {
        for(int j = i; j >= 100; j--)
        {
            int result = i*j;
            if(result == Integer.parseInt(new StringBuffer(Integer.toString(result)).reverse().toString()) && result>largestPalindrome)
            {
                largestPalindrome = result;
            }
           }
        }
    System.out.println(largestPalindrome);
    }
}