#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b[a];
  for(int i = 0; i <= a-1; i++){
    scanf("%d",&b[i]);}
  int l = b[0];
  for(int i = 1; i <= a-1; i++){
    if(l < b[i])
      l = b[i];}
  printf("%d",l);}