#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int JumpFloor(int n)
{
	if (n == 1)
		return 1;
	else if (n == 2)
		return 2;
	return JumpFloor(n - 1) + JumpFloor(n - 2);

}
int main()
{
	int a = JumpFloor(10);
	printf("%d\n", a);
	return 0;
}

