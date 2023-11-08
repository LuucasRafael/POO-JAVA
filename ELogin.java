
public class ELogin {
private String Login,Senha;

public void setLogin(String Login) {
	if (Login.length()==0) {
	 throw new IllegalArgumentException("Login invalido");
	} else {
     this.Login = Login;
	}
}
public void setSenha(String Senha ) {
	if (Senha.length()==0) {
	 throw new IllegalArgumentException("Senha invalido");
	} else {
     this.Senha = Senha;
	}
}
public String Login() {
	return Login;
}
public String Senha() {
	return Senha;
}
}
