public class SearchNode {  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    public Node head = null;  
    public Node tail = null;  
  
    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
            tail.next = head;  
        }  
    }  
  
    public void search(int element) {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
             do{  
                if(current.data ==  element) {  
                    flag = true;  
                    break;  
                }  
                current = current.next;  
                i++;  
            }while(current != head);  
             if(flag)  
                 System.out.println("Element is present in the list at the position : " + i);  
            else  
                 System.out.println("Element is not present in the list");  
        }  
    }  
  
    public static void main(String[] args) {  
        SearchNode cl = new SearchNode();  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        cl.search(2);  
        cl.search(7);  
    }  
}  