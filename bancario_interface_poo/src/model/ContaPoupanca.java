package model;

import java.math.BigDecimal;

public class ContaPoupanca implements IConta {

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
