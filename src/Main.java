public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(29);
        System.out.println("Tu edad es de " + cliente.getEdad());

        cliente.setTelefono(833020094);
        System.out.println("Tu teléfono es "+ cliente.getTelefono());

        cliente.setNombre("Antonio");
        System.out.println("Tu nombre es " + cliente.getNombre());

        cliente.setCredito(25000);
        System.out.println("Tu crédito es de " + cliente.getCredito());

        System.out.println("---------------------");


        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(45);
        System.out.println("Tu edad es de " + cliente.getEdad());

        trabajador.setTelefono(833347942);
        System.out.println("Tu teléfono es "+ cliente.getTelefono());

        trabajador.setNombre("Jaime");
        System.out.println("Tu nombre es " + cliente.getNombre());

        trabajador.setSalario(3000);
        System.out.println("Tu crédito es de " + cliente.getCredito());



    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito=credito;
    }
    public int getCredito(){
        return this.credito;
    }

}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return this.salario;
    }

}