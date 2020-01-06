#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int m;
	for (m = 'A'; m <= 'D'; m++)
	{
		if ((m != 'A') + (m == 'C') + (m == 'D') + (m != 'D')==3)
			printf("Ð×ÊÖÎª£º%c", m);
	}
	return 0;
}