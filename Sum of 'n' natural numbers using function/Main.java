#include<stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int sum = sumof(n);
  printf("%d",sum);
  return 0;
}

int sumof(int x){
  int a = 0;
  for(int i  = 1; i <= x; i++){
    a = a + i;}
  return a;}
  