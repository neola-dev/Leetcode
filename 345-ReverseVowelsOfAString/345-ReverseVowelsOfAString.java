// Last updated: 04/06/2026, 11:16:45
class Solution {
    public static boolean isVowel(char ch){
        boolean vowel=false;
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel=true;
        }
        return vowel;
    }
    public String reverseVowels(String s) {
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                cnt++;
            }
        }
        char[] arr=new char[cnt];
        int j=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                arr[j++]=ch;
            }
        }
        int left=0;
        int right=cnt-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        int k=0;
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                str.setCharAt(i,arr[k++]);
            }
        }
        return str.toString();
   }
}