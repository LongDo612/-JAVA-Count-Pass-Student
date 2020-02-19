import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int size;
        int count = 0;
        double[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number of student:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Please enter size less or equal to 30.");
        } while (size > 30);

        array = new double[size];

        for (int i=0;i<array.length;i++){
            System.out.println("Enter mark of student " + (i+1)+": ");
            array[i] = scanner.nextDouble();
        }

        System.out.println("Your students mark: ");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
            if (array[i] >= 5 && array[i] <=10)
                count++;
        }
        System.out.println("Number of pass students: "+count);
    }
}
