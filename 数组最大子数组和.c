#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int func(int arr[], int len)
{
	int i, max=0, sum=0;
	for (i = 0; i < len; i++)
	{
		sum += arr[i];
		if (sum>0)
		{
			if (sum>max)
			max = sum;
		
		}
		else
			sum = 0;
	}
	return max;
}
int main()
{
	int arr[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
	int len = sizeof(arr) / sizeof(arr[0]);
	printf("%d", func(arr, len));
	return 0;
}