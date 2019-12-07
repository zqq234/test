#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int count_one_bits(unsigned int value)
{
	int count=0;
	while (value > 0)
	{
		value = value&value - 1;
		count++;
	}
	return count;
}

int main()
{
	int s;
	scanf("%d", &s);
	printf("%d\n", count_one_bits(s));
	return 0;
}
