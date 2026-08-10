class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

        // add first
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public  void addLast(String data) {
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
                
            }

            currNode.next = newNode;
        }

        // print
        public  void printList() {
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+"->");
                currNode = currNode.next;
                
            }

            System.out.println("NULL");
        }

        public void deletefirst(){
            head = head.next;
        }

        // public 
    
    public static void main(String[] args){
        // LinkedList
        // add first
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();

    }
}