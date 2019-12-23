#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void SymMatrix(int (*arr)[5], int row, int col)
{
	int i, j, temp=1;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			if (i < j)
				arr[i][j] = temp++;
				arr[i][j] = arr[j][i];
		}
	}

}
void show(int arr[][5], int row, int col)
{
	int i = 0, j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			printf("%-2d  ", arr[i][j]);
		}
		printf("\n");
	}
}
int main()
{
	int arr[5][5] = { 0 };
	SymMatrix(arr, 5, 5);
	show(arr, 5, 5);
	return 0;
}