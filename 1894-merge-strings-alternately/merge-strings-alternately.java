class Solution {
    public String mergeAlternately(String word1, String word2) {

        int start1 = 0;
        int start2 = 0;
        StringBuilder resultString = new StringBuilder();
        while(start1<word1.length() && start2<word2.length()){
            resultString = resultString.append(word1.charAt(start1)).append(word2.charAt(start2));
            start1++;
            start2++;
        }   
            if(start1<word1.length()){
                resultString = resultString.append(word1.substring(start1));
            }

            if(start2<word2.length()){
                resultString = resultString.append(word2.substring(start2));
            }
        
        return resultString.toString();
    }
}