public class Pedido {
	private String descricao;
	private boolean preparado;

	public Pedido(String descricao) {
		this.descricao = descricao;
		this.preparado = false;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isPreparado() {
		return preparado;
	}

	public void setPreparado(boolean preparado) {
		this.preparado = preparado;
	}
}
