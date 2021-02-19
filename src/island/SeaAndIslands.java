package island;

import java.util.ArrayList;
import java.util.List;

public class SeaAndIslands {

        private int[][] sea;
        private int rowLength;
        private int columnLength;

        public SeaAndIslands(int[][] sea){
                this.sea = sea;
                rowLength = this.sea.length;
                columnLength = rowLength > 0 ? sea[0].length : 0;
        }

        public void print() {
                for (int row = 0; row < rowLength ;  row ++) {
                        for (int column = 0; column < columnLength ; column ++) {
                                System.out.print("[" + (sea[row][column] == 1 ? sea[row][column] : " ") + "]\t");
                        }
                        System.out.println();
                }
        }

        public void countIslands() {

                int numIslands = 0;

                for (int row = 0; row < rowLength ;  row ++) {
                        for (int column = 0; column < columnLength ; column ++) {
                                numIslands = isIsland(row, column) ? numIslands + 1 : numIslands;
                        }
                }

                System.out.println("Number of Islands : " + numIslands);
        }

        private boolean isIsland(int row, int column) {

                if (sea[row][column] == 0){
                        return false;
                }

                sea[row][column] = 0;

                final List<Point> points = getCheckablePositions(row, column);
                points.forEach( point -> {
                        isIsland(point.getX(), point.getY());
                });

                return true;
        }

        private List<Point> getCheckablePositions(int row, int column) {
                List<Point> points = new ArrayList<>();
                if (row < rowLength - 1) {
                        points.add(new Point(row + 1, column));
                }
                if (column < columnLength - 1) {
                        points.add(new Point(row, column + 1));
                }

                if (row > 0) {
                        points.add(new Point(row - 1, column));
                }
                if (column > 0) {
                        points.add(new Point(row, column - 1));
                }

                return points;
        }

        private static class Point {

                private int x;
                private int y;

                public Point(int x, int y) {
                        this.x = x;
                        this.y = y;
                }

                public int getX() {
                        return x;
                }

                public int getY() {
                        return y;
                }
        }
}
