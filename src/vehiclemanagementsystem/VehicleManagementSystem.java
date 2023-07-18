/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclemanagementsystem;

/**
 *
 * @author Lenovo
 */
public class VehicleManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash s=new Splash();
        s.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                s.loadvalue.setText(Integer.toString(i)+"%");
                if(i==10)
                    s.load1.setText("Reaching modules...");
                else if(i==20)
                    s.load1.setText("Fetching modules...");
                else if(i==50)
                    s.load1.setText("Connecting Databases...");
                else if(i==70)
                    s.load1.setText("Database Connected...");
                else if(i==90)
                    s.load1.setText("Opening application...");
                else if(i==100){
                    login l=new login();
                    l.setVisible(true);
                    s.dispose();
                }
                s.loader.setValue(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
