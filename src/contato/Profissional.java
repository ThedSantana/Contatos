package contato;

public class Profissional extends Contato {
	
	private String telComercial;
	private String ramal;
	private String emailProfssional;
	private String empresa;
	private Endereco endereco ;
	
	public Profissional(){
		
		super();
		
	}

	
	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getTelComercial() {
		return telComercial;
	}

	public void setTelComercial(String telComercial) {
		this.telComercial = telComercial;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public String getEmailProfssional() {
		return emailProfssional;
	}

	public void setEmailProfssional(String emailProfssional) {
		this.emailProfssional = emailProfssional;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((emailProfssional == null) ? 0 : emailProfssional.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((ramal == null) ? 0 : ramal.hashCode());
		result = prime * result
				+ ((telComercial == null) ? 0 : telComercial.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profissional other = (Profissional) obj;
		if (emailProfssional == null) {
			if (other.emailProfssional != null)
				return false;
		} else if (!emailProfssional.equals(other.emailProfssional))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (ramal == null) {
			if (other.ramal != null)
				return false;
		} else if (!ramal.equals(other.ramal))
			return false;
		if (telComercial == null) {
			if (other.telComercial != null)
				return false;
		} else if (!telComercial.equals(other.telComercial))
			return false;
		return true;
	}
	
	
	
	
	

}
