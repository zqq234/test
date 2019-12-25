#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
typedef struct node
{
	int data;
	struct node *next;
}list,*linklist;
int Find(linklist L,int k)
{
	linklist p, q;
	p = L;
	q = L;
	while (k > 0)
	{
		if (p->next != NULL)
		{
			q = q->next;
			k--;
		}
		else
		{
			printf("没有此节点！");
			break;
		}
	}
	while (q != NULL)
	{
		p = p->next;
		q = q->next;
	}
	return p->data;
}
linklist Creatlist(void)
{
	int i, len, x;
	printf("请输入想要创建节点数：");
	scanf("%d", &len);
	linklist H = (linklist)malloc(sizeof(list));
	if (H == NULL)
	{
		printf("申请空间失败！");
		exit(-1);
	}
	linklist t = H;
	t->next = NULL;
	for (i = 0; i<len; ++i)
	{

		linklist p = (linklist)malloc(sizeof(list));
		if (p == NULL)
		{
			printf("申请空间失败！");
			exit(-1);

		}
		printf("请输入第%d个节点:", i + 1);
		scanf("%d", &x);
		p->data = x;
		t->next = p;
		p->next = NULL;
		t = p;

	}
	return H;
}
int main()
{
	int m;
	linklist L=NULL;
	L = Creatlist();
	m=Find(L, 4);
	printf("%d", m);
	return 0;
}