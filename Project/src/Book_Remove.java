
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranshu Pranjal
 */
public class Book_Remove extends javax.swing.JFrame {

    /**
     * Creates new form Book_Remove
     */
    public Book_Remove() {
        initComponents();
       String s=new java.util.Date().toString();
       Date.setText(s.substring(8,10)+" "+s.substring(4,7)+" "+s.substring(24,28));
        this.setResizable(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize-38);
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Date = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFile = new javax.swing.JMenu();
        Start_Page = new javax.swing.JMenuItem();
        Log_Out = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMasters = new javax.swing.JMenu();
        jAuthor = new javax.swing.JMenuItem();
        jGenre = new javax.swing.JMenuItem();
        jPublisher = new javax.swing.JMenuItem();
        jStudent = new javax.swing.JMenuItem();
        jBooks = new javax.swing.JMenu();
        jNewBook = new javax.swing.JMenuItem();
        jIssueBooks = new javax.swing.JMenuItem();
        jBookWanted = new javax.swing.JMenuItem();
        jReturnBooks = new javax.swing.JMenuItem();
        jSearch = new javax.swing.JMenu();
        jSAuthor = new javax.swing.JMenuItem();
        jSBook = new javax.swing.JMenuItem();
        jSPublisher = new javax.swing.JMenuItem();
        jSStudent = new javax.swing.JMenuItem();
        jHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Olympus Library");

        Date.setText("Date");

        jLabel9.setFont(new java.awt.Font("Parchment", 0, 48)); // NOI18N
        jLabel9.setText("The   Olympus   Library ");

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setText("Remove Books:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Accesion Number :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Book Name :");

        jLabel12.setText("Patron :        Athena");

        jLabel11.setText("The Olympus Library");

        jLabel4.setText("© 2017 -2018               All Rights Reserved");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Author :");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Publisher :");

        jButton2.setText("Delete Information from database");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jFile.setText("File");

        Start_Page.setText("Start Page");
        Start_Page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_PageActionPerformed(evt);
            }
        });
        jFile.add(Start_Page);

        Log_Out.setText("Log Out");
        Log_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_OutActionPerformed(evt);
            }
        });
        jFile.add(Log_Out);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jFile.add(Exit);

        jMenuBar1.add(jFile);

        jMasters.setText("Masters");

        jAuthor.setText("Author Master");
        jAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAuthorActionPerformed(evt);
            }
        });
        jMasters.add(jAuthor);

        jGenre.setText("Genre Master");
        jGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenreActionPerformed(evt);
            }
        });
        jMasters.add(jGenre);

        jPublisher.setText("Publisher Master");
        jPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPublisherActionPerformed(evt);
            }
        });
        jMasters.add(jPublisher);

        jStudent.setText("Student Master");
        jStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStudentActionPerformed(evt);
            }
        });
        jMasters.add(jStudent);

        jMenuBar1.add(jMasters);

        jBooks.setText("Books");

        jNewBook.setText("Add New Book");
        jNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewBookActionPerformed(evt);
            }
        });
        jBooks.add(jNewBook);

        jIssueBooks.setText("Issue Books");
        jIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIssueBooksActionPerformed(evt);
            }
        });
        jBooks.add(jIssueBooks);

        jBookWanted.setText("Remove Book");
        jBookWanted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookWantedActionPerformed(evt);
            }
        });
        jBooks.add(jBookWanted);

        jReturnBooks.setText("Return Books");
        jReturnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnBooksActionPerformed(evt);
            }
        });
        jBooks.add(jReturnBooks);

        jMenuBar1.add(jBooks);

        jSearch.setText("Search");

        jSAuthor.setText("Search Author");
        jSAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSAuthorActionPerformed(evt);
            }
        });
        jSearch.add(jSAuthor);

        jSBook.setText("Search Books");
        jSBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSBookActionPerformed(evt);
            }
        });
        jSearch.add(jSBook);

        jSPublisher.setText("Search Publisher");
        jSPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSPublisherActionPerformed(evt);
            }
        });
        jSearch.add(jSPublisher);

        jSStudent.setText("Search Student");
        jSStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSStudentActionPerformed(evt);
            }
        });
        jSearch.add(jSStudent);

        jMenuBar1.add(jSearch);

        jHelp.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jHelp.add(jMenuItem1);

        jMenuBar1.add(jHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel12)
                .addGap(414, 414, 414)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection c;
