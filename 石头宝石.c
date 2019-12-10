#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int numJewelsInStones(char * J, char * S){
	int i = 0;
	int j = 0;
	int count = 0;
	while (J[i] != '\0')
	{
		j = 0;
		while (S[j] != '\0')
		{
			if (J[i] == S[j++])
			{
				count++;
			}
		}
		i++;
	}
	return count;
}
int main()
{
	char *S = "aA";
	char*A = "aaAbbbb";
	int count;
	count = numJewelsInStones(S, A);
	printf("%d", count);
	return 0;
}