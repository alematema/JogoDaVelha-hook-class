package br.edu.undra.app;

import br.edu.undra.modelo.versoes.VersaoHumanoVersusHumanoImpl;
import br.edu.undra.modelo.versoes.VersaoComputadorVersusComputadorImpl;
import br.edu.undra.modelo.JogoDaVelha;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre
 */
public class App {
    
    public static void main(String[] args) {
        
        JogoDaVelha jogo = new JogoDaVelha("Jogo da Velha");
        jogo.setAbstracaoVersaoJogoVelha(new VersaoHumanoVersusHumanoImpl());
        
        new Thread(jogo::iniciar).start();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jogo.setAbstracaoVersaoJogoVelha(new VersaoComputadorVersusComputadorImpl());
        
    }
    
}
