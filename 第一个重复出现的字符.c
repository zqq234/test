#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
int main()
{
	char str[] =" qywyer23tdd ";
	int i, j,len=strlen(str);
	for (i = 0; i < len; i++)
	{
		for (j = 0; j < i; j++)
		{
			if (str[i] == str[j])
			{
				printf("%c\n", str[i]);
				return 0;
			}
		}
	}
}