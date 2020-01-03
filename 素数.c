#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Prime(int a)
{
	int i;
	for (i = 2; i < a; i++)
	{
		if (a%i == 0)
			return 0;	
	}
	return 1;
}
int main()
{
	int a,temp;
	while (1)
	{
		scanf("%d", &a);
		temp = Prime(a);
		if (temp == 1)
			printf("%d是素数！\n", a);
		else
			printf("%d不是素数！\n", a);
	}
	return 0;
}
