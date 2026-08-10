
import java.util.ArrayList;

class ArrList{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Bhrantik");
        list.add("Cad");
        list.add("Divyansh");
        System.out.println("list: "+list);

        list.addAll( list);
        System.out.println(list);
    }
}