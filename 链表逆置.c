#define  _CRT_SECURE_NO_WARNINGS 1
Node *ReverseLink(Plist plist)
{
	Node *pCur = plist;
	Node *prev = NULL;
	Node *pNewHead = NULL;
	while (pCur != NULL)
	{
		Node *pCurNext = pCur->next;
		if (pCurNext == NULL)
		{
			pNewHead = pCur;
		}
		pCur->next = prev;
		prev = pCur;
		pCur = pCurNext;
	}
	return pNewHead;
}