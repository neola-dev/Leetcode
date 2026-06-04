// Last updated: 04/06/2026, 11:14:52
class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> rank=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            parent.add(i);
            rank.add(0);
        }
    }
    public int findUParent(int node){
        if(node==parent.get(node))  return node;
        int ulp=findUParent(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionByRank(int u,int v){
        int ulp_u=findUParent(u);
        int ulp_v=findUParent(v);
        if(ulp_u==ulp_v)    return;
        if(rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }
        else if(rank.get(ulp_v)<rank.get(ulp_u)){
            parent.set(ulp_v,ulp_u);
        }
        else{
            parent.set(ulp_v,ulp_u);
            int rankU=rank.get(ulp_u);
            rank.set(ulp_u,rankU+1);
        }
    }
}
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String,Integer> map=new HashMap<>();
        int n=accounts.size();
        DisjointSet ds=new DisjointSet(n);
        for(int i=0;i<n;i++){
            List<String> sub=accounts.get(i);
            for(int j=1;j<sub.size();j++){
                String email=sub.get(j);
                if(map.containsKey(email)){
                    ds.unionByRank(i,map.get(email));
                }
                else{
                    map.put(email,i);
                }
            }
        }
        List<List<String>> mergedMail=new ArrayList<>();
        for(int i=0;i<n;i++){
            mergedMail.add(new ArrayList<>());
        }
        for(String email:map.keySet()){
                int node=map.get(email);
                int ulp_node=ds.findUParent(node);
                mergedMail.get(ulp_node).add(email);
        }
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(mergedMail.get(i).isEmpty()) continue;
            Collections.sort(mergedMail.get(i));
            List<String> temp=new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            for(String email:mergedMail.get(i)){
                temp.add(email);
            }
            res.add(temp);
        }
        return res;
    }
}