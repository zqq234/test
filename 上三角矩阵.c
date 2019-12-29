#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void UpAngle(int arr[][5], int row, int col)
{
	int i, j,temp=1;
	for (i = 0; i < row; i++)
	{
		for (j = i; j < col; j++)
		{
			arr[i][j] = temp++;
		}
		printf("\n");
	}
}
void show(int arr[][5], int row, int col)
{
	int i=0, j=0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			printf("%-2d  ",arr[i][j]);
		}
		printf("\n");
	}
}
int main()
{
	int arr[5][5] = { 0 };
	UpAngle(arr, 5, 5);
	show(arr, 5, 5);
	return 0;
}