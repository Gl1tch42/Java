import java.util.Scanner;

public class Jetski extends Veiculo {
  boolean reboque;
  String casco;
  int potenciaMotor;
  double comDesconto;

  public Jetski(){
  }

  public Jetski(String ma, String casco, String mo, boolean reboque){
    super(ma,mo);
    this.casco = casco;
    this.reboque = reboque;
  }

  public Jetski(String i, String mo, boolean reboque){
    super(i, mo);
    this.reboque = reboque;
  }

  public Jetski(int n, String ma, boolean reboque, String casco){
    super(n,ma);
    this.reboque = reboque;
    this.casco = casco;
  }

  public Jetski(int v, String casco, int n){
    super(v,n);
    this.casco = casco;
  }

  public Jetski(String mo, String ma, double p, boolean reboque){
    super(mo,ma,p);
    this.reboque = reboque;
  }

  public Jetski(String mo, int v, boolean reboque){
    super(mo,v);
    this.reboque = reboque;
  }

  public Jetski(String ma, String casco, int n){
    super(ma,n);
    this.casco = casco;
  }

  public Jetski(String mo, int n, double p, String casco){
    super(mo,n,p);
    this.casco = casco;
  }

  public Jetski(String mo, int n, int v, boolean reboque, String casco){
    super(mo,n,v);
    this.reboque = reboque;
    this.casco =  casco;
  }

  public Jetski(boolean reboque, String ma, String casco, String i){
    super(ma,i);
    this.reboque = reboque;
    this.casco = casco;
  }

  public String getCasco(){
    return casco;
  }

  public void setCasco(String casco){
    this.casco = casco;
  }

  public boolean getReboque(){
    return reboque;
  }

  public void setReboque(boolean reboque){
    this.reboque = reboque;
  }

  public double getComDesconto(){
    return this.preco - (0.15 * this.preco);
 }


  public int getPotenciaMotor(){
    return potenciaMotor;
 }

 public void setPotenciaMotor(int potenciaMotor){
    this.potenciaMotor =  potenciaMotor;
 }
 

  public void cadastrar(){
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite a Marca do Jetski: ");
    setMarca(ler.nextLine());
    System.out.print("Digite o Modelo do Jetski: ");
    setModelo(ler.nextLine());
    System.out.print("Digite a Identificação do Jetski: ");
    setIdentificacao(ler.nextLine());
    System.out.print("Digite o Numero de Passageiros do Jetski: ");
    setNumeroPassageiros(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite a Velocidade Máxima do Jetski: ");
    setVelocidadeMax(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite o Preco  do Jetski: ");
    setPreco(Double.parseDouble(ler.nextLine()));
    System.out.print("Digite a Cor do Jetski: ");
    setCor(ler.nextLine());
    System.out.print("Digite a Altura Calado do Jetski: ");
    setAlturaCalado(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite o Tipo de Casco do Jetski: ");
    setCasco(ler.nextLine());
    System.out.print("Digite a Potencia do motor do Jetski: ");
    setPotenciaMotor(Integer.parseInt(ler.nextLine()));
    System.out.print("Tem Reboque no Jetski ?: ");
    char resp;
    resp = ler.next().charAt(0);
    if(resp == 's' || resp == 'S'){
      setReboque(true);
      System.out.println("Tem Reboque");
    }else{
      setReboque(false);
      System.out.println("Não tem Reboque");
    }
  }

  public void imprimir(){
    System.out.println("Marca do Veiculo: " + getMarca());
    System.out.println("Modelo do Veiculo: " + getModelo());
    System.out.println("Identificação do Veiculo: " + getIdentificacao());
    System.out.println("Número de passageiros do Veiculo: " + getNumeroPassageiros());
    System.out.println("Velocidade Máxima do Veiculo: " + getVelocidadeMax());
    System.out.println("Preço do Veiculo: " + getPreco());
    System.out.println("A cor do Veiculo é: " + getCor());
    System.out.println("A altura calado do Veiculo: " + getAlturaCalado());
    System.out.println("Valor com desconto do Jetski é: " + getComDesconto());
    System.out.println("Tipo de Casco do Jetski: " + getCasco());
    System.out.println("A potencia do motor do Jetski é:"+ getPotenciaMotor());
    if(getReboque() == true)
    System.out.println("Tem Reboque");
      else
    System.out.println("Nao tem Reboque");
  }
}
