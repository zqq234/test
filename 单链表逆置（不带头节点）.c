#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>
typedef struct node
{
	int date;
	struct node *next;
}Lnode,*Linklist;
void reverse(Linklist *L)
{
	Linklist *p, q;
	p = NULL;
	q = *L;
	while (*L != NULL)
	{
		*L = (*L)->next;
		q->next = p;
		p = q;
		q = *L;
	}
	*L = p;
}
void create(Linklist *L)
{
	*L = NULL;
	int i,len,n;
	printf("输入要创建的节点数目：\n");
	scanf("%d", &len);
	for (i = 0; i < len; i++)
	{
		printf("请输入%d个节点\n", i+1);
		scanf("%d", &n);
		Linklist q = (Linklist)malloc(sizeof(Lnode));
		if (q == NULL)
		{
			exit(-1);
		}
		q->date = n;
		q->next = *L;
		*L = q;
	}

}
void display(Linklist L)
{
	Linklist p = L;
	while (p != NULL)
	{
		printf("%d  ", p->date);
		p = p->next;
	}

}
int main()
{
	Linklist L;
	create(&L);
	display(L);
	reverse(&L); 
	printf("\n");
	display(L);
	return 0;
}