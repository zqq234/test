#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i;
	printf("1000��2000�����꣺\n");
	for (i = 1000; i <= 2000; i++)
	{
		if (i % 400 == 0)
		{
			printf("%d  ", i);
		}
		else if (i % 4 == 0 && i % 100 != 0)
		{
			printf("%d  ", i);
		}
	}
	return 0;
}
