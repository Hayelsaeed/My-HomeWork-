public class HomeWork3<E> {
    private node<E> header =null;
    private node<E> tail=null;
    private  int size=0;

    public HomeWork3() {
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
        HomeWork3<Integer>l=new HomeWork3<>();
        l.addFirst(1);
        l.addLast(21);
        l.addLast(6);
        l.addLast(4);
        l.addLast(5);
      System.out.println("Size list is: "+l.size());
    }
}
