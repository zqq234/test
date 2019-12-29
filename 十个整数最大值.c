#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i, max;
	int a[10];
	for (i = 0; i < 10; i++)
	{
		scanf_s("%d", &a[i]);
	}
	max = a[0];
	for (i = 1; i < 10; i++)
	{
		if (a[i]>max)
		{
			max = a[i];
		}
	}
	printf("max=%d", max);
	return 0;
}
