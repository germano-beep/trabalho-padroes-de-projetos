package model.servicos;

import model.servicos.servicos.Barba;
import model.servicos.servicos.Corte;
import model.servicos.servicos.Pezinho;
import model.servicos.servicos.Pigmentacao;
import model.servicos.servicos.Sombrancelha;
import model.servicos.servicos.ServicosRafael.BarbaR;
import model.servicos.servicos.ServicosRafael.CorteR;
import model.servicos.servicos.ServicosRafael.PezinhoR;
import model.servicos.servicos.ServicosRafael.PigmentacaoR;
import model.servicos.servicos.ServicosRafael.SombrancelhaR;

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
