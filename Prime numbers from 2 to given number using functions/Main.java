import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i = 2; i <= n; i++){
        if(isPrime(i)){
          System.out.println(i);
        }
      }
	    // Type your code here
	}
  public static boolean isPrime(int m){
  	boolean isPrime = true;
    for(int j = 2; j <= m/2; j++){
      if(m % j == 0){
        isPrime = false;
        break;
      }
  }
    return isPrime;
}
}