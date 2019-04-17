
public class Animal {

    private String alias;   // {NO NULO, NO VACÍO}

    public Animal(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : String.format(
                "Error: El alias es %s , indique un alias correcto", alias);
        assert !alias.isEmpty() : "Error: El alias no puede estar vacío";
        this.alias = alias;
    }
}


