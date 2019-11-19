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
public class Padre extends Personagem {

    public Padre(String nome, double forca, double habilidadeMental, double poderAtaque, double esquiva, double resist, double vidaAtual, double vidaMaxima) {
        super(nome+"Priest", 0, 0, 0, 0, 0, 2500, vidaMaxima);
    }

    
    @Override
    public void atacar(){
      //rola o dado
        dado = rolarDado.nextInt(101);
        if(dado >= 70){
            System.out.println("Inimigo convertido! A luta acabou.");
        }      
    }
    @Override
    public void contraAtacar(){
       //rola o dado
        dado = rolarDado.nextInt(101);
        if(dado >= 70){
            System.out.println("Inimigo convertido! A luta acabou.");
        }  
    }
    @Override
    public void aprimorarHabilidadeEspecial(){
        System.out.println("Este personagem não pode executar esta ação");
    }
    @Override
    public void regenerarVida(){
         this.vidaAtual = vidaAtual + vidaAtual*0.1;
    }
    
    
}
