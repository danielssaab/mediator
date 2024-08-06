public class Atendimento {

	private static Atendimento instancia = new Atendimento();

	private Atendimento() {}

	public static Atendimento getInstancia() {
		return instancia;
	}

	public String fazerPedido(String descricao) {
		Pedido pedido = new Pedido(descricao);
		return "Atendimento recebeu seu pedido.\n" +
			"A Cozinha está preparando seu pedido conforme descrição a seguir.\n" +
			">>" + Cozinha.getInstancia().prepararPedido(pedido);
	}
}
