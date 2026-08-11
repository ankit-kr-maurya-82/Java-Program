
import java.util.ArrayList;
import java.util.List;

class LinkList{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(1);

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1,200);
        System.out.println(list);
        list.add(2,1000);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}