package br.com.fiap.tdson.business;

import java.util.Date;
import java.util.List;

import br.com.fiap.tdson.exceptions.CnpjNaoEncontradoException;
import br.com.fiap.tdson.exceptions.PorteEmpresarialNaoEncontradoException;
import br.com.fiap.tdson.models.EmpresaModel;

public class EmpresaBusiness {

	
	public EmpresaModel buscaDadosEmpresarialReceitaFederal(String cnpj) 
			throws CnpjNaoEncontradoException, PorteEmpresarialNaoEncontradoException {
		
		// HttpCliente http = new HttpClient("www.receita.com.br/busca.asp?= + cnpj;
		
		if ( cnpj.equals("191") ) {
			
			throw new CnpjNaoEncontradoException("Nao foi possivel encontrar o CNPJ na base da RF");
			
		} else if ( cnpj.equals("292") )  {	
			
			throw new PorteEmpresarialNaoEncontradoException();
			
		} else {
		
			EmpresaModel empresaModel = new EmpresaModel();
			empresaModel.setCodigoNaturezaJuridica(265);
			empresaModel.setRazaoSocial("Rentalcenter");
			empresaModel.setEndereco("Rua 1, 120");
			empresaModel.setCpnj(cnpj);
			empresaModel.setPorte("N/A");
			empresaModel.setDataSituacaoCadastral(new Date());
			
			return empresaModel;
		}
	}
	
	
	public List<EmpresaModel> buscaDadosEmpresarilPorNome(String nome) {
		return null;
	}
	
}
