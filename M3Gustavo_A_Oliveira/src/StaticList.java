import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Implementação de uma lista linear com armazenamento estático,
 * baseado em array.
 */

 //Execicio do Modulo 3: Contador da lista estatica
public class StaticList<E> implements List<E> {
    private E[] elements;
    private int numElements;

    public int contaElementos(E el) {
        return contaElementosRec(el, 0);
    }

    private int contaElementosRec(E el, int index) {
        if (index >= numElements) {
            return 0;
        }
        int count = 0;
        if (elements[index].equals(el)) {
            count++;
        }
        return count + contaElementosRec(el, index + 1);
    }

    /**
     * Constrói uma lista com um tamanho máximo.
     * 
     * @param maxSize O tamanho máximo da lista
     */
    public StaticList(int maxSize) {
        elements = (E[]) new Object[maxSize];
        numElements = 0;
    }

    public int numElements() {
        return numElements;
    }

    public boolean isEmpty() {
        return numElements == 0;
    }

    public boolean isFull() {
        return numElements == elements.length;
    }

    public void insert(E element, int pos) throws OverflowException,
            IndexOutOfBoundsException {
        // verifica se há espaço na lista
        if (isFull())
            throw new OverflowException();
        // verifica se a posição é válida
        if (pos < 0 || pos > numElements)
            throw new IndexOutOfBoundsException();
        // desloca para a direita os elementos necessários,
        // abrindo espaço para o novo
        for (int i = numElements - 1; i >= pos; i--)
            elements[i + 1] = elements[i];
        // armazena o novo elemento e ajusta o total
        elements[pos] = element;
        numElements++;
    }

    public E remove(int pos) throws UnderflowException,
            IndexOutOfBoundsException {
        if (isEmpty())
            throw new UnderflowException();
        // verifica se a posição é válida
        if (pos < 0 || pos >= numElements)
            throw new IndexOutOfBoundsException();
        // guarda uma refer ncia temporária ao elemento removido�
        E element = elements[pos];
        // desloca para a esquerda os elementos necessários,
        // sobrescrevendo a posição do que está sendo removido
        for (int i = pos; i < numElements - 1; i++)
            elements[i] = elements[i + 1];
        // define para null a posição antes ocupada pelo último,
        // para que a coleta de lixo possa atuar, e ajusta o total
        elements[numElements - 1] = null;
        numElements--;
        return element;
    }

    public E get(int pos) throws IndexOutOfBoundsException {
        // verifica se a posição é válida
        if (pos < 0 || pos >= numElements)
            throw new IndexOutOfBoundsException();
        return elements[pos];
    }

    public int search(E element) {
        for (int i = 0; i < numElements; i++)
            if (element.equals(elements[i]))
                return i;
        // se chegar até aqui, é porque não encontrou
        return -1;
    }

    /**
     * Retorna uma representação String da lista.
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < numElements; i++)
            s += elements[i] + " ";
        return s;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
            return numElements;    
        }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean add(E e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public E set(int index, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<E> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }
}