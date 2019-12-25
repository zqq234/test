#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void Instead(char str[],int len)
{
	int i,j;
	for (i = 0; i < len; i++)
	{
		if (str[i] == ' ')
		{
			for (j = len; j > i; j--)
			{
				str[j + 2] = str[j];
			}
			str[i] = '%';
			str[i + 1] = '2';
			str[i + 2] = '0';
			len += 2;
		}
	}
}
int main()
{
	char str[] = "sfds fgr rgef";
	Instead(str,13);
	printf("%s", str);
	return 0;
}