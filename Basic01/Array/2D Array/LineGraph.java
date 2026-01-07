import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class LineGraph extends JPanel {
    int[] data;

    public LineGraph(int[] data) {
        this.data = data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int margin = 50;

        // Draw axes
        g.drawLine(margin, height - margin, width - margin, height - margin); // X-axis
        g.drawLine(margin, margin, margin, height - margin); // Y-axis

        // Scaling
        int max = 0;
        for (int val : data) {
            if (val > max) max = val;
        }
        double xScale = (double) (width - 2 * margin) / (data.length - 1);
        double yScale = (double) (height - 2 * margin) / max;

        // Draw lines
        g.setColor(Color.BLUE);
        for (int i = 0; i < data.length - 1; i++) {
            int x1 = (int) (margin + i * xScale);
            int y1 = (int) (height - margin - data[i] * yScale);
            int x2 = (int) (margin + (i + 1) * xScale);
            int y2 = (int) (height - margin - data[i + 1] * yScale);
            g.drawLine(x1, y1, x2, y2);
        }

        // Draw points
        g.setColor(Color.RED);
        for (int i = 0; i < data.length; i++) {
            int x = (int) (margin + i * xScale);
            int y = (int) (height - margin - data[i] * yScale);
            g.fillOval(x - 3, y - 3, 6, 6);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        System.out.println("Enter the matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Use first row for the graph
        JFrame frame = new JFrame("Line Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new LineGraph(numbers[0]));
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
