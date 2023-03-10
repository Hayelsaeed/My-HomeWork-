public class HomeWork5<E> {
private node<E> header =null;
    private node<E> tail=null;
    private  int size=0;

    public HomeWork5() {
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
    public HomeWork5<E>  margin(HomeWork5<E> A,HomeWork5<E> B){
        A.size=A.size+B.size;
        A.tail.next=B.header;
        A.tail=B.tail;
        return  A;
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
        HomeWork5<Integer>l1=new HomeWork5<>();
        HomeWork5<Integer>l2=new HomeWork5<>();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l2.addFirst(6);
        l2.addLast(7);
        l2.addLast(8);
        l2.addLast(9);
        l2.addLast(10);
        l1=l1.margin(l1,l2);
        while (!l1.isEmpty()){
            System.out.print("  "+l1.removeFirst()+" ");
        }

    }
}
