
public class pincipalLibro {
    
    public static void main(String[] args) {
        
        Libro Libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 10, 3);
        Libro Libro2 = new Libro();
        Libro2.setTitulo("El señor de los anillos");
        Libro2.setAutor("JRR Tolkien");
        Libro2.setEjemplares(5);
        Libro2.setPrestados(0);

        
        System.out.println("Información de los libros:");
        System.out.println("Título: " + Libro1.getTitulo() + "\nAutor: " + Libro1.getAutor() + 
                           "\nEjemplares: " + Libro1.getEjemplares() + "\nPrestados: " + Libro1.getPrestados());
        System.out.println("Título: " + Libro2.getTitulo() + "\nAutor: " + Libro2.getAutor() + 
                           "\nEjemplares: " + Libro2.getEjemplares() + "\nPrestados: " + Libro2.getPrestados());

        
        if (Libro1.getEjemplares() > Libro1.getPrestados()) {
            Libro1.setPrestados(Libro1.getPrestados() + 1);
            System.out.println("Se ha prestado un ejemplar de: " + Libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares disponibles de: " + Libro1.getTitulo());
        }

        
        System.out.println("Estado actualizado de " + Libro1.getTitulo() + ": " + 
                           (Libro1.getEjemplares() - Libro1.getPrestados()) + " ejemplares disponibles.");
    }
    
}