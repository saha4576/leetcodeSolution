/*vaild palindrome
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.


 */


public class QuestionNumber125 {
    public static void msin(String[] args){
        String s="A man, a plan, a canal: Panama";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String str=sb.toString();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("False");
                return;
            }
            left++;
            right--;
        }
        System.out.println("True");
    }
    
}
