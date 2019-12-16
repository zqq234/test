#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int mypow(int x, int y)
{
	if (y == 0)
		return 1;
	if (y == 1)
		return x;
	else
	{
		return x*mypow(x, y - 1);
	}
}
int main()
{
	printf("%d\n", mypow(2, 3));
	return 0;
}