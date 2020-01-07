#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void InsertSort(int arr[], int len)
{
	int i, j;
	for (i = 1; i < len; i++)
	{
		int temp=arr[i];
		for (j = i - 1; j >= 0; j--)
		{
			if (temp < arr[j])
			{
				arr[j + 1] = arr[j];
			}
			else
				break;
		}
		arr[j+1] = temp;
	}
}
int main()
{
	int i;
	int arr[] = { 3, 5, 7, 8, 9, 10, 11 };
	int len = sizeof(arr) / sizeof(arr[0]);
	InsertSort(arr, len);
	for (i = 0; i < len; i++)
	{
		printf("%d  ", arr[i]);
	}
	return 0;
}