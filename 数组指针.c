#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int arr[] = { 1, 2, 3, 4, 5, 6 };
	int(*p)[7] = &arr;
	printf("%d\n", *((*p) + 1));
	return 0;
}