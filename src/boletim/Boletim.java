//feito por Isabele Silveira

package boletim;

public class Boletim {

	public static void main(String[] args) {
		
		aluno a1 = new aluno();
		a1.nome = "Joãozinho";
		a1.nota1 = 7f;
		a1.nota2 = 5f;
		a1.nota3 = 9f;
		a1.media = ((a1.nota1 + a1.nota2 + a1.nota3 + a1.nota4)/4);	
		
		professor p1 = new professor();
		p1.nome = "Ricardo";
		p1.disciplina = "português";
		
		
		System.out.println(a1.nome + " ficou com media " + a1.media 
		+ " na disciplina de " + p1.disciplina + " do professor " + p1.nome);
		
	
	}

}
