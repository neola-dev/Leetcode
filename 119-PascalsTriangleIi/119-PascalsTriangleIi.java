// Last updated: 04/06/2026, 11:19:05
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)    row.add(1);
                else{
                    List<Integer> prev=pascal.get(i-1);
                    row.add(prev.get(j)+prev.get(j-1));
                }
            }
            pascal.add(row);
        }   
        return pascal.get(rowIndex);
    }
}