#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int  Fibo(int n)
{
	if (n == 1)
	{
		return 1;
	}
	else if (n == 2)
	{
		return 1;
	}	
	else
		return (Fibo(n - 1) + Fibo(n - 2));
}
int main()
{

	int a=Fibo(4);
	printf("%d\n", a);
	return 0;
}
