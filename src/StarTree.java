import java.util.Scanner;

public class StarTree {
    public static void main(String[] args) {
        System.err.println("\nWhat is the recursive depth you would like?");
        Scanner sc = new Scanner(System.in);
        int depth = sc.nextInt();
        sc.close();

        StdDraw.setScale(-1, 1);
        StdDraw.setPenRadius(0.005);
        double length = 0.5;

        //recursive function call
        drawStarTree(depth, 0, 0, length);
    }

    private static void drawStarTree(int depth, double x, double y, double length) {
        if (depth == 0) return;

        //calculate coordinates of endpoints
        double x0 = x - length / 2;
        double x1 = x + length / 2;
        double y0 = y - length / 2;
        double y1 = y + length / 2;

        StdDraw.line(x0, y, x1, y);
        StdDraw.line(x, y0, x, y1); 
        StdDraw.line(x0, y0, x1, y1); 
        StdDraw.line(x0, y1, x1, y0); 

        drawStarTree(depth - 1, x0, y, length / 2);
        drawStarTree(depth - 1, x1, y, length / 2); 
        drawStarTree(depth - 1, x, y0, length / 2); 
        drawStarTree(depth - 1, x, y1, length / 2); 
        drawStarTree(depth - 1, x0, y0, length / 2); 
        drawStarTree(depth - 1, x1, y1, length / 2); 
        drawStarTree(depth - 1, x0, y1, length / 2); 
        drawStarTree(depth - 1, x1, y0, length / 2); 
    }  
}
