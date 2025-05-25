package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Naveen", "Bob", "Charlie");
        Stream<String> namesStream = names.stream();

        System.out.println(Stream.generate(Math::random));


    }
}
