public class HomeWork2<E> {
    private Node<E>header;
    private Node<E>tailer;
    int size=0;

    public HomeWork2() {
        header=new Node<>(null,null, null);
        tailer = new Node<>(null,header, null);
        header.next=tailer;
    }
    public  boolean isEmpty(){
        return size==0;
    }
    public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return header.next.element;
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tailer.prev.element;
    }
    private  void addBetween(E e, Node<E>p, Node<E>n){
        Node<E> x=new Node<>(e,p,n);
        p.next=x;
        n.prev=x;
        size++;

    }
    public void addFirst(E e)
    {
        addBetween(e,header,header.next);
    }
    public void addlast(E e)
    {
        addBetween(e,tailer.prev,tailer);
    }

    private E remove(Node<E>x)  {
        if( isEmpty())return  null;
        Node<E>p=x.prev;
        Node<E>n=x.next;
        p.next=n;
        n.prev=p;
        size--;
        return x.element;

    }

    public  E removeFrist()

    {
        return  remove(header.next);
    }
    public  E removeLast()

    {
        return  remove(tailer.prev);
    }
    public int methodSize(HomeWork2<E> list){
        Node<E> i=header.next;
        int s=0;
        while (i!=tailer){
            s++;
            i=i.next;
        }return  s;
    }

    protected   static class Node<E>{
        E element;
        Node<E>prev;
        Node<E>next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
public static void main(String[] args) {
    HomeWork2<Integer>list=new HomeWork2();

    list.addFirst(11);
    list.addlast(12);
    list.addlast(13);
    list.addlast(14);
    list.addlast(15);

    System.out.println("Size list is: "+list.methodSize(list));


}
}
