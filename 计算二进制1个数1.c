#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Number(unsigned int num)
{
	int tmp,count=0;
	while (num != 0)
	{
		tmp=num & 1;
		if (tmp == 1)
			count++;
		num=num >> 1;
	}
	return count;
}
int main()
{
	int num = -1;
	int n = Number(num);
	printf("%d\n", n);
	return 0;
}