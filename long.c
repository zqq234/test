#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
unsigned long g = 0;
void te(unsigned long gg)
{
	gg = 0x01;
	return;
}
void test()
{
	te(g);
	printf("%lu", g);
	return;
}
int main()
{
	test();
	return 0;
}