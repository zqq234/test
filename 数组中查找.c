#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void find(int arr[3][3], int *px, int * py, int key)
{
	int row = 0;
	int col = *py - 1;

	while (row < *px && col >= 0)
	{
		if (arr[row][col] == key)
		{
			*px = row;
			*py = col;
			return;
		}
		else if (arr[row][col]  > key)//15 > 7
		{
			col--;
		}
		else//7 < 18
		{
			row++;
		}
	}
	//没有找到
	*px = -1;
	*py = -1;
}
void find1(int *arr, int *px, int * py, int key)
{
	int row = 0;
	int col = *py - 1;

	while (row < *px && col >= 0)
	{
		if (arr[row*(*py)+col]== key)
		{
			*px = row;
			*py = col;
			return;
		}
		else if (arr[row*(*py) + col]  > key)//15 > 7
		{
			col--;
		}
		else//7 < 18
		{
			row++;
		}
	}
	//没有找到
	*px = -1;
	*py = -1;
}

int main()
{
	int arr[3][3] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int x = 3;
	int y = 3;
	find1((int *)arr, &x, &y, 4);
	printf("%d,%d\n", x, y);
}