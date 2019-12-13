#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int fuc(int n, int k)
{
	if (k == 1)
		return n;
	else
		return n*fuc(n ,k-1);
}
int main()
{
	int s;
	s = fuc(3, 4);
	printf("%d\n", s);
	return 0;
}