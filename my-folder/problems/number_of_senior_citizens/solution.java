class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String passenger: details){
            // System.out.println((int)passenger.charAt(11));
            char age = passenger.charAt(11);
            // age.concat(passenger.charAt(12));
            System.out.println(age);
            if(age > '6')
                count ++;
            if(age == '6' && passenger.charAt(12) > '0')
                count ++;
        }
        
        return count;
    }
}