#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int n = 0, i, j, result = 1, s = 0;
	scanf("%d", &n);
	for (i = 1; i <= n; i++)
	{
		result = 1;
		for (j = 1; j <= i; j++)
		{
			result = result*j;
		}
		s = s + result;

	}
	printf("%d\n", s);
	return 0;
}
/*for (i = 1; i <= n; i++)
{
ret = ret*i;
s = s + ret;
}*/
