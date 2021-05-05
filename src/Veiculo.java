
public class Veiculo {
  String marca, modelo, identificacao, cor;
  int numPassageiros, velocidadeMax;
  double preco, desconto, alturaCalado;

  public Veiculo() {
  }

  public Veiculo(String marca_, String modelo_) {
    marca = marca_;
    modelo = modelo_;
  }

  public Veiculo(String identificacao_, String modelo_, double preco_) {
    identificacao = identificacao_;
    modelo = modelo_;
    preco = preco_;
  }

  public Veiculo(int velocidadeMax_, String modelo_) {
    velocidadeMax = velocidadeMax_;
    modelo = modelo_;
  }

  public Veiculo(double preco_, int numPassageiros_) {
    preco = preco_;
    numPassageiros = numPassageiros_;
  }

  public Veiculo(int velocidadeMax_, String modelo_, String marca_, double preco_, int numPassageiros_) {
    velocidadeMax = velocidadeMax_;
    marca = marca_;
    modelo = modelo_;
    preco = preco_;
    numPassageiros = numPassageiros_;
  }

  public Veiculo(String marca_, int numPassageiros_) {
    marca = marca_;
    numPassageiros = numPassageiros_;
  }

  public Veiculo(String modelo_, int numPassageiros_, double preco_) {
    modelo = modelo_;
    numPassageiros = numPassageiros_;
    preco = preco_;
  }

  public Veiculo(int numPassageiros_, int velocidadeMax_) {
    numPassageiros = numPassageiros_;
    velocidadeMax = velocidadeMax_;
  }

  public Veiculo(double preco_, String modelo_, int velocidadeMax_, String identificacao_) {
    preco = preco_;
    modelo = modelo_;
    velocidadeMax = velocidadeMax_;
    identificacao = identificacao_;
  }

  public Veiculo(String cor_, double AlturaCalado_) {
    cor = cor_;
    alturaCalado = AlturaCalado_;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca_) {
    marca = marca_;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo_) {
    modelo = modelo_;
  }

  public String getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(String identificacao_) {
    identificacao = identificacao_;
  }

  public int getNumeroPassageiros() {
    return numPassageiros;
  }

  public void setNumeroPassageiros(int numPassageiros_) {
    numPassageiros = numPassageiros_;
  }

  public int getVelocidadeMax() {
    return velocidadeMax;
  }

  public void setVelocidadeMax(int velocidadeMax_) {
    velocidadeMax = velocidadeMax_;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco_) {
    preco = preco_;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor_) {
    cor = cor_;
  }

  public double getAlturaCalado() {
    return alturaCalado;
  }

  public void setAlturaCalado(double alturacalado_) {
    alturaCalado = alturacalado_;
  }
}
