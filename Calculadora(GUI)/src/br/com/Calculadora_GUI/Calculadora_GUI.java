package br.com.Calculadora_GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//classe principal
public class Calculadora_GUI extends JFrame{
    //variáveis da classe
    String valor1 = "";
    String valor2 = "";
    String sinal = "";
    JLabel visor = new JLabel();
    JLabel resultado = new JLabel("0");
    JLabel lblUm = new JLabel("1", JLabel.CENTER);
    JLabel lblDois = new JLabel("2", JLabel.CENTER);
    JLabel lblTres = new JLabel("3", JLabel.CENTER);
    JLabel lblQuatro = new JLabel("4", JLabel.CENTER);
    JLabel lblCinco = new JLabel("5", JLabel.CENTER);
    JLabel lblSeis = new JLabel("6", JLabel.CENTER);
    JLabel lblSete = new JLabel("7", JLabel.CENTER);
    JLabel lblOito = new JLabel("8", JLabel.CENTER);
    JLabel lblNove = new JLabel("9", JLabel.CENTER);
    JLabel lblZero = new JLabel("0", JLabel.CENTER);
    JLabel _soma = new JLabel("+", JLabel.CENTER);
    JLabel _subtracao = new JLabel("-", JLabel.CENTER);
    JLabel _divisao = new JLabel("/", JLabel.CENTER);
    JLabel _multiplicacao = new JLabel("*", JLabel.CENTER);
    JLabel _resultado = new JLabel("=", JLabel.CENTER);
    JPanel teclado = new JPanel();
    
