
public  class Strings {
    public static void main(String[] args){
//        string declaration

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your name is : " + name);
        // concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        // compare
        String name1 = "aahony";
        String name2 = "aahony";

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not eqaul");
        }

        // if(name1== name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not eqaul");
        // }

        // substring
        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
        String sentence1 = "TonyStark";
        String name3 = sentence1.substring(0,4);
        System.out.println(name3);


        
    }
}