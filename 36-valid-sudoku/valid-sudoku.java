class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                char number = board[i][j];
                if(number != '.'){
                        if(
                            !seen.add(number + "found in row" + i) ||
                            !seen.add(number + "found in column" + j) ||
                            !seen.add(number + "found in subbox" + i/3 + "-" + j/3)    
                        )
                        {
                            return false;
                        }
                }
            }
        }
        return true;
    }
}