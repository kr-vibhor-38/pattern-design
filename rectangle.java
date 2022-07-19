import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        byte r,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter no. of Rows (Vertical height): ");
        r = inp.nextByte();
        System.out.print("Enter no. of Columns (Horizontal length: )");
        c = inp.nextByte();

        for (byte i = 1; i <=r ; i++) {
            for (byte j = 1; j <=c ; j++) {
                    if(i==1 || j==1 || i==r || j==c)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
            System.out.println();
            }
        }
    }

