/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttsconverter;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    VoiceManager vm;
    Voice v;
    public NewJFrame() {
        initComponents();
        jLabel1.setFont(new Font("Serif",Font.BOLD, 25));
        jLabel2.setFont(new Font("Calibri",Font.BOLD,25));
        jLabel3.setFont(new Font("Calibri",Font.BOLD,25));
        jLabel6.setFont(new Font("Calibri",Font.BOLD,25));
        jButton1.setFont(new Font("Serif",Font.BOLD,25));
        jTextArea1.setFont(new Font("Calibri",Font.BOLD,20));
        jRadioButton1.setFont(new Font("Calibri",Font.BOLD,20));
        jRadioButton2.setFont(new Font("Calibri",Font.BOLD,20));
        jRadioButton3.setFont(new Font("Calibri",Font.BOLD,20));
        jRadioButton4.setFont(new Font("Calibri",Font.BOLD,20));
        jRadioButton5.setFont(new Font("Calibri",Font.BOLD,20));
        jRadioButton6.setFont(new Font("Calibri",Font.BOLD,20));
        jLabel1.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.MAGENTA);
        jButton1.setForeground(Color.red);
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(jRadioButton1);
        bg1.add(jRadioButton2);
        bg1.add(jRadioButton3);
        bg1.add(jRadioButton4);
        
        ButtonGroup bg2=new ButtonGroup();
        bg2.add(jRadioButton5);
        bg2.add(jRadioButton6);
      
         
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        textSpeech1 = new textspeech.TextSpeech();
        textSpeech2 = new textspeech.TextSpeech();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 394, 353);

        jLabel1.setText("Type your message here!!!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 45, 394, 46);

        jButton1.setText("Hear me!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 430, 233, 46);

        jRadioButton1.setText(":) or :P for HAPPY");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(550, 130, 220, 26);

        jRadioButton2.setText(":( or :'( for SAD");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(550, 170, 220, 23);

        jRadioButton3.setText(":3 for FEAR");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(550, 210, 220, 23);

        jRadioButton4.setText(":| for NEUTRAL");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(550, 250, 220, 23);

        jLabel2.setText("INSERT THE EMOJI");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 80, 258, 41);

        jRadioButton5.setText("MALE");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(550, 340, 173, 23);

        jRadioButton6.setText("FEMALE");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(550, 380, 173, 23);

        jLabel3.setText("SELECT GENDER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 290, 189, 41);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttsconverter/emotions2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 450, 480);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttsconverter/emotions4.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 40, 460, 440);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(910, 0, 420, 480);

        jLabel6.setText("      EMOTIONAL TTS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 0, 250, 40);

        setBounds(0, 0, 1344, 523);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       String fullText=jTextArea1.getText();
       String text;
        System.setProperty("mbrola.base","mbrola");
        vm=VoiceManager.getInstance();
       /* if(jRadioButton5.isSelected())
        {
        v=vm.getVoice("kevin16");
        }
        else
        {
         v=vm.getVoice("mbrola_us1");   
        }
        v.allocate();
        v.speak(text);
        */
//PARSING THE FULL TEXT INTO LINES(splits on space after a dot)
Pattern re = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.MULTILINE | Pattern.COMMENTS);
Matcher reMatcher = re.matcher(fullText);
while (reMatcher.find()) {
    text=reMatcher.group();

        if((text.contains(":|") || ((text.contains(":)")|| text.contains(":P") ) && (text.contains(":(") || text.contains(":'(") ||text.contains(":3")  )) || (text.contains(":3") && (text.contains(":(") ||text.contains(":'(")))) && jRadioButton5.isSelected())//neutral boy
        {
             v=vm.getVoice("kevin16");
        jTextArea1.setForeground(Color.RED);
        v.setRate(200);
        v.setPitch(180);
        v.setVolume(1);
        v.setStyle("breathy");
        v.allocate();
        //v.speak(text);   
            
            
            
            
            
          BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\Neutral_boy.jpg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
        if(text.contains(":|"))      //cleaning code to avoid reading of special character '|'
        {
            text=text.replace(":|","..");
        }
        if(text.contains(":P"))      //cleaning code to avoid reading of special character 'P'
        {
            text=text.replace(":P","..");
        }
        if(text.contains(":3"))      //cleaning code to avoid reading of special character '3'
        {
            text=text.replace(":3","..");
        }
        v.speak(text);  
        }
         else if(( text.contains(":|") || (text.contains(":)") && text.contains(":(")) || (text.contains(":)") && text.contains(":3")) || (text.contains(":3") && text.contains(":("))) && jRadioButton6.isSelected())//neutral girl
        {
             v=vm.getVoice("mbrola_us1");
        jTextArea1.setForeground(Color.RED);
        v.setRate(200);
        v.setPitch(180);
        v.setVolume(1);
        v.setStyle("breathy");
        v.allocate();
       // v.speak(text);   
            
            
            
            
           BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\Neutral_girl.jpg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
         if(text.contains(":|"))      //cleaning code to avoid reading of special character '|'
        {
            text=text.replace(":|","..");
        }
        if(text.contains(":P"))      //cleaning code to avoid reading of special character 'P'
        {
            text=text.replace(":P","..");
        }
        if(text.contains(":3"))      //cleaning code to avoid reading of special character '3'
        {
            text=text.replace(":3","..");
        }
        v.speak(text);  
        }
        else if((text.contains(":)") || text.contains(":P")) && jRadioButton5.isSelected())//happy boy
        {
        v=vm.getVoice("kevin16");
        jTextArea1.setForeground(Color.GREEN);
        v.setRate(200);
        v.setPitch(180);
        v.setVolume(1);
        v.setStyle("breathy");
       // v.allocate();
       // v.speak(text);   
            
            
            BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
         v.allocate();
         if(text.contains(":P"))      //cleaning code to avoid reading of special character 'P'
        {
            text=text.replace(":P","..");
        }
        v.speak(text);   
        }
         else if((text.contains(":)")|| text.contains(":P")) && jRadioButton6.isSelected())//happy girl
        {
             v=vm.getVoice("mbrola_us1");
        jTextArea1.setForeground(Color.GREEN);
        v.setRate(170);
        v.setPitch(180);
        v.setVolume(1);
        v.setStyle("breathy");
        v.allocate();
       // v.speak(text);   
            
            
            
            
            
           BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_girl.jpg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
        if(text.contains(":P"))      //cleaning code to avoid reading of special character 'P'
        {
            text=text.replace(":P","..");
        }
        v.speak(text);  
        }
         else if((text.contains(":(")|| text.contains(":'(")) && jRadioButton5.isSelected())//sad boy
        {
             v=vm.getVoice("kevin16");
        jTextArea1.setForeground(Color.BLUE);
        v.setRate(120);
        v.setPitch(100);
        v.setVolume(1);
        v.setStyle("business");
        v.allocate();
        //v.speak(text);   
            
            
            
            
            
          BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\sad_boy.jpg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
        v.speak(text);  
        }
         else if((text.contains(":(")|| text.contains(":'(")) && jRadioButton6.isSelected())//sad girl
        {
             v=vm.getVoice("mbrola_us1");
        jTextArea1.setForeground(Color.BLUE);
        v.setRate(110);
        v.setPitch(150);
        v.setVolume(1);
        v.setStyle("business");
        v.allocate();
       // v.speak(text);   
            
            
            
            
            
           BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\sad_girl.jpg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
        v.speak(text);  
        }
         
         
         
         else if((text.contains(":3")) && jRadioButton5.isSelected())//fear boy
        {
             v=vm.getVoice("kevin16");
        jTextArea1.setForeground(Color.ORANGE);
        v.setRate(120);
        v.setPitch(250);
        v.setVolume(1);
        v.setStyle("business");
        v.allocate();
        //v.speak(text);   
            
            
            
            
          BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\fear_boy.jpeg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
        if(text.contains(":3"))      //cleaning code to avoid reading of special character '3'
        {
            text=text.replace(":3","..");
        }
        v.speak(text);  
        }
         else if((text.contains(":3")) && jRadioButton6.isSelected())//fear girl
        {
            v=vm.getVoice("mbrola_us1");
        jTextArea1.setForeground(Color.ORANGE);
        v.setRate(120);
        v.setPitch(250);
        v.setVolume(1);
        v.setStyle("business");
        v.allocate();
       // v.speak(text);   
            
            
            
           BufferedImage img = null;
try {
    img = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\fear_girl.jpg"));
} catch (IOException e) {
}
Image dimg = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),
        Image.SCALE_SMOOTH);
          //  byte[] ImageData=resultSet.getBytes("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        ImageIcon icon=new ImageIcon(dimg);
        jLabel7.setIcon(icon);
        if(text.contains(":3"))      //cleaning code to avoid reading of special character '3'
        {
            text=text.replace(":3","..");
        }
        v.speak(text);  
        }
    }
    }                                        

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        /*if(jRadioButton5.isSelected() && !(jRadioButton6.isSelected()))
        {
        ImageIcon icon=new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_boy.jpg");
        jLabel7.setIcon(icon);
        }
        else if(jRadioButton6.isSelected() && !(jRadioButton5.isSelected()))
        {
         ImageIcon icon=new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\TtsConverter\\src\\ttsconverter\\happy_girl.jpg");
         jLabel7.setIcon(icon);
        }
        */
        String text=jTextArea1.getText();
        if(jRadioButton1.isSelected())
             {
                 text  = text.concat(":)");
                 jTextArea1.setText(text);
                // text=text.replace(":P", ":)");
             }
        jTextArea1.setForeground(Color.GREEN);
        v.setRate(200);
        v.setPitch(180);
        v.setVolume(1);
        v.setStyle("breathy");
        
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
         String text=jTextArea1.getText();
        if(jRadioButton2.isSelected())
             {
                 text  = text.concat(":(");
                 jTextArea1.setText(text);
             }
       jTextArea1.setForeground(Color.BLUE); 
        v.setRate(120);
        v.setPitch(100);
        v.setVolume(1);
        v.setStyle("business");
    }                                             

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here: 
         String text=jTextArea1.getText();
        if(jRadioButton3.isSelected())
             {
                 text  = text.concat(":3");
                 jTextArea1.setText(text);
             }
        jTextArea1.setForeground(Color.ORANGE);
        v.setRate(120);
        v.setPitch(250);
        v.setVolume(1);
        v.setStyle("breathy");
    }                                             

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:   
         String text=jTextArea1.getText();
        if(jRadioButton4.isSelected())
             {
                 text  = text.concat(":|");
                 jTextArea1.setText(text);
             }
        jTextArea1.setForeground(Color.RED);
        v.setRate(200);
        v.setPitch(200);
        v.setVolume(1);
        v.setStyle("breathy");
    }                                             

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
       /* String text=jTextArea1.getText();
        v=vm.getVoice("kevin16");
        v.allocate();
        v.speak(text);*/
    }                                             

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
       /* String text=jTextArea1.getText();
        System.setProperty("mbrola.base","mbrola");
        vm=VoiceManager.getInstance();
        v=vm.getVoice("mbrola_us1");
        v.allocate();
        v.speak(text);*/
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private textspeech.TextSpeech textSpeech1;
    private textspeech.TextSpeech textSpeech2;
    // End of variables declaration                   
}
