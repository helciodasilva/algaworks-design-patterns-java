import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDireta();
		String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail");

		boolean status = malaDireta.enviaEmail("contatos.csv", mensagem);
		System.out.println(status);
	}

}