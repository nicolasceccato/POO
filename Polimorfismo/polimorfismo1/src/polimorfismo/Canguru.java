package polimorfismo;

public class Canguru extends Mamifero{
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    public void usarBolsa(){
        System.out.println("usando bolsa");
    }
}
