#include<stdio.h>
#include<conio.h>
void  main()
{
int a,b,c;
printf("\nEnter the no");
scanf("%d%d%d",&a,&b,&c);
if(a>b &&a>c)
printf("\nA is greater");
else if(b>c)
printf("\nB is greater");
else
printf("\nc is greater");
getch();
}

