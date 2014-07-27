package refinado;

import java.io.Serializable;

@Cabecalho(	
		instituicao = "Universidade",
		projeto = "Sistema de avaliação",
		dataCriacao = "26/07/2014",
		criador = "Murilo Nascimento",
		revisao = 2
)

@ErrosCorrigidos(erros = {"001","002"})

@SuppressWarnings("serial")
public class Anotacao implements Serializable{
	
	
	@Deprecated
	public void anotar(){
		
	}
	
	@Override
	public String toString(){
		return null;
	}
	
	
}
