#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

int MyStrlen(char *str)
{
	int len = 0;
	while (*str != '\0')
	{
		len++;
		str++;
	}
	return len;
}

void ReverseStr(char *str, char *left, char *right)
{
	while (left < right)
	{
		char tmp = *left;
		*left = *right;
		*right = tmp;
		left++;
		right--;
	}
}

void ReverseSentence(char *str)
{
	int len = MyStrlen(str);
	char *start = str;
	char *cur = str;
	char *left = str;
	char *right = str + len - 1;
	ReverseStr(str, left, right);//tned.......

	while (*cur != '\0')
	{
		if (*cur == ' ')
		{
			ReverseStr(str, start, cur-1);
			start = cur + 1;
		}
		cur += 1;
	}

}
int main()
{
	char str[] = "i am a student";
	ReverseSentence(str);
	printf("%s", str);
	return 0;
}