// Classe principal que demonstra os conceitos solicitados
public Class Adividad {
    public static void main(String[] args) {
        // Criando objetos (requisito B)
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        Moto minhaMoto = new Moto("Honda", "CBR 600", 2019, 600);

        // Usando métodos (requisito C)
        meuCarro.acelerar(60);
        minhaMoto.acelerar(100);

        meuCarro.exibirInfo();
        minhaMoto.exibirInfo();
    }
}

// Classe base Veiculo (requisito A - Classe)
class Veiculo {
    // Encapsulamento (requisito E)
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos (requisito C)
    public void acelerar(int velocidade) {
        System.out.println(modelo + " acelerando para " + velocidade + " km/h");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    // Getters e Setters (encapsulamento)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

// Herança (requisito D) - Carro herda de Veiculo
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Método específico de Carro
    public void ligarArCondicionado() {
        System.out.println(getModelo() + ": Ar condicionado ligado");
    }
}

// Herança (requisito D) - Moto herda de Veiculo
class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    // Método específico de Moto
    public void empinar() {
        System.out.println(getModelo() + " empinando!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindradas: " + cilindradas);
    }

    // Getter e Setter para cilindradas
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}