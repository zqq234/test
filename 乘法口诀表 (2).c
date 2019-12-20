#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i, j, s;
	for (i = 1; i < 10; i++)
	{
		for (j = 1; j <= i; j++)
		{
			s = i*j;
			printf("%d*%d=%d  ", j, i, s);
		}
		printf("\n", i, j, s);

	}

	return 0;

}
