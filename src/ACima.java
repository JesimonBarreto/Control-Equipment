
import Acao.AcaoReal;
import Arduino.ControlePorta;
import Painel.NewShape;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Geral
 */
public class ACima extends AcaoReal {

    @Override
    public void executeArduino(ControlePorta cp, Painel.MyscreenPanel sp) {
        sp.removerShape(7);
        NewShape ns = null;
        try {
            ns = new NewShape(sp.imagem[2], sp);
        } catch (Exception erro) {
            System.out.println("Erro ADD SHAPE");
        }
        //set point pontos selecionados(padrões)
        sp.addLayerShape(ns);
        //Enviar char para arduíno iniciar ação
    }

    @Override
    public void pararAcao(ControlePorta cp, Painel.MyscreenPanel sp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}