#include<stdio.h>
#include<iostream>
using namespace std;
#define f_in(st) freopen(st,"r",stdin);
#define f_out(st) freopen(st,"w",stdout);
int main()
{
 
	int test;
	cin>>test;
	while(test--)
	{
		string S;
		cin>>S;
		bool firstWall=false,Virus=false;
		int Pos=-1,Answer=0;
		for(int i=0;i<S.size();i++)
		{
			if(S[i]=='X')
				Virus=true;
			if(S[i]=='*' || i==S.size()-1)
			{
				if(i==S.size()-1 && Virus==false)
				{
					if(S[i]=='*')
						Answer+=(i-Pos-1);
					else
						Answer+=(S.size()-Pos-1);
				}
				else{
					if(Pos!=-1 && Virus==false)
						Answer+=(i-Pos-1);
					if(Pos==-1 && Virus==false)
						Answer+=(i);
				}
				Pos=i;
				Virus=false;
			}	
		}
		cout<<Answer<<endl;
	}
	return 0;
}
Language: C++