package trabalho;

import java.util.ArrayList;
import java.util.Date;
public class Tarefa {

    public ArrayList<Aluno> Aluno = new ArrayList<Aluno>();
    private Disciplina Disc = new Disciplina();
    public String Tema;
    public String Descricao;
    public Date data = new Date();
    private float nota;
    public String Fonte;
    public String Observacoes;
//---------------------------------------------------------------------

    //Getters e Setters

    public Aluno getAluno(int indice) {
        return this.Aluno.get(indice);
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
    
    public Disciplina getDisc() {
        return Disc;
    }

    public void setDisc(Disciplina Disc) {
        this.Disc = Disc;
    }
    
    
    
//-------------------------------------------------------------------------------

    //Funções

    public void AdicionarAluno(Aluno A){
       this.Aluno.add(A);       //Seta o aluno ao ArrayList Aluno da classe tarefa.
    }

    public void DeletarAluno(int indice){
        this.Aluno.remove(indice);
    }
    
    
    public void ImprimeTarefa(){
        System.out.println("Tema: "+ this.Tema);
        System.out.println("Descricao: "+ this.Descricao);
        System.out.println("Data: "+ this.data);
        System.out.println("Nota: "+ this.nota);
        System.out.println("Fonte: "+ this.Fonte);
        System.out.println("Observações: "+ this.Observacoes);
        System.out.println("Disciplina: "+ this.getDisc().getNome());
        
        for(int i = 0; i < this.Aluno.size(); i++){
            System.out.println("Alunos: "+ this.Aluno.get(i).getNome());
        }    
    }
}
