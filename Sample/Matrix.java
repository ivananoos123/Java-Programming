public class Matrix {
    private int matrix[][];
    
    public Matrix(){}
    
    public Matrix(int row, int column){
        matrix = new int[row][column];
    }
    
    //your methods here
    public void read (String input) {
        String matrixRow[] = input.split("\\.");
        String matrixCol[] = matrixRow[0].split("\\s+");
        int row = matrixRow.length;
        int col = matrixCol.length;
        matrix = new int [row] [col];
        
        try {
            if (row < 2) 
                throw new ExceptionWrongMatrixDimension("ExceptionWrongMatrixDimension");
        for (int i = 0; i < row; i++) {
            String temp = matrixRow[i].replaceAll("^\\s", "");
            String tempCol[] = temp.split("\\s");

            //Checks if current and before are the same length.
            if (row != tempCol.length)
                throw new ExceptionWrongMatrixValues("ExceptionWrongMatrixValues");

            for (int k = 0; k < col ; k++) {
                for (char c : tempCol[k].toCharArray()) {
                    if (Character.isLetter(c))
                        throw new ExceptionWrongMatrixValues("ExceptionWrongMatrixValues");
                } 
                matrix[i][k] = Integer.parseInt(tempCol[k]);
            }
        }
        for (int i = 0; i < row ; i++) {
            for (int k = 0; k < col; k++) {
                System.out.printf("%d ",matrix[i][k]);
            }
            System.out.println();
        }
        }
         catch (ExceptionWrongMatrixValues e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
         }
         catch (ExceptionWrongMatrixDimension e) {
             System.out.println(e.getMessage());
         }
    }


final class ExceptionWrongMatrixDimension extends Exception {
    public ExceptionWrongMatrixDimension (String e) {
        super (e); 
    }
}
final class ExceptionWrongMatrixValues extends Exception {
    public ExceptionWrongMatrixValues (String e) {
        super (e); 
    }
}

    public static void main(String[] args){
        String input="1 2 . 3 4 .";
        Matrix m = new Matrix();
        m.read(input);
    }
}