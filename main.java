import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		String Nome = null,Email,Endereco,Telefone,Senha,Senha1,Login,FJ = null,CPF = null,CNPJ = null,Passaporte = null,Pais = null,Atividade = null;
		
		System.out.println("voce e um Cliente ou um Funcionario");
		System.out.println("caso seja Cliente digite C,caso seja funcionario digite F");
		FJ = tec.nextLine();
		if (FJ.equals("C")|| FJ.equals("c")) {
			 System.out.println("voce e uma pessoa fisica, juridica ou estrangeira?");
				System.out.println("caso seja pessoa fisica digite F, caso seja pessoa juridica digite J, caso seja uma pessoa estrangeira digite E");
			    FJ=tec.nextLine();
				
				if (FJ.equals("F")||FJ.equals("f")) {
					 pessoa pessoa = new pessoa();
				System.out.println("Nome");
				 Nome = tec.nextLine();
				System.out.println();
				
				System.out.println("CPF");
				 CPF = tec.nextLine();
			    System.out.println();
			    
				}else if(FJ.equals("J")||FJ.equals("j")){
				
					System.out.println("Nome da empresa");
			     Nome = tec.nextLine();
			    System.out.println();
			    
			    System.out.println("Atividade Economica");
			    Atividade = tec.nextLine();
			    System.out.println();
			    
				System.out.println("CNPJ");
			    CNPJ = tec.nextLine();
			    System.out.println();
			    
				}else if(FJ.equals("E")||FJ.equals("e")){
			   
			   System.out.println("Nome");
			    Nome = tec.nextLine();
			   System.out.println();
					
			   System.out.println("Numero do Passaporte");
			    Passaporte = tec.nextLine();
			   System.out.println();
			   
			   System.out.println("Pais de Origem");
			    Pais = tec.nextLine();
			   System.out.println();	
				}
			    
			    System.out.println("Email");
			    Email = tec.nextLine();
			    System.out.println();

			    System.out.println("Endereco");
			    Endereco = tec.nextLine();
			    System.out.println();
			    
			    System.out.println("Telefone");
			    Telefone = tec.nextLine();
			    System.out.println();
			    
			    System.out.println("Crie uma Senha");
			    Senha = tec.nextLine();
			    System.out.println();
			    
			    System.out.println("Confirme sua Senha");
			    Senha1 = tec.nextLine();
			    System.out.println();
			    
			 pessoa pessoa = new pessoa();
	       try {
	    	  
	    	   pessoa.setNome(Nome);
	    	   pessoa.setEmail(Email);
	    	   pessoa.setEndereco(Endereco);
	    	   pessoa.setTelefone(Telefone);
	    	   pessoa.setSenha(Senha);
	    	   pessoa.setSenha1(Senha1);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	       if (FJ.equals("F")||FJ.equals("f")) {
			pessoa.setCPF(CPF);
		}else if(FJ.equals("J")||FJ.equals("j")){
			pessoa.setCNPJ(CNPJ);
			pessoa.setAtividade(Atividade);
		}else if(FJ.equals("E")||FJ.equals("e")){
			pessoa.setPassaporte(Passaporte);
			pessoa.setPais(Pais);}
	       
	       if (Senha.equals(Senha1)) {
			System.out.println("Cadastro Efetuado Com Secesso");
		} else {
			throw new IllegalArgumentException("Senhas Diferentes");
		}
			
		System.out.println("     LOGIN    ");
		
		System.out.println("Login");
	    Login = tec.nextLine();
	    System.out.println();
	    
	    System.out.println("Senha");
	    Senha = tec.nextLine();
	    System.out.println();
	    
	    ELogin ELogin = new ELogin();
	    ELogin.setLogin(Login);
	    ELogin.setSenha(Senha);
	    System.out.println("seja Bem-Vindo(a)");
	    
	    System.out.println("       HOME       ");
	    
	    System.out.println("Voce deseja Criar um Projeto?");
	    System.out.println("sim - 1");
	    System.out.println("nao - 2");
		FJ = tec.nextLine();	 
	    if (FJ.equals("1")) {
	    	
	    	String Produto,Preco,Contato,FE,IAD,DIP,DFP;
			
	    	System.out.println("Solicitação de Criaçâo de Produto");
	    			
	    			System.out.println("Informações do Cliente:");
	    			
	    			System.out.println("Nome ");
	    			Nome = tec.nextLine();
	    			System.out.println();
	    			
	    			System.out.println("E-mail");
	    			Email = tec.nextLine();
	    			System.out.println();
	    			
	    			System.out.println("Telefone");
	    			Contato = tec.nextLine();
	    			System.out.println();
	    			
	    			System.out.println("Informações do Produto:");
	    			
	    			System.out.println("Nome do Produto");
	    			Produto = tec.nextLine();
	    			System.out.println();
	    			
	    			System.out.println("Valor do Produto");
	    			Preco = tec.nextLine();
	    			System.out.println();
	    			
	    			System.out.println("Funcionario Encarregado");
	    			FE = tec.nextLine();
	    			System.out.println();
	    			
	    			System.out.println("Informaçoes Adicionais");
	    		    IAD = tec.nextLine();
	    		    System.out.println();
	    		    
	    		    System.out.println("Data Inicio do Projeto");
	    		    DIP = tec.nextLine();
	    		    System.out.println();
	    		    
	    		    System.out.println("Data Fim do Projeto");
	    			DFP = tec.nextLine();
	    			System.out.println();
	    			
	    			PCliente PCliente = new PCliente();
	    			PCliente.setNome(Nome);
	    			PCliente.setEmail(Email);
	    			PCliente.setContato(Contato);
	    			PCliente.setProduto(Produto);
	    			PCliente.setPreco(Preco);
	    			PCliente.setFE(FE);
	    			PCliente.setIAD(IAD);
	    			PCliente.setDIP(DIP);
	    			PCliente.setDFP(DFP);
	    			
	    			System.out.println("Projeto Criado Com Sucesso");
	    				
	    
	    }else if (FJ.equals("2")) {
	    	System.out.println("deseja encerrar sessao");
			FJ = tec.nextLine();
			if (FJ.equals("Sim")||FJ.equals("sim")) {
			System.out.println("sessao encerada com secesso");	
			}	
		}
	    
		//Fim
		} else if (FJ.equals("F")||FJ.equals("f")) {
			String Salario,Cargo;
			System.out.println("voce e uma pessoa fisica ou estrangeira?");
			System.out.println("caso seja pessoa fisica digite F, caso seja uma pessoa estrangeira digite E");
		    FJ=tec.nextLine();
			
			if (FJ.equals("F")||FJ.equals("f")) {
			System.out.println("Nome");
			 Nome = tec.nextLine();
			System.out.println();
			
			System.out.println("CPF");
		     CPF = tec.nextLine();
		    System.out.println();
		    
			}else if(FJ.equals("E")||FJ.equals("e")){
		   System.out.println("Nome");
		    Nome = tec.nextLine();
		   System.out.println();
		    
		   System.out.println("Numero do Passaporte");
		    Passaporte = tec.nextLine();
		   System.out.println();
		   
		   System.out.println("Pais de Origem");
		    Pais = tec.nextLine();
		   System.out.println();	
			}
		    
		    System.out.println("Email");
		    Email = tec.nextLine();
		    System.out.println();

		    System.out.println("Endereco");
		    Endereco = tec.nextLine();
		    System.out.println();
		    
		    System.out.println("Telefone");
		    Telefone = tec.nextLine();
		    System.out.println();
		    
		    System.out.println("cargo");
		    Cargo = tec.nextLine();
		    System.out.println();
		    
		    System.out.println("Salario");
		    Salario = tec.nextLine();
		    System.out.println();
		    
		    System.out.println("Crie uma Senha");
		    Senha = tec.nextLine();
		    System.out.println();
		    
		    System.out.println("Confirme sua Senha");
		    Senha1 = tec.nextLine();
		    System.out.println();
		funcio funcio = new funcio();
    try {
 	   funcio.setNome(Nome);
 	   funcio.setEmail(Email);
 	   funcio.setEndereco(Endereco);
 	   funcio.setTelefone(Telefone);
 	   funcio.setSenha(Senha);
 	   funcio.setSenha1(Senha1);
 	   funcio.setCargo(Cargo);
 	   funcio.setSalario(Salario);
	} catch (IllegalArgumentException ex) {
		System.out.println(ex.getMessage());
	}
    if (FJ.equals("F")||FJ.equals("f")) {
		funcio.setCPF(CPF);
	}else if(FJ.equals("E")||FJ.equals("e")){
		funcio.setPassaporte(Passaporte);
		funcio.setPais(Pais);
	}	
    
    if (Senha.equals(Senha1)) {
		System.out.println("Cadastro Efetuado Com Secesso");
	} else {
		throw new IllegalArgumentException("Senhas Diferentes");
	}	
	
    System.out.println("      LOGIN FUNCIONARIO      ");
    
    System.out.println("Login");
    Login = tec.nextLine();
    System.out.println();
    
    System.out.println("Senha");
    Senha = tec.nextLine();
    System.out.println();
    
    ELogin ELogin = new ELogin();
    ELogin.setLogin(Login);
    ELogin.setSenha(Senha);
    System.out.println("seja Bem-Vindo(a)");
    
    System.out.println("       HOME       ");
    
    System.out.println("Voce deseja acessar a Tabela de funcionarios?");
    System.out.println("sim - 1");
    System.out.println("nao - 2");
	FJ = tec.nextLine();	 
    if (FJ.equals("1")) {
    	 String SBase,DiasT,SReceber,DSalario,ValorR,Folga;
    	    
    	    System.out.println("Entrada De Salario E Folga");
    	    
    	    System.out.println("Salário Base");
    	    SBase = tec.nextLine();
    	    System.out.println();
    	    
    	    System.out.println("Dias Trabalhado");
    	    DiasT = tec.nextLine();
    	    System.out.println();
    	    
    	    System.out.println("Salário a Receber");
    	    SReceber = tec.nextLine();
    	    System.out.println();
    	    
    	    System.out.println("Desconto Salário");
    	    DSalario = tec.nextLine();
    	    System.out.println();
    	    
    	    System.out.println("valor a Receber");
    	    ValorR = tec.nextLine();
    	    System.out.println();
    	    
    	    System.out.println("Folga");
    	    Folga = tec.nextLine();
    	    System.out.println();
    	    
    	    EntTabela EntTabela = new EntTabela();
    	    EntTabela.setSBase(SBase);
    	    EntTabela.setDiasT(DiasT);
    	    EntTabela.setSReceber(SReceber);
    	    EntTabela.setDSalario(DSalario);
    	    EntTabela.setValorR(ValorR);
    	    EntTabela.setFolga(Folga);
    	    
    	    
	} else if (FJ.equals("2")) {
		System.out.println("deseja encerrar sessao");
		FJ = tec.nextLine();
		if (FJ.equals("Sim")||FJ.equals("sim")) {
		System.out.println("sessao encerrada com secesso");	
		}
	}
		
		//fim}{

		}
		   
	}

}
