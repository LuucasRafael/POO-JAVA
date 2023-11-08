
public class pessoa extends cadastro {
	private	String CNPJ,Atividade,Passaporte,Pais,CPF;
	 public void setCNPJ(String CNPJ) {
			if ((CNPJ.length() <14) || (CNPJ.length()> 18) ) {
				throw new IllegalArgumentException("CNPJ invalido");
			}else {
				this.CNPJ = CNPJ;
			}
	    }
	  public void setAtividade (String Atividade) {
		 if (Atividade.length()==0) {
			throw new IllegalArgumentException("Atividade Economica invalida");
		} else {
               this.Atividade = Atividade;   
		}
	 }
		 public void setPassaporte(String Passaporte) {
				if ((Passaporte.length() <8) || (Passaporte.length()> 8) ) {
					throw new IllegalArgumentException("Passaporte invalido");
				}else {
					this.Passaporte = Passaporte;
				}
		    }
		 public void setPais(String Pais) {
				if ((Pais.length() <3) || (Pais.length()> 29) ) {
					throw new IllegalArgumentException("Pais invalido");
				}else {
					this.Pais = Pais;
				}
		    }	
		    public void setCPF(String CPF) {
				if ((CPF.length() <11) || (CPF.length()> 14) ) {
					throw new IllegalArgumentException("CPF invalido");
				}else {
					this.CPF = CPF;
				}
		    }
		 
		 public String getCPF() {
				return this.CPF;
			}
		 
		 public String getPassaporte() {
				return this.Passaporte;
			}
		 public String getPais() {
				return this.Pais;
			}
	 
	 public String getCNPJ() {
			return this.CNPJ;
		}
	 public String getAtividade() {
		 return this.Atividade;
	 }
}
