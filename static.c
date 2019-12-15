#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int f(int a)
{
	int b = 0;
	static int c = 3;
	a = c++, b++;
	return a;
}
int main()
{
	int a = 2, i, k;
	for (i = 0; i < 2; i++)
	{
		k = f(a++);
	}
	printf("%d\n", k);

	return 0;
}