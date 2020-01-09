#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	char a[20];
	char *p1 = (char *)a;
	char *p2 = (char *)(a + 5);
	int n = p2 - p1;
	printf("%d", n);
	return 0;
}