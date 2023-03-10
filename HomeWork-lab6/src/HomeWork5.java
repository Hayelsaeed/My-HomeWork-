public class HomeWork5<E> {
        private Node<E> header;
    private Node<E> tailer;
    int size = 0;

    public HomeWork5() {
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
        HomeWork5<Integer> l =new HomeWork5<>();
        l.addFirst(11);
        l.addlast(12);
        l.addlast(13);
        l.addlast(14);
        System.out.print("list before remove={");
        l.print();
        System.out.print("size before remove=(");
        System.out.print(l.size());
        System.out.println(")");
        System.out.println(" ");

        while (!l.isEmpty()){
            System.out.print("item will delete={");
            System.out.print(l.removeFrist());
            System.out.println("}");
            System.out.print("Size after remove element=(");
            System.out.print(l.size());
            System.out.println(")");
            System.out.print("list after remove element={");
            l.print();
            System.out.println("");




        }
        l.print();
    }
}
