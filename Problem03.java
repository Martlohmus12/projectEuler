/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ? */

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Factor {
    public static void main(String[] args) {
        ArrayList <Long> holdNum = new ArrayList();
       
        String input = "600851475143"; 
        long number = Long.parseLong(input);
        long count;
        for (long i = 2; i<=(number); i++) {
            count = 0;
            while (number % i == 0) {
                number /= i;
                count++;
            }
            if (count != 0) {
                holdNum.add(i);
            }
        }
        JOptionPane.showMessageDialog(null, "the greates factorila number is " + Collections.max(holdNum), "BEST GREATES FACTORIAL NUMBER FINDER EVER", JOptionPane.PLAIN_MESSAGE);
    }
}



	    
	
