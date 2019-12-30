#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Strlen(char *string)
{
	int len=0;
	while (*(string++) != '\0')
	{
		len++;
	}
	return len;
}
int main()
{
	char *p = "ldflfdhhk";
	int len;
	len = Strlen(p);
	printf("%d\n", len);
	return 0;
}
