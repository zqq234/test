#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void ReverseString(char * str)
{
	int len = strlen(str);
	char tmp = *str;
	*str = *(str + len - 1);
	*(str + len - 1) = '\0';
	if (strlen(str + 1) >= 2)
	{
		ReverseString(str + 1);
	}
	*(str + len - 1) = tmp;
}
int main()
{
	char str[] = "abcdef";
	ReverseString(str);
	printf("%s\n", str);
	return 0;
}
