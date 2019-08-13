#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i = 0; i < n; i++){
    scanf("%d",&a[i]);}
  for(int i = 1; i < n; i++){
    int j = i;
    while(j > 0 && a[j-1] > a[j]){
      int t = a[j-1];
      a[j-1] = a[j];
      a[j] = t;
      j--; }
  }
  for(int i = 0; i < n; i++){
    printf("%d\n",a[i]);
  }
  //Type your code here
  return 0;
}