class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int start = 0;
        int end = num.length()-1;

        while(start<=end){
            System.out.println("start = " + num.charAt(start) + " end = " + num.charAt(end));
            if(num.charAt(start) == num.charAt(end))
            {
                start++; end--;
            }else{
                return false;
            }
        }
        return true;
    }
}