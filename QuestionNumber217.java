/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true */
import java.util.*;

public class QuestionNumber217{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Array create
        int[] nums = new int[n];

        // Array elements input
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(nums);

            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    System.out.println("True");
                    return;
                }
            }
            System.out.println("False");
        }
    }
