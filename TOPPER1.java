import java.util.Scanner;

class TOPPER1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number of students in the class: ");
        int s = sc.nextInt();

        System.out.print("Enter The Number of Subjects: ");
        int m = sc.nextInt();

        int[][] input = new int[s][m];
        int[] sum = new int[s];
        String[] names = new String[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the marks of " + names[i] +
                        " for Subject " + (j + 1) + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.err.println("Enter valid marks between 0 and 100");
                    j--;
                    continue;
                }
                input[i][j] = marks;
            }
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < m; j++) {
                sum[i] += input[i][j];
            }
        }

        int firstMax = -1, secondMax = -1;
        int firstIndex = -1, secondIndex = -1;

        for (int i = 0; i < s; i++) {
            if (sum[i] > firstMax) {
                secondMax = firstMax;
                secondIndex = firstIndex;

                firstMax = sum[i];
                firstIndex = i;
            } else if (sum[i] > secondMax && sum[i] != firstMax) {
                secondMax = sum[i];
                secondIndex = i;
            }
        }

        System.out.println("\nFirst Topper of the class is " +
                names[firstIndex] + " with " + firstMax + " marks");

        if (secondIndex != -1) {
            System.out.println("Second Topper of the class is " +
                    names[secondIndex] + " with " + secondMax + " marks");
        } else {
            System.out.println("No Second Topper found");
        }

        sc.close();
    }
}
