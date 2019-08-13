#include <stdio.h>
int main() {
  int n,m=3;
  scanf("%d",&n);
  for( int i = 1; i <= n; i++){
    printf("%d",i);
    if(i % m == 0) 
      printf(",");
  }
	//Type your code
	return 0;
}