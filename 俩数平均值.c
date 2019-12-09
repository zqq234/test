#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int avg(int m, int n)
{
	int tmp = n + ((m - n) >> 1);
	return tmp;
}
int main()
{
	printf("%d\n", avg(26, 30));
	return 0;
}
