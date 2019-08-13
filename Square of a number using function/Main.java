#include<stdio.h>
int main() {
  int n ;
  scanf("%d",&n);
  int sq = square(n);
  printf("%d",sq);  
   // Type your code here
   return 0;
}

	int square(int x){
      int a;
      a = x * x;
      return a;
    }