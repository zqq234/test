#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
void reverse(char arr[], int left, int right)
{
	char tmp;
	while (left < right)
	{
		tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
		left++;
		right--;
	}
}
int main()
{
	char str[] = "i am a student";
	int i,len = strlen(str),left=0,right=len-1;
	reverse(str, left, right);
	for (i = 0; i < len; i++)
	{
		if (str[i] == ' ')
		{
			reverse(str, left, i - 1);
			left = i + 1;
		}
	}
	for (i = 0; i < len; i++)
	{
		printf("%c", str[i]);
	}
	return 0;
}