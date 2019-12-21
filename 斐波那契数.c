#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Fibo(int n)
{
	int i,s=1,sum=1,temp;
	for (i = 0; i < n-2; i++)
	{
		if (n == 1 || n == 2)
			return 1;	
		temp = sum;
		sum += s;
		s = temp;
	}
	return sum;
}
int main()
{
	int a=Fibo(7);
	printf("%d\n", a);
	return 0;
}
