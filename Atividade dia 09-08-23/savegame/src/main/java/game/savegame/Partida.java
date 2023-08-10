package game.savegame;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Partida {
    private String NomeJogo;
    private String Mapa;
    private int pontuacao;
    public String Data;    
    private Jogador Jogador;
    private int id;
    
    
    public String getHoraPartida(){
        return this.Data;
    }
    
    public void setHoraPartida(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter Formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        this.Data = myDateObj.format(Formatador);
    }

    /**
     * @return the NomeJogo
     */
    public String getNomeJogo() {
        return NomeJogo;
    }

    /**
     * @param NomeJogo the NomeJogo to set
     */
    public void setNomeJogo(String NomeJogo) {
        this.NomeJogo = NomeJogo;
    }

    /**
     * @return the Mapa
     */
    public String getMapa() {
        return Mapa;
    }

    /**
     * @param Mapa the Mapa to set
     */
    public void setMapa(String Mapa) {
        this.Mapa = Mapa;
    }

    /**
     * @return the pontuacao
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * @param pontuacao the pontuacao to set
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * @return the Jogador
     */
    public Jogador getJogador() {
        return Jogador;
    }

    /**
     * @param Jogador the Jogador to set
     */
    public void setJogador(Jogador Jogador) {
        this.Jogador = Jogador;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
