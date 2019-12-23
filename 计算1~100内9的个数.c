#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Founction(int n)
{
	int i,count = 0;
	for (i = 1; i < n; i++)
	{
		if (i % 10 == 9)
			count++;
		if ((i / 10) % 10 == 9)
			count++;
	}
	return count;
}
int main()
{
	int n,count;
	scanf("%d", &n);
	count=Founction(n);
	printf("%d\n", count);
	return 0;
}

