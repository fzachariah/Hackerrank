#include<stdio.h>
using namespace std;
 
int main(){
    int t;
    long long a,b,m;
    scanf("%d",&t);
    while(t--){
        scanf("%lld%lld%lld",&a,&b,&m);
 
         //Ensure that B is greater than A
        if(a > b) {
            long long temp = a;
            a = b;
            b = temp;
        }
 
        printf("%lld\n",(b/m)-(a-1)/m);
 
    }
    return 0;
}
Language: C++