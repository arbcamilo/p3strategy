// Clase principal para ejecutar el ejemplo del patrón Strategy
public class MainStrategy {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(); // Crea el contexto para la estrategia

        // Configura la estrategia logística para una boda
        contexto.setEstrategia(new EstrategiaBoda());
        contexto.ejecutarPlanificacion(); // Ejecuta la planificación para la boda

        // Cambia la estrategia logística para un concierto
        contexto.setEstrategia(new EstrategiaConcierto());
        contexto.ejecutarPlanificacion(); // Ejecuta la planificación para el concierto
    }
}