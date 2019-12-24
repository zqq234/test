#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i;
	double sum = 0.0;
	for (i = 1; i < 101; i++)
	{
		if (i % 2 == 0)
		{
			sum -= 1.0 / i;
		}
		else
			sum += 1.0 / i;
	}
	printf("%lf\n", sum);
	return 0;
}
