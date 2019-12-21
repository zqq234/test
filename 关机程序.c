#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	char input[10] = { 0 };
	system("shutdown -s -t  60");
again:
	printf("电脑将在1分钟内关机，输入：小仙女，就取消关机！\n");
	scanf("%s", input);
	if (0 == strcmp(input, "小仙女"))
		system("shutdown -a");
	else
		goto again;
	return 0;
	return 0;
}