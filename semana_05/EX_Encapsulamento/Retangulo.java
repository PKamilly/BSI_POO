public class Retangulo {
    // Pertence ao Software
    private float lado1;
    private float lado2;
    private String cor;

    // Configuração padrão
    public Retangulo(){
        this.lado1 = 5;
        this.lado2 = 10;
        this.cor = "Azul";
    }

    // Veio do desenho do usuário
    public Retangulo(float lado1, float lado2, String cor){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }

    // Alteração do lado1
    public void setLado1(float lado1){
        this.lado1 = lado1;
    }
    // Alteração do lado2
    public void setLado2(float lado2){
        this.lado2 = lado2;
    }

    public void setCor(){
        this.cor = cor;
    }

    // Retorna os valores
    public float getLado1(){
        return lado1;
    }
    // Retorna os valores
    public float getLado2(){
        return lado2;
    }
    // Retorna os valores
    public String getCor(){
        return cor;
    }
    // Cálcula a área e retorna
    public float getArea(){
        return lado1*lado2;
    }

    // Verificação se é um retangulo quadrado(??)
    public boolean isQuadrado(){
        if(lado1==lado2){
            return true;
        }
        return false;
    }
    // Modo simplificado do código acima
    //public boolean isQuadrado(){
    //    return lado1 == lado2;
    //}

    // ARRUMAR
    // Retorna o conteúdo sem ser o endereço da classe
    public String toString() {
        return "Cor: "+ cor +"/n" +
    }

}
