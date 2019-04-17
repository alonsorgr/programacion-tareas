public class Robot {
    private String alias;

    public Robot(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias de un robot no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias de un robot no puede ser nulo";
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
