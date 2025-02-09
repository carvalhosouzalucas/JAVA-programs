public class Mamifero { 
    protected void andar() { 
        System.out.print("Mamífero andando "); 
    } 
}

public class Primata extends Mamifero { 
    protected void andar() { 
        System.out.print("Primata andando "); 
    } 

    protected void andar(int metros) { 
        System.out.print("Primata andando " + metros + " metros"); 
    } 
}

