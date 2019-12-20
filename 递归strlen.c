#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int Strlen(char *string)
{
	static int len = 0;
	if (*string == '\0')
		return 0;
	Strlen(string + 1);
	len++;
	return len;
}
int main()
{
	char *p = "jdfljhfyif";
	int len = Strlen(p);
	printf("%d\n", len);
	return 0;
}
