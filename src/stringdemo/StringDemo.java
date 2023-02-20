package stringdemo;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringDemo {
    public static void main(String[] args) {
        String test1 = "abc";
        String test2 = "abc";
        String test3 = new String("abc");
        String test4 = test1 + test2 + test3;
        String test5 = String.format("%s %s", test4, test2);

        StringBuilder builder = new StringBuilder();
        builder.append(test5).append(test3);
        builder.insert(2, test2);
        builder.reverse();
        builder.toString();

        StringTokenizer tokenizer = new StringTokenizer(builder.toString());
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
        }

        // Chuan hoa du lieu
        // Chien,MinH, Hai,, dao,  Nam ,Trang
        // Chien,Minh,Hai,Dao,Nam,Trang

        // Viet Regex xac dinh xem string co hop le hay khong
        // Phan cach dau phay (,) khong co dau cach va chi viet hoa chu cai dau
        // Pattern
    }

}
