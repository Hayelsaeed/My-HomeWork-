public class HomeWork2<E> {

    private node<E> header =null;
    private node<E> tail=null;
    private  int size=0;

    public HomeWork2() {
    }
    public  boolean isEmpty(){
        return  size==0;
    }
    public void  h(){
        HomeWork2.node<E> a= header;
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
        header =new HomeWork2.node<E>(e, header);
        if (isEmpty() )
            tail= header;
        size++;

    }
    public void addLast(E e)
    {
        HomeWork2.node<E> n=new HomeWork2.node<E>(e,null);
        if (isEmpty() ) header =n;
        else    tail.setNext(n);

        tail=n;
        size++;

    }
    public node<E> getSecondLast(){
        node<E> i=header;
        while (i.next.next!=null){
            i=i.next;
        }
        return  i;
    }

    private static  class node<E>{
        E element;
        HomeWork2.node<E> next;

        public node(E element, HomeWork2.node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public HomeWork2.node<E> getNext() {
            return next;
        }

        public void setNext(HomeWork2.node<E> next) {
            this.next = next;
        }
    }



    public static void main(String[] args) {
    HomeWork2<Integer>l=new HomeWork2<>();

    l.addFirst(11);
    l.addLast(12);
    l.addLast(13);
    l.addLast(14);
    l.addLast(15);
    node<Integer>i= l.getSecondLast();
    System.out.println(i.getElement());
    System.out.println(i);
}
}
