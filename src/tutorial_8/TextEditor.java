package tutorial_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextEditor extends JFrame implements ActionListener
{
    JTextArea area;
    JMenuItem newFile, clear, exit, cut, copy, paste;
    TextEditor()
    {
        setTitle("Simple Text Editor");
        setSize(600,400);
        area=new JTextArea();
        JScrollPane scroll=new JScrollPane(area);
        add(scroll);
        JMenuBar bar=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        newFile=new JMenuItem("New");
        clear=new JMenuItem("Clear");
        exit=new JMenuItem("Exit");
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        file.add(newFile);
        file.add(clear);
        file.add(exit);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        bar.add(file);
        bar.add(edit);
        setJMenuBar(bar);
        newFile.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==newFile)
        {
            area.setText("");
        }
        else if(e.getSource()==clear)
        {
            area.setText("");
        }
        else if(e.getSource()==exit)
        {
            System.exit(0);
        }
        else if(e.getSource()==cut)
        {
            area.cut();
        }
        else if(e.getSource()==copy)
        {
            area.copy()
        }
        else if(e.getSource()==paste)
        {
            area.paste();
        }
    }
    public static void main(String args[])
    {
        new TextEditor();
    }
}
