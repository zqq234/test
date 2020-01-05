#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
typedef struct
{
	int x;
	int y;
}arr;
arr arr1;
void Findsum(int arr[], int len, int k)
{
	int left = 0;
	int right = len - 1;
	int sum = 0;
	while (left <= right)
	{
		sum = arr[left] + arr[right];
		if (sum < k)
			left++;
		else if (sum>k)
			right--;
		else
		{
			arr1.x = left;
			arr1.y = right;
			break;
		}
	}
}
int main()
{
	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int len = sizeof(arr) / sizeof(arr[0]);
	Findsum(arr, len, 11);
	printf("%d %d\n", arr1.x, arr1.y);
	return 0;
}