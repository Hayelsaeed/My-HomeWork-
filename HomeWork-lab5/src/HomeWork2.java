public class HomeWork2<E> {

    private node<E>tail=null;
    private  int size=0;

    public HomeWork2() {
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

    public int methodSize(HomeWork2<E> list){
        node<E>i=tail.next;
        int s=0;
        while (i!=null){
            s++;
            i=i.next;
            if( tail.next==i)
                break;
        }return  s;
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
    public void rotate(){
        if (tail!=null)
            tail=tail.next;
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
        HomeWork2<Integer> l = new HomeWork2<>();

        l.addFirst(11);
        l.addLast(2);
        l.addLast(6);
        l.addLast(5);
        l.addLast(51);
        System.out.print("list={");
        for (int i = 0; i <l.size() ; i++) {
            System.out.print(l.first()+",");
            l.rotate();
        }
        System.out.println("}");

    }



}
