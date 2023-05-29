package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.produtos;

public class Program {

	public static void main(String[] args) {
		
		List<produtos> prod = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> line = new ArrayList<String>();
		String path = sc.nextLine();
		String t;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			
			String pr = br.readLine();
			
			while(pr!=null) {
				String[] produto = pr.split(","); 
				String nome = produto[0];
				Double valor = Double.parseDouble(produto[1]);
				int qtde = Integer.parseInt(produto[2]);
				
				prod.add(new produtos(nome,valor,qtde));
				
				pr = br.readLine();
				
				
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\summary.csv"))){
			for(produtos prods : prod) {
				
				Double total = prods.getValor() * prods.getQtde();
				bw.write(prods.getNome() + ", " + total );
				bw.newLine();
				
				
			}
			Runtime.getRuntime().exec("explorer C:\\temp\\summary.csv");

			}
			
			
			
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Digite um caminho: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println(path.getTotalSpace());
		
		*/
		
		/*File[] pastas = path.listFiles(File::isDirectory);
		File[] files = path.listFiles(File::isFile);
		System.out.println("Pastas: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		System.out.println("Arquivos: ");
		for(File file : files) {
			System.out.println(file);
		}
		*/
		
		
	/*	List<String> lines = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		//String [] lines = new String[] {"Testando arquivo"};
		
		
		
		String path = "c:\\temp\\vagner.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			int j =0;
			while(j != 1){
				
				System.out.print("Escreva: ");

				lines.add(sc.nextLine());
				
				System.out.println("Continuar? ('0' para sim, '1' para não)");
				j = sc.nextInt();
				sc.nextLine();
				
			}
			for(int i =0; i<lines.size(); i++) {
				bw.write(lines.get(i));
				bw.newLine();
			}
			
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String path = "c:\\temp\\texto.txt";
		List<String> line1 = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			
			String line = br.readLine();
			line1.add(line);
			while(line != null) {
				
				line = br.readLine();		
				line1.add(line);
			}
			
			for(int i=0; i<line1.size(); i++) {
				if(line1.get(i) != null) {
				System.out.println(line1.get(i));
				}
			}
			
			
			
		}catch(IOException e){
			System.out.println("Error: " +  e.getMessage());
		}finally {
		
		}*/
		
		
}
	}


