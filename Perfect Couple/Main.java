import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int a[] = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = s.nextInt();
      }
      int ser = s.nextInt();
       for(int i = 0; i < n; i++){
         int sum = 0;
          for(int j = i+1; j < n; j++){
				sum = a[i] + a[j];
            if(sum == ser){
              System.out.println(a[i]+", "+a[j]);
              break;
            }
          }
       }
    }
}