//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int[] values = {3, 5, 2343};
//        System.out.println(values[2]);


        String[][] texts = new String[2][3];
        texts[0][1] = "Hello World!";
        System.out.println(texts[0][1]);

        int[][] grid = {{3, 5, 2343}, {1, 3, 548}, {8, 2, 56887}};
        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[i].length; k++) {
                System.out.print(grid[i][k] + "\t");
            }
            System.out.println();
        }
    }

}