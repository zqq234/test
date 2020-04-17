class CmpKV implements Comparator<Map.Entry<String, Integer>>{
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
        if(o2.getValue() > o1.getValue()){
            return 1;
        }

        if(o2.getValue() == o1.getValue() && o1.getKey().compareTo(o2.getKey()) > 0){
            return 1;
        }

        if(o2.getValue() == o1.getValue() && o1.getKey().compareTo(o2.getKey()) == 0){
            return 0;
        }

        return -1;
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // 1. 统计每个单词出现的次数
        Map<String, Integer> m = new HashMap<>();
        for(int i = 0; i < words.length; ++i){
            m.put(words[i], m.getOrDefault(words[i], 0)+1);
        }

        // 2. 创建一个优先级队列--所有元素放进去，创建一个堆
        PriorityQueue<Map.Entry<String, Integer>> p = new PriorityQueue<>(new CmpKV());
        for(Map.Entry<String, Integer> e : m.entrySet()){
            p.offer(e);
        }

        // 3. 取堆中的前K个元素
        List<String> lRet = new ArrayList<>(k);
        for(int i = 0; i < k; ++i){
            lRet.add(p.poll().getKey());
        }

        return lRet;
    }
}