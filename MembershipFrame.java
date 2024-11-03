/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.memberhipframe;
import ac.za.tut.member.Member;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
/**
 *
 * @author hifi
 */
public class MembershipFrame extends JFrame{
//panels
    private JPanel headingPanel;
    private JPanel clientDetailsPanel;
    private JPanel namePanel;
    private JPanel surnamePanel;
    private JPanel IdPanel;
    private JPanel genderPanel;
    private JPanel contractOptionsPanel;
    private JPanel typeOfContractPanel;
    private JPanel personalTrainorPanel;
    private JPanel membershipDetailsPanel;
    private JPanel buttonPanel;
    private JPanel headingAndClientDetailsPanel;
    private JPanel contractAndMembershipPanel;
    private JPanel mainPanel;
    
    // Labels
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel idLabel;
    private JLabel genderLabel;
    private JLabel typeOfContractLabel;
    private JLabel personalTrainorLabel;
    
    //text fields
    private JTextField nameTextField;
    private JTextField surnameTextField;
    private JTextField idTextField;
    
    //radio buttons
    private JRadioButton monthTomonth;
    private JRadioButton sixMonths;
    private JRadioButton annual;
    
    //checkbox
    private JCheckBox personalTrainorBox;
    
    //text area
    private JTextArea membershipTextArea;
    
    //buttons
    private JButton registerButton;
    private JButton displayButton;
    private JButton clearButton;
    private JButton exitButton;
    
    //combobox
    private JComboBox genderComboBox;
    
    //scrollpane
    private JScrollPane scrollpane;
    
    //button group
    private ButtonGroup buttonGroup;
    
