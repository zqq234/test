#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
char *mystring()
{
	char buffer[6] = { 0 };
	char *s = "hello world!";
	for (int i = 0; i < sizeof(buffer)-1; i++)
	{
		buffer[i] = *(s + i);
	}
	return buffer;
}
int main()
{
	printf("%s\n", mystring());
	return 0;
}
