// Last updated: 04/06/2026, 11:10:35
class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
        int lastConst=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                lastConst=i;
                System.out.println(lastConst);
            }
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(i>=lastConst){
                if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                    continue;
                }
            }
            sb.append(ch1);
        }
        
        return sb.toString();
    }
}