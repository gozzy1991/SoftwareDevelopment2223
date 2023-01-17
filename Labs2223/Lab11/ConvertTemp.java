package Lab11;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame {
	
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field

		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		// Attach listener to text field

		
        CelsHandler handlerCelcius = new CelsHandler();
        celsiusField.addActionListener(handlerCelcius);

        FahrenHandler handlerFahren = new FahrenHandler();
        fahrenField.addActionListener(handlerFahren);

     // Attach window listener
     		addWindowListener(new WindowCloser());
     	}
	
	
		class WindowCloser extends WindowAdapter {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		}

    
    private class CelsHandler implements ActionListener {


        public void actionPerformed(ActionEvent event) {

        	double celsius;
        	double fahrenheit;
        	
            
            celsius = Double.parseDouble(celsiusField.getText());

            
            fahrenheit = 9.0 / 5.0 * celsius + 32;

            
            fahrenField.setText(String.format("%.2f", fahrenheit));
        }
    }

        private class FahrenHandler implements ActionListener {

            

            public void actionPerformed(ActionEvent event) {
            	
            	double celsius;
            	double fahrenheit;

                
                fahrenheit = Double.parseDouble(fahrenField.getText());

                
                celsius = 5.0 / 9.0 * (fahrenheit - 32);

                
                celsiusField.setText(String.format("%.2f", celsius));
            }

        }

        
        
}//end class