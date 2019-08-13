import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
      int n2 = n1%10;
      int n3 = n1 / 100;
      int p = n2+n3;
      System.out.println(p);
		// Type your code here
	}
}