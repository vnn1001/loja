
import java.util.Scanner;


public class Principal {
        
    public static void main(String[] args){
    
    Carro carro = new Carro();
    Carro carro2 = new Carro();
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Nome: ");
    carro.nome = scan.next();
    
    System.out.print("Marca: ");
    carro.marca = scan.next();
    
    System.out.print("Cor: ");
    carro.cor = scan.next();
    
    System.out.print("Fabricacao: ");
    carro.fabricacao = scan.next();
    
    System.out.print("Largura: ");
    carro.largura = scan.next();
    
    System.out.print("Peso: ");
    carro.peso = scan.next();
    
            
 
    System.out.println("Nome:"+carro.nome);
    System.out.println("Marca:"+carro.marca);
    System.out.println("Cor:"+carro.cor);
    System.out.println("Fabricacao:"+carro.fabricacao);
    System.out.println("Largura:"+carro.largura);
    System.out.println("Peso:" +carro.peso+"\n");
    
    
    System.out.print("Nome: ");
    carro2.nome = scan.nextLine();
    
    System.out.print("Marca: ");
    carro2.marca = scan.nextLine();
    
    System.out.print("Cor: ");
    carro2.cor = scan.nextLine();
    
    System.out.print("Fabricacao: ");
    carro2.fabricacao = scan.nextLine();
    
    System.out.print("Largura: ");
    carro2.largura = scan.nextLine();
    
    System.out.print("Peso: ");
    carro2.peso = scan.nextLine();
    
    
    
    System.out.println("Nome:"+carro2.nome);
    System.out.println("Marca:"+carro2.marca);
    System.out.println("Cor:"+carro2.cor);
    System.out.println("Fabricacao:"+carro2.fabricacao);
    System.out.println("Largura:"+carro2.largura);
    System.out.println("Peso:"+carro2.peso+"\n");
    
  }
}
