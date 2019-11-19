/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioherança;

import java.util.Random;

/**
 *
 * @author aluno
 */
public abstract class Personagem {
    
    //declara as variaveis
    protected String nome;
    protected double forca;
    protected double habilidadeMental;
    protected double poderAtaque;
    protected double esquiva;
    protected double resist; 
    protected double vidaAtual;
    protected double vidaMaxima;
    protected int dado;
   
    //declara os Metodos abstratos
    public abstract void atacar();
       
    public abstract void contraAtacar();
    
    public abstract void aprimorarHabilidadeEspecial();
    
    public abstract void regenerarVida();
    
    //rola o dado
    Random rolarDado = new Random();
    
    //Setters and Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public Personagem(String nome, double forca, double habilidadeMental, double poderAtaque, double esquiva, double resist, double vidaAtual, double vidaMaxima) {
     //`************************************************ \\
        this.nome = nome;
        this.forca = forca;
        this.habilidadeMental = habilidadeMental;
        this.poderAtaque = poderAtaque;
        this.esquiva = esquiva;
        this.resist = resist;
        this.vidaAtual = vidaAtual;
        this.vidaMaxima = vidaMaxima;
    }

    public double getHabilidadeMental() {
        return habilidadeMental;
    }

    public void setHabilidadeMental(double habilidadeMental) {
        this.habilidadeMental = habilidadeMental;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double getEsquiva() {
        return esquiva;
    }

    public void setEsquiva(double esquiva) {
        this.esquiva = esquiva;
    }

    public double getResist() {
        return resist;
    }

    public void setResist(double resist) {
        this.resist = resist;
    }

    public double getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(double vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

   
    
    
}
