package pilas;

import comun.EmptyStructureException;
import listas.ArrayList;
import pilas.Stack;
import pilas.Stack;

/**
 *
 * @author juanc
 */
public class ArrayListStack<E> implements Stack<E>{
    private ArrayList data;

    
    public ArrayListStack(){
        
    }
    
    @Override
    public boolean isEmpty() {
       return data.size()==0;
    }

    @Override
    public E peek()throws EmptyStructureException {
        E aux;
        if(isEmpty()){
        throw new EmptyStructureException();
        }
       
       return ((E)data.get(data.size()));
    }

    @Override
    public E pop()throws EmptyStructureException {
        E aux;
        if(isEmpty()){
        throw new EmptyStructureException();
        }
        aux=((E)data.get(data.size()-1));
        data.remove(data.size()-1);
        return aux;
    }

    @Override
    public void push(E target) {
        data.add(target);
    } 
}
