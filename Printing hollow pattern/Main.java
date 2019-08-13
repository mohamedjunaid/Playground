
#include <stdio.h>
int main() { 
  int n;
  scanf("%d",&n);
  for(int i = 1; i <= n;i++){
    if( i == 1 || i == n)
    {
      for(int k = 1; k <= n; k++){
        printf("*");}
      printf("\n");
    }
    else 
    {
      for(int j = 1; j <= n; j++)
      {
        if( j == 1 || j == n){
          printf("*");}
        else
        {
          printf(" ");}
      } printf("\n");
    }
  }
	// Type your code here
	return 0;
}