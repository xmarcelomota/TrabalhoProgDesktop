//Emmanuel Capelini Magalhães RA:1351559
//Marcelo Caetano Mota RA:1349759
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Codigos.Cliente;
import Codigos.Hardware;
import Codigos.ImprimeObjeto;
import Codigos.ManipuladorArquivos;
import Codigos.Software;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author marcelo
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        comboBox1 = new javax.swing.JComboBox<>();
        btnCarregar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuNovoHardware = new javax.swing.JMenuItem();
        menuNovoCliente = new javax.swing.JMenuItem();
        menuNovoSoftware = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuVerHardware = new javax.swing.JMenuItem();
        menuVerCliente = new javax.swing.JMenuItem();
        menuVerSoftware = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware", "Cliente", "Software" }));
        comboBox1.setToolTipText("Selecione o item para ser exibido na área de texto");
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });

        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.setFocusable(false);
        btnApagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnApagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o item");

        jLabel2.setText("Selecione a Ação");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setText("Adicionar");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenu3.setText("Adicionar");

        menuNovoHardware.setText("Hardware");
        menuNovoHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoHardwareActionPerformed(evt);
            }
        });
        jMenu3.add(menuNovoHardware);

        menuNovoCliente.setText("Cliente");
        menuNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoClienteActionPerformed(evt);
            }
        });
        jMenu3.add(menuNovoCliente);

        menuNovoSoftware.setText("Software");
        menuNovoSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoSoftwareActionPerformed(evt);
            }
        });
        jMenu3.add(menuNovoSoftware);

        jMenu1.add(jMenu3);

        jMenu4.setText("Carregar");

        menuVerHardware.setText("Hardware");
        menuVerHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerHardwareActionPerformed(evt);
            }
        });
        jMenu4.add(menuVerHardware);

        menuVerCliente.setText("Cliente");
        menuVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerClienteActionPerformed(evt);
            }
        });
        jMenu4.add(menuVerCliente);

        menuVerSoftware.setText("Software");
        menuVerSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerSoftwareActionPerformed(evt);
            }
        });
        jMenu4.add(menuVerSoftware);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCarregar)
                        .addGap(27, 27, 27)
                        .addComponent(btnNovo)
                        .addGap(29, 29, 29)
                        .addComponent(btnEditar)
                        .addGap(29, 29, 29)
                        .addComponent(btnApagar)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(196, 196, 196))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApagar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCarregar)
                                .addComponent(btnEditar)
                                .addComponent(btnNovo))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        String textoCarregado = ImprimeObjeto.imprimeConteudo(comboBox1.getSelectedItem(),flagTipoObj);
        jTextArea1.setText(textoCarregado);
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void menuVerSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerSoftwareActionPerformed
        // Carrega todo o conteudo do BD de software para a combobox
        File arquivo = new File("/Users/marcelo/Documents/bdSoftware.bin");
        ObjectInputStream leitor = ManipuladorArquivos.CriaLeitorBinario(arquivo);
        ArrayList<Software> bdHard = new ArrayList<Software>();
        bdHard = (ArrayList) ManipuladorArquivos.LeObjeto(leitor);
        //Tenta fechar o outputsteam. Se não der certo no software, melhor tentar alguma coisa
        try {
            leitor.close();
        } catch (IOException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel comboBAtualizada = new DefaultComboBoxModel(bdHard.toArray());
        comboBox1.setModel(comboBAtualizada);
        DefaultListCellRenderer novoRender = new DefaultListCellRenderer(){
            @Override  
        public Component getListCellRendererComponent(
            JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus)
        {
            super.getListCellRendererComponent(list, value, index,
                isSelected, cellHasFocus);

                if(value != null){
                 Software cli = (Software)value;
                 setText( cli.getNomeProduto());
                }
            return this;
        }
        };
        comboBox1.setRenderer(novoRender);
        flagTipoObj = 3;
    }//GEN-LAST:event_menuVerSoftwareActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox1ActionPerformed

    private void menuNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoClienteActionPerformed
        NovoCliente nc = new NovoCliente();
        nc.setVisible(true);
    }//GEN-LAST:event_menuNovoClienteActionPerformed

    private void menuVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerClienteActionPerformed
        // Carrega todo o conteudo do BD de clientes para a combobox
        File arquivo = new File("/Users/marcelo/Documents/bdCliente.bin");
        ObjectInputStream leitor = ManipuladorArquivos.CriaLeitorBinario(arquivo);
        ArrayList<Cliente> bdCli = new ArrayList<Cliente>();
        bdCli = (ArrayList) ManipuladorArquivos.LeObjeto(leitor);
        //Tenta fechar o outputsteam. Se não der certo no software, melhor tentar alguma coisa
        try {
            leitor.close();
        } catch (IOException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel comboBAtualizada = new DefaultComboBoxModel(bdCli.toArray());
        comboBox1.setModel(comboBAtualizada);
        DefaultListCellRenderer novoRender = new DefaultListCellRenderer(){
            @Override  
        public Component getListCellRendererComponent(
            JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus)
        {
            super.getListCellRendererComponent(list, value, index,
                isSelected, cellHasFocus);

                if(value != null){
                 Cliente cli = (Cliente)value;
                 setText( cli.getNome());
                }
            return this;
        }
        };
        comboBox1.setRenderer(novoRender);
        flagTipoObj = 2;
    }//GEN-LAST:event_menuVerClienteActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       // Implementar edição de conteúdo aqui
       switch(flagTipoObj){
            case 1: {
                //Edita um Hardware
                Hardware har = (Hardware)comboBox1.getSelectedItem();
                int index = comboBox1.getSelectedIndex();
                EditorHardware edit = new EditorHardware(har.getNomePeca(),har.getMarca(),har.getPreco(),har.getPlataforma(),har.getDescricao(),index);
                edit.setVisible(true);
                break;
            }
            case 2: {
                //Edita um Cliente
                Cliente cl = (Cliente)comboBox1.getSelectedItem();
                int index = comboBox1.getSelectedIndex();
                EditorClientes edit = new EditorClientes(cl.getNome(),cl.getEndereco(),cl.getCpf(),cl.getnCartaoCredito(),cl.getCep(),index);
                edit.setVisible(true);
                break;
            }
            case 3: {
                //Implementar para software
                Software sof = (Software)comboBox1.getSelectedItem();
                int index = comboBox1.getSelectedIndex();
                EditorSoftware edit = new EditorSoftware(sof.getNomeProduto(),sof.getPlataforma(),sof.getProdutora(),sof.getPreco(),sof.getDescricao(),index);
                edit.setVisible(true);
                break;
            }
            default:{
                //Se não foi carregado nenhum conteúdo e a Combo Box ainda está com Hardware, Software e Cliente
                JOptionPane.showMessageDialog(this, "Não foi carregado nenhum banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        //Deleta o conteúdo selecionado na ComboBox.
        switch(flagTipoObj){
            case 1: {
                //Deleta um Hardware
                //Lê arquivo de banco de dados
                File arquivo = new File("/Users/marcelo/Documents/bdHardware.bin");
                //Cria Leitor para o banco de dados e carrega para a ArrayList assim como se estivesse instanciando
                ObjectInputStream leitor = ManipuladorArquivos.CriaLeitorBinario(arquivo);
                ArrayList<Hardware> bdCli = new ArrayList<Hardware>();
                bdCli = (ArrayList) ManipuladorArquivos.LeObjeto(leitor);
                //Remove o o conteúdo selecionado pela combobox da ArrayList
                bdCli.remove(comboBox1.getSelectedIndex());
                try {
                        leitor.close();
                    } catch (IOException ex) {
                        Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                //Instancia um escritor e escreve a nova ArrayList no banco de dados. Depois fecha.
                ObjectOutputStream escritor = ManipuladorArquivos.CriaEscritorBinario(arquivo, false);
                ManipuladorArquivos.EscreveObjeto(escritor, bdCli, true);
            try {
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
                JOptionPane.showMessageDialog(this, "Item de Harware apagado. Por favor, recarregue o banco de dados.");
                break;
            }
            case 2: {
                //Deleta um Cliente
                //Lê arquivo de banco de dados
                File arquivo = new File("/Users/marcelo/Documents/bdCliente.bin");
                //Cria Leitor para o banco de dados e carrega para a ArrayList assim como se estivesse instanciando
                ObjectInputStream leitor = ManipuladorArquivos.CriaLeitorBinario(arquivo);
                ArrayList<Cliente> bdCli = new ArrayList<Cliente>();
                bdCli = (ArrayList) ManipuladorArquivos.LeObjeto(leitor);
                //Remove o o conteúdo selecionado pela combobox da ArrayList
                bdCli.remove(comboBox1.getSelectedIndex());
                try {
                        leitor.close();
                    } catch (IOException ex) {
                        Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                //Instancia um escritor e escreve a nova ArrayList no banco de dados. Depois fecha.
                ObjectOutputStream escritor = ManipuladorArquivos.CriaEscritorBinario(arquivo, false);
                ManipuladorArquivos.EscreveObjeto(escritor, bdCli, true);
            try {
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
                JOptionPane.showMessageDialog(this, "Item de cliente apagado. Por favor, recarregue o banco de dados.");
                break;
            }
            case 3: {
                //Deleta um Software
                //Lê arquivo de banco de dados
                File arquivo = new File("/Users/marcelo/Documents/bdSoftware.bin");
                //Cria Leitor para o banco de dados e carrega para a ArrayList assim como se estivesse instanciando
                ObjectInputStream leitor = ManipuladorArquivos.CriaLeitorBinario(arquivo);
                ArrayList<Software> bdCli = new ArrayList<Software>();
                bdCli = (ArrayList) ManipuladorArquivos.LeObjeto(leitor);
                //Remove o o conteúdo selecionado pela combobox da ArrayList
                bdCli.remove(comboBox1.getSelectedIndex());
                try {
                        leitor.close();
                    } catch (IOException ex) {
                        Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                //Instancia um escritor e escreve a nova ArrayList no banco de dados. Depois fecha.
                ObjectOutputStream escritor = ManipuladorArquivos.CriaEscritorBinario(arquivo, false);
                ManipuladorArquivos.EscreveObjeto(escritor, bdCli, true);
            try {
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
                JOptionPane.showMessageDialog(this, "Item de Software apagado. Por favor, recarregue o banco de dados.");
                break;
            }
            default:{
                //Se não foi carregado nenhum conteúdo e a Combo Box ainda está com Hardware, Software e Cliente
                JOptionPane.showMessageDialog(this, "Não foi carregado nenhum banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        switch(flagTipoObj){
            case 1:{}
            case 2:{
                NovoCliente nc = new NovoCliente();
                nc.setVisible(true);
                break;
            }
            case 3:{}
            default:{
                System.out.println("Calma que já que nois implementa");
            }
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void menuNovoHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoHardwareActionPerformed
        NovoHardware nh = new NovoHardware();
        nh.setVisible(true);
    }//GEN-LAST:event_menuNovoHardwareActionPerformed

    private void menuNovoSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoSoftwareActionPerformed
       NovoSoftware ns = new NovoSoftware();
        ns.setVisible(true);
    }//GEN-LAST:event_menuNovoSoftwareActionPerformed

    private void menuVerHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerHardwareActionPerformed
        // Carrega todo o conteudo do BD de software para a combobox
        File arquivo = new File("/Users/marcelo/Documents/bdHardware.bin");
        ObjectInputStream leitor = ManipuladorArquivos.CriaLeitorBinario(arquivo);
        ArrayList<Hardware> bdHard = new ArrayList<Hardware>();
        bdHard = (ArrayList) ManipuladorArquivos.LeObjeto(leitor);
        //Tenta fechar o outputsteam. Se não der certo no software, melhor tentar alguma coisa
        try {
            leitor.close();
        } catch (IOException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel comboBAtualizada = new DefaultComboBoxModel(bdHard.toArray());
        comboBox1.setModel(comboBAtualizada);
        DefaultListCellRenderer novoRender = new DefaultListCellRenderer(){
            @Override  
        public Component getListCellRendererComponent(
            JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus)
        {
            super.getListCellRendererComponent(list, value, index,
                isSelected, cellHasFocus);

                if(value != null){
                 Hardware cli = (Hardware)value;
                 setText( cli.getNomePeca());
                }
            return this;
        }
        };
        comboBox1.setRenderer(novoRender);
        flagTipoObj = 1;
    }//GEN-LAST:event_menuVerHardwareActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem menuNovoCliente;
    private javax.swing.JMenuItem menuNovoHardware;
    private javax.swing.JMenuItem menuNovoSoftware;
    private javax.swing.JMenuItem menuVerCliente;
    private javax.swing.JMenuItem menuVerHardware;
    private javax.swing.JMenuItem menuVerSoftware;
    // End of variables declaration//GEN-END:variables
    private int flagTipoObj = 0; // 0 - padrao; 1 - Hardware, 2 - Cliente, 3 - Software
    
}
