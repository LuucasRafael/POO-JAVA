
public class PCliente {
private	String Nome, Produto,Preco, Email,Contato,FE,IAD,DIP,DFP;

public void setNome(String Nome) {
	if (Nome.length() ==0) {
	 throw new IllegalArgumentException("Nome invalido");
	} else {
     this.Nome = Nome;
	}
}
public void setProduto(String Produto) {
	if (Produto.length()==0) {
	 throw new IllegalArgumentException("Produto invalido");
	} else {
     this.Produto = Produto;
	}
}
public void setPreco(String Preco) {
	if (Preco.length()==0) {
	 throw new IllegalArgumentException("Valor invalido");	
	} else {
     this.Preco = Preco;
	}
}
public void setEmail(String Email) {
	if (Email.length()==0) {
	 throw new IllegalArgumentException("Email invalido");
	} else {
     this.Email = Email;
	}
}
public void setContato(String Contato) {
	if ((Contato.length() <9) || (Contato.length()> 15)) {
	 throw new IllegalArgumentException("Contato invalido");
	} else {
     this.Contato = Contato;
	}
}
public void setFE(String FE) {
	if (FE.length()==0) {
	 throw new IllegalArgumentException("Funcionario invalido");
	} else {
     this.FE = FE;
	}
}
public void setIAD(String IAD) {
	this.IAD = IAD;
}
public void setDIP(String DIP) {
	if ((DIP.length()<8) || (DIP.length()>10)) {
	 throw new IllegalArgumentException("Data Inical invalido");	
	} else {
     this.DIP = DIP;
	}
}
public void setDFP(String DFP) {
	if ((DIP.length()<8) || (DIP.length()>10)) {
	 throw new IllegalArgumentException("Data Final invalido");	
	} else {
	 this.DFP = DFP;
	}
}

public String getNome() {
	return this.Nome;
}
public String getEmail() {
	return this.Email;
}
public String getProduto() {
	return this.Produto;
}
public String getPreco() {
	return this.Preco;
}
public String getContato() {
	return this.Contato;
}
public String getFE() {
	return this.FE;
}
public String getDIP() {
	return this.DIP;
}
public String getIAD() {
	return this.IAD;
}
public String getDFP() {
	return this.DFP;
}
}
