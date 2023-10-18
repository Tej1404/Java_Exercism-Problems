import java.util.*;
import java.lang.reflect.Array;
class SimpleLinkedList<T> {
    LinkedList<T> list= new LinkedList<>();
    SimpleLinkedList() {
    }

    SimpleLinkedList(T[] values) {
        list.addAll(List.of(values));
    }

    void push(T value) {
        list.addFirst(value);
    }

    T pop() {
        return list.removeFirst();
    }

    void reverse() {
        Collections.reverse(list);
    }

    public T[] asArray(Class<T> clazz) {
        return list.toArray((T[]) Array.newInstance(clazz,0));
    }

    int size() {
        return list.size();
    }
}
