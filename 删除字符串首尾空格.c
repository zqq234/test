#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
char *func(char str[],int len)
{
	int i=0, j;
	while (*str ==' ')
	{
		str++;
		len--;
	}
	while (str[len - 1] == ' ')
	{
		len--;
	}
	str[len ] = '\0';
	for (i; i < len; i++)
	{
		if (str[i + 1] == str[i] && str[i] == ' ')
		{
			for (j = i + 1; j < len; j++)
				str[j] = str[j + 1];
			len--;
			i--;
		}
	}
	str[len] = '\0';
	return str;
}
int main()
{
	char str[] = "   hello   world!   ";
	int len = strlen(str);
	char *c=func(str, len);
	printf("%s", c);
	return 0;
}