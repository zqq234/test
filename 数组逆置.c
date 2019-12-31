#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void fun(int arr[], int i, int j)
{
	int temp;
	if (i < j)
	{
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		fun(arr, ++i, --j);
	}
}
int main()
{
	int i;
	int arr[6] = { 0, 1, 2, 3, 4, 5 };
	fun(arr, 0, 5);
	for (i = 0; i < 6; i++)
	{
		printf("%d  ", arr[i]);
	}
	
	return 0;
}
