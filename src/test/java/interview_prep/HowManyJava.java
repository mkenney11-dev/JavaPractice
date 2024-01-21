package interview_prep;

public class HowManyJava {

    public static void main(String[] args) {

        String str = "java java hello world java java python java";
        String[] arr = str.split(" ");

        int count = 0;

        for (String each : arr) {
            if(each.equalsIgnoreCase("java")){
                count++;
        }
        }

        System.out.println(count);

    }
}
