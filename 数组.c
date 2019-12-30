#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<malloc.h>
void init(int a[],int len)
{
	int i;
	for (i = 0; i < len; i++)
	{
		a[i] = i;
	}
}
int empty(int a[],int len)
{
	int i = 0;
	for (; i < len; i++)
	{
		a[i] = 0;
	}
	return 1;
}
void reverse(int a[],int len)
{
	int i=0,temp=0;
	for (; i <len; i++, len--)
	{
		temp = a[i];
		a[i] = a[len-1];
		a[len-1] = temp;
	}
}
void show(int a[],int len)
{
	int i;
	for (i = 0; i < len; i++)
	{
		printf("%d  ", a[i]);
	}
	printf("\n");
}
int main()
{
	int arr[10];
	int len,temp;
	printf("请输入要初始化数组长度：");
	scanf("%d", &len);
	init(arr,len);
	show(arr,len);
	reverse(arr,len);
	show(arr, len);
	temp = empty(arr,len);
	if (temp == 1)
		printf("数组清空！\n");
	show(arr, len);
	system("pause");
	return 0;
}
