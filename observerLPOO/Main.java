class Main {
  public static void main(String[] args) {

    BalancaDieta balanca = new BalancaDieta();
    Dieta dieta = new Dieta(60);
    dieta.registerObserver(balanca);
    dieta.setPeso(150);
  }
} 
