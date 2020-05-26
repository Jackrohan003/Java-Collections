import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 
	 int t = sc.nextInt();

for(int z =0;z<t;z++)
{
	 int m = sc.nextInt();
	 int n = sc.nextInt();
	 
	 
	 int main[] = new int[m];
	 int sub[]= new int[n];
	 
	    for(int i=0;i<m;i++)
            main[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
            sub[i]=sc.nextInt();    
    
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x:main)
        {
            if(map.containsKey(x)==false)
                map.put(x,1);
            else
                map.put(x,map.get(x)+1);
        }
        
        int cnt =0;
        
        for(int x:sub)
        {
            if(map.containsKey(x))
            {
                map.put(x,map.get(x)-1);
                if(map.get(x)==0)
                    map.remove(x);
                cnt++;
            }
        }
        if(cnt==n)
            System.out.println("Yes");
        else
            System.out.println("No");
}
	 }
}
