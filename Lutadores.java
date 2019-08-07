
package Controle;


public class Lutadores implements Interface{
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Construtor
    public Lutadores(String nome, String nacionalidade,int idade, float altura, float peso,int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    //metodos

    @Override
    public void apresentar() {
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getAltura()+"M");
        System.out.println(this.getCategoria());
        System.out.println(this.getIdade());
        System.out.println(this.getPeso()+"Kg");
        System.out.printf("%dW %dL %dD\n",this.getVitorias(),this.getDerrotas(),this.getEmpates());
        
        
    }

    @Override
    public void status() {
        System.out.printf("%dW %dL %dD\n",this.getVitorias(),this.getDerrotas(),this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<=70){
            this.categoria="leve";
            
        }else if(this.peso<=83.9){
            this.categoria="medio";
        }else if(this.peso<=120.2){
            this.categoria="pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
   
    
    
    
    
    
}
