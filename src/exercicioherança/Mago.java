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
public class Mago extends Personagem {

    public Mago(String nome, double forca, double habilidadeMental, double poderAtaque, double esquiva, double resist, double vidaAtual, double vidaMaxima) {
        super(nome+ "Mage", 0, 1500, habilidadeMental*8, 19, resist, 2000, vidaMaxima);
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
           this.vidaAtual = this.vidaAtual - this.poderAtaque - resist*2; 
        }
    }
    @Override
    public void contraAtacar(){
        
    }
    @Override
    public void aprimorarHabilidadeEspecial(){
        this.habilidadeMental = habilidadeMental + habilidadeMental*0.15;
    }
    @Override
    public void regenerarVida(){
       this.vidaAtual = vidaAtual + vidaAtual*0.1;
    }
    
}
