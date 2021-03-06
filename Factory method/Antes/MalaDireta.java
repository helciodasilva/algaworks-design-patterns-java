import java.util.List;

public class MalaDireta {

	public boolean enviaEmail(String nomeArquivo, String mensagem) {
		Contatos contatosRepositorio = new Contatos();
		List<Contato> contatos = contatosRepositorio.recuperaContatosCSV(nomeArquivo);
	
		System.out.println("Conectando no servidor SMTP...");
		System.out.println("Mensagem a ser envada: " + mensagem);
		System.out.println();
	
		for (Contato contato : contatos) {
			System.out.println("From: <contato@algaworks.com>");
			System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
			System.out.println(mensagem);
			System.out.println();
		}
		
		return true;
	}
	
}