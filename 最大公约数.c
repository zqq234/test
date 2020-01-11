#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int a = 24;
	int b = 18;
	while ((a%b) != 0)
	{
		int c;
		c = a %b;
		a = b;
		b = c;
	}
	printf("%d\n", b);
	return 0;
}

