package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class ContaPoupanca implements IConta {

	private String numero;
	private BigDecimal saldo;
	private LocalDateTime dataAbertura;
	private boolean status;

	public ContaPoupanca() {
	}

	public ContaPoupanca(String numero) {
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
		ContaPoupanca other = (ContaPoupanca) obj;
		return Objects.equals(numero, other.numero);
	}

	@Override
	public boolean realizarSaque(BigDecimal quantia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BigDecimal consultarSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean realizarDeposito(BigDecimal quantia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void realizarTransferencia(IConta destino, BigDecimal quantia) {
		// TODO Auto-generated method stub

	}

}
