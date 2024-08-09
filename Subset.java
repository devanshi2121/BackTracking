package BacktrackingfolderDSA;
import java.util.*;
public class Subset {
	public static void subset(int[] arr,int idx,int sum,String ans){
		if(sum==0){
			for(int i=ans.length()-1;i>=0;i--){
				System.out.print(ans.charAt(i)+" ");
			}
			System.out.println();
			return;
		}
		if(sum<0){
			return;
			}
		if(idx==arr.length){
			return;
		}
		subset(arr,idx+1,sum,ans);
		subset(arr,idx+1,sum-arr[idx],ans+arr[idx]);
		
		}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		subset(arr,0,target,"");
		
    }
}
    

