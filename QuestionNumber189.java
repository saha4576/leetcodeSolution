/*
  Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/
public class QuestionNumber189 {
     public static void main(String[] args){
        int [] nums={ 1,2,3,4,5,6,7};
        int k=3;
        int count=0;
        int n=nums.length;
      
       
       for(int i=0;count<n;i++){
            int idx=i;
            int curr=nums[idx];
            do{
                int next=nums[(idx+k)%n];
                nums[(idx+k)%n]=curr;
                curr=next;
                idx=(idx+k)%n;
                count=count+1;
            }
            while(idx!=i);
        }
         for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
       
    }
   
    
}
