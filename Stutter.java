
public class Stutter {

	/*sets the limit,  and stutteres all the primes*/
	
	public static void main(String[] args) {
	int lim = 100;
	//stutter(lim);
	System.out.println(lim);
	System.out.println(stutter(lim));
		
	}
	
	/* 
	 * If a number is prime return true
	 * */
	
	private static boolean isPrime(int n){
		boolean isPrime = true;
		
		int i = 2;
		int div = 0;
		while(i<n){
			if(n%i == 0){	//if the number n is divisable by i
				div++;
			}
			
			i++;
		}	
		
		//if n is divisable by more than 0 values, returns false. else returns true
		if(div>=1){
			isPrime = false; 
		}
		 if(div==0){
			isPrime = true; 
		}	
		 
		return isPrime;
	}
	
	
	
	
	/* putting together and printing the stutter*/
	private static String stutter(int lim){
		String stutter = "";
		int l = lim;
		int i = 1;
		while (i<=l){
			//System.out.println(i);
			if(isPrime(i)){
				String str = Integer.toString(i);
				stutter = stutter + str;
				stutter = stutter + str + " ";	
			}
			
			//System.out.println(i);
			i++;
		}
		
		//System.out.println(stutter);
		return stutter;
		}
	
		
}


