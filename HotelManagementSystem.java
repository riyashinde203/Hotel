
package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
                setSize( 1329,886);         
                setLayout(null);
                setTitle("Hotel Management System");
               

		l1 = new JLabel("");
                b1 = new JButton("Next");
                b1.setFont(new Font("times new roman",Font.PLAIN,24));
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/hotel1.jpg"));
                Image i3 = i1.getImage().getScaledInstance( 1329,886,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(200,50,1500,100);
                lid.setFont(new Font("times new roman",Font.PLAIN,70));
                lid.setForeground(Color.white);
                l1.add(lid);
                
                b1.setBounds(1190,640,100,30);
		l1.setBounds(0, 0, 1329,886);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                

	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}
