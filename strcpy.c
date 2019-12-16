#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	char arr[2][4];
	strcpy((char*)arr, "you");
	strcpy(arr[1], "me");
	arr[0][3] = '&';
	printf("%s\n", arr);
	return 0;
}