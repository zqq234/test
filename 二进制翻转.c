#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
unsigned int reverse_bit(unsigned int value)
{
	int i, m,n=0;
	for (i = 0; i < 32; i++)
	{
		n= (value >> i) & 1;
		m |= n << 31 - i;
	}
	return m;
}
int main()
{
	printf("%u\n", reverse_bit(25));
	return 0;
}