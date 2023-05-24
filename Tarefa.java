package trabalho;

import java.util.ArrayList;
import java.util.Date;
public class Tarefa {

    public ArrayList<Aluno> Aluno;
    public String Disciplina;
    public String Tema;
    public String Descricao;
    public Date data;
    public float nota;
    public String Fonte;
    public String Observacoes;
//---------------------------------------------------------------------

    //Getters e Setters

    public ArrayList<Aluno> getAluno() {
        return Aluno;
    }

    public void setAluno(Aluno A) {
        this.Aluno.add(A);
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String tema) {
        Tema = tema;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getFonte() {
        return Fonte;
    }

    public void setFonte(String fonte) {
        Fonte = fonte;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String observacoes) {
        Observacoes = observacoes;
    }
//-------------------------------------------------------------------------------

    //Funções

    public void AdicionarAluno(ArrayList<Aluno>Aluno){
        this.Aluno = Aluno;       //Seta o aluno ao ArrayList Aluno da classe tarefa.
    }

    public void DeletarAluno(ArrayList<String>Aluno, int indice){
        this.Aluno.remove(indice);
    }
}
