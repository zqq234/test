#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int old(int n)
{
	if (n == 1)
		return 10;
	else
		return 2 + old(n - 1);
}
int main()
{
	int a;
	a = old(5);
	printf("%d\n", a);
	return 0;
}
