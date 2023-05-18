package org.example;

import java.util.ArrayList;

public class tarefa {

    public ArrayList<String> Aluno;
    public String Disciplina;
    public String Tema;
    public String Descricao;
    public date data;
    public float nota;
    public String Fonte;
    public String Observacoes;
//---------------------------------------------------------------------

    //Getters e Setters

    public ArrayList<String> getAluno() {
        return Aluno;
    }

    public void setAluno(ArrayList<String> aluno) {
        Aluno = aluno;
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

    public void DeletarTarefa(){
        tarefa t = new tarefa();    // Cria um novo objeto tarefa;
        t = null;                   // O deixa nulo.
    }

    public void AdicionarAluno(ArrayList<String>Aluno){
        setAluno(Aluno);       //Seta o aluno ao ArrayList Aluno da classe tarefa.
    }

    public void RemoverAluno(ArrayList<String>Aluno){
        this.getAluno(aluno) = null; //Obtém o nome do aluno e o limpa.
    }
}
