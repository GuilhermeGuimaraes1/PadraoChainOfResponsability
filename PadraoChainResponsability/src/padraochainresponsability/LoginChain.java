
package padraochainresponsability;

public abstract class LoginChain {
    
    protected LoginChain next;
    protected IDLogins identificadorDoLogin;
    
    public LoginChain(IDLogins id) {
        next = null;
        identificadorDoLogin = id;
    }
    
    public void setNext(LoginChain forma) {
        if(next == null) {
            next = forma;
        }
        else {
            next.setNext(forma);
        }
    }
    
    public void efetuarLogin(IDLogins id) throws Exception {
        if(podeEfetuarLogin(id)) {
            efetuarLogin();
        }
        else {
            if(next == null) {
                throw new Exception("Não pode ser realizado o cadastro desse login!");
            }
            next.efetuarLogin(id);
        }
    }
    
    private boolean podeEfetuarLogin(IDLogins id) {
        if(identificadorDoLogin == id) {
            return true;
        }
        return false;
    }
    
    protected abstract void efetuarLogin();
}
