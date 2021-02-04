package stream_;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * stream represent a sequence of objects from a source, which supports aggregate operations
 *
 * 1. Sequence of elements: a stream provides a set of elements of specific type in a sequential manner. A Stream
 *    gets/computes elements on demand. It never stores the elements
 *
 * 2. Source: Stream takes Collections, Arrays, or I/O resources as input source
 *
 * 3. Aggregate operations: Stream support aggregate operations like filter, map, limit, reduce, find, match, and so on.
 *
 * 4. Pipelining: Most of the stream operations return stream itself so that their result can be pipeline. These operations
 *    are called intermediate operations and their function is to take input, process them, and return output to the target,
 *    collect() method is a terminal operation which is normally present at the end of the pipelining operation which is
 *    normally present at the end if the pipelining operation to mark the end of the stream
 *
 * 5. Automatic iterations: Stream operations do the iterations internally over the source elements provided, in contracts
 *    to Collections where explicit iteration is required
 *
 *  Generation Streams
 *   Java 8 Collection interface has two methods to generate a Stream
 *       - stream() - Returns a sequential stream considering collection as its source
 *       - parallelStream() - Returns a parallel Stream considering collection as its source
 *
 */
public class StreamTutorial {

    /**
     * forEach: Stream has provided a new method "forEach" to iterate each element of the stream
     *
     */
    public static void forEachFun(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    /**
     * map: the 'map' method is used to map each element to its corresponding result.
     *
     */
    public static void mapFun(){
        List<Integer> numbers = Arrays.asList(3,2,2,4,5,6,3,5);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(Arrays.toString(squaresList.toArray()));
    }

    /**
     * filter: The 'filter' method is used to eliminate base on a criteria.
     *
     */
    public static void filterFun(){
        List<String> strings = Arrays.asList("abc", "", "bc", "a", "123", "");
        int count = (int) strings.stream().filter(String::isEmpty).count();
        System.out.println(count);
        List<String> listStrings = strings.stream().filter(s -> s.length() > 0).collect(Collectors.toList());
        System.out.println(Arrays.toString(listStrings.toArray()));
    }

    public static void main(String[] args) {
        System.out.println("stream tutorial");
//        forEachFun();
//        mapFun();
        filterFun();

    }
}
