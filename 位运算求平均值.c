#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int a=6, b=4, avg;
	avg = (a&b) + ((a^b) >> 1);
	printf("%d", avg);
	return 0;
}
