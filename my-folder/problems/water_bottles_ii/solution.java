class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullBottles =  numBottles;
        int emptyBottles = 0;
        int bottlesDrunk = 0;
        boolean condition = true;
        // System.out.println("Outside Loop");
        while (condition){
            // System.out.println("Inside Loop");
            if(fullBottles == 0 && emptyBottles < numExchange){
                condition = false;
            }
            else if (emptyBottles >= numExchange){
                emptyBottles -= numExchange;
                fullBottles ++;
                numExchange ++;
            }else{
                // System.out.println("Inside");
                emptyBottles += fullBottles;
                bottlesDrunk += fullBottles;
                fullBottles = 0;
                
            }
            // System.out.println("Full Bottles: "+fullBottles+" Empty Bottles: "+emptyBottles+" Num Exchange: "+numExchange+" Bottles Drunk: "+bottlesDrunk);
        }
        return bottlesDrunk;
    }
}