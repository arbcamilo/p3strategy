// Clase que utiliza una estrategia logística en particular
class Contexto {
    private EstrategiaLogistica estrategia; // Referencia a la estrategia logística

    // Método para establecer la estrategia logística
    public void setEstrategia(EstrategiaLogistica estrategia) {
        this.estrategia = estrategia; // Asigna la estrategia al contexto
    }

    // Método para ejecutar la planificación utilizando la estrategia configurada
    public void ejecutarPlanificacion() {
        if (estrategia != null) {
            estrategia.planificar(); // Llama al método planificar de la estrategia
        } else {
            System.out.println("No se ha establecido ninguna estrategia logística.");
        }
    }
}