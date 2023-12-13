package gui_uas_pbo;

public class GUI_UAS_PBO extends javax.swing.JFrame {
    public GUI_UAS_PBO() {
        initComponents();
    }                       
    private void initComponents() {
        ImageProfil = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel("MUHAMMAD ASRORUDDIN");
        LabelNIM = new javax.swing.JLabel("NIM:");
        NIMdanJurusan = new javax.swing.JLabel("21120121130080  |  Teknik Komputer S1");
        Header1 = new javax.swing.JLabel();
        Header2 = new javax.swing.JLabel();
        jPanelUtama = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelDosen = new javax.swing.JLabel("Dosen wali : ");
        NamaDosenWali = new javax.swing.JLabel("Kurniawan Teguh Martono, S.T., M.T.");
        NipDosen = new javax.swing.JLabel("(NIP: 198303192010121002)");
        LabelAngkatan = new javax.swing.JLabel("Tahun Angkatan");
        LabelSemester = new javax.swing.JLabel("Semester Studi");
        TahunAngkatan = new javax.swing.JLabel("2021");
        Semester = new javax.swing.JLabel("5");
        jLabel16 = new javax.swing.JLabel("|");
        jPanel2 = new javax.swing.JPanel();
        LabelMatkul = new javax.swing.JLabel("Pemrograman Berorientasi Objek");
        ImageUndip = new javax.swing.JLabel();
        LabelUndip = new javax.swing.JLabel("Universitas Diponegoro");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ImageProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_uas_pbo/profil.jpg"))); // NOI18N
        getContentPane().add(ImageProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, 80, 80));
        LabelNama.setFont(new java.awt.Font("Roboto", 1, 14));
        LabelNama.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 190, 30));
        LabelNIM.setFont(new java.awt.Font("Roboto", 1, 12));
        LabelNIM.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(LabelNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));
        NIMdanJurusan.setFont(new java.awt.Font("Roboto", 0, 12));
        NIMdanJurusan.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(NIMdanJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));
        Header1.setBackground(new java.awt.Color(0, 51, 241));
        Header1.setAlignmentY(0.0F);
        Header1.setOpaque(true);
        getContentPane().add(Header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 480, 60));
        Header2.setBackground(new java.awt.Color(255, 255, 255));
        Header2.setOpaque(true);
        getContentPane().add(Header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 480, 50));
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 328));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LabelDosen.setFont(new java.awt.Font("Roboto", 1, 12));
        jPanel1.add(LabelDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 43, -1, -1));
        NamaDosenWali.setFont(new java.awt.Font("Roboto", 0, 12));
        jPanel1.add(NamaDosenWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 43, -1, -1));
        NipDosen.setFont(new java.awt.Font("Roboto", 0, 12));
        jPanel1.add(NipDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 69, -1, -1));
        LabelAngkatan.setFont(new java.awt.Font("Roboto", 0, 14));
        LabelAngkatan.setForeground(new java.awt.Color(51, 51, 51));
        LabelAngkatan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelAngkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, 135, 25));
        LabelSemester.setFont(new java.awt.Font("Roboto", 0, 12));
        LabelSemester.setForeground(new java.awt.Color(51, 51, 51));
        LabelSemester.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 112, 125, 25));
        TahunAngkatan.setFont(new java.awt.Font("Roboto", 0, 24));
        TahunAngkatan.setForeground(new java.awt.Color(102, 102, 102));
        TahunAngkatan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TahunAngkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 135, 38));
        Semester.setFont(new java.awt.Font("Roboto", 0, 24));
        Semester.setForeground(new java.awt.Color(102, 102, 102));
        Semester.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 143, 125, 38));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 70));
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 60, 70));
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(170, 210));
        LabelMatkul.setFont(new java.awt.Font("Times New Roman", 1, 10));
        LabelMatkul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageUndip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageUndip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_uas_pbo/Undip.png"))); // NOI18N
        LabelUndip.setFont(new java.awt.Font("Times New Roman", 0, 11));
        LabelUndip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImageUndip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMatkul, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(LabelUndip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(LabelMatkul)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ImageUndip, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(LabelUndip).addContainerGap(13, Short.MAX_VALUE))
        );
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanelUtama);
        jPanelUtama.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().add(jPanelUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 490, 220));
        pack();
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
            java.util.logging.Logger.getLogger(GUI_UAS_PBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_UAS_PBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_UAS_PBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_UAS_PBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_UAS_PBO().setVisible(true);
            }
        });
    }                    
    private javax.swing.JLabel Header1;
    private javax.swing.JLabel Header2;
    private javax.swing.JLabel ImageProfil;
    private javax.swing.JLabel ImageUndip;
    private javax.swing.JLabel LabelAngkatan;
    private javax.swing.JLabel LabelDosen;
    private javax.swing.JLabel LabelMatkul;
    private javax.swing.JLabel LabelNIM;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelSemester;
    private javax.swing.JLabel LabelUndip;
    private javax.swing.JLabel NIMdanJurusan;
    private javax.swing.JLabel NamaDosenWali;
    private javax.swing.JLabel NipDosen;
    private javax.swing.JLabel Semester;
    private javax.swing.JLabel TahunAngkatan;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JPanel jPanel2;               
}