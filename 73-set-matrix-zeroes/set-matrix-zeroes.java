class Solution {
    public void setZeroes(int[][] matrix) {

        //create two hashmap
        HashSet<Integer> rows = new HashSet<Integer> ();
        HashSet<Integer> cols = new HashSet<Integer> ();

        //add row and col index to hashmap

        for(int i = 0 ; i < matrix.length ; i++) {

            for(int j = 0 ; j < matrix[i].length ; j++) {

                if(matrix[i][j] != 0) continue;

                    cols.add(j);
                    rows.add(i);
                
            }
        }

        //for every rows in set make all elements are 0
        for(Integer i: rows) {

            for(int j = matrix[0].length - 1 ; j >= 0 ; j--) {
                
                matrix[i][j] = 0;
            }
        }   
        //for every col in set make all rows are 0
        for(Integer j: cols) {

            for(int i = matrix.length - 1 ; i >= 0 ; i-- ) {
                
                matrix[i][j] = 0;
            }
        }
    }
}