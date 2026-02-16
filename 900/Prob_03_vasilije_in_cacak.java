import java.util.Scanner;

public class Prob_03_vasilije_in_cacak {
     public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		while(t-->0){
		    long n = sc.nextLong();
		    long k = sc.nextLong();
		    long x = sc.nextLong();
		    
		    long sum1 = k*(k+1)/2;
		    if(x < sum1) {
		        sb.append("NO\n");
		    } else {
		       long sum2 = k * (n+n-k+1) / 2;
		       if(x > sum2) sb.append("NO\n");
		       else sb.append("YES\n");
		    }
		}
		System.out.print(sb);
        sc.close();
	}
}
