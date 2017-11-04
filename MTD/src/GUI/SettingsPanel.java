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
public class SettingsPanel extends javax.swing.JPanel {


	BufferedImage backgroundImage;
	String imageBuffer = "/images/settings.jpg";
    public SettingsPanel() {
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

        difSlider = new javax.swing.JSlider();
        defaultBut = new javax.swing.JButton();
        sandboxBut = new javax.swing.JButton();
        easyBut = new javax.swing.JButton();
        mediumBut = new javax.swing.JButton();
        hardBut = new javax.swing.JButton();
        hardcoreBut = new javax.swing.JButton();
        backBut = new javax.swing.JButton();

        defaultBut.setToolTipText("");
        defaultBut.setText("Default Settings");
        defaultBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButActionPerformed(evt);
            }
        });

        sandboxBut.setText("SandBox");
        sandboxBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandboxButActionPerformed(evt);
            }
        });

        easyBut.setText("Easy");
        easyBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButActionPerformed(evt);
            }
        });

        mediumBut.setText("Medium");
        mediumBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButActionPerformed(evt);
            }
        });

        hardBut.setText("Hard");
        hardBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButActionPerformed(evt);
            }
        });

        hardcoreBut.setText("Hardcore");
        hardcoreBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardcoreButActionPerformed(evt);
            }
        });


        backBut.setText("Back");
        backBut.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		backButActionPerformed(evt);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(difSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(defaultBut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sandboxBut)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(easyBut)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mediumBut)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hardBut)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hardcoreBut)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backBut)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(difSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sandboxBut)
                    .addComponent(easyBut)
                    .addComponent(mediumBut)
                    .addComponent(hardBut)
                    .addComponent(hardcoreBut))
                .addGap(68, 68, 68)
                .addComponent(defaultBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(backBut)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>                        

    private void defaultButActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void sandboxButActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void easyButActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void mediumButActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void hardButActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void hardcoreButActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
                                     
    private void backButActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	this.hide();
    	GameFrame settingsTriggered = new GameFrame(new MainMenuPanel());
    }  

    // Variables declaration - do not modify                     
    private javax.swing.JButton backBut;
    private javax.swing.JButton defaultBut;
    private javax.swing.JSlider difSlider;
    private javax.swing.JButton easyBut;
    private javax.swing.JButton hardBut;
    private javax.swing.JButton hardcoreBut;
    private javax.swing.JButton mediumBut;
    private javax.swing.JButton sandboxBut;
    // End of variables declaration   

}
