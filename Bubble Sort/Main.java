
#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i = 0; i < n ; i++){
    scanf("%d",&a[i]);}
  for(int i = 0; i <= n - 2; i++){
    for(int j = 0; j <= n-2-i;j++){
    if(a[j] > a[j+1]){
      int temp = a[j];
      a[j] = a[j+1];
      a[j+1] = temp;}}}
  for(int i = 0; i < n; i++){
    printf("%d\n",a[i]);}
  
  //Type your code here
  return 0;
}
