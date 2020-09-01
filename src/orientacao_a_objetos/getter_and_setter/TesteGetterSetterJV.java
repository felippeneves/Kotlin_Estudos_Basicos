package orientacao_a_objetos.getter_and_setter;

public class TesteGetterSetterJV
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        TesteGetterSetterKT testeKT = new TesteGetterSetterKT("Teste");
        //Métodos getter e setter que estão sendo chamados, são criados pelo Kotlin "por baixo dos panos"
        testeKT.getName();
        testeKT.setName("teste2");
    }
}
