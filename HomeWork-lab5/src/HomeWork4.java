public class HomeWork4<E> {

    private node<E>tail=null;
    private  int size=0;

    public HomeWork4() {
        }

    public  boolean isEmpty(){
        return  size==0;
    }
    public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return tail.next.getElement();
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.element;
    }

    public void addFirst(E e)
    {if (size==0)
    {   tail=new node<E>(e,null);
        tail.setNext(tail);}
    else {
        tail.next=new node<>(e,tail.next);
        tail.setNext(tail.next);
    }

        size++;

    }
    public  void addLast(E e){
        addFirst(e);
        tail=tail.next;
    }

    public boolean  Sequence(HomeWork4<E> A,HomeWork4<E> B){
        boolean f=false;
        node<E>b=B.tail.next;
        node<E>a=A.tail.next;
        if (A.size()==B.size()){
            for (int i = 1; i <=B.size ; i++) {

                if (b.element== a.element) {

                    break;

                }
                else {
                    b = b.next;
                    if (i == B.size )
                        return f;
                }


            }
            while (b!=null&&a!=null){
                if (b.element==a.element)
                    f=true;
                else {
                    f=false;
                    return  f;}
                b=b.next;
                a=a.next;
                if(a==A.tail.next)
                    break;
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
        HomeWork4<Integer> l1 = new HomeWork4();
        HomeWork4<Integer> l2 = new HomeWork4();
        l1.addFirst(11);
        l1.addLast(12);
        l2.addFirst(12);
        l2.addLast(11);
        if (l1.Sequence(l1, l2))
            System.out.println("list1 and list2 have the same sequence");
        else
            System.out.println("list1 and list2 doesn't have the same sequence");
    }

}
