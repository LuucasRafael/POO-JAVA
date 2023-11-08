
public class funcio extends cadastro {
	private	String Cargo,Salario,CPF;private String Passaporte,Pais;
 public void setCargo(String Cargo) {
		if ((Cargo.length() <2) || (Cargo.length()> 14) ) {
			throw new IllegalArgumentException("Cargo invalido");
		}else {
			this.Cargo = Cargo;
		}
    }
 public void setSalario(String Salario) {
		if ((Salario.length() <4) || (Salario.length()> 14) ) {
			throw new IllegalArgumentException("Salario invalido");
		}else {
			this.Salario = Salario;
		}
 }  public void setCPF(String CPF) {
		if ((CPF.length() <11) || (CPF.length()> 14) ) {
			throw new IllegalArgumentException("CPF invalido");
		}else {
			this.CPF = CPF;
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
	 
	 public String getPassaporte() {
			return this.Passaporte;
		}
	 public String getPais() {
			return this.Pais;
		}
 
 public String getCPF() {
		return this.CPF;
	}
 
 public String getCargo() {
		return this.Cargo;
	}
 public String getSalario() {
		return this.Salario;
	}
}
