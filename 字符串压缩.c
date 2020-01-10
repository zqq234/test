#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
int main()
{
	char str[] = "sssnnndd";
	int len = strlen(str);
	int i,count=1;
	for (i = 0; i < len; i++)
	{
		if (str[i + 1] == str[i])
			count++;
		else if (count == 1)
			printf("%c", str[i]);
		else
		{
			printf("%d%c", count, str[i]);
			count = 1;
		}
	}
	return 0;
}