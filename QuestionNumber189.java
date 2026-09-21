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
    static int rev(int [] num, int start,int end){
        int n=num.length;
        while(start >= end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
        
        start=start+1;
        end=end-1;
        }
        return rev(num,0,num.length-1);
        return rev(num,0,k-1);

    }
    public static void main(String[] args){
        int [] num={ 1,2,3,4,5,6,7};
        int k=3;
        System.out.print(rev(num,k,0,end));
    }
    
}
