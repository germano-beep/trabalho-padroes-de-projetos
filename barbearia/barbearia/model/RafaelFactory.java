package barbearia.model;


public class RafaelFactory implements ServicoInterfFactory {

    @Override
    public Corte createCorte() {
        return new CorteR();
    }

    @Override
    public Barba createBarba() {
        return new BarbaR();
    }

    @Override
    public Pezinho createPe() {
        return new PezinhoR();
    }

    @Override
    public Pigmentacao createPigmentacao() {
        return new PigmentacaoR();
    }

    @Override
    public Sombrancelha createSombrancelha() {
        return new SombrancelhaR();
    }
    
}
