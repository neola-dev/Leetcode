// Last updated: 04/06/2026, 11:10:46
class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int indx=ch-'a';
            if(arr[indx]!=-1 && (sb.length()-arr[indx]<=k)){
              continue;
            }
            sb.append(ch);
            arr[indx]=sb.length()-1;
            System.out.println(sb);
        }
        return sb.toString();
    }
}