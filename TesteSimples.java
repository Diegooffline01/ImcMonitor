class TesteSimples {

  public void executar(){
    Atleta atleta = new Atleta();
    atleta.setNome("Diego Marcel");
    atleta.setIdade(19);

    System.out.println("Nome: "+atleta.getNome());
    System.out.println("Idade: "+atleta.getIdade());
  }
}