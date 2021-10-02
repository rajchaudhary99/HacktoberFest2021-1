/* Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order. */
import java.util.*;
public class Permutations {
    static void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr){
        if(resultList.size() == arr.length){
            list.add(new ArrayList<>(resultList));
        } 
        else{
            for(int i = 0; i < arr.length; i++){ 
                if(resultList.contains(arr[i])) continue; 
                resultList.add(arr[i]);
                permuteHelper(list, resultList, arr);
                resultList.remove(resultList.size() - 1);
            }
        }
    } 
    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), nums);
        return list;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[] nums = new int[n];
      for(int i=0;i<n;i++) nums[i]=sc.nextInt();
      List<List<Integer>> list = permute(nums);
      System.out.println(list);
    }
}
