#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int DigitSum(int n)
{
	 static int sum=0;
	if (n > 9)
	{
		DigitSum(n / 10);
	}
	return sum += (n % 10);
}
int main()
{
	int sum;
	sum = DigitSum(123467);
	printf("%d\n", sum);
	return 0;
}