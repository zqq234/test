#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void func(int arr[], int len)
{
	int i, j,temp;
	for (i = 0; i < len; i++)
	{
		if ((arr[i] % 2) == 0)
		{
			for (j = i + 1; j < len; j++)
			{
				if ((arr[j] % 2) == 1)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
		}
	}
}
int main()
{
	int arr[] = { 1,2,3,4,5,6,7,8 };
	int i,len = sizeof(arr) / sizeof(arr[0]);
	func(arr, len);
	for (i = 0; i < len; i++)
	{
		printf("%d  ", arr[i]);
	}
	return 0;
}