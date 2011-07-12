/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on Jul 12, 2011, 3:09:18 PM
 */
package views;

/**
 *
 * @author ajohnson
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verticalSplitPane = new javax.swing.JSplitPane();
        splitPaneNestedSplitPeerShareFolder = new javax.swing.JSplitPane();
        splitPanePeerInfoAndLocalShare = new javax.swing.JSplitPane();
        peerInfoPane = new javax.swing.JScrollPane();
        localShareFolderPane = new javax.swing.JScrollPane();
        peerShareFolderPane = new javax.swing.JScrollPane();
        transferInfoPane = new javax.swing.JScrollPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuCloseButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secure Transfer Over SSL Application");

        verticalSplitPane.setDividerLocation(450);
        verticalSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        verticalSplitPane.setName("verticalSplitPane"); // NOI18N

        splitPaneNestedSplitPeerShareFolder.setDividerLocation(500);
        splitPaneNestedSplitPeerShareFolder.setName("splitPaneNestedSplitPeerShareFolder"); // NOI18N

        splitPanePeerInfoAndLocalShare.setDividerLocation(150);
        splitPanePeerInfoAndLocalShare.setName("splitPanePeerInfoAndLocalShare"); // NOI18N

        peerInfoPane.setName("peerInfoPane"); // NOI18N
        splitPanePeerInfoAndLocalShare.setLeftComponent(peerInfoPane);

        localShareFolderPane.setName("localShareFolderPane"); // NOI18N
        splitPanePeerInfoAndLocalShare.setRightComponent(localShareFolderPane);

        splitPaneNestedSplitPeerShareFolder.setLeftComponent(splitPanePeerInfoAndLocalShare);

        peerShareFolderPane.setName("peerShareFolderPane"); // NOI18N
        splitPaneNestedSplitPeerShareFolder.setRightComponent(peerShareFolderPane);

        verticalSplitPane.setTopComponent(splitPaneNestedSplitPeerShareFolder);

        transferInfoPane.setName("transferInfoPane"); // NOI18N
        verticalSplitPane.setRightComponent(transferInfoPane);

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText("File");
        fileMenu.setName("fileMenu"); // NOI18N

        fileMenuCloseButton.setText("Close");
        fileMenuCloseButton.setName("fileMenuCloseButton"); // NOI18N
        fileMenu.add(fileMenuCloseButton);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verticalSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verticalSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuCloseButton;
    private javax.swing.JScrollPane localShareFolderPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane peerInfoPane;
    private javax.swing.JScrollPane peerShareFolderPane;
    private javax.swing.JSplitPane splitPaneNestedSplitPeerShareFolder;
    private javax.swing.JSplitPane splitPanePeerInfoAndLocalShare;
    private javax.swing.JScrollPane transferInfoPane;
    private javax.swing.JSplitPane verticalSplitPane;
    // End of variables declaration//GEN-END:variables
}
