public class Task4 {
    public static void main(String[] args) {
        Predicate<Integer> positive = x -> x>0;
        int[] massive ={123, -234, 543, 345, -5};
        for (int i : massive) {
            if (positive.test(i))
                System.out.println(i);
        }
    }
}
interface Predicate<T> {
    boolean test(T t);
}
