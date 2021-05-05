import java.util.Scanner;

public class Iate extends Veiculo {
  int numeroTripulantes, numeroCabines;
  boolean piscina;
  double peso, desconto, cabinePorPessoa;

  public Iate() {
  }

  public Iate(String ma, String mo, int numeroTrip, int numeroCabine) {
    super(ma, mo);
    numeroTripulantes = numeroTrip;
    numeroCabines = numeroCabine;
  }

  public Iate(String i, String mo, boolean piscina) {
    super(i, mo);
    this.piscina = piscina;
  }

  public Iate(int n, boolean p, int numeroTripulantes, String ma) {
    super(n, ma);
    piscina = p;
    this.numeroTripulantes = numeroTripulantes;
  }

  public Iate(int v, int numeroCabines, int n) {
    super(v, n);
    this.numeroCabines = numeroCabines;
  }

  public Iate(String mo, String ma, double p, int numeroCabines) {
    super(mo, ma, p);
    this.numeroCabines = numeroCabines;
  }

  public Iate(String mo, int v, int numeroTripulantes) {
    super(mo, v);
    this.numeroTripulantes = numeroTripulantes;
  }

  public Iate(String ma, boolean piscina, int n) {
    super(ma, n);
    this.piscina = piscina;
  }

  public Iate(String mo, int n, double p, int numeroCabines) {
    super(mo, n, p);
    this.numeroCabines = numeroCabines;
  }

  public Iate(String mo, int n, int v, boolean piscina, int numeroTripulantes) {
    super(mo, n, v);
    this.piscina = piscina;
    this.numeroTripulantes = numeroTripulantes;
  }

  public Iate(boolean piscina, String mo, int numeroTripulantes, String i) {
    super(mo, i);
    this.piscina = piscina;
    this.numeroTripulantes = numeroTripulantes;
  }

  public int getNumeroTripulantes() {
    return numeroTripulantes;
  }

  public void setNumeroTripulantes(int numeroTripulantes_) {
    numeroTripulantes = numeroTripulantes_;
  }

  public int getNumeroCabine() {
    return numeroCabines;
  }

  public void setNumeroCabine(int numeroCabines_) {
    numeroCabines = numeroCabines_;
  }

  public boolean getPiscina() {
    return piscina;
  }

  public void setPiscina(boolean piscina_) {
    piscina = piscina_;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso_) {
    peso = peso_;
  }

  public double getDesconto() {
    return this.preco - (0.10 * this.preco);
  }
  public double getCabinePorPessoa() {
    return cabinePorPessoa;
  }

  public void setCabinePorPessoa (int pessoas, int tripulantes, int cabines ) {
    this.cabinePorPessoa = (pessoas + tripulantes)/cabines;
  }

  public void cadastrar() {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite a Marca do iate: ");
    setMarca(ler.nextLine());
    System.out.print("Digite o Modelo do iate: ");
    setModelo(ler.nextLine());
    System.out.print("Digite a Identificação do iate: ");
    setIdentificacao(ler.nextLine());
    System.out.print("Digite o Numero de Passageiros do iate: ");
    setNumeroPassageiros(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite a Velocidade Máxima do iate: ");
    setVelocidadeMax(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite o Preco  do iate: ");
    setPreco(Double.parseDouble(ler.nextLine()));
    System.out.print("Digite a Cor do iate: ");
    setCor(ler.nextLine());
    System.out.print("Digite a Altura Calado do iate: ");
    setAlturaCalado(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite a Quantidade de Tripulantes do Iate: ");
    setNumeroTripulantes(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite a Quantidade de Cabines do Iate: ");
    setNumeroCabine(Integer.parseInt(ler.nextLine()));
    System.out.print("Digite o Peso do Iate: ");
    setPeso(Integer.parseInt(ler.nextLine()));
    System.out.print("Tem Piscina no Iate ? ");
    char resp;
    resp = ler.next().charAt(0);
    if (resp == 's' || resp == 'S') {
      setPiscina(true);
      System.out.println("Tem Piscina");
    } else {
      setPiscina(false);
      System.out.println("Não tem Piscina");
    }
    setCabinePorPessoa(getNumeroPassageiros(), getNumeroTripulantes(), getNumeroCabine());

  }

  public void imprimir() {
    System.out.println("Marca do iate: " + getMarca());
    System.out.println("Modelo do iate: " + getModelo());
    System.out.println("Identificação do iate: " + getIdentificacao());
    System.out.println("Número de passageiros do iate: " + getNumeroPassageiros());
    System.out.println("Velocidade Máxima do iate: " + getVelocidadeMax());
    System.out.println("Preço do iate: " + getPreco());
    System.out.println("A cor do iate é: " + getCor());
    System.out.println("A altura calado do iate: " + getAlturaCalado());
    System.out.println("Valor com desconto é: " + getDesconto());
    System.out.println("Número de Tripulantes do Iate: " + getNumeroTripulantes());
    System.out.println("Número de cabines do Iate:" + getNumeroCabine());
    System.out.println("Número de pessoas por cabine é: " + getCabinePorPessoa());
    System.out.println("O peso do Iate é: " + getPeso());
    if (getPiscina() == true)
      System.out.println("Tem Piscina");
    else
      System.out.println("Nao tem Piscina");
  }

  public void cabinePorPessoa(int pessoas_, int tripulantes_, int cabines_ ) {
    setCabinePorPessoa(pessoas_, tripulantes_, cabines_);
  }
}
