public interface Aggregate<T> {
    /**
     * 获取迭代器
     * @return Iterator
     */
    public Iterator<T> getIterator();
}