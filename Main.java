//My imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class Main
{ 
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame("Jin Book app");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Must Have Line
    frame1.setSize(500, 500);
    frame1.setVisible(true);

    //add panels
    JPanel panel1 = new JPanel(new GridLayout(5,5, 20,20));

    //Labels and textfields
    JLabel label1 = new JLabel("Book that i am currently reading");
    JTextField textfield1 = new JTextField(10);
    JLabel label2 = new JLabel("Books that i want to read");
    JTextField textfield2 = new JTextField(10);
    JLabel label3 = new JLabel("I dont have a favorite genre.");
    

    //Button 1
    JButton button1 = new JButton("Count Books");

    button1.addActionListener(new ActionListener()
    {
      int bookamt = 0;
      public void actionPerformed (ActionEvent e)
      {
        System.out.println("Amount of books went up 1");
        bookamt++;
        System.out.println("You have " + bookamt + " books");
      }//end block of what button will do
    });//end action listener
    
    //Button 2
    JButton button2 = new JButton("What books have I read?");

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed (ActionEvent e)
      {
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("Dracula");
        bookList.add("Frankenstein");
        bookList.add("1984");
        bookList.add("Animal Farm");
        System.out.println(bookList);
      }
    });//end action listener

    //button3
    JButton  button3 = new JButton("Update Genre");

      button3.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
           String[] genre = {"I like fiction", "I like fantasy",
           "I like horror", "I like mystery"};
            String newText = genre[(int)(Math.random() * genre.length)];
            label3.setText(newText);
          }//end the block of what the button will do
      }); //end the ActionListener

    panel1.add(button1);
    panel1.add(button2);
    panel1.add(label1);
    panel1.add(textfield1);
    panel1.add(label2);
    panel1.add(textfield2);
    panel1.add(label3);
    panel1.add(button3);

    //Panel 2
    JPanel panel2 = new JPanel(new BorderLayout(10, 10));

    //Add image
    ImageIcon bookImg = new ImageIcon("book.png");
    JLabel bookLabelPic = new JLabel(bookImg);
    panel2.add(bookLabelPic);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.CENTER, panel2);
  }//end main method
}//end main class
