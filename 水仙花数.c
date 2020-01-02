#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>//包含pow()函数
int main()
{
	int i;
	for (i = 0; i < 999999; i++)
	{
		int w=1,count=0,sum=0;//count用来存储数的位数
		while (i / w!= 0)//计算数的位数
		{
			count++;
			w *= 10;
		}
		for (w = w / 10; w>0; w /= 10)
		{
			sum =pow(( i / w%10),count)+sum;//sum用来计算各个位N次方之和
		}
		if (sum == i)
		{
			printf("%d  ", i);
		}
	}
	return 0;
}
