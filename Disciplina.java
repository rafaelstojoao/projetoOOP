package trabalho;

public class Disciplina {
    private Professor professor = new Professor();
    private String nome;
    private String termo;
    private String descricao;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void AdicionarProfessor(Professor professor) {
        this.setProfessor(professor);
    }
	
    public void setTermo(String termo){
		this.termo = termo;
	}

    public String getTermo(){
		return this.termo;
	}

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
	
}
