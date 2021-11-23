package linkedList;

public class SingleLinkedList {

    public Node head;
    public Node tail;

    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;

        return head;
    }


    public void insertInLinkedList(int nodeValue,int location){
        Node node=new Node();
        node.value=nodeValue;

        if(head==null){
            createSinglyLinkedList(nodeValue);
        }else if(location==0){
            node.next=head;
            head=node;
        }else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }else{
            Node tempNode=head;
            int index=0;

            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            node.next=tempNode.next;
            tempNode.next=node;



        }

        size++;

    }

    public void traverseSingleLinkedList(){
        if(head==null){
            System.out.println("Linked List not exist!");
        }
        else {
            Node tempNode=head;
            for (int i=0;i<size;i++){
                System.out.println(tempNode.value);
                if (i != size - 1) {
                    System.out.println("->");
                }
                tempNode=tempNode.next;
            }
        }
    }
}
