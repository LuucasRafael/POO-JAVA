
public class cadastro {
	private	  String Nome,Email,Endereco,Telefone,Senha,Senha1;
	  
	public void setNome(String Nome) {
		if ((Nome.length() <2) || (Nome.length()> 30) ) {
			throw new IllegalArgumentException("Nome invalido");
		}else {
			this.Nome = Nome;
		}
	}
	public void setEmail(String Email) {
		if ((Email.length() <10) || (Email.length()> 30) ) {
			throw new IllegalArgumentException("Email invalido");
		}else {
			this.Email = Email;
		}
	}
	public void setEndereco(String Endereco) {
		if ((Endereco.length() <5) || (Endereco.length()> 30) ) {
			throw new IllegalArgumentException("Endere�o invalido");
		}else {
			this.Endereco = Endereco;
		}
	}
	public void setTelefone(String Telefone) {
		if ((Telefone.length() <9) || (Telefone.length()> 15) ) {
			throw new IllegalArgumentException("Telefone invalido");
		}else {
			this.Telefone = Telefone;
		}
	}
	public void setSenha(String Senha) {
		if ((Senha.length() <6) || (Senha.length()> 30) ) {
			throw new IllegalArgumentException("Senha invalido");
		}else {
			this.Senha = Senha;
		}
	}
	public void setSenha1(String Senha1) {
		if ((Senha1.length() <6) || (Senha1.length()> 30) ) {
			throw new IllegalArgumentException("Senha invalido");
		}else {
			this.Senha1 = Senha1;
		}
	}
	
	public String getNome() {
		return this.Nome;
	}
	public String getEmail() {
		return this.Email;
	}
	public String getEndereco() {
		return this.Endereco;
	}
	public String getTelefone() {
		return this.Telefone;
	}
	public String getSenha() {
		return this.Senha;
	}
	public String getSenha1() {
		return this.Senha1;
	}
	
	
}
