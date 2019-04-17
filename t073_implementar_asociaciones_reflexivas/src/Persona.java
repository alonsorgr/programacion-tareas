public class Persona {

    private String alias;           // NO NULO, NO VACIO
    private char sexo;              // [V,M]
    private Persona padre;
    private Persona madre;
    private Persona conyuge;
    private Persona amigo;

    public Persona(String alias, char sexo) {
        setAlias(alias);
        setSexo(sexo);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias de una persona no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias de una persona no puede estar vacio";
        this.alias = alias;
    }

    private void setSexo(char sexo) {
        assert sexo == 'V' || sexo == 'M' :
                String.format("Error: el sexo (%c) no es válido. VALORES: [V,M]", sexo);
        this.sexo = sexo;
    }

    public void setPadre(Persona padre) {
        assert padre != null : "Error: el progenitor recibido no puede ser nulo";
        assert padre != this :
                String.format("Error: la persona (%s) no puede ser progenitor de sí mismo", padre);
        assert padre != madre || madre != null :
                String.format("Error: la persona (%s) no puede ser progenitor 2 veces de la misma persona", padre);
        assert padre.sexo == 'V' :
                String.format("Error: el sexo de la persona recibida (%s) tiene que ser (%c)", padre, 'V');
        this.padre = padre;
    }

    public void setMadre(Persona madre) {
        assert madre != null : "Error: el progenitor recibido no puede ser nulo";
        assert madre != this :
                String.format("Error: la persona (%s) no puede ser progenitor de sí mismo", madre);
        assert madre != padre || padre != null :
                String.format("Error: la persona (%s) no puede ser progenitor 2 veces de la misma persona", madre);
        assert madre.sexo == 'M' :
                String.format("Error: el sexo de la persona recibida (%s) tiene que ser (%c)", madre, 'M');
        this.madre = madre;
    }

    public void setConyuge(Persona conyuge) {
        assert conyuge != null : "Error: el conyuge recibido no puede ser null";
        assert conyuge != this :
                String.format("Error: la persona (%s) no puede ser conyuge de sí mismo", conyuge);
        assert conyuge != padre || conyuge != madre :
                String.format("Error: el conyuge (%s) no puede ser padre o madre de la misma persona", conyuge);
        if (conyuge == amigo)
            amigo = null;

        this.conyuge = conyuge;
    }

    public void setAmigo(Persona amigo) {
        assert amigo != null : "Error: el amigo recibido no puede ser nulo";
        assert amigo != this :
                String.format("Error: la persona (%s) no puede ser amigo de sí mismo", amigo);
        assert amigo != padre || amigo != madre :
                String.format("Error: un amigo (%s) no puede ser padre o madre de la misma persona", conyuge);
        if (amigo == conyuge)
            conyuge = null;

        this.amigo = amigo;
    }

    @Override
    public String toString() {
        return "alias: " + alias  +
                "\nsexo: " + sexo +
                "\npadre: " + padre +
                "\nmadre: " + madre +
                "\nconyuge: " + conyuge +
                "\namigo: " + amigo;

    }
}
