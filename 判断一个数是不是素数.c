#define  _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
int IsPrime(int n)
{
	int i = 0;
	for (i = 2; i < n; i++)
	{
		if (n % i == 0)
		{
			return 0;
		}
	}
	return 1;
}
int main()
{
	int ret = IsPrime(10);
	if (ret == 1)
	{
		printf("is prime\n");
	}
	else
	{
		printf("is not prime\n");
	}
	return 0;
}
