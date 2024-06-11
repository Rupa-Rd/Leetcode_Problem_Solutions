class Solution {
    public String defangIPaddr(String address) {
        // String defangedAddress = "";
        // for(char ch: address.toCharArray()){
        //     if(ch == '.'){
        //         defangedAddress += "[.]";
        //     }else{
        //         defangedAddress += ch;
        //     }
        // }
        // return defangedAddress;
        
        return address.replace(".","[.]");
    }
}