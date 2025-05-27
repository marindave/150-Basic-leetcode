class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ip=new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch=='.') ip.append("[.]");
            else ip.append(ch);
        }
        return ip.toString();
    }
}