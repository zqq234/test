#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Number(unsigned int num)
{
	int tmp,count=0;
	while (num!=0 )
	{
		tmp = num % 2;
		num = num / 2;
		if (tmp == 1)
			count++;
	}
	return count;
}
int main()
{
	int num = -1;
	int n=Number(num);
	printf("%d\n", n);
	system("pause");
	return 0;
}