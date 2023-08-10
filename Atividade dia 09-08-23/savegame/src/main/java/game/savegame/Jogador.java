package game.savegame;

import java.util.ArrayList;

public class Jogador {
    private String Nickname;
    private int id;
    public ArrayList <Pais> P = new ArrayList<>();
    
    public void getP(){
        for (int i = 0; i < this.P.size(); i++) {
            System.out.println("Posição: " + i + " Pais: " + this.P.get(i).getNome());
        }
    }
    
    public void setP (Pais P){
        this.P.add(P);
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
