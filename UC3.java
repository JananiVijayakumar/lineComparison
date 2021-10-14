import java.util.*;
public class UC3 {

    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 4;
        int y1 = 5;
        int y2 = 10;
		int a1 = 5;
        int a2 = 2;
        int b1 = 6;
        int b2 = 20;

        System.out.println("A Length as 2 points (x,y) : " + "("+x1+ "," +y1+ ")" + "and" + "(" +x2+ "," +y2+ ")");
		System.out.println("A Length as 2 points (a,b) : " + "("+a1+ "," +b1+ ")" + "and" + "(" +a2+ "," +b2+ ")");
        double LenthOfLine1 = Math.sqrt((x2 - x1) * 2 + (y2-y1) * 2);
		double LenthOfLine2 = Math.sqrt((a2 - a1) * 2 + (b2-b1) * 2);
        System.out.println("welcome to line comparison computation program");
		System.out.println("Length of a line1 is : "+ LenthOfLine1);
		System.out.println("Length of a line2 is : "+ LenthOfLine2);

    int line = Double.compare(LenthOfLine2, LenthOfLine1);
	System.out.println(line);
	if (LenthOfLine1 == LenthOfLine2)
	{
		System.out.println("2 lenth of the line is equal");
	}
	else if (LenthOfLine1 > LenthOfLine2)
	{
		System.out.println("line1 is greater than line2 lines are not equal");
	}
	else if (LenthOfLine1 < LenthOfLine2)
	{
		System.out.println("line1 is less than line2 lines are not equal");
	}
	else
	{
		System.out.println("lines are not equal");
	}
}
}