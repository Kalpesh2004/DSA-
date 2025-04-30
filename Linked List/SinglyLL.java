class node
{
    public int data;
    public node next;

    public node(int x)
    {
        daat = x;
        next = null;
    }
}

class LL
{
    public node head;

    public LL()
    {
        head =null;
    }
    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head = newn;
        }
    }
    public void Display()
    {
        System.out.println("Elements form Linked list are: ");

        node temp = head;

        while(temp != head)
        {
            System.out.print("|" +temp.data +"|");
            temp = temp.next;
        }
        System.out.println("null";)
    }
}
class SinglyLL
{
    public static void main(String[] args)
    {

    }
}