    //método construtor
    public Calculadora_GUI(){
        //botão de mostrar o resultado da operação
        _resultado.setSize(224, 27);
        _resultado.setLocation(10, 180);
        _resultado.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                //verifica a operação e faz a conta
                int __resultado;
                valor2 = visor.getText();
                if(sinal.equals("soma")){
                    __resultado = Integer.valueOf(valor1)+Integer.valueOf(valor2);
                    resultado.setText(String.valueOf(__resultado));
                }else if(sinal.equals("subtracao")){
                    __resultado = Integer.valueOf(valor1)-Integer.valueOf(valor2);
                    resultado.setText(String.valueOf(__resultado));
                }else if(sinal.equals("divisao")){
                    __resultado = Integer.valueOf(valor1)/Integer.valueOf(valor2);
                    resultado.setText(String.valueOf(__resultado));
                }else if(sinal.equals("multiplicacao")){
                    __resultado = Integer.valueOf(valor1)*Integer.valueOf(valor2);
                    resultado.setText(String.valueOf(__resultado));
                }
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        
        //mostra o resultado da operação
        _resultado.setForeground(new Color(255, 255, 255));
        _resultado.setCursor(new Cursor(Cursor.HAND_CURSOR));
        _resultado.setBackground(new Color(87, 87, 86));
        _resultado.setOpaque(true);
                
        //botão de multiplicação       
        _multiplicacao.setSize(48, 35);
        _multiplicacao.setLocation(186, 135);
        _multiplicacao.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {    
                //escolhe a operação de multiplicação      
                valor1 = visor.getText();
                visor.setText("");
                sinal = "multiplicacao";
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        _multiplicacao.setForeground(new Color(255, 255, 255));
        _multiplicacao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        _multiplicacao.setBackground(new Color(87, 87, 86));
        _multiplicacao.setOpaque(true);
        
        //botão do zero
        lblZero.setSize(164, 30);
        lblZero.setLocation(10, 137);
        lblZero.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                //mostra o zero no visor
                visor.setText(visor.getText()+"0");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblZero.setForeground(new Color(255, 255, 255));
        lblZero.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblZero.setBackground(new Color(87, 87, 86));
        lblZero.setOpaque(true);
        
        //botão de divisão 
        _divisao.setSize(48, 35);
        _divisao.setLocation(186, 95);
        _divisao.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {   
                //escolhe a operação de divisão
                valor1 = visor.getText();
                visor.setText("");
                sinal = "divisao";
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        _divisao.setForeground(new Color(255, 255, 255));
        _divisao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        _divisao.setBackground(new Color(87, 87, 86));
        _divisao.setOpaque(true);
        
        //botão do nove
        lblNove.setSize(48, 30);
        lblNove.setLocation(126, 97);
        lblNove.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o nove no visor
                visor.setText(visor.getText()+"9");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblNove.setForeground(new Color(255, 255, 255));
        lblNove.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblNove.setBackground(new Color(87, 87, 86));
        lblNove.setOpaque(true);
        
        //botão do oito
        lblOito.setSize(48, 30);
        lblOito.setLocation(68, 97);
        lblOito.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o oito no visor
                visor.setText(visor.getText()+"8");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblOito.setForeground(new Color(255, 255, 255));
        lblOito.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblOito.setBackground(new Color(87, 87, 86));
        lblOito.setOpaque(true);
        
        //botão do sete
        lblSete.setSize(48, 30);
        lblSete.setLocation(10, 97);
        lblSete.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o sete no visor
                visor.setText(visor.getText()+"7");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblSete.setForeground(new Color(255, 255, 255));
        lblSete.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblSete.setBackground(new Color(87, 87, 86));
        lblSete.setOpaque(true);
        
        //botão de subtração
        _subtracao.setSize(48, 35);
        _subtracao.setLocation(186, 55);
        _subtracao.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {    
                //escolhe a operação de subtração
                valor1 = visor.getText();
                visor.setText("");
                sinal = "subtracao";
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        _subtracao.setForeground(new Color(255, 255, 255));
        _subtracao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        _subtracao.setBackground(new Color(87, 87, 86));
        _subtracao.setOpaque(true);
        
        //botão do seis
        lblSeis.setSize(48, 30);
        lblSeis.setLocation(126, 56);
        lblSeis.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o seis no visor
                visor.setText(visor.getText()+"6");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblSeis.setForeground(new Color(255, 255, 255));
        lblSeis.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblSeis.setBackground(new Color(87, 87, 86));
        lblSeis.setOpaque(true);
        
        //botão do cinco
        lblCinco.setSize(48, 30);
        lblCinco.setLocation(68, 56);
        lblCinco.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                 //mostra o cinco no visor
                visor.setText(visor.getText()+"5");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblCinco.setForeground(new Color(255, 255, 255));
        lblCinco.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblCinco.setBackground(new Color(87, 87, 86));
        lblCinco.setOpaque(true);
        
        //botão do quatro
        lblQuatro.setSize(48, 30);
        lblQuatro.setLocation(10, 56);
        lblQuatro.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o quatro no visor
                visor.setText(visor.getText()+"4");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblQuatro.setForeground(new Color(255, 255, 255));
        lblQuatro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblQuatro.setBackground(new Color(87, 87, 86));
        lblQuatro.setOpaque(true);
        
        //botão de soma
        _soma.setSize(48, 35);
        _soma.setLocation(186, 15);
        _soma.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {    
                //escolha a operação de soma
                valor1 = visor.getText();
                visor.setText("");
                sinal = "soma";
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        _soma.setForeground(new Color(255, 255, 255));
        _soma.setCursor(new Cursor(Cursor.HAND_CURSOR));
        _soma.setBackground(new Color(87, 87, 86));
        _soma.setOpaque(true);
        
        //botão do três
        lblTres.setSize(48, 30);
        lblTres.setLocation(126, 15);
        lblTres.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o três no visor
                visor.setText(visor.getText()+"3");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblTres.setForeground(new Color(255, 255, 255));
        lblTres.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblTres.setBackground(new Color(87, 87, 86));
        lblTres.setOpaque(true);
        
        //botão do dois
        lblDois.setSize(48, 30);
        lblDois.setLocation(68, 15);
        lblDois.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o dois no visor
                visor.setText(visor.getText()+"2");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblDois.setForeground(new Color(255, 255, 255));
        lblDois.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblDois.setBackground(new Color(87, 87, 86));
        lblDois.setOpaque(true);
        
        //botão do um
        lblUm.setSize(48, 30);
        lblUm.setLocation(10, 15);
        lblUm.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {                
                //mostra o um no visor
                visor.setText(visor.getText()+"1");
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        lblUm.setForeground(new Color(255, 255, 255));
        lblUm.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblUm.setBackground(new Color(87, 87, 86));
        lblUm.setOpaque(true);
        
        //tela do resultado
        resultado.setOpaque(true);
        resultado.setBackground(new Color(178, 178, 178));
        resultado.setSize(250, 46);
        resultado.setLocation(0, 46);
        
        //tela do visor
        visor.setOpaque(true);
        visor.setForeground(new Color(255, 255, 255));
        visor.setBackground(new Color(87, 87, 86));
        visor.setSize(250, 46);
        visor.setLocation(0, 0);
    
        //configuração do teclado da calculadora
        teclado.setLayout(null);
        teclado.setBackground(new Color(178, 178, 178));
        teclado.setSize(250, 215);
        teclado.setLocation(0, 90);
        teclado.add(lblUm);
        teclado.add(lblDois);
        teclado.add(lblTres);
        teclado.add(_soma);
        teclado.add(lblQuatro);
        teclado.add(lblCinco);
        teclado.add(lblSeis);
        teclado.add(_subtracao);
        teclado.add(lblSete);
        teclado.add(lblOito);
        teclado.add(lblNove);
        teclado.add(_divisao);
        teclado.add(lblZero);
        teclado.add(_multiplicacao);
        teclado.add(_resultado);
        
        //configuração do JFrame
        this.setLayout(null);
        this.setSize(250, 330);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(visor);
        this.add(resultado);
        this.add(teclado);
    }
    
    //método principal    
    public static void main(String[] args){
        Calculadora_GUI calc = new Calculadora_GUI();
        calc.setVisible(true);
    }
}