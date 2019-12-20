#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void Table(int s)
{
	int i , j ;
	for (i = 1; i <= s; i++)
	{
		for (j = 1; j <= i; j++)
		{
			printf("%dx%d=%d   ", i, j, i*j);
		}
		printf("\n");
	}
}
int main()
{
	int a;
	scanf("%d", &a);
	Table(a);
	return 0;
}
