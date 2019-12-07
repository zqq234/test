#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>
unsigned int reverse_bit(unsigned int value)
{
	int i, sum=0;
	for (i = 0; i < 32; i++)
	{
		sum += ((value >> i) & 1)*pow(2, 31 - i);
	}
	return sum;
}
int main()
{
	printf("%u", reverse_bit(25));
	return 0;
}