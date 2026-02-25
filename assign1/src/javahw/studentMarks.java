
package javahw;
import java.util.Scanner;
public class studentMarks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter marks:");
        int marks = sc.nextInt();

        int grade= marks / 10; 

        switch (grade) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
            case 5:
                System.out.println("Grade: C");
                break;
            case 4:
            case 3:    
                System.out.println("Grade: D");
                break;
            default:
                    System.out.println("F");
        }
    }
}
        
   
