package StringProblem;

public class Mindfire {
    public static int Strcmp(String a, String b) {
        int diff = 0, i = 0;
        do {
            diff = (int) a.charAt(i) - (int) b.charAt(i);
            ++i;
        } while (diff == 0 && i < a.length());
        return diff;
    }

    public static boolean isExist(String[] ar, String a) {
        for (int i = 0; i < ar.length; i++)
            if (ar[i] != null && Strcmp(ar[i], a) == 0) 
                return true;
        return false;
    }

    public static void main(String[] args) {
        String input = "hello_asd_hello_aleoh_is_hello_hello";

        int pp = 0, slsh = 0, max = 0;
        String buff = "";

        // Count the no of Strings and maximum length
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '_') {
                slsh++;
                if (max < i - pp) {
                    max = i - pp;
                }
                pp = i+1;
            }
        }
        slsh++;
        if (max < input.length() - pp - 1) {
            max = input.length() - pp - 1;
        }
        pp = 0;
        String[] possible = new String[slsh];
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '_' ) {
                if( i - pp == max && !isExist(possible, buff)){
                    possible[index] = buff;
                    ++index;
                }
                buff = "";
                pp = i+1;
            }else{
                buff += input.charAt(i);
            }
        }
        if (input.length() - pp == max) {
            possible[index] = buff;
            ++index;
        }
        
        // lexical order
        for (int j = 0; j < index; j++) {
            for (int k = 0; k < index - 1; k++) {
                if (Strcmp(possible[k], possible[k + 1]) > 0) {
                    String temp = possible[k];
                    possible[k] = possible[k + 1];
                    possible[k + 1] = temp;
                }
            }
        }

        for (int j = 0; j < index; j++)
            System.out.print(possible[j] +" ");

    }
}
