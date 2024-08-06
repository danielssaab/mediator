import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

	@Test
	void deveFazerPedido() {
		Cliente cliente = new Cliente();
		assertEquals("Atendimento recebeu seu pedido.\nA Cozinha está preparando seu pedido conforme descrição a seguir.\n" +
				">>A Cozinha está preparando o pedido: Pizza de pepperoni",
			cliente.fazerPedido("Pizza de pepperoni"));
	}

	@Test
	void deveFazerPedidoOutroTipo() {
		Cliente cliente = new Cliente();
		assertEquals("Atendimento recebeu seu pedido.\nA Cozinha está preparando seu pedido conforme descrição a seguir.\n" +
				">>A Cozinha está preparando o pedido: Lasanha de carne",
			cliente.fazerPedido("Lasanha de carne"));
	}

	@Test
	void deveVerificarSePedidoFoiPreparado() {
		Pedido pedido = new Pedido("Salada Caesar");
		Cozinha cozinha = Cozinha.getInstancia();
		cozinha.prepararPedido(pedido);
		assertTrue(pedido.isPreparado());
	}

	@Test
	void naoDevePrepararPedidoSemDescricao() {
		Pedido pedido = new Pedido("");
		Cozinha cozinha = Cozinha.getInstancia();
		String resultado = cozinha.prepararPedido(pedido);
		assertEquals("A Cozinha está preparando o pedido: ", resultado);
		assertTrue(pedido.isPreparado());
	}

	@Test
	void deveCobrirPedidosMultiplos() {
		Cliente cliente = new Cliente();
		assertEquals("Atendimento recebeu seu pedido.\nA Cozinha está preparando seu pedido conforme descrição a seguir.\n" +
				">>A Cozinha está preparando o pedido: Bolo de chocolate",
			cliente.fazerPedido("Bolo de chocolate"));

		assertEquals("Atendimento recebeu seu pedido.\nA Cozinha está preparando seu pedido conforme descrição a seguir.\n" +
				">>A Cozinha está preparando o pedido: Café",
			cliente.fazerPedido("Café"));

		assertEquals("Atendimento recebeu seu pedido.\nA Cozinha está preparando seu pedido conforme descrição a seguir.\n" +
				">>A Cozinha está preparando o pedido: Sanduíche de presunto",
			cliente.fazerPedido("Sanduíche de presunto"));
	}
}
