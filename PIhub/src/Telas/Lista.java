package Telas;
import DAO.Sessao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lista extends javax.swing.JFrame {


    public Lista() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLista = new javax.swing.JTable();
        textPesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoTudo = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 222, 222));

        tableLista.setBackground(new java.awt.Color(255, 255, 255));
        tableLista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableLista.setForeground(new java.awt.Color(0, 0, 0));
        tableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Plataforma", "Genero", "Progresso", "Favorito"
            }
        ));
        tableLista.setGridColor(new java.awt.Color(71, 0, 76));
        tableLista.setRowSelectionAllowed(false);
        tableLista.setSelectionBackground(new java.awt.Color(71, 0, 76));
        jScrollPane1.setViewportView(tableLista);

        textPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        textPesquisa.setBorder(null);
        textPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPesquisaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(71, 0, 76));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        botaoPesquisar.setBackground(new java.awt.Color(128, 79, 132));
        botaoPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisar.setText("Ok");
        botaoPesquisar.setBorder(null);
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoTudo.setBackground(new java.awt.Color(150, 107, 146));
        botaoTudo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoTudo.setForeground(new java.awt.Color(255, 255, 255));
        botaoTudo.setText("Tudo");
        botaoTudo.setBorder(null);
        botaoTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTudoActionPerformed(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(71, 0, 76));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.setBorder(null);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 25, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void textPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPesquisaActionPerformed
       
    }//GEN-LAST:event_textPesquisaActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
         String titulo = textPesquisa.getText();
    DefaultTableModel model = (DefaultTableModel) tableLista.getModel();
    model.setRowCount(0);

    try (Connection conn = DAO.ConexaoDB.getConexao()) {
        String sql = "SELECT * FROM jogos WHERE nome LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + titulo + "%");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            boolean favorito = rs.getBoolean("Favorito");
            String favoritoTexto = favorito ? "Sim" : "Não";

            model.addRow(new Object[]{
                rs.getInt("ID"),
                rs.getString("Nome"),
                rs.getString("Plataforma"),
                rs.getString("Genero"),
                rs.getString("Progresso"),
                favoritoTexto
            });
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao buscar dados.");
    }
    }//GEN-LAST:event_botaoPesquisarActionPerformed
    private void carregarTabela() {
     try (Connection conn = DAO.ConexaoDB.getConexao()) {
            String sql = "SELECT * FROM jogos";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel) tableLista.getModel();
            modelo.setRowCount(0);
            while(rs.next()){
            int id = rs.getInt("ID");
            String titulo = rs.getString("Nome");
            String autor = rs.getString("Plataforma");
            String genero = rs.getString("Genero");
            String progresso = rs.getString("Progresso");
            boolean favorito = rs.getBoolean("favorito");
            String favoritoTexto = favorito ? "Sim" : "Não";
            
            modelo.addRow(new Object[]{id, titulo, autor, genero, progresso, favoritoTexto});
             }
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }  
}
    private void botaoTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTudoActionPerformed
    carregarTabela();
    }//GEN-LAST:event_botaoTudoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
    new Menu().setVisible(true);
    dispose();    
    }//GEN-LAST:event_botaoVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoTudo;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLista;
    private javax.swing.JTextField textPesquisa;
    // End of variables declaration//GEN-END:variables
}
