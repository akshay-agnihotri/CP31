import java.util.Scanner;

public class Prob_02_chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    
		    int[] freq = new int[26];
		    for(int i=0;i<n;i++){
		        char ch = s.charAt(i);
		        freq[ch-'a']++;
		    }
		    boolean ans = true;
		    for(int f:freq){
		        if(f%2==1) k--;
		        if(k<-1){
		            ans=false;
		            break;
		        }
		    }
		    if(ans) sb.append("YES\n");
		    else sb.append("NO\n");
		}
		System.out.print(sb);
        sc.close();
    }
}