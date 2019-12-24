#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Number(unsigned int num)
{
	int tmp, count = 0;
	while (num != 0)
	{
		num = num & num-1;//7&6&5&4&3==0
			count++;
	}
	return count;
}
int main()
{
	int num = 15;
	int n = Number(2019);
	printf("%d\n", n);
	system("pause");
	return 0;
}