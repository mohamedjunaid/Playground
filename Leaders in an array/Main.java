
#include <stdio.h>
int main() 
{
    int n;
    scanf("%d", &n);
    int arr[n], j;
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for(int i = 0; i < n; i++)
    {
        for(j = i + 1; j < n; j++)
        {
            if(arr[i] <= arr[j])
            {
                break;
            }
        }
        if(j == n)
            printf("%d ", arr[i]);
    }
    return 0;
}