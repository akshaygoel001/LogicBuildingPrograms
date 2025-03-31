package StringRelatesPrograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateCharFromString {

    public static void main(String[] args) {
        String str1 = "automation";//automin
        StringBuilder newstr = new StringBuilder();
        List<Character> list=new ArrayList<>();
        for (char c:str1.toCharArray()){
            if (!list.contains(c)){
                list.add(c);
                newstr.append(c);
            }
        }
        System.out.println(newstr);
    }
}
