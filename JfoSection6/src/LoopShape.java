import java.util.Scanner;

public class LoopShape {

    static void createRectangle(int width, int height) {
        // Refuse to draw shapes with dimensions less than 1
        if (width < 1 || height < 1) {
            System.out.println("Invalid dimensions. Please use dimensions greater than or equal to 1.");
            return;
        }

        // Draw a Rectangle
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
            	if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                {
                  System.out.print("#"+" ");
                }
                else {
                  System.out.print(" "+ " ");
                }
              }
              System.out.println();
            }
          }

    static void createTriangle(int leg) {
        // Refuse to draw shapes with dimensions less than 1
        if (leg < 1) {
            System.out.println("Invalid dimensions. Please use dimensions greater than or equal to 1.");
            return;
        }

        // Draw an Isosceles Right Triangle
        for (int i = 1; i <= leg; i++) {
            for (int j = 1; j <= i; j++) {
            	if(j==1 || j==i || i==leg){
            	     System.out.print("#");  //print star, when the condiiton is true
            	     }
            	     else{
            	     System.out.print(" ");
            	}
            	}
            	System.out.println();
            	}
            	}
        
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter width and height of rectangle: ");
    	int width=sc.nextInt();
    	int height=sc.nextInt();
    	System.out.println("Enter size for Triangle: ");
        int leg=sc.nextInt();
        createRectangle(width,height);
        createTriangle(leg);
        sc.close();
    }
}
