
package hangman;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HangmanJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> words = new ArrayList<String>(Arrays.asList("absurd", "azure", "boggle", "buzzing",
            "crypt", "equip", "flopping", "funny", "banana", "pear",
            "science", "glyph", "wave", "secret", "component",
            "walkway", "encyclopedia", "jazz", "fizz", "yummy", "zombie", "zodiac"));
    private static int levelLives;
    private int lives;
    private Canvas canvas;
    private ButtonListener listener;
    private GameController game;
    private List<JButton> buttons = new ArrayList<JButton>();
    protected HangmanJFrame hangmanJFrame;
    private String word;
    private WinJFrame winFrame;
    private StartJFrame startFrame;

    private javax.swing.JButton a_jButton;
    private javax.swing.JButton b_jButton;
    private javax.swing.JPanel button_jPanel3;
    private javax.swing.JButton c_jButton;
    private javax.swing.JButton d_jButton;
    private javax.swing.JButton e_jButton;
    private javax.swing.JButton endGame_jButton;
    private javax.swing.JButton f_jButton;
    private javax.swing.JButton g_jButton;
    private static javax.swing.JLabel guessWorld_jLabel;
    private javax.swing.JButton h_jButton;
    private javax.swing.JButton i_jButton;
    private javax.swing.JPanel info_jPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton j_jButton;
    private javax.swing.JButton k_jButton;
    private javax.swing.JButton l_jButton;
    private static javax.swing.JLabel livesjLabel;
    private javax.swing.JButton m_jButton;
    private javax.swing.JButton n_jButton;
    private javax.swing.JButton o_jButton;
    private javax.swing.JMenuItem openFilejMenuItem;
    private javax.swing.JButton p_jButton;
    private javax.swing.JButton q_jButton;
    private javax.swing.JButton r_jButton;
    private javax.swing.JButton s_jButton;
    private javax.swing.JButton t_jButton;
    private javax.swing.JButton u_jButton;
    private javax.swing.JButton v_jButton;
    private javax.swing.JPanel view_jPanel1;
    private javax.swing.JButton w_jButton;
    private javax.swing.JButton x_jButton;
    private javax.swing.JButton y_jButton;
    private javax.swing.JButton z_jButton;

    public HangmanJFrame(int levelLives) {
        HangmanJFrame.levelLives = levelLives;
        this.lives = levelLives;
        listener = new ButtonListener();
        initComponents();

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(190, 240));
        view_jPanel1.add(canvas);
        this.word = getRandomWord();
        System.out.println("WORD " + this.word);
        game = new GameController(this.word);
        game.setLives(lives);
        livesjLabel.setText(String.valueOf(game.getLives()));
        guessWorld_jLabel.setText(game.showDashes());
        repaint();

    }


    private void initComponents() {

        view_jPanel1 = new javax.swing.JPanel();
        info_jPanel2 = new javax.swing.JPanel();
        guessWorld_jLabel = new javax.swing.JLabel();
        button_jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        t_jButton = new javax.swing.JButton();
        u_jButton = new javax.swing.JButton();
        v_jButton = new javax.swing.JButton();
        w_jButton = new javax.swing.JButton();
        x_jButton = new javax.swing.JButton();
        y_jButton = new javax.swing.JButton();
        z_jButton = new javax.swing.JButton();
        s_jButton = new javax.swing.JButton();
        r_jButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        k_jButton = new javax.swing.JButton();
        l_jButton = new javax.swing.JButton();
        n_jButton = new javax.swing.JButton();
        o_jButton = new javax.swing.JButton();
        p_jButton = new javax.swing.JButton();
        q_jButton = new javax.swing.JButton();
        m_jButton = new javax.swing.JButton();
        j_jButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        a_jButton = new javax.swing.JButton();
        b_jButton = new javax.swing.JButton();
        c_jButton = new javax.swing.JButton();
        d_jButton = new javax.swing.JButton();
        e_jButton = new javax.swing.JButton();
        f_jButton = new javax.swing.JButton();
        g_jButton = new javax.swing.JButton();
        h_jButton = new javax.swing.JButton();
        i_jButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        endGame_jButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        livesjLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFilejMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout view_jPanel1Layout = new javax.swing.GroupLayout(view_jPanel1);
        view_jPanel1.setLayout(view_jPanel1Layout);
        view_jPanel1Layout.setHorizontalGroup(
            view_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        view_jPanel1Layout.setVerticalGroup(
            view_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        guessWorld_jLabel.setFont(new java.awt.Font("Felix Titling", 1, 48)); 
        guessWorld_jLabel.setForeground(new java.awt.Color(51, 0, 204));
        guessWorld_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout info_jPanel2Layout = new javax.swing.GroupLayout(info_jPanel2);
        info_jPanel2.setLayout(info_jPanel2Layout);
        info_jPanel2Layout.setHorizontalGroup(
            info_jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guessWorld_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        info_jPanel2Layout.setVerticalGroup(
            info_jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(guessWorld_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        t_jButton.setBackground(new java.awt.Color(0, 153, 153));
        t_jButton.setText("T");
        t_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        t_jButton.addActionListener(listener);
        buttons.add(t_jButton);

        u_jButton.setBackground(new java.awt.Color(0, 153, 153));
        u_jButton.setText("U");
        u_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        u_jButton.addActionListener(listener);
        buttons.add(u_jButton);

        v_jButton.setBackground(new java.awt.Color(0, 153, 153));
        v_jButton.setText("V");
        v_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        v_jButton.addActionListener(listener);
        buttons.add(v_jButton);

        w_jButton.setBackground(new java.awt.Color(0, 153, 153));
        w_jButton.setText("W");
        w_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        w_jButton.addActionListener(listener);
        buttons.add(w_jButton);

        x_jButton.setBackground(new java.awt.Color(0, 153, 153));
        x_jButton.setText("X");
        x_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        x_jButton.addActionListener(listener);
        buttons.add(x_jButton);

        y_jButton.setBackground(new java.awt.Color(0, 153, 153));
        y_jButton.setText("Y");
        y_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        y_jButton.addActionListener(listener);
        buttons.add(y_jButton);

        z_jButton.setBackground(new java.awt.Color(0, 153, 153));
        z_jButton.setText("Z");
        z_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        z_jButton.addActionListener(listener);
        buttons.add(z_jButton);

        s_jButton.setBackground(new java.awt.Color(0, 153, 153));
        s_jButton.setText("S");
        s_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        s_jButton.addActionListener(listener);
        buttons.add(s_jButton);

        r_jButton.setBackground(new java.awt.Color(0, 153, 153));
        r_jButton.setText("R");
        r_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        r_jButton.addActionListener(listener);
        buttons.add(r_jButton);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(r_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(u_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(v_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(w_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(x_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(y_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(z_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        k_jButton.setBackground(new java.awt.Color(0, 153, 153));
        k_jButton.setText("K");
        k_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        k_jButton.addActionListener(listener);
        buttons.add(k_jButton);

        l_jButton.setBackground(new java.awt.Color(0, 153, 153));
        l_jButton.setText("L");
        l_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        l_jButton.addActionListener(listener);
        buttons.add(l_jButton);

        n_jButton.setBackground(new java.awt.Color(0, 153, 153));
        n_jButton.setText("N");
        n_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        n_jButton.addActionListener(listener);
        buttons.add(n_jButton);

        o_jButton.setBackground(new java.awt.Color(0, 153, 153));
        o_jButton.setText("O");
        o_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        o_jButton.addActionListener(listener);
        buttons.add(o_jButton);

        p_jButton.setBackground(new java.awt.Color(0, 153, 153));
        p_jButton.setText("P");
        p_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        p_jButton.addActionListener(listener);
        buttons.add(p_jButton);

        q_jButton.setBackground(new java.awt.Color(0, 153, 153));
        q_jButton.setText("Q");
        q_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        q_jButton.addActionListener(listener);
        buttons.add(q_jButton);

        m_jButton.setBackground(new java.awt.Color(0, 153, 153));
        m_jButton.setText("M");
        m_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        m_jButton.addActionListener(listener);
        buttons.add(m_jButton);

        j_jButton.setBackground(new java.awt.Color(0, 153, 153));
        j_jButton.setText("J");
        j_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        j_jButton.addActionListener(listener);
        buttons.add(j_jButton);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(j_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(k_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(n_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(o_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(p_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        a_jButton.setBackground(new java.awt.Color(0, 153, 153));
        a_jButton.setText("A");
        a_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        a_jButton.addActionListener(listener);
        buttons.add(a_jButton);

        b_jButton.setBackground(new java.awt.Color(0, 153, 153));
        b_jButton.setText("B");
        b_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        b_jButton.addActionListener(listener);
        buttons.add(b_jButton);

        c_jButton.setBackground(new java.awt.Color(0, 153, 153));
        c_jButton.setText("C");
        c_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        c_jButton.addActionListener(listener);
        buttons.add(c_jButton);

        d_jButton.setBackground(new java.awt.Color(0, 153, 153));
        d_jButton.setText("D");
        d_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        d_jButton.addActionListener(listener);
        buttons.add(d_jButton);

        e_jButton.setBackground(new java.awt.Color(0, 153, 153));
        e_jButton.setText("E");
        e_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        e_jButton.addActionListener(listener);
        buttons.add(e_jButton);

        f_jButton.setBackground(new java.awt.Color(0, 153, 153));
        f_jButton.setText("F");
        f_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        f_jButton.addActionListener(listener);
        buttons.add(f_jButton);

        g_jButton.setBackground(new java.awt.Color(0, 153, 153));
        g_jButton.setText("G");
        g_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        g_jButton.addActionListener(listener);
        buttons.add(g_jButton);

        h_jButton.setBackground(new java.awt.Color(0, 153, 153));
        h_jButton.setText("H");
        h_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        h_jButton.addActionListener(listener);
        buttons.add(h_jButton);

        i_jButton.setBackground(new java.awt.Color(0, 153, 153));
        i_jButton.setText("I");
        i_jButton.setPreferredSize(new java.awt.Dimension(70, 70));
        i_jButton.addActionListener(listener);
        buttons.add(i_jButton);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(a_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(d_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(e_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(g_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(h_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(i_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        endGame_jButton.setBackground(new java.awt.Color(204, 51, 0));
        endGame_jButton.setFont(new java.awt.Font("Forte", 1, 10)); // NOI18N
        endGame_jButton.setForeground(new java.awt.Color(0, 0, 204));
        endGame_jButton.setText("End Game");
        endGame_jButton.setBorder(null);
        endGame_jButton.setBorderPainted(false);
        endGame_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGame_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(endGame_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(endGame_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout button_jPanel3Layout = new javax.swing.GroupLayout(button_jPanel3);
        button_jPanel3.setLayout(button_jPanel3Layout);
        button_jPanel3Layout.setHorizontalGroup(
            button_jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, button_jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        button_jPanel3Layout.setVerticalGroup(
            button_jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(button_jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("  Lives remaining:");

        livesjLabel.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        livesjLabel.setForeground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(livesjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(livesjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setForeground(new java.awt.Color(0, 153, 153));
        jMenu1.setText("Menu");

        openFilejMenuItem.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        openFilejMenuItem.setForeground(new java.awt.Color(0, 102, 102));
        openFilejMenuItem.setText("Open File");
        openFilejMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFile(evt);
            }
        });
        jMenu1.add(openFilejMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view_jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info_jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(view_jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(info_jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void endGame_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);

    }

    public void setStartFrame(StartJFrame startFrame) {
        this.startFrame = startFrame;
    }


    private void openFile(java.awt.event.ActionEvent evt) {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            try  {
            	BufferedReader br = new BufferedReader(new FileReader(selectedFile.getAbsolutePath()));
            List<String> newWordsList =  new ArrayList<String>();
                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {

                   newWordsList.add(sCurrentLine.trim());

                }
                br.close();
                if(newWordsList.size()>0){
                   this.words = newWordsList;
                }else{
                JOptionPane.showMessageDialog(null,
                        "File is empty",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
                startNewGame();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        "Cannot open file",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        }

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setStroke(new BasicStroke(5.0f));
        graphics2D.drawLine(40, 250, 135, 250);//ok

        graphics2D.drawLine(90, 100, 90, 250);//ok

        graphics2D.drawLine(90, 100, 180, 100);
        graphics2D.drawLine(180, 100, 180, 120);

        graphics2D.drawLine(92, 130, 120, 102);

        if (levelLives == 8) {
            if (lives < 8) {
                graphics2D.setStroke(new BasicStroke(2.0f));
                graphics2D.setColor(Color.YELLOW);
                graphics2D.fillOval(165, 120, 30, 30);
            }
            if (lives < 7) {
                graphics2D.setColor(Color.BLACK);
                graphics2D.drawLine(177, 130, 172, 135);
                graphics2D.drawLine(172, 130, 177, 135);

            }
            if (lives < 6) {
                graphics2D.drawLine(187, 130, 182, 135);
                graphics2D.drawLine(182, 130, 187, 135);

            }

        }
        if (levelLives == 7) {
            if (lives < 7) {
                graphics2D.setStroke(new BasicStroke(2.0f));
                graphics2D.setColor(Color.YELLOW);
                graphics2D.fillOval(165, 120, 30, 30);
            }

            if (lives < 6) {
                graphics2D.setColor(Color.BLACK);
                graphics2D.drawLine(177, 130, 172, 135);
                graphics2D.drawLine(172, 130, 177, 135);
                graphics2D.drawLine(187, 130, 182, 135);
                graphics2D.drawLine(182, 130, 187, 135);

            }

        }
        if (levelLives == 6) {
            if (lives < 6) {
                // the head

                graphics2D.setStroke(new BasicStroke(2.0f));
                graphics2D.setColor(Color.YELLOW);
                graphics2D.fillOval(165, 120, 30, 30);

                graphics2D.setColor(Color.BLACK);
                graphics2D.drawLine(177, 130, 172, 135);
                graphics2D.drawLine(172, 130, 177, 135);

                graphics2D.drawLine(187, 130, 182, 135);
                graphics2D.drawLine(182, 130, 187, 135);
            }

        }

        if (lives < 5) {
            //body
            g.drawLine(180, 150, 180, 180);
        }
        if (lives < 4) {
            //left arm

            g.drawLine(180, 160, 160, 145);

        }
        if (lives < 3) {
            //right arm
            g.drawLine(180, 160, 200, 145);
        }

        if (lives < 2) {
            //right leg
            g.drawLine(180, 180, 200, 200);

        }


        if (lives == 0) {
            //left leg
            g.drawLine(180, 180, 160, 200);

        }

    }

    private String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index).toUpperCase();
    }

    public void startNewGame() {
        for (JButton jButton : buttons) {
            jButton.setEnabled(true);
        }
        this.lives = HangmanJFrame.levelLives;
        this.word = getRandomWord();

        game = new GameController(this.word);

        game.setLives(lives);
        livesjLabel.setText(String.valueOf(lives));
        guessWorld_jLabel.setText(game.showDashes());
        repaint();

    }

    private void showWinFrame(String text, String word, int lives) {
        winFrame = new WinJFrame();

        winFrame.setHangmanJFrame(hangmanJFrame);
        winFrame.setStartFrame(startFrame);
        winFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        winFrame.setText(text);
        winFrame.setWord(word);

        winFrame.setVisible(true);

    }

    public void setHangmanJFrame(HangmanJFrame hangmanJFrame) {
        this.hangmanJFrame = hangmanJFrame;
    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String s = event.getActionCommand();

            JButton btn = (JButton) event.getSource();
            btn.setEnabled(false);

            repaint();

            game.guessLetter(s.charAt(0));

            guessWorld_jLabel.setText(game.showDashes());
            livesjLabel.setText(String.valueOf(game.getLives()));

            guessWorld_jLabel.setText(game.showDashes());
            livesjLabel.setText(String.valueOf(game.getLives()));

            lives = game.getLives();

            if (game.isEndGame()) {
                if (word.equals(guessWorld_jLabel.getText()) && game.getLives() > 0) {

                    hangmanJFrame.setVisible(false);

                    showWinFrame("  YOU WIN!", game.showWord(), lives);

                } else {

                    hangmanJFrame.setVisible(false);
                    showWinFrame("GAME OVER!", game.showWord(), lives);

                }

            }

        }
    }




}
