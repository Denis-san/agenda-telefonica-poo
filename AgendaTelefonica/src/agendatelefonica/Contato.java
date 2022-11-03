
package agendatelefonica;


public class Contato implements Comparable<Contato>{
    
    private String nome;
    private String numero;
    private String detalhes;

    public Contato(String nome, String numero, String detalhes) {
        this.nome = nome;
        this.numero = numero;
        this.detalhes = detalhes;
    }
  
    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }  

  
    @Override
    public int compareTo(Contato t) {
        return nome.compareTo(t.getNome());
    }

}
