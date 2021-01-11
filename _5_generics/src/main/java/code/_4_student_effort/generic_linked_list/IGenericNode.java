package code._4_student_effort.generic_linked_list;

public interface IGenericNode <T> {
    T getValue();
    void setValue(T value);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}
