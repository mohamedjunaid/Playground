import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s = new Scanner(System.in);
      int b = s.nextInt();
      int e = s.nextInt();
      pow(b,e);// Type your code here
	}
  public static void pow(int base, int exp){
    int r = 1;
    while(exp != 0){
      r *= base;
      exp--;
    }
    System.out.println(r);
}
}