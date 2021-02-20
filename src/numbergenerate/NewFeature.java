package numbergenerate;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;
import java.awt.SystemColor;
public class NumberGenerate extends javax.swing.JFrame {
    public NumberGenerate() {
    	addComponentListener(new ComponentAdapter() {
    		@Override
    		public void componentResized(ComponentEvent e) {
    		}
    	});
    	getContentPane().setBackground(Color.CYAN);
        initComponents();
        this.jButton4.setVisible(false);
    }
    double currentNumber;
    double PredictedNumber=Math.floor(Math.random()*100);;
    int i; 
    SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
   @Override
   protected Void doInBackground() throws Exception {
    while (i <= 100) {
           Thread.sleep(1000);
           currentNumber = Math.floor(Math.random() * 100);
           String Num =String.valueOf(currentNumber);
            if(i>=101)
            {
            jLabel1.setText("User fails and Game Is Over" );
            jButton4.setVisible(true);
            }
            else
           SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                   jLabel1.setText(Num);
               }
           });}
    return null;
   }
  };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(Color.ORANGE);
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(Color.BLACK);
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.RED);
        setForeground(Color.RED);
        setIconImages(null);

        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To Random Number Game");
        jLabel1.setBorder(new MatteBorder(4, 5, 5, 5, (Color) null));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(Color.YELLOW);
        jButton1.setFont(new Font("Times New Roman", Font.BOLD, 17)); // NOI18N
        jButton1.setText("higher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(Color.YELLOW);
        jButton2.setFont(new Font("Times New Roman", Font.BOLD, 17)); // NOI18N
        jButton2.setText("lower");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(Color.RED);
        jButton3.setFont(new Font("Times New Roman", Font.BOLD, 17)); // NOI18N
        jButton3.setText("Start/Play");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Current Number Is 20");

        jButton4.setBackground(Color.YELLOW);
        jButton4.setFont(new Font("Times New Roman", Font.BOLD, 17)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(184)
        			.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
        			.addGap(68)
        			.addComponent(jButton4)
        			.addContainerGap(188, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(84)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(112))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(203, Short.MAX_VALUE)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(93)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(41, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(33))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(currentNumber < PredictedNumber)
        {  
           String Num = String.valueOf(currentNumber);
             SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                   jLabel2.setText("Your Prediction is true and current Number is ="+Num );
               }
           });      }
        else {
        
             SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                   jLabel1.setText("Fail and Game Over" );
                   jLabel2.setVisible(false);
               }
           });
             i=101;
             
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        worker.execute();
        String Num = String.valueOf(PredictedNumber);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(currentNumber < PredictedNumber)
        {
           String Num = String.valueOf(currentNumber);
             SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                   jLabel2.setText("Your prediction is true and current Number is ="+Num ); }
           });  }
        else {           
             SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                   jLabel1.setText("Fail and Game Over" );
                   jLabel2.setVisible(false);
               }});
             i=101;        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberGenerate().setVisible(true); }
        });}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
}
