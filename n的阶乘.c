#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i, n = 0, res = 1;
	scanf("%d", &n);
	for (i = n; i > 0; i--)
	{
		res = res*i;
	}
	printf("%d\n", res);
	return 0;
}
