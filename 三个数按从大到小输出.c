#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int a = 7, b = 3, c = 9, m;
	if (a < b)
	{
		m = a;
		a = b;
		b = m;
	}
	if (a < c)
	{
		m = a;
		a = c;
		c = m;
	}
	if (b < c)
	{
		m = b;
		b = c;
		c = m;
	}
	printf("a=%d,b=%d,c=%d", a, b, c);
	return 0;
}
