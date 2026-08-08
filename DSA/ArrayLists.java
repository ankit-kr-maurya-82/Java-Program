import java.util.ArrayList;

class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<String> colors = new ArrayList<String>();

        // add elements
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Cherry");
        // fruits.add("Anas");
        colors.add("red");
        colors.add("yellow");
        colors.add("black");

        System.out.println(colors);

        // get elements
        // String getelement = fruits.get(1);
        String getelement = colors.get(1);
        System.out.println(getelement);

        // add el in between
        // fruits.add(1,"Grapes");
        // System.out.println(fruits);

        // set element
        // fruits.set(0,"cherry");
        // System.out.println(fruits);

        // delete element
        // fruits.remove(2);
        // System.out.println(fruits);

        // size 
        // int size = fruits.size();
        // System.out.println(size);

        // loops
        // for(int i=0; i<fruits.size(); i++){
        //     System.out.println(fruits.get(i));
        // }
        // System.out.println("");


        // sorting
        // Collections.sort(fruits);
        // System.out.println(fruits);
    }
    
}