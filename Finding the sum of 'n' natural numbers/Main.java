#include <stdio.h>

int main()
{
  int n;
  scanf("%d",&n);
  printf("%d",sum(n));
  //Type your code here
  return 0;
}

int sum(int a){
  if(a != 0)
    return a + sum( a - 1);
  else 
    return a;
}