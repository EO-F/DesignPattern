public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     * @return boolean
     */
    public boolean hasNext();

    /**
     * 返回当前元素并将当前位置指针指向下一个元素
     * @return element
     */
    public T next();
}