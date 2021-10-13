/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Dipanjali
 */
public class ThreadsControllerTest {

    public ThreadsControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of run method, of class ThreadsController.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        ThreadsController instance = new ThreadsController();
        instance.start();
    }

    @Test
    public void test(){
        System.out.println("Tested!");
    }

    @Test
    public void aSnakeis3UnitsLongByDefault(){
        ThreadsController instance = new ThreadsController();
        int length = 3;
        assertEquals(4,length);
    }

    private void assertEquals(int i, int length) {
    }


}
