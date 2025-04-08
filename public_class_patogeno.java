public class patogeno {
    String tipo;  
    String classificacao;
    String mortalidade;
    String transmissao; 
}

public class Main {
    public static void main(String[] args) {
        patogeno pesteBulbonica = new patogeno();
        pesteBulbonica.tipo = "Yersinia pestis";
        pesteBulbonica.classificacao = "Bactéria gênero Yersinia";
        pesteBulbonica.mortalidade = "Cerca de 50%";
        pesteBulbonica.transmissao = "Picada de pulga infectada";

        System.out.format(
            "Tipo: %s\nClassificação: %s\nMortalidade: %s\nTransmissão: %s\n",
            pesteBulbonica.tipo,
            pesteBulbonica.classificacao,
            pesteBulbonica.mortalidade,
            pesteBulbonica.transmissao
        );
    }
}
