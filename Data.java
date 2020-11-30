/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Data {
    ArrayList<Product> allProduct = new ArrayList<>();
    
    //This is a Singleton
    private static final Data manageData = new Data();
    private Data(){}
    public static Data getData(){
        return manageData;
    }
    
    
    
    
    public void saveData(){
	String path = new File("Product Database.txt").getAbsolutePath();
        
        try (FileWriter fstream = new FileWriter(path);
	    BufferedWriter info = new BufferedWriter(fstream)) {
            for(Product value: this.allProduct){
		info.write(String.format(value.getName() + "%n"));
                info.write(String.format(value.getAmount() + "%n"));
                info.write(String.format(value.getDescription() + "%n"));
            }  
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    
    
    
    public void loadData(){
        String path = new File("Product Database.txt").getAbsolutePath();;
        try {
            List<String> content = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
	    int length = content.size();
            if (length!=0){
                for(int i=0; i<length/3; i++){
                    this.allProduct.add(new Product(content.get(3*i), Integer.parseInt(content.get(3*i+1)), content.get(3*i+2)));
                }
            }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
