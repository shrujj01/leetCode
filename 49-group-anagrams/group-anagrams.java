class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();

        for(String s : strs){
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String sortedWords = new String(word);
            if(!map.containsKey(sortedWords)){
                map.put(sortedWords,new ArrayList<String>());
            }
                map.get(sortedWords).add(s);        
        }
        return new ArrayList(map.values());
    }
}