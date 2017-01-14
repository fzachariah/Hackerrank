import java.util.Scanner;

 class Solution {

	public static void main(String args[]) {
		int T, N;

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		T = sc.nextInt();
		
		
		int width[]=new int[N];
		  for(int i = 0; i <N; ++i) {
		    width[i]=sc.nextInt();
		  }

		
		for(int i = 0; i <T; ++i) {
		    int l, r;
		    l=sc.nextInt();
		    r=sc.nextInt();


		    int ans = width[l];
		    while(l <= r) {
		      ans = Math.min(ans, width[l]);
		      l++;
		    }
		    System.out.println(ans);
		  }
		
	}
}
