package lim.base.api;

public class StringBuidlerDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append("abc");
        System.out.println(sb);

        System.out.println("------------------------");

        sb.append(123).append("abcdef");
        System.out.println(sb);
    }
}
