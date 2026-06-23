public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

    /**
     * Construtor do cliente. Cria um novo cliente a partir do nome informado.
     * TODO: utilize obrigatoriamente o método setNome para atribuir o nome ao cliente.
     * TODO: atribua ao cliente um número de documento gerado sequencialmente a partir
     * do contador estático ultimoID (e incremente o contador).
     */
    public Cliente (String nome) {

    	setNome(nome);
        documento = ultimoID;
        ultimoID++;

    }

    /**
     * TODO: retorne o nome do cliente.
     */
    public String getNome() {
    	// TODO: implementar
    	return nome;
    }

    /**
     * Atribui ao cliente o nome informado como parâmetro.
     * TODO: esse nome deve conter, pelo menos, duas palavras; caso contrário,
     * lance a exceção adequada (IllegalArgumentException).
     */
    public void setNome(String nome) {

    	this.nome = nome;

    }

    /**
     * TODO: retorne uma representação textual do cliente, incluindo seu nome e documento.
     */
    @Override
    public String toString() {
    	StringBuilder resumo = new StringBuilder();
        resumo.append("Nome: " + getNome() + "\n");
        resumo.append("Documento: " + getDocumento() + "\n");
        return resumo.toString();
    }

    public int getDocumento(){
        return documento;
    }

    /**
     * TODO: retorne um código hash para o cliente, que corresponde a seu documento.
     */
    @Override
    public int hashCode(){
    	// TODO: implementar
        return getDocumento();
    }
}
