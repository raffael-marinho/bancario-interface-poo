package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class ContaCorrente implements IConta {

	private String numero;
	private BigDecimal saldo;
	private LocalDateTime dataAbertura;
	private boolean status;

	public ContaCorrente() {
	}

	public ContaCorrente(String numero) {
		this.numero = numero;
		this.saldo = saldo.setScale(2);
		this.dataAbertura = LocalDateTime.now();
		this.status = true;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Objects.equals(numero, other.numero);
	}

	@Override
	public boolean realizarSaque(BigDecimal quantia) {
		// TODO Auto-generated method stub
		if (isStatus() && quantia.compareTo(this.saldo) == -1 && quantia.compareTo(new BigDecimal("0")) == -1) {
			this.saldo = this.saldo.subtract(quantia);
			return true;
		}
		return false;
	}

	@Override
	public BigDecimal consultarSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public boolean realizarDeposito(BigDecimal quantia) {
		// TODO Auto-generated method stub
		if (isStatus() && quantia.compareTo(new BigDecimal("0")) == 1) {
			this.saldo = this.saldo.add(quantia);
			return true;
		}
		return false;
	}

	@Override
	public boolean realizarTransferencia(IConta destino, BigDecimal quantia) {
		// TODO Auto-generated method stub
		if (destino instanceof ContaCorrente) {
			if (isStatus() && destino.isStatus() && quantia.compareTo(saldo) == -1
					&& quantia.compareTo(BigDecimal.ZERO) == 1) {
				this.saldo = this.saldo.subtract(quantia);
				destino.setSaldo(destino.getSaldo().add(quantia));
				return true;
			}
		} else if (destino instanceof ContaPoupanca) {
			if (isStatus() && destino.isStatus()
					&& quantia.add(quantia.multiply(new BigDecimal(IConta.TAXA_ADMINISTRATIVA))).compareTo(saldo) == -1
					&& quantia.compareTo(BigDecimal.ZERO) == 1) {
				this.saldo = this.saldo
						.subtract(quantia.add(quantia.multiply(new BigDecimal(IConta.TAXA_ADMINISTRATIVA))));
				destino.setSaldo(destino.getSaldo().add(quantia));
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status="
				+ status + "]";
	}
}
