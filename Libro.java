public class Libro
{
    // instance variables
    private String t;
    private String a;

    /**
     * Constructor
     */
    public Libro(String titulo, String autor)
    {
        t = titulo;
        a = autor;
    }
    
    //Metodo de acceso
    public String dimeAutor()
    {
        return a;
    }
    
    public String dimeTitulo()
    {
        return t;
    }
}