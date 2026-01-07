public class StrBuild{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert in index 0
        sb.insert(0, 'S');
        System.out.println(sb);

        sb.insert(3, 'n');
        System.out.println(sb);

        // delete the extra 'n'

        sb.delete(3, 4);
        System.out.println(sb);
    }
}