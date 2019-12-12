#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
#include<Windows.h>
int main()
{
	int left = 0;
	char a[20] = "welcome to bit!";
	char b[20] = "###############";
	int right = strlen(a) - 1;
	for (; left <= right; left++, right--)
	{
		b[left] = a[left];
		b[right] = a[right];
		printf("%s\n", b);
		Sleep(1000);
		system("cls");
	}
	return 0;
}
