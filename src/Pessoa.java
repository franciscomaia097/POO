public class Pessoa {
    String nome;
    String morada;
    int codigoPostal;
    int telefone;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    String estadoCivil;

public Pessoa(){

}

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento, String estadoCivil){
    this.nome = nome;
    this.diaNascimento = diaNascimento;
    this.mesNascimento = mesNascimento;
    this.anoNascimento = anoNascimento;
    this.estadoCivil = estadoCivil;

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEstadoCivilExtenso (){
        switch(this.estadoCivil) {
            case "s":
                System.out.println("A pessoa e solteira");
                return this.estadoCivil;

            case "c":
                System.out.println("A pessoa e casada");
                return this.estadoCivil;

            case "d":
                System.out.println("A pessoa e divorciada");
                return this.estadoCivil;

            case "v":
                System.out.println("A pessoa e viuva");
                return this.estadoCivil;

            case "u":
                System.out.println("A pessoa está em união de facto");
                return this.estadoCivil;
            default:
                return this.estadoCivil;

        }

}


    public void Status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Morada: " + this.morada + "\n" + this.codigoPostal);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de nascimento: " + this.diaNascimento + "/" + this.mesNascimento + "/" + this.anoNascimento);
        System.out.println("Estado civil: " + getEstadoCivilExtenso());

    }

    public int getIdade(int ano){
        int idade = ano - this.anoNascimento;
        if(idade<0){
            System.out.println("Ano de referencia inferior ao ano de nascimento");
        }
        else {
            System.out.println("A pessoa tem " + idade + " anos");
            return idade;
        }
        return idade;
    }
    public void eMaiorIdade(int ano){
    int maiorIdade = ano - this.anoNascimento;

    if (maiorIdade < 18 && maiorIdade > 0){
        System.out.println("A pessoa é de menor idade");
    } else if (maiorIdade >= 18) {
        System.out.println("A pessoa é de maior idade");
    } else{
        System.out.println("Ano de referencia inferior ao ano de nascimento");
    }
    }
    public void informacaoMaiorIdade(int ano){
    if(getIdade(ano) > 18){
        Status();
    }
    else {
        System.out.println("A pessoa é menor de idade");
    }
    }
}
