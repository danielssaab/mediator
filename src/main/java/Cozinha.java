public class Cozinha implements Setor {

	private static Cozinha instancia = new Cozinha();

	private Cozinha() {}

	public static Cozinha getInstancia() {
		return instancia;
	}

	@Override
	public String prepararPedido(Pedido pedido) {
		pedido.setPreparado(true);
		return "A Cozinha está preparando o pedido: " + pedido.getDescricao();
	}
}
