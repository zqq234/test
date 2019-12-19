#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int fuc(int arr[], int len)
{
	int i,j, count=0;
	for (i = 0; i < len; i++)
	{
		count = 0;
		for (j = 0; j < len; j++)
		{
			if (arr[i] == arr[j])
				count++;
			if (count>len / 2)
				return arr[i];
		}
	}
	return 0;
}
int main()
{
	int arr[] = { 1, 3, 4, 6, 7, 8, 5,6, 4, 4 ,4,4,4,4,4};
	int len = sizeof(arr) / sizeof(arr[0]);
	if (fuc(arr, len))
		printf("%d\n", fuc(arr, len));
	else
		printf("没有超过数组长度一半的数字！\n");
	return 0;
}