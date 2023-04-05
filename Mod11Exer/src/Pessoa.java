import java.util.Objects;

public class Pessoa<T>{

        private String nome;
        private String genero;
        private String profissao;
        private Integer salario;

        public Pessoa(String nome, String genero, String profissao, Integer salario) {
            this.nome = nome;
            this.genero = genero;
            this.profissao = profissao;
            this.salario = salario;
        }



        public void Pessoas(String nome, String genero, String profissao) {
            this.nome = nome;
            this.genero = genero;
            this.profissao = profissao;
        }

        
        

        public String getNome() {

            return nome;
        }

        public void setNome(String nome) {

            this.nome = nome;
        }

        public String getgenero() {

            return genero;
        }

        public void setgenero(String genero) {

            this.genero = genero;
        }

        public String getprofissao() {

            return profissao;
        }

        public void setprofissao(String profissao) {

            this.profissao = profissao;
        }

        public Integer getsalario() {

            return salario;
        }

        public void setsalario(Integer salario) {

            this.salario = salario;
        }

   /* @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", profissao='" + profissao + '\'' +
                ", salario=" + salario +
                '}';
    }*/


        public String toString() {

            //return this.profissao;
            //return this.nome +" -> "+ this.genero;
            return this.nome +" -> "+
                    this.genero +" -> "+
                    this.profissao +" -> "+
                    this.salario;

        }



        /*@Override
        public int compareTo(pessoas Pessoas) {

            return this.nome.compareTo(Pessoas.clone());
        }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa<?> pessoa)) return false;
        return getNome().equals(pessoa.getNome()) && genero.equals(pessoa.genero) && profissao.equals(pessoa.profissao) && salario.equals(pessoa.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), genero, profissao, salario);
    }
}


