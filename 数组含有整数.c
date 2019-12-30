#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Find(int arr[][4], int m, int n,int e)
{
	int i = 0;
	while ((m > 0) && (i < n))
	{
		if (e>arr[m-1][i])
			i++;
		else if (e < arr[m-1][i])
			m--;
		else
			return 1;
	}
	return 0;
}
int main()
{
	int arr[4][4] = { 1, 2, 8, 9, 2, 4, 9, 12, 4, 7, 10, 13, 6, 8, 11, 15 };
	if (Find(arr, 4, 4, 3))
		printf("可以找到！\n");
	else
		printf("不能找到！\n");
	system("pause");
	return 0;
}