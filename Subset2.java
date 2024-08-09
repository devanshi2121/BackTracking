package BacktrackingfolderDSA;
import java.util.*;
public class Subset2 {
    static List<Integer> ls=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        subsetss(arr,target,0);
    }
    public static void subsetss(int[] arr,int target,int idx){
        if(target==0){
            for(int i=0;i<ls.size();i++){
                System.out.print(ls.get(i)+" ");
            }
            System.out.println(" ");
            return;
        }
        for(int i=idx;i<arr.length;i++){
            ls.add(arr[i]);
            subsetss(arr, target-arr[i], i+1);
            ls.remove(ls.size()-1);
        }
    }
    
}
