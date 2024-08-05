class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> distinct = new ArrayList<>();
        for(String c: arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
                distinct.remove(c);
            }else{
                map.put(c, 1);
                distinct.add(c);
            }
        }
        System.out.println(map);
        System.out.println(distinct);
        if( k > distinct.size())
            return "";
        return distinct.get(k-1);
    }
}