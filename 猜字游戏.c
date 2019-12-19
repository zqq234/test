#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>

void menu()
{
	printf("-------------------------1:play---------------------------\n");
	printf("-------------------------0:exit----------------------------\n");
}
void play()
{
	int i,s=1;
	while (s)
	{
		int m;
		int random = rand()%100+1;//1~100随机数
		while (1)
		{
			printf("请输入：\n");
		scanf("%d", &m);
		if (m > random)
			printf("猜大了！\n");
		else if (m < random)
			printf("猜小了！\n");
		else
		{
			printf("猜对了！\n");
			s = 0;		
			break;
		}
		
		}

	}
}
int main()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
		printf("请选择：\n");
		scanf("%d", &input);
		switch (input)
		{
		case 0:
			break;
		case 1:
			play();
			break;
		default:
			printf("选择错误，请重新输入！\n");
			break;
		}
	} while (input);
	return 0;
}
