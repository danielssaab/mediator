public class Pessoa {

	public String fazerPedido(String descricao) {
		return Atendimento.getInstancia().fazerPedido(descricao);
	}
}
