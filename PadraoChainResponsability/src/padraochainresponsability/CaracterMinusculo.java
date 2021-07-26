
package padraochainresponsability;

public class CaracterMinusculo extends LoginChain{
    public String senha1 = "abcD";
    public String senha2 = "AAAAA";

    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha1) {
        this.senha1 = senha1;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }
    
    public CaracterMinusculo() {
        super(IDLogins.caracterMinusculo);
    }
    
    @Override
    protected void efetuarLogin() {
        if ("abcD".equals(this.senha1)) {
            System.out.println("Login possui caracter Minusculo.");
        } else if ("abcd".equals(this.senha2)) {
            System.out.println("Não pode cadastrar usuário, adicione um caracter Minusculo");
        }

    }
}
