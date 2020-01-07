#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int binsearch(int key, int arr[], int len)
{
	int left = 0;
	int right = len - 1;
	int mid = 0;
	while (left <= right)
	{
		mid = (left + right) / 2;
		if (arr[mid] < key)
			left = mid + 1;
		else if (arr[mid]>key)
			right = mid - 1;
		else
			return mid;
	}
	return -1;
}
int main()
{
	int arr[] = { 2, 8, 11, 56, 66, 77, 88, 99 };
	int len = sizeof(arr) / sizeof(arr[0]);
	int index = binsearch(11, arr, len);
	printf("%d\n", index);
	return 0;
}
