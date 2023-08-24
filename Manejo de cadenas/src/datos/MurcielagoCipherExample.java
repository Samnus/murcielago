package datos;

import javax.swing.*;
import java.awt.event.*;

public class MurcielagoCipherExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traductor a Clave Murciélago");
        final JTextArea textArea = new JTextArea();
        JButton traducirButton = new JButton("Traducir a Clave Murciélago");

        traducirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                String textoTraducido = traducirAMurcielago(texto);
                JOptionPane.showMessageDialog(frame, "Texto traducido: \n" + textoTraducido);
            }
        });

        frame.add(textArea);
        frame.add(traducirButton);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Función para traducir un texto a clave Murciélago
    public static String traducirAMurcielago(String texto) {
        StringBuilder textoTraducido = new StringBuilder();
        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char letra = Character.toUpperCase(caracter);
                if (letra >= 'A' && letra <= 'Z') {
                    // Realiza la traducción según la clave Murciélago
                    char letraTraducida = ' ';
                    switch (letra) {
                        case 'A': letraTraducida = '7'; break;
                        case 'B': letraTraducida = 'b'; break;
                        case 'C': letraTraducida = '3'; break;
                        case 'D': letraTraducida = 'd'; break;
                        case 'E': letraTraducida = '5'; break;
                        case 'F': letraTraducida = 'f'; break;
                        case 'G': letraTraducida = '8'; break;
                        case 'H': letraTraducida = 'h'; break;
                        case 'I': letraTraducida = '4'; break;
                        case 'J': letraTraducida = 'j'; break;
                        case 'K': letraTraducida = 'k'; break;
                        case 'L': letraTraducida = '6'; break;
                        case 'M': letraTraducida = '0'; break;
                        case 'N': letraTraducida = 'n'; break;
                        case 'O': letraTraducida = '9'; break;
                        case 'P': letraTraducida = 'p'; break;
                        case 'Q': letraTraducida = 'q'; break;
                        case 'R': letraTraducida = '2'; break;
                        case 'S': letraTraducida = 's'; break;
                        case 'T': letraTraducida = 't'; break;
                        case 'U': letraTraducida = '1'; break;
                        case 'V': letraTraducida = 'v'; break;
                        case 'W': letraTraducida = 'w'; break;
                        case 'X': letraTraducida = 'x'; break;
                        case 'Y': letraTraducida = 'y'; break;
                        case 'Z': letraTraducida = 'z'; break;
                    }
                    textoTraducido.append(letraTraducida);
                } else {
                    textoTraducido.append(caracter); // Mantener caracteres no alfabéticos sin cambios
                }
            } else {
                textoTraducido.append(caracter); // Mantener caracteres no alfabéticos sin cambios
            }
        }
        return textoTraducido.toString();
    }
}
