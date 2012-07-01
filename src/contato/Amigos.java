package contato;

import java.util.Calendar;

public class Amigos extends Contato {
	
	private Calendar dtNascimento;
	private String twiter;
	private Endereco endereco;
	
	public Amigos(){
		super();
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getTwiter() {
		return twiter;
	}

	public void setTwiter(String twiter) {
		this.twiter = twiter;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dtNascimento == null) ? 0 : dtNascimento.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((twiter == null) ? 0 : twiter.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amigos other = (Amigos) obj;
		if (dtNascimento == null) {
			if (other.dtNascimento != null)
				return false;
		} else if (!dtNascimento.equals(other.dtNascimento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (twiter == null) {
			if (other.twiter != null)
				return false;
		} else if (!twiter.equals(other.twiter))
			return false;
		return true;
	}
	
	
	
	

}
