
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ArrList{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ankit");
        list1.add("Ankit");
        list1.add("Ankit");
        list1.add("Bhrantik");
        list1.add("Cad");
        list1.add("Divyansh");
        System.out.println("list1: "+list1);
        List<String> list2 = new ArrayList<>();
        list2.add("BA");
        list2.add("BCA");
        list2.add("BCA");
        list2.add("BED");
        list2.add("MBBS");
        System.out.println("list2: "+list2);
        list2.remove(0);
        System.out.println("list2: "+list2);

        List<Integer> listNum = new ArrayList<>();
        List<Integer> listNum2 = new LinkedList<>();
        listNum.add(10);
        listNum.add(20);
        listNum.add(1);

        listNum2.add(1);
        listNum2.add(2);
        listNum2.add(3);

        System.out.println(listNum);
        // System.out.println(listNum.size());
        // System.out.println(listNum.contains(200));
        // listNum.remove(Integer.valueOf(1));
        // System.out.println(listNum);
        // System.out.println(listNum2);
        // listNum.addAll(listNum2);
        // System.out.println(listNum);
        // listNum.removeAll(listNum2);
        // listNum.retainAll(listNum2);   

        // listNum.clear(); 
        Object a[] = listNum.toArray();
        for (Object e : a) {
            Integer temp = (Integer) e;
            System.out.println(e);
        }
        System.out.println(listNum);


        List<String> smallList = list2.subList(1,4);
        System.out.println(smallList);

    }
}