import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);  // Type your code here
    int n = s.nextInt();
      int a []= new int[n];
     // int e = s.nextInt();
      for(int i = 0; i < n; i++){
        a[i] = s.nextInt();
      }
      int s1 = s.nextInt();
      int s2 = s.nextInt();
     int e1 = -1;
      int e2 = -1;
      for(int i = 0; i < n; i++){
        if(a[i] == s1){
          e1 = i;
        }
        if(a[i] == s2){
          e2 = i;
        }
      }
      
      // search(s1,a,n);
      //search(s2,a,n);
    System.out.println(e1);
       System.out.println(e2);
        
      }
    }
    
      

