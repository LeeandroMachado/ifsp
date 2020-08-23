import java.util.*;

class Exercicio1 {
  class Cliente {
    private String name;
    private String address;
    private String document;
    private String zipcode;

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public String getAddress() {
      return this.address;
    }

    public void setDocument(String document) {
      this.document = document;
    }

    public String getDocument() {
      return this.document;
    }

    public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
    }

    public String getZipcode() {
      return this.zipcode;
    }
  }

  public Cliente registerClient(Scanner scn) {
    Cliente client = new Cliente();

    System.out.print("Nome: ");
    client.setName(scn.next());
    System.out.println("");

    System.out.print("Endereço: ");
    client.setAddress(scn.next());
    System.out.println("");

    System.out.print("CPF: ");
    client.setDocument(scn.next());
    System.out.println("");

    System.out.print("CEP: ");
    client.setZipcode(scn.next());
    System.out.println("");

    return client;
  }

  public void showClient(Cliente client) {
    System.out.println("Nome: " + client.getName());
    System.out.println("Endereço: " + client.getAddress());
    System.out.println("CPF: " + client.getDocument());
    System.out.println("CEP: " + client.getZipcode());
  }

  public static void main(String[] args) {
    Exercicio1 ex = new Exercicio1();
    Scanner scn = new Scanner(System.in);
    List<Cliente> clientes = new ArrayList<Cliente>();
    
    int choice = 0;

    do {
      clientes.add(ex.registerClient(scn));
      System.out.println("Deseja cadastrar mais um cliente? 1-SIM 0-NAO ");
      choice = scn.nextInt();
      System.out.println("\n");
    } while (choice == 1);

    for(Cliente client : clientes){
      System.out.println("\n");
      ex.showClient(client);
    }
  }
}