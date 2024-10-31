
import entity.*;
import entity.composicao.Endereco;
import model.Genero;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int idFilme=1;
    static int idSala=1;
    static Scanner teclado;
        static ArrayList<Filme> filmes = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Ingresso> ingressos = new ArrayList<>();
    static ArrayList<Sala> salas = new ArrayList<>();

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        teclado.close();
    }

    public static void addCliente(){
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        System.out.println("Digite o nome do Cliente:");
        cliente.setNome(teclado.nextLine());
        System.out.println("Digite o CPF do cliente:");
        cliente.setCPF(teclado.nextLine());
        System.out.println("Endereço:");
        System.out.println("Digite a Rua(logradouro):");
        endereco.setLogradouro(teclado.nextLine());
        System.out.println("Digite o número da casa:");
        endereco.setNumero(teclado.nextLine());
        System.out.println("Digite o nome do Bairro:");
        endereco.setBairro(teclado.nextLine());
        System.out.println("Digite o nome da cidade:");
        endereco.setCidade(teclado.nextLine());
        cliente.setEndereco(endereco);
        clientes.add(cliente);
    }
    public static void listarClientes(){
        if(!clientes.isEmpty()){
            System.out.println("==========================");
            for(Cliente cliente: clientes) System.out.println(cliente.toString());
            System.out.println("==========================");
        }else System.out.println("NENHUM CLIENTE ENCONTRADO");
    }
    public static void addFilme() {
        Filme filme = new Filme();
        System.out.println("Digite o título do Filme:");
        filme.setTitulo(teclado.nextLine());
        System.out.println("Digite o genero do FIlme: ");
        for(Genero genero: Genero.values()) System.out.println(genero);
        String op = teclado.nextLine();
        for(Genero genero: Genero.values()){
            if(op.equalsIgnoreCase(genero.name())){
                filme.setGenero(genero);
            }
        }
        System.out.println("Digite o tempo de duração do Filme (HH:mm):");
        filme.setDuracao(teclado.nextLine());
        filme.setIdFilme(idFilme);
        filmes.add(filme);
        idFilme++;
    }
    public static void listarFilmes() {
        if (!filmes.isEmpty()) {
                System.out.println("==========================");
                for(Filme filme: filmes) System.out.println(filme.toString());
                System.out.println("==========================");

        } else System.out.println("Nenhum filme cadastrado");

    }
    public static void addSala(){
        Sala sala = new Sala();
        sala.setNumero(idSala);
        System.out.printf("Digite a capacidade máxima da sala %d:",idSala);
        sala.setCapMaxima(teclado.nextInt());
        salas.add(sala);
        idSala++;
    }
    public static void listarSalar(){
        if(!salas.isEmpty()){
            System.out.println("==========================");
            for(Sala sala:salas) System.out.println(sala.toString());
            System.out.println("==========================");
        }else System.out.println("NENHUMA SALA ENCONTRADA");
    }
    public static void addIngresso(){

    }
    public static void listarIngressos(){
        if(!ingressos.isEmpty()){
            System.out.println("==========================");
            for(Ingresso ingresso:ingressos) System.out.println(ingresso.toString());
            System.out.println("==========================");
        } else System.out.println("NENHUM INGRESSO ENCONTRADO");
    }
    public static void getIngressoOfId(Integer id){
        for(Ingresso ingresso: ingressos)
            if(id.equals(ingresso.getIdIngresso())){
                System.out.println(ingresso.toString());
                return ;
            }
        System.out.printf("\nINGRESSO %d NÃO ENCONTRADO\n",id);
    }
    public static void getIngressoOfCPFCliente(String cpf){
        for(Ingresso ingresso: ingressos)
            if(cpf.equalsIgnoreCase(ingresso.getCliente().getCPF())){
                System.out.println(ingresso.toString());
                return ;
            }
        System.out.printf("\nINGRESSO DO CLIENTE DE CPF %S NÃO ENCONTRADO\n",cpf);
    }

}
