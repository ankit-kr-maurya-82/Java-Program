class FiveArr{
    public static void main(String[] args){
        String names[] = {"Ankit", "Bhrantik", "Jatin", "Shivansh"};
        // for each loop
        for(String name : names){
            System.out.println("name: "+name);
        }
        int sum = 0;
        int numbers[] = {1,2,3,4,5};
        for(int number: numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}