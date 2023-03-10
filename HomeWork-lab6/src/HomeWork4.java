public class HomeWork4<E> {

    private Node<E> header;
    private Node<E> tailer;
    int size = 0;

    public HomeWork4() {
        header = new Node<>(null, null, null);
        tailer = new Node<>(null, header, null);
        header.next = tailer;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.next.element;
    }

    public E last() {
        if (isEmpty()) return null;
        return tailer.prev.element;
    }

    private void addBetween(E e, Node<E> p, Node<E> n) {
        Node<E> x = new Node<>(e, p, n);
        p.next = x;
        n.prev = x;
        size++;

    }

    public void addFirst(E e) {
        addBetween(e, header, header.next);
    }

    public void addlast(E e) {
        addBetween(e, tailer.prev, tailer);
    }

    private E remove(Node<E> node) {
        if (isEmpty()) return null;
        Node<E> p = node.prev;
        Node<E> n = node.next;
        p.next = n;
        n.prev = p;
        size--;
        return node.element;

    }

    public E removeFrist() {
        return remove(header.next);
    }

    public E removeLast() {
        return remove(tailer.prev);
    }

    public HomeWork4<E> margin(HomeWork4<E> A, HomeWork4<E> B) {
        A.size = A.size + B.size;
        A.tailer.prev.next = B.header.next;
        A.tailer = B.tailer;


        return A;
    }
    public void print(){
       Node<E> i=header.next;
        while (i.next!=null){
            System.out.print(i.getElement()+",");
            i=i.next;
        }
        System.out.print("}");

        System.out.println();
    }


    protected static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

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
        HomeWork4<Integer> l1 = new HomeWork4();
        HomeWork4<Integer> l2 = new HomeWork4();
        l1.addFirst(1);
        l1.addlast(2);
        l1.addlast(3);
        l1.addlast(4);
        l1.addlast(5);
        System.out.print("list1={");
        l1.print();
        l2.addFirst(6);
        l2.addlast(7);
        l2.addlast(8);
        l2.addlast(9);
        l2.addlast(10);
        System.out.print("list2={");
        l2.print();
        System.out.print("after margin list={");
        l1=l1.margin(l1,l2);
        l1.print();

    }
}
