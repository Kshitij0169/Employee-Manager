/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.util.ArrayList;

/**
 *
 * @author kshitijkumartiwari
 */
public class EmployeeHistory {
    
    private ArrayList<Employees> history;
    
    public EmployeeHistory() {
        
       this.history = new ArrayList<Employees>();
    }

    public ArrayList<Employees> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employees> history) {
        this.history = history;
    }
    
    public Employees addNewEmployees(){
        
        Employees newEmployees = new Employees();
        history.add(newEmployees);
        return newEmployees;
    }
    
    public void deleteEmployees(Employees es){
        history.remove(es);
    }
    
}
