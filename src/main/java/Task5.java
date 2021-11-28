import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = integer -> integer*integer;
        int[] mas = {4, 5, 6, 7, 8};
        for (int i = 0; i < mas.length; i++) {
            mas[i] = square.apply(mas[i]);
        }
        System.out.println(Arrays.toString(mas));
    }
}
interface UnaryOperator<T> {
    T apply(T t);
}
