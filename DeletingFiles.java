import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

class DeletingFiles {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\sruthi-pt4021\\IdeaProjects\\un");

        try (Stream<Path> walk = Files.walk(path)) {
            walk.sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .peek(System.out::println)
                    .forEach(File::delete);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}