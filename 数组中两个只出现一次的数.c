#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int arr[] = { 1, 3, 5, 7, 1, 3, 5, 9 };
	int a[100] = { 0 };
	int i,j,len = sizeof(arr) / sizeof(arr[0]);
	for (i = 0; i < len; i++)
	{
		a[arr[i]]++;
	}
	for (j = 0; j < 100; j++)
	{
		if (a[j] == 1)
			printf("%d\n", j);
	}
	return 0;
}