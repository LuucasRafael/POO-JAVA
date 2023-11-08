
public class EntTabela {
private String SBase,DiasT,SReceber,DSalario,ValorR,Folga;

public void setSBase(String SBase) {
	if (SBase.length()==0) {
	 throw new IllegalArgumentException("Salario Base invalido");	
	} else {
     this.SBase = SBase;
	}
}
public void setDiasT(String DiasT) {
	if (DiasT.length()==0) {
	 throw new IllegalArgumentException("Dias Trabalhados invalidos");	
	} else {
     this.DiasT = DiasT;
	}
}
public void setSReceber(String SReceber) {
	if (SReceber.length()==0) {
	 throw new IllegalArgumentException("Salario invalido");	
	} else {
     this.SReceber = SReceber;
	}
}
public void setDSalario(String DSalario) {
	if (DSalario.length()==0) {
	 throw new IllegalArgumentException("Desconto invalido");	
	} else {
     this.DSalario = DSalario;
	}
}
public void setValorR(String ValorR) {
	if (ValorR.length()==0) {
	 throw new IllegalArgumentException("Valor invalido");	
	} else {
     this.ValorR = ValorR;
	}
}
public void setFolga(String Folga) {
	if (Folga.length()==0) {
	 throw new IllegalArgumentException("Folga invalida");	
	} else {
     this.Folga = Folga;
	}
}

public String getSBase() {
	return this.SBase;
}
public String getDiasT() {
	return this.DiasT;
}
public String getSReceber() {
	return this.SReceber;
}
public String getDSalario() {
	return this.DSalario;
}
public String getValorR() {
	return this.ValorR;
}
public String getFolga() {
	return this.Folga;
}
}
