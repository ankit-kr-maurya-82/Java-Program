class lengthOfLastWord{
    public static void main(){
        String str = "Hello world";
        
        String[] words= str.split(" ");
        System.out.println(words[words.length - 1]);
        String countString = words[words.length - 1];

    
    System.out.println(countString.length());


    }
}