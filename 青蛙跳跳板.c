#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int JumpFloor(int n)
{
	int i,f1 = 1;
	int f2 = 2,f3=0;
	if (n == 1)
		return 1;
	if (n == 2)
		return 2;
	for (i = 3; i <= n; i++)
	{
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
	}
	return f3;
}
int main()
{
	int a = JumpFloor(50);
	printf("%d\n", a);
	return 0;
}
