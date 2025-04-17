package LinkedIn;

import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LoadingFileChallenge {

    public static void main(String[] args) {

        String s1 = "apple";
        String s2 = "apple";
        String s3 = new String("apple");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        Collection c = new ArrayList();
        c.addAll(Arrays.asList(1,2,3,4,5));
        c.stream()
                .filter(i -> (int)i % 2 == 0)
                .forEach(System.out::println);

        System.out.println(c.stream().min(Comparator.naturalOrder()));
        LocalDate today = LocalDate.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        try {
            File input = new File("D:\\menuList.txt");
            File output = new File("D:\\menuListWithPrice.txt");
            PrintWriter out = new PrintWriter(output);
            Scanner scanner = new Scanner(input);
            Scanner in = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Enter price of "+line+":");
                int price = in.nextInt();
                out.print(line);
                out.print("\t");
                out.println(price);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not found");
        }







    }
}
