/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */

public class QuestionNumber349 {
    public static void main(String[] args){
        int [] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};
        int n=nums1.length;
        int m=nums2.length;
        int [] ans=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    ans[k]=nums1[i];
                    k++;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
