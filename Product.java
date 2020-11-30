/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

/**
 *
 * @author ASUS
 */
public class Product {
    private String name;
    private int amount;
    private String description;

    public Product(){
        
    }
    
    public Product(String name, int amount, String description) {
        this.name = name;
        this.amount = amount;
        this.description = description;
        
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
