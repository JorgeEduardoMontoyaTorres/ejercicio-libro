public class Libro
{
    // instance variables
    private String t; 
    private String a;
    private int pag;
    private String referencia;
    private int prestamos;

    /**
     * Constructor
     */
    public Libro(String titulo, String autor, int paginas)
    {
        t = titulo;
        a = autor;
        pag = paginas;
        referencia = "";
        prestamos = 0;
    }
    
    //Metodos de acceso
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
        
        if(referencia.length() != 0)
        {
            cadResult += ", ";
            cadResult += "Numero de referencia: ";
            cadResult += referencia;
        }else
            {
                cadResult += ", ";
                cadResult += "Numero de referencia: ";
                cadResult += "ZZZ";
            }
        
        cadResult += ", ";
        cadResult += "Prestamos: ";
        cadResult += prestamos;
        
        return cadResult;
    }
    
    public String dimeNumRef()
    {
        return referencia;
    }
    
    public int dimePrestamos()
    {
        return prestamos;
    }
    
    //Metodos de modificacion
    public void cambiaNumRef(String NumeroDeReferencia)
    {
        if(NumeroDeReferencia.length() >= 3)
            referencia = NumeroDeReferencia;
    }
    
    public void prestar()
    {
        prestamos ++;
    }
}