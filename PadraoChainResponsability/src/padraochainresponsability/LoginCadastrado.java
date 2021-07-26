
package padraochainresponsability;

public class  LoginCadastrado extends LoginChain {
    public String usuario = "Guilherme1@";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    public LoginCadastrado() {
        super(IDLogins.loginCadastrado);
    }
    
    @Override
    protected void efetuarLogin() {
        if(!"Guilherme1@".equals(this.usuario)){
            System.out.println("Não pode cadastrar usuário já existe");
        }
        System.out.println("Login cadastrado com sucesso.");
    }
}
