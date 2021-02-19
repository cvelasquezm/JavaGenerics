package island;

public class Main {

        public static void main(String[] args) {

                final int[][] sea = getIsland();
                final int[][] sea2 = getIsland2();

                SeaAndIslands seaAndIslands = new SeaAndIslands(sea);
                seaAndIslands.print();
                seaAndIslands.countIslands();

                SeaAndIslands seaAndIslands2 = new SeaAndIslands(sea2);
                seaAndIslands2.print();
                seaAndIslands2.countIslands();
        }

        private static int[][] getIsland() {
                int[][] sea = new int[8][8];
                sea[0][0] = 0;
                sea[0][1] = 0;
                sea[0][2] = 1;
                sea[0][3] = 0;
                sea[0][4] = 0;
                sea[0][5] = 0;
                sea[0][6] = 0;
                sea[0][7] = 0;

                sea[1][0] = 0;
                sea[1][1] = 0;
                sea[1][2] = 1;
                sea[1][3] = 0;
                sea[1][4] = 1;
                sea[1][5] = 1;
                sea[1][6] = 0;
                sea[1][7] = 0;

                sea[2][0] = 0;
                sea[2][1] = 0;
                sea[2][2] = 0;
                sea[2][3] = 0;
                sea[2][4] = 0;
                sea[2][5] = 1;
                sea[2][6] = 0;
                sea[2][7] = 0;

                sea[3][0] = 0;
                sea[3][1] = 0;
                sea[3][2] = 1;
                sea[3][3] = 0;
                sea[3][4] = 1;
                sea[3][5] = 1;
                sea[3][6] = 0;
                sea[3][7] = 0;

                sea[4][0] = 0;
                sea[4][1] = 0;
                sea[4][2] = 1;
                sea[4][3] = 1;
                sea[4][4] = 0;
                sea[4][5] = 0;
                sea[4][6] = 1;
                sea[4][7] = 1;

                sea[5][0] = 0;
                sea[5][1] = 0;
                sea[5][2] = 0;
                sea[5][3] = 0;
                sea[5][4] = 1;
                sea[5][5] = 0;
                sea[5][6] = 1;
                sea[5][7] = 1;

                sea[6][0] = 0;
                sea[6][1] = 0;
                sea[6][2] = 0;
                sea[6][3] = 1;
                sea[6][4] = 1;
                sea[6][5] = 1;
                sea[6][6] = 1;
                sea[6][7] = 0;

                sea[7][0] = 0;
                sea[7][1] = 0;
                sea[7][2] = 0;
                sea[7][3] = 0;
                sea[7][4] = 1;
                sea[7][5] = 0;
                sea[7][6] = 0;
                sea[7][7] = 0;

                return sea;
        }

        private static int[][] getIsland2() {
                int[][] sea = new int[4][5];
                sea[0][0] = 1;
                sea[0][1] = 0;
                sea[0][2] = 0;
                sea[0][3] = 0;
                sea[0][4] = 1;

                sea[1][0] = 0;
                sea[1][1] = 0;
                sea[1][2] = 1;
                sea[1][3] = 0;
                sea[1][4] = 0;

                sea[2][0] = 0;
                sea[2][1] = 1;
                sea[2][2] = 0;
                sea[2][3] = 1;
                sea[2][4] = 1;

                sea[3][0] = 0;
                sea[3][1] = 0;
                sea[3][2] = 0;
                sea[3][3] = 1;
                sea[3][4] = 0;

                return sea;
        }
}
