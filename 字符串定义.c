#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	char str[6] = { '\0' };
	int a = 10;
	const char *p = "hello";
	printf("%c\n", *p);
	a += a *= a -= a / 3;
	printf("%d", a);
	return 0;
}