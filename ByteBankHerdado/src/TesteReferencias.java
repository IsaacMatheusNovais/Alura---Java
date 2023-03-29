
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Neji");
		String nome = g1.getNome();
		g1.setSalario(5000);
		controleBonificacao controle = new controleBonificacao();
		controle.registra(g1);
		System.out.println(controle.getSoma());
		
		System.out.println(controle.getSoma());
		
		EditorDeVideo ev = new EditorDeVideo();
		ev.setSalario(2500);
		controle.registra(ev);

		System.out.println(controle.getSoma());
	}
}
