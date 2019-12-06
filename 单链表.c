#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
typedef struct Node
{
	int data;
	struct Node*next;
}node,*plist;
void Initlist(plist p)
{
	if (p == NULL)
		return;
	p->next = NULL;
}
plist getnode(int val)
{
	node* get = (node*)malloc(sizeof(node));
	get->data = val;
	get->next = NULL;
	return get;
}
void InsertTail(plist p, int val)
{
	plist pcur, pget;
	pcur = p;
	while (pcur ->next!= NULL)
	{
		pcur = pcur->next;
	}
	pget = getnode(val);
	pcur->next = pget;
}
void show(plist p)
{
	plist pcur=p->next;
	while (pcur != NULL)
	{
		printf("%d  ", pcur->data);
		pcur = pcur->next;
	}
}
int countnode(plist p)
{
	int count=0;
	plist pcur=p->next;
	while (pcur != NULL)
	{
		count++;
		pcur = pcur->next;
	}
	return count;
}
int main()
{
	node list;
	Initlist(&list);
	InsertTail(&list, 1);
	InsertTail(&list, 2);
	InsertTail(&list, 3);
	InsertTail(&list, 4);
	show(&list);
	printf("\n节点个数：%d\n", countnode(&list));
	return 0;
}
