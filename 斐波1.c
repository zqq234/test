#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int fibo(int n)
{
	int i,f1 = 1, f2 = 1, f3 = 1;
	for (i = 3; i <= n; i++)
	{
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
	}
	return f3;
}
int main()
{
	int a = fibo(1);
	printf("%d", a);
	return 0;
}
