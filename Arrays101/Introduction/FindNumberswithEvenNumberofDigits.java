class Solution {
    public int findNumbers(int[] nums) {
        
        int integerCount = 0;
        int finalCount = 0;
        int current = 0;
        
        for(int i : nums){
            
            //System.out.println("i = "+i);
            current = i;
            
            while(current >= 1){
                current = current / 10;
                //System.out.println("current = "+ current);
                integerCount++;
                //System.out.println("integerCount = " + integerCount);
            }
            
            if(integerCount % 2 == 0){
                finalCount++;
                //System.out.println("finalCount = " + finalCount);
            }
            
            integerCount = 0;
           
        }
        
        return finalCount;
    }
}