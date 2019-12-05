#include "stdio.h"

#include "stdlib.h"

#include "conio.h"

#include "string.h"

#define N 3







struct student

{

	int num;

	char name[20];

	int age;

	char sex[5];

	char address[10];

	char telephone[20];

	int score[3];

	float sum;

	float avr;

}stu[N];







void view()

{

	printf("\n\n\n\n\n\n\n\n");

	printf("\t==========================================================\n");   

	printf("\t**********            学生管理系统              **********\n");      

	printf("\t**********                            **********\n");

	printf("\t**********                                 **********\n");

	printf("\t==========================================================\n");

}







int pass()  

{

	int x;  

	printf("\t\t\t请输入登录密码:");

	scanf("%d",&x);

	if(x==66)

		return 1;   

	else

	{

		printf("您输入的密码有误\n");

		return 0;

	} 

}







void input()

{

	int i,j;

	

	for(i=0;i<N;i++)

	{

		printf("请输入学号:");

		scanf("%d",&stu[i].num);

		printf("请输入姓名:");

		scanf("%s",stu[i].name);

		printf("请输入年龄:");

		scanf("%d",&stu[i].age);

		printf("请输入性别:");

		scanf("%s",stu[i].sex);

		printf("请输入住址:");

		scanf("%s",stu[i].address);

		printf("请输入电话:");

		scanf("%s",stu[i].telephone);

		

		for(j=0;j<N;j++)

		{

			printf("第%d门成绩的分数：",j+1);

			scanf("%d",&stu[i].score[j]);

		}	

		printf("\n");

	}

    printf("\n\n输入完毕!按任意键返回主菜单!");

	getch();

}





void select(int n)

{

	if(n<=4)

	{

		printf("%d号学生:\n",n);

		printf("学号: %d\n",stu[n-1].num);

		printf("姓名: %s\n",stu[n-1].name);

		printf("年龄: %d\n",stu[n-1].age);

		printf("性别: %s\n",stu[n-1].sex);

		printf("住址: %s\n",stu[n-1].address);

		printf("电话: %s\n",stu[n-1].telephone);

	}

	else

		printf("您输入的学号不存在，请返回主页面重新选择:");

	getch();

}





void count()

{

	int i,j;

	float t,sum,avr;		

	

	printf("学号     姓名      成绩1    成绩2    成绩3");	

	for(i=0;i<N;i++)

	{

		printf("\n");

		printf("%3d\t",stu[i].num);

		printf("%4s\t",stu[i].name);

		for(j=0;j<N;j++)

		{

			printf("%7d",stu[i].score[j]);

            printf("\t");

		}

		printf("\n");

	}	

	

	for(i=0;i<N;i++)

	{

		sum=0.0;	

		for(j=0;j<N;j++)

		{

			sum+=stu[i].score[j];

		}

		stu[i].sum=sum;

		stu[i].avr=sum/N;	

		printf("\n学生%s的总成绩为:",stu[i].name);

		printf("%0.2f分",stu[i].sum);

		printf("\n学生%s的平均成绩为:",stu[i].name);

		printf("%0.2f分",stu[i].avr);

	}

    

	for(j=0;j<N;j++)

	{

		for(i=0;i<N-j-1;i++)

		{

			if(stu[i].avr<stu[i+1].avr)

			{

				t=stu[i].avr;

				stu[i].avr=stu[i+1].avr;

				stu[i+1].avr=t;

			}

		}    

	}

	printf("\n\n学生平均成绩前三名:\n");	

	

	for(i=0;i<N;i++)

	{

		printf("第%d名:",i+1);

		printf("%0.2f分\n",stu[i].avr);

	}

	printf("\n按任意键返回主菜单!");

	getch();

}





void add()

{

	printf("请输入学号:");

	scanf("%d",&stu[3].num);

	printf("请输入姓名:");

	scanf("%s",stu[3].name);

	printf("请输入年龄:");

	scanf("%d",&stu[3].age);

	printf("请输入性别:");

	scanf("%s",stu[3].sex);

	printf("请输入住址:");

	scanf("%s",stu[3].address);

	printf("请输入电话:");

	scanf("%s",stu[3].telephone);

	printf("\n");		

	printf("\n\n输入完毕!按任意键返回主菜单!");

	getch();

}





void Delete()

{	     

	int n;

	printf("请输入要删除学生的学号:");

	scanf("%d",&n);

	

	stu[n-1].num=stu[n].num;

	strcpy(stu[n-1].name,stu[n].name);

	stu[n-1].age=stu[n].age;

	strcpy(stu[n-1].sex,stu[n].sex);

	strcpy(stu[n-1].address,stu[n].address);

	strcpy(stu[n-1].telephone,stu[n].telephone);



    stu[n].num=stu[n+1].num;

	strcpy(stu[n].name,stu[n+1].name);

	stu[n].age=stu[n+1].age;

	strcpy(stu[n].sex,stu[n+1].sex);

	strcpy(stu[n].address,stu[n+1].address);

	strcpy(stu[n].telephone,stu[n+1].telephone);



    stu[n+1].num=stu[n+2].num;

	strcpy(stu[n+1].name,stu[n+2].name);

	stu[n+1].age=stu[n+2].age;

	strcpy(stu[n+1].sex,stu[n+2].sex);

	strcpy(stu[n+1].address,stu[n+2].address);

	strcpy(stu[n+1].telephone,stu[n+2].telephone);

	

	printf("\n\n输入完毕!按任意键返回主菜单!");

	getch();

}





void menu()

{

    int m,n;

	printf("\n\n\n");

	printf("\t\t\t********************************\n");

	printf("\n\n\t\t\t\t学生信息管理系统\n\n");

	printf("\t\t\t\t   1.信息录入\n\n\t\t\t\t   2.信息查询\n\n\t\t\t\t   3.成绩查询\n\n\t\t\t\t   4.增加学生\n\n\t\t\t\t   5.删减学生\n\n");

	printf("\n\t\t\t********************************\n");

	printf("\t\t\t\t输入要进行的操作:");

	scanf("%d",&m);

	switch(m)

	{

	   case 1:

		   {

			   system("cls");

			   input();

			   break;

		   }

	   case 2:

		   {

			   system("cls");

			   printf("请输入要查询学生的学号:");

			   scanf("%d",&n);

			   select(n);

			   break;

		   }

	   case 3:

		   {

			   system("cls");

			   count();

			   break;  

		   }    

	   case 4:

		   {

			   system("cls");

			   add();

			   break;

		   }

	   case 5:

		   {

			   system("cls");			   

			   Delete();

			   break;

		   }		   

	}

}





int main()

{

	view();

	if(pass())

	{

		while(1)

		{

			system("cls");

			menu();

		}

	}

}