    public MembershipFrame() {
        //basic frame settings
        
        setSize(500,550);
        setTitle("Gym Membership");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    //create panels
    headingPanel=new JPanel (new FlowLayout(FlowLayout.CENTER));
    
    clientDetailsPanel=new JPanel(new GridLayout(4,1,1,1));
    clientDetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client details"));
    namePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    surnamePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    IdPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    genderPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    headingAndClientDetailsPanel=new JPanel(new BorderLayout());
    
    contractOptionsPanel=new JPanel(new GridLayout(2,1,1,1));
    contractOptionsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract options"));
    typeOfContractPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    personalTrainorPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    membershipDetailsPanel=new JPanel(new BorderLayout());
    
    contractAndMembershipPanel=new JPanel(new BorderLayout());
    
    buttonPanel=new JPanel (new FlowLayout(FlowLayout.LEFT));
    
    mainPanel=new JPanel(new BorderLayout());
    
    //create Labels
    headingLabel=new JLabel ("Membership Form");
    headingLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
    headingLabel.setForeground(Color.BLUE);
    
    nameLabel=new JLabel ("Name: ");
    surnameLabel=new JLabel ("Surname: ");
    idLabel=new JLabel ("Id no: ");
    genderLabel=new JLabel ("Genger: ");
    typeOfContractLabel=new JLabel ("Type of contract: ");
    personalTrainorLabel=new JLabel ("Select the checkbox if you need a personal trainer");
    
    //create text fields
    nameTextField=new JTextField (10);
    surnameTextField=new JTextField (10);
    idTextField=new JTextField (10);
    
    //create text area
    membershipTextArea=new JTextArea();
    membershipTextArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Member(s) details"));
    
    //create buttons
    registerButton=new JButton("Register");
    registerButton.addActionListener(new RegisterBtnListener());
    
    displayButton=new JButton("Display");
    displayButton.addActionListener(new DisplayBtnListener());
    
    clearButton=new JButton("Clear");
    clearButton.addActionListener(new ClearBtnListener());
    
    exitButton=new JButton("Exit");
    exitButton.addActionListener(new ExitBtnListener());
    
    //create radio buttons
    monthTomonth=new JRadioButton("Month-to-month");
    sixMonths=new JRadioButton("Six months");
    annual=new JRadioButton("Annual");
    
    //create button group
    buttonGroup=new ButtonGroup();
    buttonGroup.add(monthTomonth);
    buttonGroup.add(sixMonths);
    buttonGroup.add(annual);
    
    //creste checkbox
    personalTrainorBox=new JCheckBox();
    
    //create combobox
    genderComboBox=new JComboBox();
    genderComboBox.addItem("Female");
    genderComboBox.addItem("Male");
    
    //create scroll pane
    scrollpane=new JScrollPane(membershipTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    //add components to panels
    headingPanel.add(headingLabel);
    
    namePanel.add(nameLabel);
    namePanel.add(nameTextField);
    
    surnamePanel.add(surnameLabel);
    surnamePanel.add(surnameTextField);
    
    IdPanel.add(idLabel);
    IdPanel.add(idTextField);
    
    genderPanel.add(genderLabel);
    genderPanel.add(genderComboBox);
    
    clientDetailsPanel.add(namePanel);
    clientDetailsPanel.add(surnamePanel);
    clientDetailsPanel.add(IdPanel);
    clientDetailsPanel.add(genderPanel);
    
    headingAndClientDetailsPanel.add(headingPanel,BorderLayout.NORTH);
    headingAndClientDetailsPanel.add(clientDetailsPanel,BorderLayout.CENTER);
    
    typeOfContractPanel.add(typeOfContractLabel);
    typeOfContractPanel.add(monthTomonth);
    typeOfContractPanel.add(sixMonths);
    typeOfContractPanel.add(annual);
    
    personalTrainorPanel.add(personalTrainorLabel);
    personalTrainorPanel.add(personalTrainorBox);
    
    contractOptionsPanel.add(typeOfContractPanel);
    contractOptionsPanel.add(personalTrainorPanel);
    
     membershipDetailsPanel.add(scrollpane);
    membershipDetailsPanel.add(membershipTextArea);
    
    contractAndMembershipPanel.add(contractOptionsPanel, BorderLayout.NORTH);
    contractAndMembershipPanel.add(membershipDetailsPanel, BorderLayout.CENTER);
    
    buttonPanel.add(registerButton);
    buttonPanel.add(displayButton);
    buttonPanel.add(clearButton);
    buttonPanel.add(exitButton);
    
    mainPanel.add(headingAndClientDetailsPanel, BorderLayout.NORTH);
    mainPanel.add(contractAndMembershipPanel, BorderLayout.CENTER);
    mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    add(mainPanel);
        
        setVisible(true);
        
    }
    private class RegisterBtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //create local variables
            String name, surname, gender, id, contractType="";
            boolean ispersonalTrainerSelected;
            Member member;
            int value;
            JFileChooser fc;
            BufferedWriter bw;
            File file;
            
            //get text 
            name=nameTextField.getText();
            surname=surnameTextField.getText();
            id=idTextField.getText();
            gender=(String) genderComboBox.getSelectedItem();
            contractType="Month-to-month";
            ispersonalTrainerSelected=personalTrainorBox.isSelected();
            
            if(sixMonths.isSelected()){
                contractType="Six months";
            }
            else
                if(annual.isSelected()){
                    contractType="Annual";
                }
            
            //ceate a member
            member=new Member(name, surname, id,  gender, contractType, ispersonalTrainerSelected);
            
            //create file chooser
            fc=new JFileChooser();
            
            //create file dialog
            value=fc.showSaveDialog(MembershipFrame.this);
            
            //chech value
            if(value==JFileChooser.APPROVE_OPTION){
                try{
                    file=fc.getSelectedFile();
                    
                    bw=new BufferedWriter(new FileWriter(file));
                    
                    bw.write(member.toString());
                    
                    bw.newLine();
                    
                    bw.close();
                    
                    nameTextField.setText("");
                    surnameTextField.setText("");
                    idTextField.setText("");
                    
                    JOptionPane.showMessageDialog(MembershipFrame.this, "Member Registered");
                }
                catch(IOException ex){
                    System.out.println(ex);
                }
            }
        }
        
    }
    private class DisplayBtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //create local variables
            String data,records="";
            BufferedReader br = null;
            File file;
            JFileChooser fc;
            int value;
            
            //create file chooser
            fc=new JFileChooser();
            
            //create file dialog
            value=fc.showOpenDialog(MembershipFrame.this);
            
            //chech if the returned value is appproved
            if(value==JFileChooser.APPROVE_OPTION){
                try{
                    file=fc.getSelectedFile();
                    
                    br=new BufferedReader(new FileReader(file));
                    while((data=br.readLine())!=null){
                        records=records+data+"\n";
                    }
                    br.close();
                    
                    membershipTextArea.setText(records);
                }
                catch(IOException ex){
                    System.out.println(ex);
                }
            }
        }
    }
    
    private class ClearBtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            nameTextField.setText("");
                    surnameTextField.setText("");
                    idTextField.setText("");
        }
        
    }
    
   private class ExitBtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        
            System.exit(0);
        }
        
    }
}

