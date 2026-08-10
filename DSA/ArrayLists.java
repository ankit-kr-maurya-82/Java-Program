import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        // add elements
        cars.add("BMW");
        cars.add("Mustang");
        cars.add("Thar");
        cars.add("Tata");
        cars.add("Ford");

        System.out.println(cars);

        // get elements
        for(int i=0; i<cars.size();i++){
            System.out.println(i + " " + cars.get(i));
        }

        int Size = cars.size();
        System.out.println("size : "+Size);
       
    // add elements in between
    cars.add(2,"Tesla");
    System.out.println("add elements in between : "+cars);
    

        // set element

        cars.set(0,"Maruti");
        System.out.println("after set: "+cars);

        // delete element
        cars.remove(2);
        System.out.println("after remove : "+cars);

        // sorting
        Collections.sort(cars);
        System.out.println("after sorting: "+cars);
    }
    
}