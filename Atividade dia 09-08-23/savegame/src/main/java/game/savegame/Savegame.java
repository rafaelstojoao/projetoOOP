package game.savegame;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Savegame {
    
    public static void gravacabeca(){
        try{
            OutputStream saida = new FileOutputStream("./Historico.csv");
            Writer escritor = new OutputStreamWriter(saida);
            BufferedWriter carregador = new BufferedWriter(escritor);
            
            carregador.write("ID, Data, ID Jogador, Nome Jogador, Pontuação");
            carregador.newLine();
            carregador.close();
            
        } catch (Exception e) {
            System.out.println("Deu ruim ai fera...");
        }
    }
    
    public static void gravapartida(Partida P1){
        try{
            OutputStream saida = new FileOutputStream("./Historico.csv",true);
            Writer escritor = new OutputStreamWriter(saida);
            BufferedWriter carregador = new BufferedWriter(escritor);
            
            carregador.write(P1.getId()+ "," + P1.getHoraPartida() + "," + P1.getJogador().getId() + "," + P1.getJogador().getNickname() + "," + P1.getPontuacao());
            carregador.newLine();
            carregador.close();
            
        } catch (Exception e) {
            System.out.println("Deu ruim ai fera...");
        }
    }

    public static void main(String[] args) {
        /*
        Jogador J1 = new Jogador();
        
        J1.setNickname("Rogerio");
        
        Partida P1 = new Partida();
        
        
        P1.setNomeJogo("Jogo 1");
        P1.setJogador(J1);
        P1.setHoraPartida();
        Savegame:gravacabeca();
        Savegame:gravapartida(P1);
        */
        
        Jogador j = new Jogador();
        Partida p = new Partida();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o Nome do jogo a ser gravado: ");
        p.setNomeJogo(leitor.nextLine());
        
        System.out.println("Digite o Nome do mapa: ");
        p.setMapa(leitor.nextLine());
        
        System.out.println("Digite o ID da partida: ");
        
        p.setId(leitor.nextInt());
        
        p.setHoraPartida();
        
        System.out.println("Digite o ID do jogador: ");
        
        j.setId(leitor.nextInt());
        leitor.nextLine();
        System.out.println("Digite o nome do jogador: ");
        
        j.setNickname(leitor.nextLine());

        System.out.println("Digite a pontuação do " + j.getNickname() + " nesta partida: ");
        p.setPontuacao(leitor.nextInt());
        
        p.setJogador(j);
        
        Savegame:gravapartida(p);
        
        
        ConnectionPVP c = new ConnectionPVP();
        c.conecta();
        
        try {
            c.grava ("INSERT INTO Jogador (id,Nome) VALUES("+ j.getId() + ", '" + j.getNickname() + "');");
            c.listdata();
        } catch (SQLException ex) {
            Logger.getLogger(Savegame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            c.grava ("INSERT INTO Partida (NomeJogo, HoraPartida, Mapa,Pontuacao, Jogador, Id) VALUES("
                    + "'"+ p.getNomeJogo() + "'"
                    + ",'"+ p.getHoraPartida() + "'"
                    + ",'"+ p.getMapa() + "'"
                    + ", "+ p.getPontuacao()
                    + ",'"+ p.getJogador().getNickname() + "'"
                    + ", "+ p.getJogador().getId()
                            + ");");
            c.listdata();
        } catch (SQLException ex) {
            Logger.getLogger(Savegame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}

