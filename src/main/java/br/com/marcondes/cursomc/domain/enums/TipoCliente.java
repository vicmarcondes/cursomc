package br.com.marcondes.cursomc.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Física"), 
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private Integer cod;
	private String desc;
	
	private TipoCliente(Integer cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(x.getCod().equals(cod)) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
