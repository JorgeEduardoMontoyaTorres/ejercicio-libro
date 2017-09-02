/**
 * Para crear objetos libro y guardar sus datos importantes.
 * @version 24 agosto 2017
 */
public class Libro
{
    // instance variables
    private String t; 
    private String a;
    private int pag;
    private String referencia;
    private int prestamos;

    /**
     * Constructor donde se inicializa las variables de instancia.
     * @param titulo Contiene el titulo del libro.
     * @param autor Contiene el autor del libro.
     * @param paginas Numero de paginas del libro.
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
    /**
     * Nos indica el nombre del libro en pantalla.
     * @return Nos muestra en pantalla el nombre del autor.
     */
    public String dimeAutor()
    {
        return a;
    }
    
    /**
     * Nos indica el titulo del libro en pantalla.
     * @return Nos muestra en pantalla el nombre del libro.
     */
    public String dimeTitulo()
    {
        return t;
    }
    
    /**
     * Nos indica con cuantas paginas cuenta el libro.
     * @return numero de paginas.
     */
    public int dimePaginas()
    {
        return pag;
    }
    
    /**
     * Muestra todos los detalles del libro como lo es el titulo, autor, paginas, numero de referencia y cuantas veces a sido prestado.
     */
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
    
    /**
     * Nos indica el numero de referencia del libro.
     * @return Muestra en pantalla el numero de referencia.
     */
    public String dimeNumRef()
    {
        return referencia;
    }
    
    /**
     * Nos indica cuantas veces a sido prestado el libro.
     * @return Muestra los prestamos que se han realizo.
     */
    public int dimePrestamos()
    {
        return prestamos;
    }
    
    //Metodos de modificacion
    /**
     * Este metodo nos ayuda a modificar o cambiar el numero de referencia del libro.
     * @param numeroDeReferencia Numero de referencia nuevo.
     */
    public void cambiaNumRef(String NumeroDeReferencia)
    {
        if(NumeroDeReferencia.length() >= 3)
            referencia = NumeroDeReferencia;
    }
    
    /**
     * Agrega un prestamo mas al historial del libro.
     */
    public void prestar()
    {
        prestamos ++;
    }
}