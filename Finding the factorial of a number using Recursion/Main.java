#include<stdio.h>
int main()
{ 
  int n;
  scanf("%d",&n);
 // int c = int fact(int n);
  printf("%d",fact(n));
	//Try out your code here
	return 0;
}

int fact(int a){
  if(a!=0)
    return a * fact( a - 1);
  else 
    return 1;
}