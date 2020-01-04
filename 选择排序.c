#include<stdio.h>
void select(int arr[], int len)
{
	int i, j;
	for (i = 0; i < len - 1; i++)
	{
		for (j = i + 1; j < len; j++)
		{
			if (arr[j] < arr[i])
			{
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
int main()
{
	int i;
	int arr[] = { 4, 2, 6, 7, 5, 10, 9 };
	int len = sizeof(arr) / sizeof(arr[0]);
	select(arr, len);
	for (i = 0; i < len; i++)
	{
		printf("%d  ", arr[i]);
	}
	return 0;
}