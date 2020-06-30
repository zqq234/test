class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root!=null){
            for(Node tmp:root.children){
                postorder(tmp);
            }
            res.add(root.val);
        }
        return res;
    }
}