package trabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
      
      Scanner input = new Scanner(System.in);  
        
      Pessoa P = new Pessoa();
      Aluno A = new Aluno();
      Aluno B = new Aluno();
      Aluno C = new Aluno();
      Aluno Dd = new Aluno();
      Aluno E = new Aluno();
      Aluno F = new Aluno();
      Professor Pp = new Professor();
      Tarefa T = new Tarefa();
      Disciplina D = new Disciplina();
      
      P.setNome("Giovanni");
       
      P.setContato("giovani69@gmail.com");
       
                                                        // Inserção de Alunos
      A.setNome("Giovanni");
        
      A.setContato("giovanniak47@gmail.com");
      
      B.setNome("Gustavo");
        
      B.setContato("tavinhobr222@gmail.com");
      
      C.setNome("Andrei");
        
      C.setContato("andreiboladao@gmail.com");
      
      Dd.setNome("Renan");
        
      Dd.setContato("renan06@gmail.com");
      
      E.setNome("Felipe");
        
      E.setContato("felipe07@gmail.com");
      
      F.setNome("Jão");
        
      F.setContato("furry@gmail.com");
                                                        // Inserção de Alunos
      
      
      T.setNota(10);
      T.setDescricao("Tarefa de Programação");
      T.setFonte("https://github.com/rafaelstojoao/projetoOOP");
      T.setTema("Orientação a Objetos");
      T.setObservacoes("Muito Dahora e joia demais =D");
        
      
        System.out.println("Insira uma data: ");
        String data = input.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        T.data = formatter.parse(data);
      
        
      Pp.setNome("Rafael");
       
        
      Pp.setContato("rafafafel@terra.com");
           
      
      T.AdicionarAluno(A);
      T.AdicionarAluno(B);
      T.AdicionarAluno(C);
      T.AdicionarAluno(Dd);
      T.AdicionarAluno(E);
      T.AdicionarAluno(F);
        
      /*T.DeletarAluno(0);
        System.out.println(T.getAluno(0).getNome());*/
    
      D.setNome("OOP");
     
        
      D.setDescricao("Matéria de Programação Orientada a Objetos");
        
        
      D.setProfessor(Pp);
        
      
      T.setDisc(D);
      
      T.ImprimeTarefa();
    
        
        
    }
}
