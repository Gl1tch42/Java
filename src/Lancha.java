import java.util.Scanner;

public class Lancha extends Veiculo {
   boolean banheiro;
   String tipoCasco;
   double desconto;
   int potenciaMotor;
   // Veiculo veiculo = new Veiculo();

   /** Metodos Construtores */
   public Lancha() {
   }

   public Lancha(String ma, String mo, String tipoCasco_) {
      super(ma, mo);
      tipoCasco = tipoCasco_;
   }

   public Lancha(String id, String mo, boolean banheiro_) {
      super(id, mo);
      banheiro = banheiro_;
   }

   public Lancha(int v, String tipoCasco_, String ma, boolean banheiro_) {
      super(v, ma);
      tipoCasco = tipoCasco_;
      banheiro = banheiro_;
   }

   public Lancha(int v, String tipoCasco_, int n) {
      super(v, n);
      tipoCasco = tipoCasco_;
   }

   public Lancha(boolean banheiro_, String tipoCasco_, double p, int n) {
      super(p, n);
      banheiro = banheiro_;
      tipoCasco = tipoCasco_;
   }

   public Lancha(String mo, String ma, int v, String tipoCasco_) {
      super(mo, ma, v);
      tipoCasco = tipoCasco_;
   }

   public Lancha(String ma, boolean banheiro_, int n) {
      super(ma, n);
      banheiro = banheiro_;
   }

   public Lancha(String mo, int n, double p, String tipoCasco_) {
      super(mo, n, p);
      tipoCasco = tipoCasco_;
   }

   public Lancha(String mo, int n, int v, String t) {
      super(mo, n, v);
      tipoCasco = t;
   }

   public Lancha(double p, boolean banheiro_, String mo, String tipoCasco_, int v, String i) {
      super(p, mo, v, i);
      banheiro = banheiro_;
      tipoCasco = tipoCasco_;
   }

   public boolean getBanheiro() {
      return banheiro;
   }

   public void setBanheiro(boolean banheiro_) {
      banheiro = banheiro_;
   }

   public String getTipoCasco() {
      return tipoCasco;
   }

   public void setTipoCasco(String tipoCasco) {
      this.tipoCasco = tipoCasco;
   }

   public double getDesconto() {
      return this.preco - (0.12 * this.preco);
   }

   public void setDesconto(double p) {
      desconto = p - (0.12 * p);
   }

   public int getPotenciaMotor() {
      return potenciaMotor;
   }

   public void setPotenciaMotor(int potenciaMotor) {
      this.potenciaMotor = potenciaMotor;
   }

   public void cadastrar() {
      Scanner ler = new Scanner(System.in);

      // veiculo.entradaDados();
      System.out.print("Digite a Marca do Veiculo: ");
      setMarca(ler.nextLine());
      System.out.print("Digite o Modelo do Veiculo: ");
      setModelo(ler.nextLine());
      System.out.print("Digite a Identificação do Veiculo: ");
      setIdentificacao(ler.nextLine());
      System.out.print("Digite o Numero de Passageiros do Veiculo: ");
      setNumeroPassageiros(Integer.parseInt(ler.nextLine()));
      System.out.print("Digite a Velocidade Máxima do Veiculo: ");
      setVelocidadeMax(Integer.parseInt(ler.nextLine()));
      System.out.print("Digite o Preco  do Veiculo: ");
      setPreco(Double.parseDouble(ler.nextLine()));
      System.out.print("Digite a Cor do Veiculo: ");
      setCor(ler.nextLine());
      System.out.print("Digite a Altura Calado do Veiculo: ");
      setAlturaCalado(Integer.parseInt(ler.nextLine()));
      setDesconto(getPreco());
      System.out.print("Digite o Tipo de Casco da Lancha: ");
      setTipoCasco(ler.nextLine());
      System.out.print("Digite a Potencia do motor da Lancha: ");
      setPotenciaMotor(Integer.parseInt(ler.nextLine()));
      System.out.print("Tem banheiro na Lancha ? ");
      char resp;
      resp = ler.next().charAt(0);
      if (resp == 's' || resp == 'S') {
         setBanheiro(true);
         System.out.println("Tem Banheiro");
      } else {
         setBanheiro(false);
         System.out.println("Não tem Banheiro");
      }
      setDesconto(getPreco());
   }

   public void imprimir() {
      System.out.println("Marca do Veiculo: " + getMarca());
      System.out.println("Modelo do Veiculo: " + getModelo());
      System.out.println("Identificação do Veiculo: " + getIdentificacao());
      System.out.println("Número de passageiros do Veiculo: " + getNumeroPassageiros());
      System.out.println("Velocidade Máxima do Veiculo: " + getVelocidadeMax());
      System.out.println("Preço do Veiculo: " + getPreco());
      System.out.println("A cor do Veiculo é: " + getCor());
      System.out.println("A altura calado do Veiculo: " + getAlturaCalado());
      System.out.println("Valor com desconto é: " + getDesconto());
      System.out.println("O tipo de casco é: " + getTipoCasco());
      System.out.println("A potencia do motor é: " + getPotenciaMotor());
      if (getBanheiro() == true)
         System.out.println("Tem banheiro");
      else
         System.out.println("Nao tem banheiro");
   }
}