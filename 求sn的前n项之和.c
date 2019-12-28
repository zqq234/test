#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>
int main()
{
	int a, n,i,sum=0,m=1,s=0;
	printf("请输入要计算的数：\n");
	scanf("%d", &a);
	printf("请输入前多少项之和：\n");
	scanf("%d", &n);
	for (i = 1; i < n+1 ;i++)
	{
		for (m = 1;m<pow(10,i); m *= 10)
		{
			sum = sum + a*m;
		}
		
		s = s + sum;
		sum = 0;
	}
	printf("%d\n", s);
	return 0;
}

