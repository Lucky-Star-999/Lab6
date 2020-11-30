/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File tmpDir = new File("Product Database.txt");
        boolean exists = tmpDir.exists();
        if (exists){
            Data.getData().loadData();
        }
        
        
        Form_1 form1 = new Form_1();
        
        
        form1.setVisible(true);
    }
    
}
