#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void Year(int i)
{
	if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
		printf("是闰年！\n");
	else
		printf("不是闰年！\n");
	
}
int main()
{
	int year;
	while (1)
	{
		scanf("%d", &year);
		Year(year);
	}
	
	return 0;
}
