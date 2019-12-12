#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#define f(x,y) ((x)+(y))
int main()
{
	int a = 3, b = 4;
	printf("%d\n", f(a++, b++));
	system("pause");
	return 0;
}