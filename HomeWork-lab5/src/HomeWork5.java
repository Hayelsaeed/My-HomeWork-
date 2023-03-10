public class HomeWork5<E> {

    private node<E>tail=null;
    private  int size=0;

    public HomeWork5() {
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

    public HomeWork5<E> clone(HomeWork5<E>l){
        HomeWork5<E>l1=new HomeWork5<>();
        node<E> i=l.tail.next;
        while (i!=l.tail){

           l1.addLast(i.element);
           i=i.next;
        }   l1.addLast(i.element);
        return l1;}
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
        HomeWork5<Integer>l1=new HomeWork5<>();
        HomeWork5<Integer>l2=new HomeWork5<>();
        l1.addFirst(11);
        l1.addLast(12);
        l1.addLast(13);
        l1.addLast(14);
        l1.addLast(15);
        l1.addLast(16);
        System.out.print("list1={");
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.first()+",");
            l1.rotate();
        }
        System.out.println("}");


        l2=l2.clone(l1);
        System.out.println("after cloning:  ");
        System.out.print("list1={");
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.first()+",");
            l1.rotate();
        }
        System.out.println("}");

        System.out.print("list2={");
        for (int i = 0; i <l2.size() ; i++) {
            System.out.print(l2.first()+",");
            l2.rotate();
        }
        System.out.println("}");




    }


}
