#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
int main()
{
	char str[] = "they are students!";
	char s[] = "aeiou", a[256] = { 0 };
	int i,j,len1 = strlen(str),len2=strlen(s);
	for (i = 0; i < len2; i++)
	{
		a[s[i]]++;
	}
	for (i = 0; i < len1; i++)
	{
		if (a[str[i]] != 0)
		{
			for (j = i; j < len1; j++)
			{
				str[j] = str[j + 1];
			}
			len1--;
		}
	}
	str[len1] = '\0';
	printf("%s", str);
	return 0;
}