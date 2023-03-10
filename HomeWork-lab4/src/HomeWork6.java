public class HomeWork6<E> {
private node<E> header =null;
    private node<E> tail=null;
    private  int size=0;

    public HomeWork6() {
    }
    public  boolean isEmpty(){
        return  size==0;
    }
    public void  h(){
        node<E> a= header;
        header =tail;
        tail=a;
    }
    public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return  header.getElement();
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.element;
    }
    public void addFirst(E e)
    {
        header =new node<E>(e, header);
        if (isEmpty() )
            tail= header;
        size++;

    }
    public void addLast(E e)
    {
        node<E> n=new node<E>(e,null);
        if (isEmpty() ) header =n;
        else    tail.setNext(n);

        tail=n;
        size++;

    }
    public E removeFirst(){
        if(isEmpty())return  null;
        E del=header.element;
        header=header.next;
        size--;
        if (size==0)
            tail=null;
        return  del;


    }
public void revers(HomeWork6<E> r){

        if (!isEmpty()){
            node prev=null;
            node curr=header;
            node next= null;
            while (curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            header=prev;
        }


    }

    private static  class node<E>{
        E element;
        node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }
    }
    public static void main(String[] args) {
        HomeWork6<Integer>l=new HomeWork6<>();
        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.revers(l);
        while (!l.isEmpty()){
            System.out.print("  "+l.removeFirst()+" ");
        }
    }
}
