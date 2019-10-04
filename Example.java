import java.util.stream.IntStream;

/**
 * @author kit
 */
class Example {

    public static void main(String[] args) {
        System.out.println(String.format("sum of even [%d->%d] = %d", 1, 10, sumEven(1, 10)));
    }

    static int sumEven(int from, int to) {
        return IntStream
                .range(from, to)
                .filter(e -> e % 2 == 0)
                .reduce(0, Integer::sum);
    }
}
