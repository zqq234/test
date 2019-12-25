#define  _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>

int main()
{
	char password[20] = { 0 };
	int count = 3;
	while (count != 0)
	{
		printf("老铁，请输入你的password：");
		scanf("%s", password);
		if (strcmp(password, "123456") == 0)//"123456"
		{
			printf("登录成功\n");
			break;
		}
		else
		{
			count--;
			printf("你还有%d次机会!\n", count);
		}
	}
	return 0;
}

