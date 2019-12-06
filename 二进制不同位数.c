#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int count(int m, int n)
{
	int i, s = 0;
	for (i = 0; i<32; i++)
	{
		if ((m >> i & 1) == (n >> i & 1))
			s++;
	}
	return s;
}
int main()
{
	printf("%d", count(10, 9));
	return 0;
}