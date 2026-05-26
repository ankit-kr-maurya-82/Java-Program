public class StrBuild{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Ankit");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert in index 0
        sb.insert(0, 'S');
        System.out.println(sb);

        sb.insert(2, 'a');
        System.out.println(sb);

        // delete the extra 'a'

        sb.delete(2, 3);
        System.out.println(sb);
    }
}