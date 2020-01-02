#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i, j;
	printf("100到200之间的素数为：\n");
	for (i = 101; i <= 200; i += 2)
	{
		for (j = 2; j <= sqrt((double)i); j++)
		{
			if (i%j == 0)
				break;
		}
		if (j < sqrt((double)i))
			printf("%d\n", i);
	}
	return 0;

}
