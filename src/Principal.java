import java.util.ArrayList;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        // Un objeto es una instancia de una clase
        Pelicula miPelicula = new Pelicula("LaLaLand", 2021); // instanciacion de la clase com.aluracursos.screenmatch.modelos.Pelicula

        // Accediendo y modificando los datos mediante métodos públicos
        //miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La Casa del Dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Joker", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones " 
            + calculadora.getTiempoTotal() 
            + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        /////////////////////////////////////////////////////////////////////////////////////////
        /// Variable de referencia ***** Tipo de objeto que se guardará (Se puede modificar el pelicula de la izq por Var) Var: hace una inferencia del tipo de dato del objeto que esta en el lado derecho
        //Pelicula peliculaDeBruno = new Pelicula()
        var peliculaDeBruno = new Pelicula("El señor de los añillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        // Lista y Colecciones de Datos (ArrayList<E>) <Tipo de dato que tendra cada uno de los objetos en el arraylist>
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula); // Para agregar un dato al array con add
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size()); // Tamaño del array .size
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre()); // Buscar un elemento en particular (posicion y nombre)
        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());
    }
}
