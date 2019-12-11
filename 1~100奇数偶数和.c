#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i = 1, jsum = 0, osum = 0, sum = 0;
	/*
	while (i <= 100)
	{
	if (i % 2 == 0)
	{
	osum += i;
	sum += i;
	}
	else
	{
	jsum += i;
	sum += i;
	}
	i++;
	}
	for (i = 1; i <= 100; i++)
	{
	if (i % 2 == 0)
	{
	osum += i;
	sum += i;
	}
	else
	{
	jsum += i;
	sum += i;
	}
	}*/
	do
	{
		if (i % 2 == 0)
		{
			osum += i;
			sum += i;
		}
		else
		{
			jsum += i;
			sum += i;
		}
		i++;
	} while (i <= 100);
	printf("奇数和为：%d,偶数和为：%d,总和为：%d\n", jsum, osum, sum);
	return 0;
}

