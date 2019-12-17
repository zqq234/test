#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#pragma pack(4)
int main()
{
	struct tagetest1
	{
		short a;long b;
		char d;
		
		long c;
	};
	struct tagetest1  st1;
	printf("%d", sizeof(st1));
	return 0;
}
#pragma pack()