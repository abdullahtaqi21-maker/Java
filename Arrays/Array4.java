package Arrays;


public class Array4 {
    public static void main(String[] args) {
        int [][] Mynumbers = {{1, 4, 9}, {6, 0, 7}};

        //System.out.println(Mynumbers[1][2]);

        for(int i = 0; i < Mynumbers.length; i++) {
            for(int j = 0; j < Mynumbers[i].length; j++) {
                System.out.print(Mynumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
