#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	char s[] = "\\123456\123456\t";
	printf("%d\n", strlen(s));
	return 0;
}