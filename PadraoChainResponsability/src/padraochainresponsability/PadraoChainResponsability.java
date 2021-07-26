
package padraochainresponsability;

public class PadraoChainResponsability {

    public static void main(String[] args) {
        LoginChain login = new LoginCadastrado();
        login.setNext(new CaracterMaiucsculo());
        login.setNext(new CaracterMinusculo());
        login.setNext(new CaractereEspecial());
        login.setNext(new Numero());
        login.setNext(new NumerosConsecutivos());
        login.setNext(new OitoCaractere());
        login.setNext(new MenosQueDezesseis());
        
        try {
            login.efetuarLogin(IDLogins.loginCadastrado);
            login.efetuarLogin(IDLogins.caracterMaiucsculo);
            login.efetuarLogin(IDLogins.caracterMinusculo);
            login.efetuarLogin(IDLogins.caracterEspecial);
            login.efetuarLogin(IDLogins.numero);
            login.efetuarLogin(IDLogins.numerosConsecutivos);
            login.efetuarLogin(IDLogins.oitoCaracter);
            login.efetuarLogin(IDLogins.menosQueDezesseis);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
