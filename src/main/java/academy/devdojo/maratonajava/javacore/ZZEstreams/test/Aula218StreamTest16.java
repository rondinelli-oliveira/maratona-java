package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Aula218StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sunStreamIterate(num);
        sunParallelStreamIterate(num);
        sunLongStreamIterate(num);
        sunParallelLongStreamIterate(num);
    }

    private static void sumFor(Long num) {
        System.out.println("Sum for");
        long result = 0;
        long initTime = System.currentTimeMillis();
        for (long i = 0; i <= num; i++) {
            result += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(result + " " + (endTime - initTime) + "ms");
    }

    private static void sunStreamIterate(Long num) {
        System.out.println("Sum StreamIterate");
        long initTime = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long endTime = System.currentTimeMillis();
        long time = endTime - initTime;
        System.out.println(result + " " + time + "ms");
    }

    //[1,2,3,4,5,6,7,8,9,0]
    //1 - 1-5
    //2 - 6-0
    private static void sunParallelStreamIterate(Long num) {
        System.out.println("Sum ParallelStreamIterate");
        long initTime = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long endTime = System.currentTimeMillis();
        long time = endTime - initTime;
        System.out.println(result + " " + time + "ms");
    }

    private static void sunLongStreamIterate(Long num) {
        System.out.println("Sum LongStreamIterate");
        long initTime = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long endTime = System.currentTimeMillis();
        long time = endTime - initTime;
        System.out.println(result + " " + time + "ms");
    }

    private static void sunParallelLongStreamIterate(Long num) {
        System.out.println("Sum ParallelLongStreamIterate");
        long initTime = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long endTime = System.currentTimeMillis();
        long time = endTime - initTime;
        System.out.println(result + " " + time + "ms");
    }
}
