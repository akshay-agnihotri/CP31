import java.util.Arrays;
import java.util.Scanner;

public class Prob_04_Jellyfish_and_Undertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		while(t-->0){
		    long a = sc.nextInt();
		    long b = sc.nextInt();
		    int n = sc.nextInt();
		    
		    long[] arr = new long[n];
		    for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		    Arrays.sort(arr);
		    
		    long ans=b-1;
		    for(int i=0;i<n;i++){
		        ans = ans + Math.min(1+arr[i],a) - 1;
		    }
		    ans += 1;
		    sb.append(ans+"\n");
		}
		System.out.print(sb);
		sc.close();
    }
}
