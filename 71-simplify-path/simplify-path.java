class Solution {
    public String simplifyPath(String path) {
        // Bruteforce: O(n)
//         String[] components = path.split("/+");
//         List<String> directories = new ArrayList<>();
        
//         System.out.println(Arrays.deepToString(components));
//         for(String c: components){
//             if(c.equals(".") || c.isEmpty())
//                 continue;
//             else if(c.equals("..")){
//                 if(!directories.isEmpty())
//                     directories.remove(directories.size() - 1);
//             } else
//                 directories.add(new String(c));
//         }
//         System.out.println(directories);
//         StringBuilder ans = new StringBuilder("/");
//         for(int i = 0; i < directories.size(); i ++){
//             ans.append(directories.get(i));
//             if(i < directories.size() - 1)
//                 ans.append("/");
//         }
        
//         return ans.toString();
        
        // Optimal using Stack: O(n)
        String[] components = path.split("/+");
        Stack<String> st = new Stack<>();
        
        System.out.println(Arrays.deepToString(components));
        for(String c: components){
            if(c.equals(".") || c.isEmpty())
                continue;
            else if(c.equals("..")){
                if(!st.isEmpty())
                    st.pop();
            } else
                st.push(new String(c));
        }
        // System.out.println(directories);
        StringBuilder ans = new StringBuilder();
        for(String s: st){
            ans.append("/").append(s);
        }
        
        return ans.length() == 0 ? "/" : ans.toString();
        
    }
}