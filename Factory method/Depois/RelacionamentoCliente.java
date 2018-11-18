import javax.swing.JOptionPane;

public class RelacionamentoCliente {

	public static void main(String[] args) {
		MalaDiretaCSV malaDireta = new MalaDiretaCSV("contatos.csv");
		String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
		
		boolean status = malaDireta.enviaEmail(mensagem);
		
		JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
	}
	
}
