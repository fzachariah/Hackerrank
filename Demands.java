#include <cstdio>
#include <string>
#include <cstring>
#include <iostream>
using namespace std;
int main(){
	string s;
	int Q, l;
	long long a, b;
	cin >> s;
	l = s.size();
	scanf("%d", &Q);
	while (Q--){
		scanf("%lld %lld", &a, &b);
		a--;
		b--;
		a = a%l;
		b = b%l;
		
		if (s[a]==s[b])
			printf("Yes\n");
		else
			printf("No\n");
	}
	return 0;
}
Language: C++