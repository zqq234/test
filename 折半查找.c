#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int seek(int a[], int e)
{
	int mid, low = 0, high = 9;
	while (low <= high)
	{
		mid = (low + high) / 2;
		if (e > a[mid])
		{
			low = mid + 1;
		}
		else if (e < a[mid])
		{
			high = mid - 1;
		}
		else
			return mid;
	}
	return -1;

}
int main()
{
	int i, s;
	int a[10];
	printf("请输入一组有序数：\n");
	for (i = 0; i < 10; i++)
	{
		scanf("%d", &a[i]);
	}
	s = seek(a, 7);
	printf("它的下标是：%d\n", s);
	return 0;
}
