package br.senai.sp.jandira.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

		
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// btn gravar
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGravar.setBounds(64, 290, 89, 23);
		contentPane.add(btnGravar);
		
		// btn limpar
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setBounds(197, 290, 89, 23);
		contentPane.add(btnLimpar);
		
		//btn sair
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(330, 290, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblTitulo = new JLabel("Manipula\u00E7\u00E3o de Arquivos");
		lblTitulo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblTitulo.setBounds(96, 29, 323, 30);
		contentPane.add(lblTitulo);
		
		JLabel lblArquivo = new JLabel("Arquivos");
		lblArquivo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblArquivo.setBounds(64, 81, 89, 23);
		contentPane.add(lblArquivo);
		
		JScrollPane scrollPaneTexto = new JScrollPane();
		scrollPaneTexto.setBounds(64, 115, 355, 166);
		contentPane.add(scrollPaneTexto);
		
		JTextPane textPaneTexto = new JTextPane();
		scrollPaneTexto.setViewportView(textPaneTexto);
		
	//########### ações dos Botões #############
		
		//método ação do botão Gravar
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				
			}
		});
		
		//método ação do botão Limpar
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				
			}
		});
		
		//método ação do botão sair
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				
			}
		});
		
		
	}
}
