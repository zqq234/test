#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int a[5] = { 2, 4, 5, 4, 5 };
	int i,temp=a[0];
	for (i = 1; i < 5; i++)
	{
		temp = temp^a[i];
	}
	printf("%d\n", temp);
	return 0;
}