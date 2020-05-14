/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Usuario;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alejandra Cadena
 */
public class ValidarLoginNGTest {
    
    public ValidarLoginNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of verificarLogin method, of class ValidarLogin.
     */
    @Test
    public void testVerificarLogin() {
        System.out.println("verificarLogin");
        Usuario usuario = null;
        ValidarLogin instance = new ValidarLogin();
        String expResult = "";
        String result = instance.verificarLogin(usuario);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarLongitudNombre method, of class ValidarLogin.
     */
    @Test
    public void testVerificarLongitudNombre() {
        System.out.println("verificarLongitudNombre");
        String nombre = "";
        ValidarLogin instance = new ValidarLogin();
        boolean expResult = false;
        boolean result = instance.verificarLongitudNombre(nombre);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarLongitudPassword method, of class ValidarLogin.
     */
    @Test
    public void testVerificarLongitudPassword() {
        System.out.println("verificarLongitudPassword");
        String password = "";
        ValidarLogin instance = new ValidarLogin();
        boolean expResult = false;
        boolean result = instance.verificarLongitudPassword(password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
