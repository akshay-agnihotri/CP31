import java.util.*;

public class Prob_01_forked {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int xk = sc.nextInt();
		    int yk = sc.nextInt();
		    int xq = sc.nextInt();
		    int yq = sc.nextInt();
		    
		    int[] m1 = {a,a,-a,-a};
		    int[] m2 = {b,-b,b,-b};
		    
		    HashSet<String> hs = new HashSet<>();
		    for(int i=0;i<4;i++){
		        hs.add(new String((xk+m1[i])+"_"+(yk+m2[i])));
		        hs.add(new String((xk+m2[i])+"_"+(yk+m1[i])));
		    }
		    int ans = 0;
		    for(int i=0;i<4;i++){
		        String s1 = new String((xq+m1[i])+"_"+(yq+m2[i]));
		        String s2 = new String((xq+m2[i])+"_"+(yq+m1[i]));
		        if(hs.contains(s1)){
		          ans++;
		          hs.remove(s1);
		        } 
		        if(hs.contains(s2)){
		             ans++;
		             hs.remove(s2);
		        }
		    }
		    sb.append(ans+"\n");
		}
		System.out.print(sb);
        sc.close();
	}
}
