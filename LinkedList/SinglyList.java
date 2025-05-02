/**
 * Implementation of a Singly Linear Linked List.
 * Supports insertFirst,insertLast,deletFirst,deleteLast,insertAtPos,deleteAtPos,display, and count operations.
 * Author: Kalpesh Sonawane
 * Date: 30/05/2025
 */

class Node                               
{
    public int data;
    public Node next;

    public Node(int x)                 
    {
        data = x;
        next = null;
    }
}

class SinglyLinkedList                       
{
    private Node head;
    private int count;

    public SinglyLinkedList()
    {
        head = null;
        count = 0;
    }

   public void insertFirst(int no)
   {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head = newn;
        }
        count++;
   }
   public void insertLast(int no)
   {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            Node temp = head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        count++;
   }
    
     public void deleteFirst()
     {
        if(head == null)
        {
            return;
        }
        else
        {
            head = head.next;
        }
        count--;
     }
     public void deleteLast()
     {
        if(head == null)
        {
            return;
        }
        else if(head.next == null)
        {
            head = null;
        }
        else
        {
            Node temp = head;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        count--;
     }
    public void insertAtPos(int no , int pos)
    {
        if((pos < 1) || (pos > count+1))
        {
            return;
        }
        if(pos == 1)
        {
            insertFirst(no);
        }
         else if(pos == count+1)
        {
            insertLast(no);
        }
        else
        {
            Node newn = new Node(no);
            Node temp = head;

            int i = 0;

            for(i =1; i<pos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            count++;
        }
    } 
    public void deleteAtPos(int pos)
    {
        if(pos < 1  ||  pos > count)
        {
           return;
        }
        if(pos == 1)
        {
            deleteFirst();
        }
        else if(pos == count)
        {
            deleteLast();
        }
        else
        {
            Node temp = head;
            for(int i =1; i< pos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            count--;
        }
    }
    public void display()
    {
        System.out.println("---- Singly Linear Linked List --------:");

        Node temp = head;

        while(temp != null)                       
        {
            System.out.print(temp.data+"->");                     
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getCount()
    {
        return count;
    }
}
class SinglyList
{
    public static void main(String Arg[])
    {
        SinglyLinkedList list = new SinglyLinkedList();         
        
        insertionOperation(list);
        deletionOperation(list);
        performPositionOperation(list);

        list.display();
        System.out.println("Number of element in the LinkedList are:"+list.getCount());
    }

        public static void insertionOperation(SinglyLinkedList list)
        {
            list.insertFirst(51);                                      
            list.insertFirst(21);
            list.insertFirst(11);
            list.insertLast(101);
            list.insertLast(111);
            list.insertLast(151);
        }
        public static void deletionOperation(SinglyLinkedList list)
        {
            // list.deleteFirst();
            // list.deleteLast();
        }

        public static void performPositionOperation(SinglyLinkedList list)       
        {
            list.insertAtPos(56,4);
            // list.insertAtPos(44,2);
            // list.deleteAtPos(5);
        }
}
