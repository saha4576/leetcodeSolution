//122. Best Time to Buy and Sell Stock II



public class QuestionNumber122 {
    public static void main(String[] args){
        int [] n={7,1,3,6,4};
        int maxProfit=0;
        for(int i=1;i<n.length;i++){
         if(n[i]>n[i-1]){
            maxProfit=maxProfit+n[i]-n[i-1];
         }
        }
        System.out.print(maxProfit);
    }
    
}
