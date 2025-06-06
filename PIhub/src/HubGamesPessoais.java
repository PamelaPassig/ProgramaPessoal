
import Telas.Login;


public class HubGamesPessoais {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true);
        }
    });
    }
}