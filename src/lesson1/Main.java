package lesson1;

public class Main {
    public static void main(String[] args) {
        boolean i = true;
        boolean j = !i;
        i= !j;
        boolean k = !i||!j;
        boolean o = i && k;

        if(o) i = !j;

        System.out.println(i+ " " + j + " " +k);



    }


}