package model;

import java.math.BigDecimal;

public interface IConta {

	public boolean realizarSaque(BigDecimal quantia);

	public BigDecimal consultarSaldo();

	public boolean realizarDeposito(BigDecimal quantia);

	public void realizarTransferencia(IConta destino, BigDecimal quantia);

}
