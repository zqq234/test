#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
void reverse_string(char *string)
{
	if (*string == '\0')
		return;
	reverse_string(string+1);
	printf("%c", *string);
	
}
int main()
{
	char *p = "fdjksjfsif";
	reverse_string(p);
	return 0;
}
