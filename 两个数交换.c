#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void Exchange(int *a, int *b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}
int main()
{
	int a = 1, b = 2;
	printf("a=%d,b=%d\n",a, b);
	Exchange(&a,&b);
	printf("a=%d,b=%d\n",a, b);
	return 0;
}
