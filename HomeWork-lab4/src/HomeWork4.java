public class HomeWork4<E> {

    private node<E> header =null;
    private node<E> tail=null;
    private  int size=0;

    public HomeWork4() {
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
    public void  rotate(){
        addLast(removeFirst());
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
        HomeWork4<Integer> l = new HomeWork4<>();
        l.addFirst(3);
        l.addLast(1);
        l.addLast(7);
        l.addLast(6);
        l.addLast(5);
        l.rotate();
        while (!l.isEmpty()) {
            System.out.print("," + l.removeFirst() + " ");
        }
    }
}
