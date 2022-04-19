package model.servicos;

import model.servicos.servicos.Barba;
import model.servicos.servicos.Corte;
import model.servicos.servicos.Pezinho;
import model.servicos.servicos.Pigmentacao;
import model.servicos.servicos.Sombrancelha;
import model.servicos.servicos.ServicosJacare.BarbaJ;
import model.servicos.servicos.ServicosJacare.CorteJ;
import model.servicos.servicos.ServicosJacare.PezinhoJ;
import model.servicos.servicos.ServicosJacare.PigmentacaoJ;
import model.servicos.servicos.ServicosJacare.SombrancelhaJ;

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
