import javax.swing.JOptionPane;

public class NovoClienteCadastrado {

	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
		String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem de novo cliente:");
		
		boolean status = malaDireta.enviaEmail(mensagem);
		
		JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
	}
	
}
