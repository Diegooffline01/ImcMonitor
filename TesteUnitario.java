class TesteUnitario {

  public void executarAll() throws Exception {
    testeNome();
    testeIdade();
  }

  public void testeNome() throws Exception {
    Atleta atleta = new Atleta();
    String nome;

    nome = " ";
    atleta.setNome(nome);
    if (!atleta.getNome().equals(nome)) {
      // System.out.println("ERRO !!! falha ao manipular Nome "+nome);
      throw new Exception("ERRO !!! falha ao manipular nome "+nome + "esta retornando " +atleta.getNome());
    }
  }

  public void testeIdade() throws Exception {
    Atleta atleta = new Atleta();
    int idade;

    idade = 10;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade) {
      // System.out.println("ERRO !!! falha ao manipular Idade");
      throw new Exception("ERRO !!! falha ao manipular Idade "+idade + "esta retornando " +atleta.getIdade());
    }
  }
}