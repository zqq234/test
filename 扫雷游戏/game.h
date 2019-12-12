#ifndef   __GAME__H_
#define  __GAME__H_

#define ROW 3
#include<stdio.h>
#include<stdlib.h>
#include<time.h>

char Iswin(char board[][ROW], int row, int col);
void InitBoard(char board[][ROW], int row, int col, char set);
void ShowBoard(char board[][ROW], int row, int col);
void PlayerMove(char board[][ROW], int row, int col);
void ComputerMove(char board[][ROW], int row, int col);
static int isfull(char board[][ROW], int row, int col);
#endif