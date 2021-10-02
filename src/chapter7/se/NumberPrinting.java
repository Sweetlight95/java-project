package chapter7.se;

public class NumberPrinting {
    private static int[][] shapes = new int[5][5];
    public static void displayShape(){
        for (int row = 0; row < shapes.length; row++) {
            for (int column = 0; column < shapes[row].length; column++)
                if(shapes[row][column]==0) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }public void setUpShapes(String userInput){
        for (int row = 0; row < userInput.length(); row++) {
            switch (row){
                case 0:
                    int a = Character.getNumericValue(userInput.charAt(row));
                    if(a == 1){
                        shapeA();
                        break;
                    }
                case 1:
                    int b = Character.getNumericValue(userInput.charAt(row));
                    if (b == 1){
                        shapeB();
                        break;
                    }
                case 2:
                    int c = Character.getNumericValue(userInput.charAt(row));
                    if (c == 1){
                        shapeC();
                        break;
                    }
                case 3:
                    int d = Character.getNumericValue(userInput.charAt(row));
                    if (d == 1){
                        shapeD();
                        break;
                    }
                case 4:
                    int e = Character.getNumericValue(userInput.charAt(row));
                    if(e == 1){
                        shapeE();
                        break;
                    }
                case 5:
                    int f = Character.getNumericValue(userInput.charAt(row));
                    if(f == 1){
                        shapeF();
                        break;
                    }
                case 6:
                    int g = Character.getNumericValue(userInput.charAt(row));
                    if (g == 1){
                        shapeG();
                        break;
                    }
            }
        }
    }
    private void shapeG() {
        shapes[2][0] = 1;
        shapes[2][1] = 1;
        shapes[2][2] = 1;
        shapes[2][3] = 1;
        shapes[2][4] = 1;
    }
    private void shapeF() {
        shapes[0][0] = 1;
        shapes[1][0] = 1;
        shapes[2][0] = 1;
    }
    private void shapeE() {
        shapes[2][0] = 1;
        shapes[3][0] = 1;
        shapes[4][0] = 1;
    }
    private void shapeD() {
        shapes[4][0] = 1;
        shapes[4][1] = 1;
        shapes[4][2] = 1;
        shapes[4][3] = 1;
        shapes[4][4] = 1;
    }
    private void shapeC() {
        shapes[2][4] = 1;
        shapes[3][4] = 1;
        shapes[4][4] = 1;
    }
    void shapeB() {
        shapes[0][4] = 1;
        shapes[1][4] = 1;
        shapes[2][4] = 1;
    }
    void shapeA() {
        shapes[0][0] = 1;
        shapes[0][1] = 1;
        shapes[0][2] = 1;
        shapes[0][3] = 1;
        shapes[0][4] = 1;
    }

    public int[][] getShapeA() {
        return shapes;
    }

    public int[][] getShapeB() {
        return shapes;
    }
}
