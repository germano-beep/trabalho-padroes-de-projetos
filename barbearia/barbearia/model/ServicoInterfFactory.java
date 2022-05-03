package barbearia.model;

public interface ServicoInterfFactory {

    public Corte createCorte();
    public Barba createBarba();
    public Pezinho createPe();
    public Pigmentacao createPigmentacao();
    public Sombrancelha createSombrancelha();
    
}
