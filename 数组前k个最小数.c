#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int fuc(int arr[],int k)
{
	int i,temp=arr[0];
	for (i = 1; i < k; i++)
	{
		if (arr[i] < temp)
		{
			temp = arr[i];
		}
	}
	return temp;
}
int main()
{
	int arr[] = { 9, 7, 4, 5, 3, 2, 8, 1, 12, 6 };
	printf("%d", fuc(arr, 5));
	return 0;
}