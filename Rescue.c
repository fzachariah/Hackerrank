#include<stdio.h>
int main()
{
    int n,i,k,t;
    scanf("%d",&t);
    int fact = 1;
    for(i=2;i<=24;i++)
    {
        fact=(fact*i)%107;
    }
    while(t--)
    {
        scanf("%d %d",&n,&k);
        if(n==1 || n==2)
        {
            printf("%d\n",n);
        }
        else if(n==3)
        {
            if(k==2)
            {
                printf("%d\n",720%107);
            }
            else
            {
                printf("0\n");
            }
        }
        else if(n==4)
        {
            if(k==2)
            {
                printf("%d\n",fact);
            }
            else
            {
                printf("0\n");
            }
        }
        else
        {
           printf("0\n");
        }
    }
    return(0);
}
Language: C