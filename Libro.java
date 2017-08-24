public class Libro
{
    // instance variables
    private String t;
    private String a;
    private int pag;

    /**
     * Constructor
     */
    public Libro(String titulo, String autor, int paginas)
    {
        t = titulo;
        a = autor;
        pag = paginas;
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
    
    public int dimePaginas()
    {
        return pag;
    }
    
    public String dimeDetalles()
    {
        String cadResult = "";
        cadResult += "Título";
        cadResult += ": ";
        cadResult += t;
        cadResult += ", ";
        cadResult += "Autor";
        cadResult += ": ";
        cadResult += a;
        cadResult += ", ";
        cadResult += "Páginas";
        cadResult += ": ";
        cadResult += pag;
        
        return cadResult;
    }
}