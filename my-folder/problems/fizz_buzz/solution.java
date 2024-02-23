class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i ++){
            if(i % 15 == 0){ // Divisible by both 3 and 5
                ans.add("FizzBuzz");
            }else if(i % 3 == 0){ // Divisible by 3
                ans.add("Fizz");
            }else if(i % 5 == 0){ // Divisible by 5
                ans.add("Buzz");
            }else{
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}