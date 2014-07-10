

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Problem05 {

    private static final int number = 20;
    
    public static void main(String []args){
    	Problem05 p = new Problem05();
    	int t = p.getSolution();
    	System.out.println(t);
    }

    public int getSolution()
    {
        HashMap hm = new HashMap();
        
        for(int i = number; i > 2; i--)
        {
            List primes = getPrimesBrute(i);
            int firstIndex = 0;
            int lastIndex;
            int val;
            boolean done = false;
            
            while(!done)
            {
                int key = (Integer)primes.get(firstIndex);
                lastIndex = primes.lastIndexOf(key);
                val = lastIndex - firstIndex + 1;
                
                if(!hm.containsKey(key) || val > (Integer)hm.get(key))
                {
                    hm.put(key, val);
                }
                
                if(lastIndex == primes.size()-1)
                {
                    done = true;
                }
                else
                {
                    firstIndex = lastIndex + 1;
                }
            }            
        }
        
        Set<Integer> keys = hm.keySet();
        int endResult = 1;
        
        for( int key : keys )
        {
            endResult = endResult*(int)Math.pow(key,(Integer)hm.get(key));
        }
        
        return endResult;
    }

    private List getPrimesBrute(int toPrimes) 
    {
        List<Integer> primes = new ArrayList<Integer>();
        
        for(int i=2; i <= toPrimes; i++)
        {    
            while(toPrimes%i == 0)
            {
                toPrimes = toPrimes/i;
                primes.add(i);
            }
        }
        
        return primes;
    }
}
