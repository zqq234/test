#define  _CRT_SECURE_NO_WARNINGS 1
int YearLeap(int i)
{
	if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
int main()
{
	int i = 0;
	for (i = 1000; i <= 2000; i++)
	{
		if (YearLeap(i) == 1)
		{
			printf("is YearLeap %d\n", i);
		}
	}
	return 0;
}
