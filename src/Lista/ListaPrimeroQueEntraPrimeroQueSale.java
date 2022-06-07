package Lista ;

public class ListaPrimeroQueEntraPrimeroQueSale<E extends Number> {
    Element firstElement;

    public ListaPrimeroQueEntraPrimeroQueSale() {

    }

    public void add(E e) {   //hago que sea el primer elemento to do el rato en el add por lo de la cola que has dicho
        Element nuevoPrimerElemento = new Element(e); //NO se porque no me va el object este -.-
        if (firstElement != null) {
            nuevoPrimerElemento = firstElement;
        } else {
            nuevoPrimerElemento.setNextElement(firstElement);
            firstElement = nuevoPrimerElemento;
        }
    }

    public Object getFirstObject() {
        return firstElement;
    }

    public Element remove() {

    return firstElement=null;}

    public boolean isEmpty() {
        if (firstElement != null && firstElement.getNextElement() != null) {
            return false;

        } else
            return true;
    }

    public void clear() {
        do{
            firstElement=null;
        } while(firstElement!=null && firstElement.getNextElement()!=null){


    }}

    public int count() {
        int contador = 0;
        for (Element firstelement : ListaPrimeroQueEntraPrimeroQueSale) {
            contador++;

        }
        return contador;
    }

//    public void print(){
//        System.out.println();
//    }
    public Element peek(){
        if ()
        return firstElement;

}



    private class Element{
        Element nextElement=null;
        Object object;

        public Object getObject() {
            return object;
        }



        public Element(Object newObject){
            this.object= newObject;

        }
        public void setObject(Object newObject){
            object=newObject;
        }
        public void setNextElement(Element newNextElement){
        this.nextElement=newNextElement;

        }

        public Element getNextElement(){
        return nextElement;

        }

        public void delete(){
            object=null;
            nextElement=null;
        }

    }







}}
