
package padraochainresponsability;

public class Numero extends LoginChain{
    
    public String senha1 = "Guilherme1@";
    public String senha2 ="guilherme";

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
    
    public Numero() {
        super(IDLogins.numero);
    }
    
    @Override
    protected void efetuarLogin() {
        if("Guilherme1@".equals(this.senha1)) {
            System.out.println("Login possui numero");
        }
        else if("guilherme".equals(this.senha2)) {
            System.out.println("Não e possivel cadastrar senha não possui numero");
        }
        
    }
}
