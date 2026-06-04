// Last updated: 04/06/2026, 11:15:44
class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int upperCount=0;
        int lowerCount=0;
        boolean isFirstUpper=Character.isUpperCase(word.charAt(0));
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            else{
                lowerCount++;
            }
        }
        if(upperCount==n || lowerCount==n){
            return true;
        }
        if(isFirstUpper && lowerCount==n-1)    return true;
        return false;
    }
}