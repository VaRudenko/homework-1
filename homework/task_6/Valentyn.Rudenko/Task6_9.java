    import java.util.Scanner;


    public class Task6_9 {
        public static void main(String[] args) {
            int n, arr[];
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input length of massive: ");
            n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = i + 1;

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0)
                sum += arr[i];
            }

            int z = sum;
            System.out.println(z);

        }
    }
