package barbearia.model;



public class JacareFactory implements ServicoInterfFactory {

    @Override
    public Corte createCorte() {
        return new CorteJ();
    }

    @Override
    public Barba createBarba() {
        return new BarbaJ();
    }

    @Override
    public Pezinho createPe() {
        return new PezinhoJ();
    }

    @Override
    public Pigmentacao createPigmentacao() {
        return new PigmentacaoJ();
    }

    @Override
    public Sombrancelha createSombrancelha() {
        return new SombrancelhaJ();
    }
    
}
