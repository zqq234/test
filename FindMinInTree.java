public class FindMinInTree {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int findMin(int[] tree) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for (int i = 0; i <tree.length ; i++) {
            q.offer(tree[i]);
        }
        System.out.println(q);
        int count=1;
        while(!q.isEmpty()){
            if(q.peek()!=count){
                return count;
            }else{
                q.poll();
                count++;
            }
        }
        return count;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _tree_size = 0;
        _tree_size = Integer.parseInt(in.nextLine().trim());
        int[] _tree = new int[_tree_size];
        int _tree_item;
        for(int _tree_i = 0; _tree_i < _tree_size; _tree_i++) {
            _tree_item = Integer.parseInt(in.nextLine().trim());
            _tree[_tree_i] = _tree_item;
        }

        res = findMin(_tree);
        System.out.println(String.valueOf(res));

    }
}
