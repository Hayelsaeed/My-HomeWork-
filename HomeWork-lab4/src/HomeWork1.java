

public class HomeWork1<E> {

    private node<E> header =null;
    private node<E> tail=null;
    private  int size=0;

    public HomeWork1() {
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

    public boolean  equals(HomeWork1<E> A,HomeWork1<E> B){
        boolean f=false;
        node<E> b=B.header;
        node<E> a=A.header;
        if (A.size()==B.size()){
            while (b!=null&&a!=null){
                if (b.element==a.element)
                    f=true;
                else {
                    f=false;
                    return  f;

                }
                b=b.next;
                a=a.next;
            }
        }



        return  f;
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
        HomeWork1<Integer>l1=new HomeWork1<>();
        HomeWork1<Integer>l2=new HomeWork1<>();
        l1.addFirst(11);
        l1.addLast(12);

        l2.addFirst(11);
        l2.addLast(12);

        if (l1.equals(l1,l2))
            System.out.println("the lists are equal" );
        else
            System.out.println("the lists are not equal" );


    }
}





