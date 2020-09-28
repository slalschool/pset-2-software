import java.util.List;
import java.util.NoSuchElementException;

public class SimpleLinkedList {

    private Node head;
    private Node tail;
    public int size;

    public SimpleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public SimpleLinkedList(List<String> list) {
        head = new Node(null, null, null);
        tail = new Node(null, null, null);

        Node current = head;

        for (int i =  0; i < list.size(); i++) {
            current.data = list.get(i);
            Node previous = current;
            current =  new Node (current, null, null);
            previous.next = current;
        }
        current.data = list.get(list.size()-1);
        tail = current;
        size = list.size();
    }

    public void add(int index, String s) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index == 0) {
            addFirst(s);
        }
        else if (index == size - 1) {
            addLast(s);
        }
        else {
            Node current = getNode(index);
            Node newNode = new Node (current.prev, s, current);
            size++;

            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void addFirst (String s) {
        Node current = head;
        Node newNode = new Node (null, s, current);

        head = newNode;
        if (size == 0) {
            tail = newNode;
        } else {
            current.prev = newNode;
        }
        size++;
    }

    public void addLast(String s) {
        Node current = tail;
        Node newNode = new Node(current, s, null);

        tail = newNode;
        if (current == null) {
            head = newNode;
        } else {
            current.next = newNode;
        }

        size++;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            if (count++ == index) {
                return current;
            }

            current = current.next;
        }
        return null;
    }


    public void clear () {
        head = new Node (null, null, null);
        tail = new Node (null, null, null);
        size = 0;
    }

    public boolean contains (String s) {
        if(indexOf(s) == -1) {
            return false;
        }

        return true;
    }

    public String getFirst () {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public String getLast () {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    public int indexOf (String s) {
        for (int i = 0; i < size; i++) {
            if (getNode(i).data == s) {
                return i;
            }
        }
        return -1;
    }

    public String get(int index) {
        Node current = getNode(index);
        return current.data;
    }

    public String remove (int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size -1) {
            return removeLast();
        }
        else {
            Node removedNode = getNode(index);
            removedNode.prev.next = removedNode.next;
            removedNode.next.prev = removedNode.prev;
            String removed = removedNode.data;
            size = size - 1;
            return removed;
        }
    }

    public boolean remove (String s) {
        if(contains(s) == false) {
            return false;
        }
        for(int i = 0; i <size; i++) {
            Node current = getNode(i);
            if(current.data == s) {
                remove(i);
            }
        }
        return true;
    }
    public String removeFirst () {
        String removed = head.data;
        Node removedNode = head;
        head = removedNode.next;
        head.prev = null;
        size--;
        return removed;
    }

    public String removeLast () {
        String removed = tail.data;
        Node removedNode = tail;
        tail = removedNode.prev;
        tail.next = null;
        size--;
        return removed;
    }

    public String set(int index, String s) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node current = getNode(index);
        String node = current.data;
        if (s == null) s = "null";
        current.data = s;
        return node;
    }

    public int size () {
        return size;
    }

    public String toString () {
        String startString = "[";
        Node current = head;
        if(size != 0) {
            for (int i = 0; i < size - 1; i++) {
                startString = startString + current.data + ", ";
                current = current.next;
            }
            startString = startString + current.data;
        }
        else if(size == 0) {
            return "[]";
        }

        return startString + "]";
    }

    public static class Node {

        Node prev;
        String data;
        Node next;

        public Node(Node prev, String data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}