// class Element implements Comparable<Element>{
//     char ch;
//     int freq;

//     public Element(char ch, int freq){
//         this.ch = ch;
//         this.freq = freq;
//     }

//     public int compareTo(Element that){
//         return that.freq - this.freq;
//     }
// }

// class Solution {
//     public String frequencySort(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }
//         PriorityQueue<Element> pq = new PriorityQueue<>();
//         for(Map.Entry<Character, Integer> entry : map.entrySet()){
//             Element element = new Element(entry.getKey(), entry.getValue());
//             pq.offer(element);
//         }

//         StringBuilder str = new StringBuilder();
//         while(pq.size()>0){
//             Element ele = pq.poll();
//             while(ele.freq>0){
//                 str.append(ele.ch);
//                 ele.freq--;
//             }
//         }
//         return str.toString();
//     }
// }



class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        Character[] arr = new Character[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, (a, b)->{
            if(freq[b] == freq[a])
                return a-b;
            return freq[b] - freq[a];
        });

        StringBuilder sb = new StringBuilder();
        for(char c: arr){
            sb.append(c);
        }
        return sb.toString();
    }
}