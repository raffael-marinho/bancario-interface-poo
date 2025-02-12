package model;

import java.math.BigDecimal;

public interface IConta {

	public final float TAXA_ADMINISTRATIVA = 0.02f;

	public boolean isStatus();

	public BigDecimal getSaldo();

	public void setSaldo(BigDecimal novoSaldo);

	public boolean realizarSaque(BigDecimal quantia);

	public BigDecimal consultarSaldo();

	public boolean realizarDeposito(BigDecimal quantia);

	public boolean realizarTransferencia(IConta destino, BigDecimal quantia);

}
