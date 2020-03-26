
package tik.tac.toe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TikTacToe extends JFrame
{ 
    private Container c;
    private JPanel panel1,panel2;
    private JTextField player_O_textfield,player_X_textfield,draw_textfield;
    private JButton[] button = new JButton[10]; 
    private Font font = new Font("Times New Roman",Font.BOLD,24);
    
    private String start_icon = "X";
    
    private int player_X_score = 0;
    private int player_O_score = 0;
    private int draw_score = 0;
    
    
    public TikTacToe()
    {
        setFrame();
        setContainer();
        setPanel();
        setTexField();
        setButton();
        setActionLister();
    }
    
    public void setFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void setContainer()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
    }
    
    
    public void setPanel()
    {
        panel1 = new JPanel();
        panel1.setBounds(60,35,280,65);
        panel1.setLayout(new GridLayout());
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(60,120,280,200);
        panel2.setLayout(new GridLayout(3,3));
        c.add(panel2);
    }
    
    public void setTexField()
    {
        player_O_textfield = new JTextField();
        player_O_textfield.setEditable(false);
        player_O_textfield.setFont(font);
        player_O_textfield.setHorizontalAlignment(JTextField.CENTER);
        panel1.add(player_O_textfield);
        
        player_X_textfield = new JTextField();
        player_X_textfield.setEditable(false);
        player_X_textfield.setFont(font);
        player_X_textfield.setHorizontalAlignment(JTextField.CENTER);
        panel1.add(player_X_textfield);
        
        draw_textfield = new JTextField();
        draw_textfield.setEditable(false);
        draw_textfield.setFont(font);
        draw_textfield.setHorizontalAlignment(JTextField.CENTER);
        panel1.add(draw_textfield);
    }
    
    
    
    
    public void setButton()
    {
        
        for(int i= 1;i<10;i++)
        {
            button[i] = new JButton("");
            button[i].setFont(font);
            panel2.add(button[i]);
        }
    
    }
    
    
    public void setActionLister()
    {  
     
            button[1].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[1].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[2].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[2].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[3].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[3].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[4].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[4].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[5].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[5].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[6].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[6].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[7].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[7].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[8].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[8].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
            
            button[9].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    button[9].setText(start_icon);
                    setIcon();
                    checkPlayer();                        
                }   
            });
    }
       
    
    public void allClear()
    {
        for(int i = 1;i<10;i++)
        {
            button[i].setText(null);
        }
    }
    
    public void allEnable()
    {
        for(int i = 1;i<10;i++)
        {
            button[i].setEnabled(true);
        }
    }
    
    public void checkPlayer()
    {
                    if(button[1].getText()=="X"&&button[2].getText()=="X"&&button[3].getText()=="X")
                    {
                          player_x_wins();
                    }
                    if(button[4].getText()=="X"&&button[5].getText()=="X"&&button[6].getText()=="X")
                    {
                          player_x_wins();
                    }
                    if(button[7].getText()=="X"&&button[8].getText()=="X"&&button[9].getText()=="X")
                    {
                          player_x_wins();
                    }
                    if(button[1].getText()=="X"&&button[4].getText()=="X"&&button[7].getText()=="X")
                    {
                          player_x_wins();
                    }
                    if(button[2].getText()=="X"&&button[5].getText()=="X"&&button[8].getText()=="X")
                    {
                          player_x_wins();
                    }
                    if(button[3].getText()=="X"&&button[6].getText()=="X"&&button[9].getText()=="X")
                    {
                          player_x_wins();
                    }
                    if(button[1].getText()=="X"&&button[5].getText()=="X"&&button[9].getText()=="X")
                    {
                          player_x_wins();
                    }
                    if(button[3].getText()=="X"&&button[5].getText()=="X"&&button[7].getText()=="X")
                    {
                          player_x_wins();
                    }
                    
                    
                    if(button[1].getText()=="O"&&button[2].getText()=="O"&&button[3].getText()=="O")
                    {
                          player_O_wins();
                    }
                    if(button[4].getText()=="O"&&button[5].getText()=="O"&&button[6].getText()=="O")
                    {
                          player_O_wins();
                    }
                    if(button[7].getText()=="O"&&button[8].getText()=="O"&&button[9].getText()=="O")
                    {
                          player_O_wins();
                    }
                    if(button[1].getText()=="O"&&button[4].getText()=="O"&&button[7].getText()=="O")
                    {
                          player_O_wins();
                    }
                    if(button[2].getText()=="O"&&button[5].getText()=="O"&&button[8].getText()=="O")
                    {
                          player_O_wins();
                    }
                    if(button[3].getText()=="O"&&button[6].getText()=="O"&&button[9].getText()=="O")
                    {
                          player_O_wins();
                    }
                    if(button[1].getText()=="O"&&button[5].getText()=="O"&&button[9].getText()=="O")
                    {
                          player_O_wins();
                    }
                    if(button[3].getText()=="O"&&button[5].getText()=="O"&&button[7].getText()=="O")
                    {
                          player_O_wins();
                    }
    }
    
    
    
    
    public void setIcon()
    {
        if(start_icon == "X")
        {
           start_icon = "O"; 
        }
        else
        {
           start_icon = "X"; 
        }
    }
    
    public void player_x_wins()
    {
        JOptionPane.showMessageDialog(null, "Player X wins");
        player_X_score = player_X_score + 1;
        player_X_textfield.setText("X = "+player_X_score);
        allClear();
       
    }
    
    public void player_O_wins()
    {
        JOptionPane.showMessageDialog(null, "Player O wins");
        player_O_score = player_O_score + 1;
        player_O_textfield.setText("O = "+player_O_score);
        allClear();
       
    }
    
    
    public static void main(String[] args) 
    {
       TikTacToe frame = new TikTacToe();
       frame.setVisible(true);
    }
    
}
