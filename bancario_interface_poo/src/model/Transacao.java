package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class Transacao {

	private long id;
	private BigDecimal quantia;
	private LocalDateTime dataTransacao;
	private String tipoTransacao;
	private IConta destino;

	public Transacao(BigDecimal quantia, LocalDateTime dataTransacao, String tipoTransacao, IConta destino) {
		this.id = new Random().nextLong();
		this.quantia = quantia;
		this.dataTransacao = dataTransacao;
		this.tipoTransacao = tipoTransacao;
		this.destino = destino;
	}

	public Transacao() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getQuantia() {
		return quantia;
	}

	public void setQuantia(BigDecimal quantia) {
		this.quantia = quantia;
	}

	public LocalDateTime getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(LocalDateTime dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public IConta getDestino() {
		return destino;
	}

	public void setDestino(IConta destino) {
		this.destino = destino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacao other = (Transacao) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Transacao [id=" + id + ", quantia=" + quantia + ", dataTransacao=" + dataTransacao + ", tipoTransacao="
				+ tipoTransacao + ", destino=" + destino + "]";
	}
}
