// Last updated: 04/06/2026, 11:19:07
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> sub=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    sub.add(1);
                }
                else{
                    List<Integer> prev=res.get(i-1);
                    int num=prev.get(j)+prev.get(j-1);
                    sub.add(num);
                }
            }
            res.add(sub);
        }
        return res;
    }
}