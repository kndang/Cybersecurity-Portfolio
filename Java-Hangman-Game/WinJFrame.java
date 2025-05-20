package hangman;

public class WinJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private HangmanJFrame hangmanJFrame;
    private StartJFrame startFrame;
    @SuppressWarnings("unused")
	private int lives;
    private javax.swing.JButton endGame_jButton;
    private javax.swing.JLabel info_jLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newGame_jButton;
    private javax.swing.JLabel word_jLabel;

    public WinJFrame() {

        initComponents();
    }

    public void setHangmanJFrame(HangmanJFrame hangmanJFrame) {
        this.hangmanJFrame = hangmanJFrame;
    }

    public void setStartFrame(StartJFrame startFrame) {
        this.startFrame = startFrame;
    }



    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        info_jLabel = new javax.swing.JLabel();
        endGame_jButton = new javax.swing.JButton();
        newGame_jButton = new javax.swing.JButton();
        word_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 102, 0));

        info_jLabel.setBackground(new java.awt.Color(255, 102, 0));
        info_jLabel.setFont(new java.awt.Font("Forte", 0, 48));
        info_jLabel.setForeground(new java.awt.Color(255, 255, 255));

        endGame_jButton.setBackground(new java.awt.Color(255, 0, 51));
        endGame_jButton.setFont(new java.awt.Font("Forte", 1, 12));
        endGame_jButton.setText("END GAME");
        endGame_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnListener(evt);
            }
        });

        newGame_jButton.setBackground(new java.awt.Color(0, 255, 0));
        newGame_jButton.setFont(new java.awt.Font("Forte", 1, 12));
        newGame_jButton.setText("NEW GAME");
        newGame_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnListener(evt);
            }
        });

        word_jLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        word_jLabel.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(endGame_jButton)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(word_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(info_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(newGame_jButton)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(info_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(endGame_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(newGame_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(157, 157, 157)))
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

    private void exitBtnListener(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void newGameBtnListener(java.awt.event.ActionEvent evt) {

        startFrame.setVisible(true);
        this.setVisible(false);
    }

    public void setText(String text) {
        info_jLabel.setText(text);
    }

    public void setWord(String text) {
        word_jLabel.setText(text);
    }





}
