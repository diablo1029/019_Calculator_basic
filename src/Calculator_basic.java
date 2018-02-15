import javax.swing.*;
import java.awt.event.*;
 
 
class Calculator implements ActionListener
{
    JFrame frame;
    JTextField textField;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsqrt,bsq,blog,bcub;
 
    static double a=0,b=0,result=0;
    static int operator=0;
 
    Calculator()
    {
        frame=new JFrame("Calculator");
        textField=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");
        bsqrt=new JButton("√");
        bsq=new JButton("^2");
        blog=new JButton("log");
        bcub=new JButton("^3");
        
        textField.setBounds(30,40,350,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        bsq.setBounds(320,100,50,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        bcub.setBounds(320,170,50,40);
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bsqrt.setBounds(320,240,50,40);
        
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        blog.setBounds(320,310,50,40);
        
        bdel.setBounds(60,380,100,40);
        bclr.setBounds(180,380,100,40);
        
        frame.add(textField);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bsub);
        frame.add(bdec);
        frame.add(b0);
        frame.add(beq);
        frame.add(badd);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(bsqrt);
        frame.add(bsq);
        frame.add(blog);
        frame.add(bcub);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        bsqrt.addActionListener(this);
        bsq.addActionListener(this);
        blog.addActionListener(this);
        bcub.addActionListener(this);

    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            textField.setText(textField.getText().concat("1"));
        
        if(e.getSource()==b2)
            textField.setText(textField.getText().concat("2"));
        
        if(e.getSource()==b3)
            textField.setText(textField.getText().concat("3"));
        
        if(e.getSource()==b4)
            textField.setText(textField.getText().concat("4"));
        
        if(e.getSource()==b5)
            textField.setText(textField.getText().concat("5"));
        
        if(e.getSource()==b6)
            textField.setText(textField.getText().concat("6"));
        
        if(e.getSource()==b7)
            textField.setText(textField.getText().concat("7"));
        
        if(e.getSource()==b8)
            textField.setText(textField.getText().concat("8"));
        
        if(e.getSource()==b9)
            textField.setText(textField.getText().concat("9"));
        
        if(e.getSource()==b0)
            textField.setText(textField.getText().concat("0"));
        
        if(e.getSource()==bdec)
            textField.setText(textField.getText().concat("."));
        
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(textField.getText());
            operator=1;
            textField.setText("");
        } 
        
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(textField.getText());
            operator=2;
            textField.setText("");
        }
        
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(textField.getText());
            operator=3;
            textField.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(textField.getText());
            operator=4;
            textField.setText("");
        }
        
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(textField.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
                
                case 5: result=Math.sqrt(a);
                
                case 6: result=Math.pow(a, 2);
                
                case 7: result=Math.pow(a, 3);
        
                default: result=0;
            }
        
            textField.setText(""+result);
        }
        
        if(e.getSource()==bclr) {
            textField.setText("");
        }
        
        if(e.getSource()==bdel)
        {
            String s=textField.getText();
            textField.setText("");
            for(int i=0;i<s.length()-1;i++)
            textField.setText(textField.getText()+s.charAt(i));
        }
        if(e.getSource()==bsqrt) {
        	a=Double.parseDouble(textField.getText());
            operator=5;
            textField.setText("");
        }
        	
    }
 
    public static void main(String...s)
    {
    	/*
    	 double mathTest = Math.pow(10.0, 2.0);
    	
    	System.out.println("10^2 = " + mathTest);
    	
    	mathTest = Math.sqrt(25.0);
    	System.out.println("sqrt(25) = " + mathTest);
    	
    	mathTest = Math.pow(25.0, 0.5);
    	System.out.println("math pow method for sqrt(25) = " + mathTest);
    	
    	mathTest = Math.pow(10.0, 2.5);
    	System.out.println("math pow method for sqrt(25) = " + mathTest);
    	
    	mathTest = Math.log10(5);
    	System.out.println("math log10 method for 500.0 = " + mathTest); 
    	*/
    	
        new Calculator();
    }
}