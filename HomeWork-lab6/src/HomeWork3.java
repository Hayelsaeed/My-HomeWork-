public class HomeWork3<E> {
    private Node<E>header;
    private Node<E>tailer;
    int size=0;

    public HomeWork3() {
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
    public boolean  equals(HomeWork3<E> A, HomeWork3<E> B){
        boolean f=false;
        Node<E> b = B.header.next, a = A.header.next;
        if (A.size()== B.size()){
            for (int i = 0; i < A.size; i++) {


                if (b.element== a.element)
                    f=true;
                else {
                    f = false;
                    return f;
                }

                b = b.next;
                a = a.next;
            }}
        return  f;
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
HomeWork3<Integer>l1=new HomeWork3<>();
    HomeWork3<Integer>l2=new HomeWork3<>();
        l1.addFirst(11);
        l1.addlast(15);

        l2.addFirst(11);
        l2.addlast(15);

        if (l1.equals(l1,l2))
            System.out.println("the two lists are equal" );
        else
                System.out.println("the two lists are not equal" );


}
}
