class Solution {
    public void reverseWords(char[] s) {
        // int start = 0, end = s.length-1;
        reverse(s,0,s.length-1);
        int start = 0,end = -1;
        for(int i = 0; i<s.length;i++){
            if(s[i] == ' '){
                reverse(s,start,i-1);
                start = i+1;
            }
        }
        reverse(s,start,s.length-1);
        
    }

    public void reverse(char[] s, int startIndex, int endIndex){
        while(startIndex < endIndex){
            char temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}