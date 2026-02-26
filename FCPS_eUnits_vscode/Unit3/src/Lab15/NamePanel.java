   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.4.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class NamePanel extends JPanel
   {
      private JComponent myComponent;
      public NamePanel(JComponent arg)
      {
         myComponent = arg;
      
         setLayout(new FlowLayout());
      
         JRadioButton button1 = new JRadioButton("Serif");
         button1.addItemListener(new Listener("Serif"));
         button1.setSelected(false);
         add(button1);
      
         JRadioButton button2 = new JRadioButton("SansSerif");
         button2.addItemListener(new Listener("SansSerif"));
         button2.setSelected(false);
         add(button2);
      
         JRadioButton button3 = new JRadioButton("Monospaced");
         button3.addItemListener(new Listener("Monospaced"));
         button3.setSelected(false);
         add(button3);
      
         ButtonGroup group = new ButtonGroup(); //logical association
         group.add(button1);
         group.add(button2);
         group.add(button3);
      
         String name = myComponent.getFont().getName();
         if(name.equals("Monospaced"))
            button3.setSelected(true);
         else if(name.equals("SansSerif"))
            button2.setSelected(true);
         else //default to serif
         {
            button1.setSelected(true);
            Font f = myComponent.getFont();
            myComponent.setFont(new Font("Serif", f.getStyle(), f.getSize()));
         }
      }
      private class Listener implements ItemListener
      {
         private String myName;
         public Listener(String x)
         {
            myName = x;
         }
         public void itemStateChanged(ItemEvent e)
         {
            Font f = myComponent.getFont();
            myComponent.setFont(new Font(myName, f.getStyle(), f.getSize()));
         }
      }
   }