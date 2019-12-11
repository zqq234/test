#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void bubble(int arr[], int len)
{
	int i, j, temp,flag;
	for (i = 0; i < len - 1; i++)
	{
		flag = 0;
		for (j = 0; j <len - i-1; j++)
		{
			if (arr[j + 1] < arr[j])
			{
				temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;
				flag=1;
			}
		}
	if (flag == 0)
				break;
	}
}

int main()
{
	int i;
	int arr[] = { 1, 3, 5, 2, 8, 7 };
	int len = sizeof(arr) / sizeof(arr[0]);
	bubble(arr, len);
	for (i = 0; i < len; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}