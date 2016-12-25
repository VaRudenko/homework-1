import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task6_8_8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 74, 35, 25, 47, 32, 12, 87};
        int max = Arrays.stream(arr).collect(Collectors.reducing(Integer::max)).get();

        System.out.println(max);
    }
}