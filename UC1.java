import java.util.*;
public class UC1 {

    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 4;
        int y1 = 5;
        int y2 = 10;

        System.out.println("A Length as 2 points : " + "("+x1+ "," +y1+ ")" + "and" + "(" +x2+ "," +y2+ ")");
        double LenthOfLine = Math.sqrt((x2 - x1) * 2 + (y2-y1) * 2);
        System.out.println("welcome to line comparison computation program");
		System.out.println("Length of a line : "+ LenthOfLine);

    }
}