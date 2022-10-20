package br.com.fiap.tdson.models;

import java.util.Date;

public class EmpresaModel {

	private int id;
	private String cpnj;
	private String razaoSocial;
	private String porte;
	private int codigoNaturezaJuridica;
	private Date dataSituacaoCadastral;
	private String endereco;
	
	
	public EmpresaModel() {
		super();
	}
	
	public EmpresaModel(int id, String cpnj, String razaoSocial, String porte, int codigoNaturezaJuridica,
			Date dataSituacaoCadastral, String endereco) {
		super();
		this.id = id;
		this.cpnj = cpnj;
		this.razaoSocial = razaoSocial;
		this.porte = porte;
		this.codigoNaturezaJuridica = codigoNaturezaJuridica;
		this.dataSituacaoCadastral = dataSituacaoCadastral;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getCodigoNaturezaJuridica() {
		return codigoNaturezaJuridica;
	}
	public void setCodigoNaturezaJuridica(int codigoNaturezaJuridica) {
		this.codigoNaturezaJuridica = codigoNaturezaJuridica;
	}
	public Date getDataSituacaoCadastral() {
		return dataSituacaoCadastral;
	}
	public void setDataSituacaoCadastral(Date dataSituacaoCadastral) {
		this.dataSituacaoCadastral = dataSituacaoCadastral;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
