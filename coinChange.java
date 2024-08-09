package BacktrackingfolderDSA;
public class coinChange {
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int target=8;
        int sum=0;
        String ans="";
        COinChange(arr, target, 0, "",0);
    }
    public static void COinChange(int arr[],int target,int sum,String ans,int idx){
        if(sum==target){
            System.out.println(ans);
            return;
        }
        if(sum>target){
            return;
        }                                                                //combination coin is with idx
        for(int i=idx;i<arr.length;i++){
            COinChange(arr, target, sum+arr[i], ans+arr[i],i);          //permutation-wise is without idx
        }

    }
    
}
