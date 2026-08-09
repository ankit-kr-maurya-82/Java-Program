



class WrapperClasses{
    public static void main(String[] args) {
        int num = 12;
        System.out.println(num);
        Integer obj = new Integer(13);
        System.out.println(obj);
        Integer obj2 = Integer.valueOf("13");
        System.out.println(obj2);
        Integer obj3 = 13; // autoboxing
        System.out.println(obj3); 
        int age = obj; // unboxing

    
    }
}