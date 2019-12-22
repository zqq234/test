#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void Num(int n)
{

	if (n > 9)
	{
		Num(n / 10);
	}
	printf("%d ", n % 10);
}
int main()
{

	Num(1234);
	return 0;

}