ResultSet rs;
Statement stmt;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String accno=jTextField1.getText();
String query= "select accession_no,name_book,first_name,middle_name,last_name,publisher_name from book,author,publisher where book.author_no=author.author_no and publisher.publisher_no=book.publisher_no and accession_no="+accno+";";
if(!accno.matches(""))
{
try
{
 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
 stmt= c.createStatement();
 rs=stmt.executeQuery(query);
 rs.next();
 jTextField2.setText(rs.getString(2));
 jTextField3.setText(rs.getString(3)+rs.getString(4)+rs.getString(5));
 jTextField4.setText(rs.getString(6));
 jButton2.setEnabled(true);
}
 catch(Exception e)
 {
 if(e.getMessage().matches("Illegal operation on empty result set."))
     JOptionPane.showMessageDialog(this,"Invalid Accession Number !!");
     jTextField1.setText("");
 }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int accessionno=Integer.parseInt(jTextField1.getText());
int res= JOptionPane.showConfirmDialog(null,"Are you sure youu ant to remove all information regarding this book: "+jTextField2.getText());
if(res==JOptionPane.YES_OPTION)
    {
try
{
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
stmt= c.createStatement();
String query="delete from book where accession_no="+accessionno+";";
stmt.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Record Deleted!");
}
catch (Exception e)
{
    JOptionPane.showMessageDialog(this,"Something went haywire there, why don't you try again ?");
}    
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Start_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_PageActionPerformed
        close();
        Home_Screen s= new Home_Screen();
        s.setVisible(true);
    }//GEN-LAST:event_Start_PageActionPerformed

    private void Log_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_OutActionPerformed
        JOptionPane.showMessageDialog(this,"Please wait a few moments while we tidy up your workstation !!");
        close();
        Security_Screen s= new Security_Screen();
        s.setVisible(true);
    }//GEN-LAST:event_Log_OutActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAuthorActionPerformed
        close();
        Author_Master s= new Author_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jAuthorActionPerformed

    private void jGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenreActionPerformed
        close();
        Genre_Master s= new Genre_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jGenreActionPerformed

    private void jPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPublisherActionPerformed
        close();
        Publisher_Master s= new Publisher_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jPublisherActionPerformed

    private void jStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStudentActionPerformed

    }//GEN-LAST:event_jStudentActionPerformed

    private void jNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewBookActionPerformed
        close();
        File_in_a_new_book s= new File_in_a_new_book();
        s.setVisible(true);
    }//GEN-LAST:event_jNewBookActionPerformed

    private void jIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIssueBooksActionPerformed
        close();
        Book_Issue s= new Book_Issue();
        s.setVisible(true);
    }//GEN-LAST:event_jIssueBooksActionPerformed

    private void jBookWantedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookWantedActionPerformed
        close();
        Book_Remove s= new Book_Remove();
        s.setVisible(true);
    }//GEN-LAST:event_jBookWantedActionPerformed

    private void jReturnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnBooksActionPerformed
        close();
        Book_Return s= new Book_Return();
        s.setVisible(true);
    }//GEN-LAST:event_jReturnBooksActionPerformed

    private void jSAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSAuthorActionPerformed
        close();
        Author_Search s= new Author_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSAuthorActionPerformed

    private void jSBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSBookActionPerformed
        close();
        Book_Search s= new Book_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSBookActionPerformed

    private void jSPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSPublisherActionPerformed
        close();
        Publisher_Search s= new Publisher_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSPublisherActionPerformed

    private void jSStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSStudentActionPerformed
        close();
        Student_Search s= new Student_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSStudentActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        About s= new About();
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Book_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Remove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Log_Out;
    private javax.swing.JMenuItem Start_Page;
    private javax.swing.JMenuItem jAuthor;
    private javax.swing.JMenuItem jBookWanted;
    private javax.swing.JMenu jBooks;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jFile;
    private javax.swing.JMenuItem jGenre;
    private javax.swing.JMenu jHelp;
    private javax.swing.JMenuItem jIssueBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMasters;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jNewBook;
    private javax.swing.JMenuItem jPublisher;
    private javax.swing.JMenuItem jReturnBooks;
    private javax.swing.JMenuItem jSAuthor;
    private javax.swing.JMenuItem jSBook;
    private javax.swing.JMenuItem jSPublisher;
    private javax.swing.JMenuItem jSStudent;
    private javax.swing.JMenu jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem jStudent;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
