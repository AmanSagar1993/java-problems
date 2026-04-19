package src.main.java.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSumExmaple {

    public static void main(String[] args) {

       int[] nums = {1,3,9,4,6,17};
       int target = 9;
        int[] resultValues = getValues(nums,target);
       int[] resultIndices = getIndices(nums,target);
        System.out.println(resultValues[0] + "   " + resultValues[1]);
        System.out.println(resultIndices[0] + "   " + resultIndices[1]);
    }

    public static int[] getValues(int[] nums, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(target-nums[i])){
                return new int[]{nums[i], target-nums[i]};
            }
            set.add(nums[i]);
        }
        return new int[]{-1,-1};
    }


    public static int[] getIndices(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
