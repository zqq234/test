#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	char *p = "bbga";
	char arr[256] = { 0 };
	char *q = p;
	while (*q)
	{
		arr[*q]++;
		q++;
	}
	while (*p)
	{
		if (arr[*p] == 1)
		{
			printf("%c\n", *p);
			return 0;
		}
		p++;

	}
	
}