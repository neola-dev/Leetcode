// Last updated: 04/06/2026, 11:20:58
class Solution {
    public static void helper(int ind,String digits,HashMap<Character,String> map,List<String> res,StringBuilder sb){
        if(ind>=digits.length()){
            res.add(sb.toString());
            return;
        }
        char dig=digits.charAt(ind);
        String str=map.get(dig);
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            helper(ind+1,digits,map,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0)  return res;
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        helper(0,digits,map,res,new StringBuilder());
        return res;
    }
}