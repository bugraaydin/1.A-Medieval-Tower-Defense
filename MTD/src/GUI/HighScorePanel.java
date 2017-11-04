package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *
 * @author Bugra
 */
public class HighScorePanel extends javax.swing.JPanel {

	BufferedImage backgroundImage;
	String imageBuffer = "/images/highScore.jpg";
    public HighScorePanel() {
		this.setPreferredSize(new Dimension(832,776));
	     try {
	         backgroundImage = ImageIO.read(getClass().getResourceAsStream(imageBuffer));
	        } catch(IOException exc) {
	          exc.printStackTrace();
	        }

	
       initComponents();
   }
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, null);
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        backBut = new javax.swing.JButton();
        highScoreText = new javax.swing.JLabel();

        backBut.setText("Back");
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });

        highScoreText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highScoreText.setText("1- Muhittin 48/50 27:40");
        highScoreText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(backBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addComponent(highScoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(highScoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBut)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>                        

    private void backButActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	this.hide();
    	GameFrame settingsTriggered = new GameFrame(new MainMenuPanel());
    }                                       


    // Variables declaration - do not modify                     
    private javax.swing.JButton backBut;
    private javax.swing.JLabel highScoreText;
    // End of variables declaration                   
}

