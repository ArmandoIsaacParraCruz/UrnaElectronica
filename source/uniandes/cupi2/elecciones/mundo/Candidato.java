/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Candidato.java 445 2007-06-25 16:30:28Z camil-ji $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_elecciones
 * Autor: Carlos Andr�s Vega - 29-ene-2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.elecciones.mundo;

/**
 * Candidato de la eleccion.
 */

public class Candidato
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del candidato.
     */
    private String nombre;

    /**
     * Apellido del candidato.
     */
    private String apellido;

    /**
     * Partido politico del candidato.
     */
    private String partidoPolitico;

    /**
     * Edad del candidato.
     */
    private int edad;

    /**
     * Costo de campania del candidato.
     */
    private double costoCampanha;

    /**
     * N�mero de votos del candidato.
     */
    private int votos;
    
    /**
     * Numero de votos influenciados por internet.
     */
    //TODO Declare el atributo de votos influenciados por internet.
    private int votosInfluenciaInternet;
    /**
     * Numero de votos de genero femenino.
     */
    //TODO Declare el atributo de genero femenino.
    private int votosGeneroFemenino;
    /**
     * Numero de votos de genero masculino.
     */
    //TODO Declare el atributo de genero masculino.
    private int votosGeneroMasculino;
    /**
     * Numero de votos de edad joven (18 - 34).
     */
    //TODO Declare el atributo de rango de edad joven.
    private int votosEdadJoven;
    /**
     * Numero de votos de edad media (35 - 54).
     */
    //TODO Declare el atributo de rango de edad media.
    private int votosEdadMedia;
    /**
     * Numero de votos de edad mayor (55 o más).
     */
    //TODO Declare el atributo de rango de edad mayor.
    private int votosEdadMayor;

    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------

    /**
     * Inicializa los datos del candidato con los valores que vienen por parametro. <br>
     * <b>post: </b> El costo de campania se inicializa en cero<br>
     * El numero de votos se inicializa en cero. <br>
     * @param nNombre Nombre del candidato
     * @param nApellido Apellido del Candidato
     * @param nPartidoPolitico Partido politico del candidato
     * @param nEdad Edad del candidato
     */

    public Candidato( String nNombre, String nApellido, String nPartidoPolitico, int nEdad )
    {
        nombre = nNombre;
        apellido = nApellido;
        partidoPolitico = nPartidoPolitico;
        edad = nEdad;
        costoCampanha = 0;
        votos = 0;
        
        //TODO Inicialice los atributos de las estadisticas sobre los votos
        votosInfluenciaInternet = 0;
        votosGeneroMasculino = 0;
        votosGeneroFemenino = 0;
        votosEdadJoven = 0;
        votosEdadMedia = 0;
        votosEdadMayor = 0;
        
    }

    /**
     * Devuelve el nombre del candidato.
     * @return nombre del candidato.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Devuelve el apellido del candidato.
     * @return apellido del candidato.
     */
    public String darApellido( )
    {
        return apellido;
    }

    /**
     * Devuelve el partido politico del candidato.
     * @return partido politico del candidato.
     */
    public String darPartidoPolitico( )
    {
        return partidoPolitico;
    }

    /**
     * Devuelve la edad del candidato.
     * @return edad del candidato.
     */
    public int darEdad( )
    {
        return edad;
    }

    /**
     * Devuelve el costo de campania del candidato.
     * @return costo de campania del candidato.
     */
    public double darCostoCampanha( )
    {
        return costoCampanha;
    }

    /**
     * Devuelve el numero de votos del candidato.
     * @return numero de votos obtenidos.
     */
    public int darVotos( )
    {
        return votos;
    }
    
    /**
     * Devuelve el numero de votos influenciados por internet.
     * @return numero de votos influenciados por internet.
     */
    public int darVotosInfluenciaInternet()
    {
    	//TODO  Complete el metodo segun la documentacion.
    	return votosInfluenciaInternet;
    }
    
    /**
     * Devuelve el numero de votos de genero femenino.
     * @return numero de votos de genero femenino.
     */
    public int darVotosGeneroFemenino()
    {
    	//TODO  Complete el metodo segun la documentacion.
    	return votosGeneroFemenino;
    }
    
    /**
     * Devuelve el numero de votos de genero masculino.
     * @return numero de votos de genero masculino.
     */
    public int darVotosGeneroMasculino()
    {
    	//TODO  Complete el metodo segun la documentacion.
    	return votosGeneroMasculino;
    }
    
    /**
     * Devuelve el n�mero de votos de edad joven.
     * @return n�mero de votos de edad joven.
     */
    public int darVotosEdadJoven()
    {
    	//TODO  CComplete el metodo segun la documentacion.
    	return votosEdadJoven;
    }
    
    /**
     * Devuelve el n�mero de votos de edad media.
     * @return n�mero de votos de edad media.
     */
    public int darVotosEdadMedia()
    {
    	//TODO  CComplete el metodo segun la documentacion.
    	return votosEdadMedia;
    }
    
    /**
     * Devuelve el n�mero de votos de edad mayor.
     * @return n�mero de votos de edad mayor.
     */
    public int darVotosEdadMayor()
    {
    	//TODO  CComplete el metodo segun la documentacion.
    	return votosEdadMayor;
    }

    /**
     * Ingresa un voto al candidato.<br>
     * <b>post: </b> Se modific� el n�mero de votos aument�ndose el existente en 1.
     */
    public void ingresarUnVoto( )
    {
        votos = votos + 1;
    }

    /**
     * Adiciona un voto influenciado por la televisi�n <br<
     * <b>post: </b> Se adiciona al costo de la campa�a la suma de $1000 y se incrementa el n�mero de votos totales en 1.
     */
    public void agregarVotoTelevision( )
    {
        costoCampanha = costoCampanha + 1000;
    }

    /**
     * Adiciona un voto influenciado por la radio <br>
     * <b>post: </b> Se adiciona al costo de la campa�a la suma de $500 y se incrementa el n�mero de votos totales en 1.
     * 
     */
    public void agregarVotoRadio( )
    {
        costoCampanha = costoCampanha + 500;
    }

    /**
     * Adiciona un voto influenciado por Internet <br>
     * <b>post: </b> Se adiciona al costo de la campa�a la suma de $100, se incrementa el n�mero de votos totales en 1. 
     * Se incrementa en 1 el n�mero de votos influenciados por internet.
     */
    public void agregarVotoInternet( )
    {
    	//TODO  Complete el m�todo seg� la documentaci�n.
    	votosInfluenciaInternet += 1;
    	costoCampanha += 100;
    }
    
    /**
     * Adiciona un voto dado por un votante de g�nero femenino <br>
     * <b>post: </b> Se incrementa el n�mero de votos de g�nero femenino en 1.
     */
    public void agregarVotoGeneroFemenino( )
    {
    	//TODO  Complete el m�todo seg� la documentaci�n.
    	votosGeneroFemenino += 1;
    }
    
    /**
     * Adiciona un voto dado por un votante de g�nero masculino <br>
     * <b>post: </b> Se incrementa el n�mero de votos de g�nero masculino en 1.
     */
    public void agregarVotoGeneroMasculino( )
    {
    	//TODO  Complete el m�todo seg� la documentaci�n.
    	votosGeneroMasculino += 1;
    }
    
    /**
     * Adiciona un voto dado por un votante de edad joven <br>
     * <b>post: </b> Se incrementa el n�mero de votos de edad joven en 1.
     */
    public void agregarVotoEdadJoven( )
    {
    	//TODO  Complete el m�todo seg� la documentaci�n.
    	votosEdadJoven += 1;
    }
    
    /**
     * Adiciona un voto dado por un votante de edad media <br>
     * <b>post: </b> Se incrementa el n�mero de votos de edad media en 1.
     */
    public void agregarVotoEdadMedia( )
    {
    	//TODO  Complete el m�todo seg� la documentaci�n.
    	votosEdadMedia += 1;
    }
    
    /**
     * Adiciona un voto dado por un votante de edad mayor <br>
     * <b>post: </b> Se incrementa el n�mero de votos de edad mayor en 1.
     */
    public void agregarVotoEdadMayor( )
    {
    	//TODO  Complete el m�todo seg� la documentaci�n.
    	votosEdadMayor += 1;
    }

    /**
     * Se reinicia el conteo de votos 
     * <b>post: </b> votos = 0. votosGeneroFemenino = 0. votosGeneroMasculino = 0. votosEdadJoven = 0.
     * 	votosEdadMedia = 0. votosEdadMayor = 0. votosInfluenciaInternet=0
     */
    public void reiniciarConteoVotos( )
    {
        votos = 0;
        //TODO  Complete el m�todo seg� la documentaci�n.
        votosInfluenciaInternet = 0;
        votosGeneroFemenino = 0;
        votosGeneroMasculino = 0;
        votosEdadJoven = 0;
        votosEdadMedia = 0;
        votosEdadMayor = 0;
    }

    /**
     * Se reinicia el costo de campa�a <b>post: </b> costoCampanha = 0.
     */
    public void reiniciarCostoCampanha( )
    {
        costoCampanha = 0;
    }
}

