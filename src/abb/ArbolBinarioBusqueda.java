package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;
    public ArbolBinarioBusqueda(){
        raiz = null;

    }

    /*
   Arbol esta vacio
     */
    public boolean estaVacio(){
        return raiz == null;

    }
    /*
    Metodo recursivo para insertar un nodo a nuestro abb*/
private void insertar(Nodo padre, Nodo hijo, int dato){
    if(hijo == null){
        //caso base
        Nodo nuevo = new Nodo(null, dato, null);
        if(dato >= padre.getDato()){
            padre.setDerecho(nuevo);
        } else{
            padre.setIzquierdo(nuevo);
        }
    } else {// llamada recursiva
        if (dato >= padre.getDato()){
            insertar(hijo, hijo.getDerecho(), dato);
        } else{
            insertar(hijo, hijo.getIzquierdo(), dato);
        }
        }
    }
    //Metodo auxiliar para insertar nodo al abb
    public void  insertar (int dato){
    if (estaVacio()){
        Nodo nuevo = new Nodo(null, dato, null);
    raiz = nuevo;
    } else {
    if(dato >= raiz.getDato()){
        insertar(raiz, raiz.getDerecho(),dato);
    } else {
        insertar(raiz, raiz.getIzquierdo(),dato);
    }
    }
    }
    //Metodo recursivo para recorrer mostrar el arbol inOrden
    private void mostrarEnOrden(Nodo nodo){
    if ( nodo == null){//caso base

    }else{ // llamada recursiva
        mostrarEnOrden(nodo.getIzquierdo());
        System.out.print(nodo.getDato() + "  ");
        mostrarEnOrden(nodo.getDerecho());
    }
    }
    //metodo auxiliar para recorrer/ mostrar el arbol enOrden
    public void mostrarEnOrden(){
    Nodo temp = raiz;
    mostrarEnOrden(raiz);
        System.out.println();
    }
}
