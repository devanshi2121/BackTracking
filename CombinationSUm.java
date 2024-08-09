package BacktrackingfolderDSA;
import java.util.*;
public class CombinationSUm {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(arr,target));
        
    }
    public static List<List<Integer>> combinationSum(int[] candidate,int target){
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0,candidate,target,ans,new ArrayList<>());
        return ans;
    }
    public static void findCombinations(int ind,int[] candidate,int target,List<List<Integer>> ans,List<Integer> ds){
        if(ind==candidate.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidate[ind]<=target){
            ds.add(candidate[ind]);
            findCombinations(ind, candidate, target-candidate[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1, candidate, target, ans, ds);
    }  
}
