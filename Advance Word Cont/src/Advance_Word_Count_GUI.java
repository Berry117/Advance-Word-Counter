
import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Advance_Word_Count_GUI extends JPanel implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected JTextField textField;
    protected JTextArea textArea;
    protected JButton BTN;
    protected JButton Counter;
    static ArrayList<String> Words_In_The_File = new ArrayList<String>();
    static ArrayList<Integer> Occurance_Count = new ArrayList<Integer>();
    static HashMap<String, Integer> Record_Keeper = new HashMap<String, Integer>();
    static String Without_Pun;

    public Advance_Word_Count_GUI() {
        super(new GridBagLayout());

        textArea = new JTextArea(40, 50);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);


        Counter = new JButton("Counter Print");
        Counter.setBounds(10, 10, 20, 50);
        Counter.addActionListener(this);
        Counter.setBackground(Color.white);
        Counter.setVisible(true);
        add(Counter);

        // Add Components to this panel.
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);
    }

    public void actionPerformed(ActionEvent evt) {
        FileInputStream Counting_Document;
        try {
            Counting_Document = new FileInputStream("Counting_Words//Count.txt");
            Scanner Document_Reader = new Scanner(Counting_Document);

            while (Document_Reader.hasNext()) {
                String data = Document_Reader.next();
                Without_Pun = data.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
                System.out.println(data);
                if (Record_Keeper.containsKey(Without_Pun)) {
                    Record_Keeper.put(Without_Pun, Record_Keeper.get(Without_Pun) + 1);
                }

                else if (!Without_Pun.equals("the") && !Without_Pun.equals("me") && !Without_Pun.equals("my")
                        && !Without_Pun.equals("myself") && !Without_Pun.equals("we") && !Without_Pun.equals("our")
                        && !Without_Pun.equals("ours") && !Without_Pun.equals("ourselves") && !Without_Pun.equals("you")
                        && !Without_Pun.equals("your") && !Without_Pun.equals("doing") && !Without_Pun.equals("where")
                        && !Without_Pun.equals("yours") && !Without_Pun.equals("a") && !Without_Pun.equals("why")
                        && !Without_Pun.equals("yourself") && !Without_Pun.equals("an") && !Without_Pun.equals("how")
                        && !Without_Pun.equals("yourselves") && !Without_Pun.equals("the") && !Without_Pun.equals("all")
                        && !Without_Pun.equals("me") && !Without_Pun.equals("and") && !Without_Pun.equals("any")
                        && !Without_Pun.equals("he") && !Without_Pun.equals("but") && !Without_Pun.equals("both")
                        && !Without_Pun.equals("him") && !Without_Pun.equals("if") && !Without_Pun.equals("each")
                        && !Without_Pun.equals("his") && !Without_Pun.equals("or") && !Without_Pun.equals("few")
                        && !Without_Pun.equals("himself") && !Without_Pun.equals("because")
                        && !Without_Pun.equals("more") && !Without_Pun.equals("she") && !Without_Pun.equals("as")
                        && !Without_Pun.equals("most") && !Without_Pun.equals("her") && !Without_Pun.equals("until")
                        && !Without_Pun.equals("other") && !Without_Pun.equals("hers") && !Without_Pun.equals("while")
                        && !Without_Pun.equals("some") && !Without_Pun.equals("herself") && !Without_Pun.equals("of")
                        && !Without_Pun.equals("such") && !Without_Pun.equals("it") && !Without_Pun.equals("at")
                        && !Without_Pun.equals("no") && !Without_Pun.equals("its") && !Without_Pun.equals("by")
                        && !Without_Pun.equals("nor") && !Without_Pun.equals("itself") && !Without_Pun.equals("for")
                        && !Without_Pun.equals("not") && !Without_Pun.equals("they") && !Without_Pun.equals("with")
                        && !Without_Pun.equals("only") && !Without_Pun.equals("them") && !Without_Pun.equals("about")
                        && !Without_Pun.equals("own") && !Without_Pun.equals("their") && !Without_Pun.equals("against")
                        && !Without_Pun.equals("same") && !Without_Pun.equals("theirs")
                        && !Without_Pun.equals("between") && !Without_Pun.equals("so")
                        && !Without_Pun.equals("themselves") && !Without_Pun.equals("into")
                        && !Without_Pun.equals("than") && !Without_Pun.equals("what") && !Without_Pun.equals("through")
                        && !Without_Pun.equals("too") && !Without_Pun.equals("which") && !Without_Pun.equals("during")
                        && !Without_Pun.equals("very") && !Without_Pun.equals("who") && !Without_Pun.equals("before")
                        && !Without_Pun.equals("can") && !Without_Pun.equals("whom") && !Without_Pun.equals("after")
                        && !Without_Pun.equals("will") && !Without_Pun.equals("this") && !Without_Pun.equals("above")
                        && !Without_Pun.equals("just") && !Without_Pun.equals("that") && !Without_Pun.equals("below")
                        && !Without_Pun.equals("don") && !Without_Pun.equals("these") && !Without_Pun.equals("to")
                        && !Without_Pun.equals("should") && !Without_Pun.equals("those") && !Without_Pun.equals("from")
                        && !Without_Pun.equals("now") && !Without_Pun.equals("am") && !Without_Pun.equals("up")
                        && !Without_Pun.equals("is") && !Without_Pun.equals("down") && !Without_Pun.equals("are")
                        && !Without_Pun.equals("in") && !Without_Pun.equals("was") && !Without_Pun.equals("out")
                        && !Without_Pun.equals("were") && !Without_Pun.equals("on") && !Without_Pun.equals("be")
                        && !Without_Pun.equals("off") && !Without_Pun.equals("been") && !Without_Pun.equals("over")
                        && !Without_Pun.equals("being") && !Without_Pun.equals("under") && !Without_Pun.equals("have")
                        && !Without_Pun.equals("again") && !Without_Pun.equals("has") && !Without_Pun.equals("further")
                        && !Without_Pun.equals("has") && !Without_Pun.equals("then") && !Without_Pun.equals("had")
                        && !Without_Pun.equals("once") && !Without_Pun.equals("having") && !Without_Pun.equals("here")
                        && !Without_Pun.equals("do") && !Without_Pun.equals("there") && !Without_Pun.equals("does")
                        && !Without_Pun.equals("when") && !Without_Pun.equals("did") && !Without_Pun.equals("i")) {
                    Record_Keeper.put(Without_Pun, 1);
                }

            }



            ArrayList<Map.Entry<String, Integer>> Rearranged = new ArrayList<>(Record_Keeper.entrySet());

            Collections.sort(Rearranged, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e2.getValue() - e1.getValue();
                }
            });
            if (evt.getSource() == Counter) {

                for (Map.Entry<String, Integer> key : Rearranged) {
                    textArea.append("(" + key.getValue() + ", " + key.getKey() + ")" + "\n");

                }
                Counter.setEnabled(false);

            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Advance Word COunter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 150, 1280, 810);

        // Add contents to the window.
        frame.add(new Advance_Word_Count_GUI());

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event dispatch thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

