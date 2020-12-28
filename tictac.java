import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
	int c;
	int d;
	Label u1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	FDemo()
	{
		setResizable(false);
		setBackground(Color.black);
		setForeground(Color.red);
		setTitle("Tic Tac Toe");
		Font f=new Font("Fixedsys",Font.ITALIC,25);
		setFont(f);
		setLayout(null);
		int x=100;
				try{Thread.sleep(200);}catch(Exception e){}
		
		u1=new Label("Lets Start The Game");
		u1.setSize(300,50);
		u1.setLocation(x+50,30);
		add(u1);
						try{Thread.sleep(200);}catch(Exception e){}

		
		b1=new Button();
		b1.setLocation(x,x);
		b1.setSize(x,x);
		add(b1);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b2=new Button();
		b2.setLocation(x+x,x);
		b2.setSize(x,x);
		add(b2);
				try{Thread.sleep(200);}catch(Exception e){}
	
		b3=new Button();
		b3.setLocation(x+x+x,x);
		b3.setSize(x,x);
		add(b3);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b4=new Button();
		b4.setLocation(x,x+x);
		b4.setSize(x,x);
		add(b4);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b5=new Button();
		b5.setLocation(x+x,x+x);
		b5.setSize(x,x);
		add(b5);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b6=new Button();
		b6.setLocation(x+x+x,x+x);
		b6.setSize(x,x);
		add(b6);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b7=new Button();
		b7.setLocation(x,x+x+x);
		b7.setSize(x,x);
		add(b7);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b8=new Button();
		b8.setLocation(x+x,x+x+x);
		b8.setSize(x,x);
		add(b8);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b9=new Button();
		b9.setLocation(x+x+x,x+x+x);
		b9.setSize(x,x);
		add(b9);
				try{Thread.sleep(200);}catch(Exception e){}
		
		b10=new Button("Restart");
		b10.setLocation(x+x-50,x+x+x+x+10);
		b10.setSize(200,50);
		add(b10);
				try{Thread.sleep(200);}catch(Exception e){}
	
		c=0;
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{	
		
		c++;
		Button b=(Button)e.getSource();
		if(e.getSource()==b10)
		{
			b1.setLabel("");
			b2.setLabel("");
			b3.setLabel("");
			b4.setLabel("");
			b5.setLabel("");
			b6.setLabel("");
			b7.setLabel("");
			b8.setLabel("");
			b9.setLabel("");
			b10.setLabel("Restart");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		if(c%2==1)
		u1.setText("Player X Turn");
		else //if(c%2==0)
		u1.setText("Player O Turn");
		
		}
		
			
		else if(c%2==1)
			{	
				b.setLabel("O");
				b.removeActionListener(this);
			}
			else if(c%2==0)
			{
			b.setLabel("X");
			b.removeActionListener(this);
			}
		
		
		String s1=b1.getLabel();
		String s2=b2.getLabel();
		String s3=b3.getLabel();
		String s4=b4.getLabel();
		String s5=b5.getLabel();
		String s6=b6.getLabel();
		String s7=b7.getLabel();
		String s8=b8.getLabel();
		String s9=b9.getLabel();
		String s[]={"no value",s1,s2,s3,s4,s5,s6,s7,s8,s9};
		
		//Winning condition
		for(int i=0;i<=6;i+=3)
		if(s[i+1]==s[i+2]&&s[i+2]==s[i+3]&&s[i+3]=="X")
		{
		u1.setText("Player X Wins");
		rb();
		break;
		}
		else if(s[i+1]==s[i+2]&&s[i+2]==s[i+3]&&s[i+3]=="O")
		{
		u1.setText("Player O Wins");
		rb();
		break;
		}
		
		for(int i=1;i<=3;i++)
			if(s[i]==s[i+3]&&s[i+3]==s[i+6]&&s[i+6]=="X")
			{
				u1.setText("Player X Wins");
				rb();
				break;
			}	
			else if(s[i]==s[i+3]&&s[i+3]==s[i+6]&&s[i+6]=="O")
			{
				u1.setText("Player O Wins");
				rb();
				break;
			}
		
		//diagonals
	    if(s[1]==s[5]&&s[5]==s[9]&&s[9]=="X")
		{
			u1.setText("Player X Wins");
			rb();
		}
		else if(s[1]==s[5]&&s[5]==s[9]&&s[9]=="O")
		{
			u1.setText("Player O Wins");
			rb();
		}
		
		if(s[3]==s[5]&&s[5]==s[7]&&s[7]=="X")
		{
			u1.setText("Player X Wins");
			rb();
		}
		else if(s[3]==s[5]&&s[5]==s[7]&&s[7]=="O")
		{
			u1.setText("Player O Wins");
			rb();

	}
		}
	public void rb()
	{
		b1.removeActionListener(this);
		b2.removeActionListener(this);
		b3.removeActionListener(this);
		b4.removeActionListener(this);
		b5.removeActionListener(this);
		b6.removeActionListener(this);
		b7.removeActionListener(this);
		b8.removeActionListener(this);
		b9.removeActionListener(this);
	}	
}	
	

class tictac
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,600);
		f.setLocation(400,10);
	}
}
		
		
/*
		b1.setLocation(100,100);
		b1.setSize(100,100);
		//b1.setBackground(blu);
		//b1.setForeground(Color.white);
*/		

