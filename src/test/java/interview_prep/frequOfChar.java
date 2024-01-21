package interview_prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequOfChar {

    public static void main(String[] args) {

       String str = "helloloololwww";
       Map<Character, Integer> letters = new LinkedHashMap<>();

       for(String each: str.split("")){
           int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

           letters.put(each.charAt(0), frequency);
       }

    }

}
