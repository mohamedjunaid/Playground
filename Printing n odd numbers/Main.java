#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int a = 2 * n;
  for(int i =1 ; i <= a ; i++)
  {
    if(i % 2 == 1)
      printf("%d\n",i);
  }
	//Type your code
	return 0;
}