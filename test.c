#define  _CRT_SECURE_NO_WARNINGS 1
#include"game.h"
void menu()
{
	printf("********************\n");
	printf("******0.exit********\n");
	printf("******1.play*******\n");
	printf("*******************\n");
}
void game()
{
	char ret = 0;
	char board[ROW][ROW] = { 0 };// '0'  '\0'   0   NULL
	InitBoard(board, ROW, ROW, ' ');
	ShowBoard(board, ROW, ROW);
	while (1)
	{
		PlayerMove(board[ROW], ROW, ROW);
		ret = Iswin(board[ROW], ROW, ROW);
		if (ret != ' ')
			break;
		ShowBoard(board, ROW, ROW);
		ComputerMove(board, ROW, ROW);
		ret = Iswin(board[ROW], ROW, ROW);
		if (ret != ' ')
			break;
		ShowBoard(board, ROW, ROW);
	}
	if (ret == 'x')
	{
		printf("���Ӯ�ˣ�\n");
	}
	else if (ret == 'O')
	{
		printf("����Ӯ�ˣ�");
	}
	else if (ret == 'Q')
	{
		printf("ƽ�֣�\n");
	}
}
int main()
{
	int input = 0;
	do
	{
		menu();
		printf("����������ѡ��-��");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			printf("��Ϸ��ʼ\n");
			game();
			break;
		case 0:
			printf("��Ϸ�˳�\n");
			break;
		default:
			printf("��������ȷ�Ĳ���\n");
			break;
		}
	} while (input);
	return 0;
}
