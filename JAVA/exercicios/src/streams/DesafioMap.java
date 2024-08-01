package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream().map(Integer::toBinaryString).map(Utilitarios.reverseString).map(Utilitarios.binaryStringToNumber)
        .forEach(System.out::println);
    }
}
