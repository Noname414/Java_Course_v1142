   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.4.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class StylePanel extends JPanel
   {
      private JComponent myComponent;
      public StylePanel(JComponent arg)
      {
         myComponent = arg;
      
         setLayout(new FlowLayout());
         JCheckBox box1 = new JCheckBox("Bold");
         box1.addItemListener(new Listener(Font.BOLD));
         add(box1);
         JCheckBox box2 = new JCheckBox("Italic");
         box2.addItemListener(new Listener(Font.ITALIC));
         add(box2);
      
         int style = myComponent.getFont().getStyle();
         if(style == Font.BOLD)
            box1.setSelected(true);
         else if(style == Font.ITALIC)
            box2.setSelected(true);
         else if(style == (Font.BOLD | Font.ITALIC))
         {
            box1.setSelected(true);
            box2.setSelected(true);
         }
      }
      private class Listener implements ItemListener
      {
         private int myStyle;
         public Listener(int x)
         {
            myStyle = x;
         }
         public void itemStateChanged(ItemEvent e)
         {
            Font f = myComponent.getFont();
            int style = f.getStyle();
            if(e.getStateChange() == ItemEvent.SELECTED)
            {
               style += myStyle;
            }
            else
            {
               style -= myStyle;
            }
            myComponent.setFont(new Font(f.getName(), style, f.getSize()));
         }
      }
   }