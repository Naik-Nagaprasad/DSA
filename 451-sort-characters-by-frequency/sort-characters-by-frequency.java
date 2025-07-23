class Element implements Comparable<Element>{
    char ch;
    int freq;

    public Element(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }

    public int compareTo(Element that){
        return that.freq - this.freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            Element element = new Element(entry.getKey(), entry.getValue());
            pq.offer(element);
        }

        StringBuilder str = new StringBuilder();
        while(pq.size()>0){
            Element ele = pq.poll();
            while(ele.freq>0){
                str.append(ele.ch);
                ele.freq--;
            }
        }
        return str.toString();
    }
}