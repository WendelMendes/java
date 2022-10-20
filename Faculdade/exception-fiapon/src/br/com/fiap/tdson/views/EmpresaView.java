package br.com.fiap.tdson.views;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

import br.com.fiap.tdson.business.EmpresaBusiness;
import br.com.fiap.tdson.exceptions.CnpjNaoEncontradoException;
import br.com.fiap.tdson.exceptions.PorteEmpresarialNaoEncontradoException;
import br.com.fiap.tdson.models.EmpresaModel;

public class EmpresaView {

	public static void main(String[] args) {
		

		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o CNPJ");
		String cnpj = s.nextLine();
		
		
		EmpresaBusiness empresaBusiness = new EmpresaBusiness();
		
		EmpresaModel empresaModel;

		
		
		try {
			
			empresaModel = empresaBusiness.buscaDadosEmpresarialReceitaFederal(cnpj);
			
			System.out.println("");
			System.out.println("");
			System.out.println("Empresa encontrada");
			System.out.println( empresaModel.getCpnj() );
			System.out.println( empresaModel.getRazaoSocial() );
			System.out.println( empresaModel.getCodigoNaturezaJuridica() );

			
			
		} catch ( CnpjNaoEncontradoException | PorteEmpresarialNaoEncontradoException e) {	
			
			System.out.println("CPNJ nao encontrado na base da receita federal");
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			
			System.out.println("Erro genérico");
			System.out.println(e.getClass());
			
		} finally {
			empresaBusiness = null;
			Date dataCorrente = new Date();
			System.out.println("Programa finalizado " + dataCorrente);
		}
			
			/*
			
		} catch (CnpjNaoEncontradoException e) {
			
			System.out.println("CPNJ nao encontrado na base da receita federal");
			
		} catch (PorteEmpresarialNaoEncontradoException e) {
			
			System.out.println("Existe uma falha no cadastro desse CPNJ, favor ligar em XXXXXXXX");
			
		}
		*/
		
		
		
	}
	
	
}
