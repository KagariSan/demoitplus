package fordemo;

public class Demo {
    public static void main(String[] args) {
//        int i = 0;
//        for (; i < 10;) {
//            System.out.println(i);
//            i++;
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 20;
//        do  {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 10);


        int i = 0;
        for (;;) {
            if ( i >= 10) {
                break;
            } else if (i > 5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
