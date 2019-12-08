#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
struct A
{
	int a;
	int b;
};
struct B
{
	int c;
	struct A*pa;
	struct A AA;
};
int main()
{
	struct B bb ;
	bb.c;
	bb.AA.a;
	bb.pa->a;
}