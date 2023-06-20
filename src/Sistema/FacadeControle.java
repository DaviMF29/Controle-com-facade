/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author Miguel
 */
public class FacadeControle {
    
    protected ConfigImagem imagem;
    protected ConfigControle controle;
    protected ConfigAudio audio;
    
    
    public void inicializarSubsistemas() {
        imagem = new ConfigImagem();
        imagem.configuracaoInicialBrilho();
        imagem.configuracaoInicialSaturacao();
        
        controle = new ConfigControle();
        controle.moverAnalogico();
        
        audio = new ConfigAudio();
        audio.configuracaoInicialVolume();
        
    }
    
   public void aumentarSaturacao() {
        if (imagem.saturacao >= 100) {
            System.out.println("Saturacao no máximo");
        } else {
            imagem.saturacao = imagem.saturacao + 10;
        }
    }

    public void diminuirSaturacao() {
        if (imagem.saturacao <= 0) {
            System.out.println("Saturação no mínimo");
        } else {
            imagem.saturacao = imagem.saturacao - 10;
        }
    }
    
    public void aumentarBrilho() {
        if (imagem.brilho >= 100) {
            System.out.println("Brilho no máximo");
        } else {
            imagem.brilho = imagem.brilho + 10;
        }
    }

    public void diminuirBrilho() {
        if (imagem.brilho <= 0) {
            System.out.println("Brilho no mínimo");
        } else {
            imagem.brilho = imagem.brilho - 10;
        }
    }
    
    public void aumentarVolume(){
        if(audio.volume>=100){
            System.out.println("Volume no máximo");
        }
        
        else{
            audio.volume = audio.volume +10;
        }
    }
    
    public void diminuirVolume(){
        if(audio.volume <=0){
        System.out.println("Saturacao no mínimo");
    }
        else{
            audio.volume = audio.volume -10;
        }
    }
}
