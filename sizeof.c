#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
int main()
{
	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	printf("%d\n", sizeof(arr[4]));
	printf("%d\n", sizeof(arr[10]));
	char str1[100] = "abcdef";
	char str2[] = "abcdef";
	char *str3 = "abcdef";
	char str4[100] = "abcdef\0xyz";
	char str5[] = "abcdef\0xyz";
	char *str6 = "abcdef\0xyz";
	char str7[100] = "abcdef\n\0xyz";
	char str8[] = "abcdef\n\0xyz";
	char *str9 = "abcdef\n\0xyz";
	printf("%d,%d\n", sizeof(str5), strlen(str4));
	return 0;
}
