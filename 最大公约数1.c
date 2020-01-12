#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int a, b, m, i;
	scanf_s("%d%d", &a, &b);
	if (a < b)
		m = a;
	else
		m = b;
	for (i = m; i>0; i--)
	{
		if (a%m == 0 && b%m == 0)
		{
			printf("最大公约数为：%d\n", i);
			break;
		}
	}
	return 0;
}
