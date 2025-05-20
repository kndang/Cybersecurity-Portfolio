
package hangman;


public class StartJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HangmanJFrame hangmanJFrame;
    private javax.swing.JButton easy_jButton;
    private javax.swing.JButton hard_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton medium_jButton;


    public StartJFrame() {
        initComponents();
    }




    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        easy_jButton = new javax.swing.JButton();
        medium_jButton = new javax.swing.JButton();
        hard_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        easy_jButton.setBackground(new java.awt.Color(255, 255, 0));
        easy_jButton.setFont(new java.awt.Font("Forte", 1, 18));
        easy_jButton.setText("Easy");
        easy_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyBtnHandler(evt);
            }
        });

        medium_jButton.setBackground(new java.awt.Color(255, 102, 51));
        medium_jButton.setFont(new java.awt.Font("Forte", 1, 18));
        medium_jButton.setText("Medium");
        medium_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumBtnHandler(evt);
            }
        });

        hard_jButton.setBackground(new java.awt.Color(255, 51, 51));
        hard_jButton.setFont(new java.awt.Font("Forte", 1, 18));
        hard_jButton.setText("Hard");
        hard_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardBtnHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hard_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medium_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(easy_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(easy_jButton)
                .addGap(26, 26, 26)
                .addComponent(medium_jButton)
                .addGap(27, 27, 27)
                .addComponent(hard_jButton)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void easyBtnHandler(java.awt.event.ActionEvent evt) {

        this.hangmanJFrame = new HangmanJFrame(8);
        this.hangmanJFrame.setStartFrame(this);
        hangmanJFrame.setHangmanJFrame(hangmanJFrame);
        this.hangmanJFrame.setVisible(true);
        this.setVisible(false);
    }

    private void mediumBtnHandler(java.awt.event.ActionEvent evt) {
        this.hangmanJFrame = new HangmanJFrame(7);
         this.hangmanJFrame.setStartFrame(this);
        hangmanJFrame.setHangmanJFrame(hangmanJFrame);
        this.hangmanJFrame.setVisible(true);
        this.setVisible(false);
    }

    private void hardBtnHandler(java.awt.event.ActionEvent evt) {
        this.hangmanJFrame = new HangmanJFrame(6);
         this.hangmanJFrame.setStartFrame(this);
        hangmanJFrame.setHangmanJFrame(hangmanJFrame);
        this.hangmanJFrame.setVisible(true);
        this.setVisible(false);
    }


    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartJFrame().setVisible(true);
            }
        });
    }








}
