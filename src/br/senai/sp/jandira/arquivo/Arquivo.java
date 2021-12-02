package br.senai.sp.jandira.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Arquivo {

	//método gravar dados
	public boolean gravar(String posicao, String texto){
		
		
		try {			
			//obj arquivo
			FileWriter arquivo = new FileWriter(posicao);
			
			//obj texto
			PrintWriter txtEscrito = new  PrintWriter(arquivo);
			
			//comados para abrir txtEscrito e fechar txtEscrito
			txtEscrito.append(texto);
			txtEscrito.close();
			
			return true;
						
		}catch (IOException e) {
			
			System.out.println("teste de arquivo criado pelo eclipse" + e.getMessage());
			return false;
			
		}
		
	}
		
				
		//método
		public String ler(String caminho){
			
			String conteudo="";
			
					
			try {
				
				//obj arquivo
				FileReader arquivo = new FileReader(caminho); 
				
				//obj lerArquivo
				BufferedReader lerArquivo = new BufferedReader(arquivo);
				
				String linha= ""; //?? o que faz essa váriavel linha ??
				
				//comondo para linha receber lerArquivo e para cada linha do obj LerArquivo ser lida
				linha=lerArquivo.readLine(); // ?? por que essa linha está antes do loop? qual a sua função???
				
				//loop para ler (percorrer) cada linha do texto
				while(linha != null) {
					
					conteudo += linha + "\n";
					linha = lerArquivo.readLine();
					
				}
				
				arquivo.close();
				return conteudo;	
				
				
			} catch (Exception e) {
				
				System.out.println("ERRO: " + e.getMessage());
				return "";
			}
			
			
		}
		
	}
	
