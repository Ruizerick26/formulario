import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class formulario {
    private JPanel formulario;
    private JLabel nombres;
    private JTextField nom;
    private JTextField cedu;
    private JTextField edad;
    private JButton guardar;
    private JButton cargarButton;

    String fileN = "Formulario_Datos.txt";
    objetotemporal tem = new objetotemporal();
    public static void main(String[] args) {
        JFrame frame = new JFrame("formulario");
        frame.setContentPane(new formulario().formulario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public formulario(){
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nom.getText();
                String cedula = cedu.getText();
                String edad_s = edad.getText();
                try (FileOutputStream fileout = new FileOutputStream(fileN);
                     ObjectOutputStream obout = new ObjectOutputStream(fileout);
                ) {
                    obout.writeObject(nombre + cedula + edad_s);
                    obout.writeObject(tem);
                    System.out.println("Archivo guradado correctamente");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            });
        cargarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               try(FileInputStream fileint = new FileInputStream(fileN);
                   ObjectInputStream obint = new ObjectInputStream(fileint);){
                   tem readobt =(tem) obint.readObject();

                      nom.setText(nombre);
                      //cedu.setText();
                      //edad.setText();
               } catch (FileNotFoundException ex) {
                   throw new RuntimeException(ex);
               } catch (IOException ex) {
                   throw new RuntimeException(ex);
               }
            }
        });
        }
}

