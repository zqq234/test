#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int fun(int arr[], int len)
{
	int left = 0;
	int right = len - 1;
	int temp;
	while (left < right)
	{
		while (left < right&&arr[left] % 2)
		{
			left++;
		}
		while (left < right&&arr[right] % 2 == 0)
		{
			right--;
		}
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
int main()
{
	int arr[] = { 2, 3, 5, 7, 8, 3, 5, 6 },i;
	int len = sizeof(arr) / sizeof(arr[1]);
	fun(arr, len);
	for (i = 0; i < len; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}