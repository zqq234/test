#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int MyStrlen(char *str)
{
	
	if (*str == '\0')
		return 0;
	return 1+MyStrlen(str + 1);
	
}
int main()
{
	char *p = "hello";
	int len = MyStrlen(p);
	printf("%d\n", len);
	return 0;
}
