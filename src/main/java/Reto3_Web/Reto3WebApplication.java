//modelo
//interface
//repositorio
//servicio
//controlador
package Reto3_Web;

import Reto3_Web.interfaces.InterfaceFragance;
import Reto3_Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto3WebApplication implements CommandLineRunner {

    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceFragance interfaceFragance;
    @Autowired
    private InterfaceFragance interfaceOrder;
	public static void main(String[] args) {
		SpringApplication.run(Reto3WebApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        interfaceFragance.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
         //To change body of generated methods, choose Tools | Templates.
    }

        
        
        
        
        
        
        
}
