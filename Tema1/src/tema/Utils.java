package tema;

public class Utils {
	
	public static long fibonacci(int n){
		long penultim = 0, ultim = 1, curent = 1;
		for(int i = 2; i <= n; i++){
			curent = penultim + ultim;
			penultim = ultim;
			ultim = curent;
		}
		
		return curent;
	}
	
	public static boolean primTest(int n){
		if(n < 2){
			return false;
		}
		if(n % 2 == 0 && n != 2){
			return false;
		}
		for(int i = 3; i <= Math.sqrt(n); i += 2){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
