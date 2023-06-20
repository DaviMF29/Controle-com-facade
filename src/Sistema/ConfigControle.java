/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author Miguel
 */
public class ConfigControle {
    String botaoEsquerdo; 
    String botaoAnalogico;
    String botaoMaoDireita;
    
    public void moverAnalogico(){
        if(botaoAnalogico == "Esquerdo"){
            moverEsquerda();
        }
        else if(botaoAnalogico == "Direito"){
            moverDireita();
        }
        else if(botaoAnalogico == "Cima"){
            moverCima();
        }
        else if(botaoAnalogico == "Baixo"){
            moverBaixo();
        }
                     
    }
    
    public void moverEsquerda() {
        System.out.println("Esquerda");
    }
 
    public void moverDireita() {
        System.out.println("Direita");
    }
    
    public void moverCima() {
        System.out.println("Cima");
    }
    public void moverBaixo() {
        System.out.println("Baixo");
    }
    
    
    public void ConfigBotoesEsquerdo(){
        if(botaoEsquerdo == "Esquerdo"){
            apertarEsquerda();
        }
        else if(botaoEsquerdo == "Direito"){
            apertarDireita();
        }
        else if(botaoEsquerdo == "Cima"){
            apertarCima();
        }
        else if(botaoEsquerdo == "Baixo"){
            apertarBaixo();
        }
                     
    }
    
    public void apertarEsquerda() {
        System.out.println("Esquerda");
    }
 
    public void apertarDireita() {
        System.out.println("Direita");
    }
    
    public void apertarCima() {
        System.out.println("Cima");
    }
    public void apertarBaixo() {
        System.out.println("Baixo");
    }
    
    
    
    public void ConfigBotoesDireito(){
        if(botaoMaoDireita == "Quadrado"){
            apertarQuadrado();
        }
        else if(botaoMaoDireita == "Bolinha"){
            apertarBolinha();
        }
        else if(botaoMaoDireita == "Triangulo"){
            apertarTriangulo();
        }
        else if(botaoMaoDireita == "X"){
            apertarX();
        }
        
        
        
    }
    
    
    public void apertarQuadrado() {
        System.out.println("Quadrado");
    }
 
    public void apertarTriangulo() {
        System.out.println("Triangulo");
    }
    
    public void apertarX() {
        System.out.println("X");
    }
    public void apertarBolinha() {
        System.out.println("Bolinha");
    }
}
