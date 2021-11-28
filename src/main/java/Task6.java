public class Task6 {
    public static void main(String[] args) throws NumberFormatException {
        Function<String, Integer> sumBYN = s -> {
            s.replaceAll("BYN", "0");
            int i = Integer.parseInt(s) / 2;
            return i;
        };
        String str= "20 BYN";
        int res = sumBYN.apply(str);
        System.out.println(res);

    }
}
interface Function<T, R> {
    R apply(T t);
}
