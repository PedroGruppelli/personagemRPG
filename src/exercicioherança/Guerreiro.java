/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioherança;

/**
 *
 * @author aluno
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome, double forca, double habilidadeMental, double poderAtaque, double esquiva, double resist, double vidaAtual, double vidaMaxima) {
        super(nome+"Warrior", 300, 0, 300*10, 19, 45, vidaAtual, 30000);
    }

   
    @Override
    public void atacar(){
        //gera o "ataque"
         dado = rolarDado.nextInt(90);
        //se errar
        if(dado < this.esquiva){
            System.out.println("Falhou..");
        //se acertar
        }else if (dado >= this.esquiva){
           this.vidaAtual = this.vidaAtual - poderAtaque - resist*2; 
        }
        
    }
    
    @Override
    public void contraAtacar(){
        //gera o "ataque"
         dado = rolarDado.nextInt(90);
        //se errar
        if(dado < this.esquiva){
            System.out.println("Falhou..");
        //se acertar
        }else if (dado >= this.esquiva){
           this.vidaAtual = this.vidaAtual *1* poderAtaque - resist*2; 
        }
    }
    @Override
    public void aprimorarHabilidadeEspecial(){
        this.forca = forca + forca*0.1;
    }
    @Override
    public void regenerarVida(){
        this.vidaAtual = vidaAtual + vidaAtual*0.05;
    }
    
    
}
