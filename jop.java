import javax.swing.JOptionPane;
import javax.swing.JComboBox;
public class jop {
    public static void main(String args[]){
    // showInputDialog() method
    // allows user to enter something in a pop up
    // message what the user entered will be read as a string and will be returnrd
    
    String output=JOptionPane.showInputDialog("enter your age: ");
    System.out.println(output);

    // showMeassageDialog() method
    // allow you to show some messages on the screen as pop-up window showMessageDialog(null, object message)
    JOptionPane.showMessageDialog(null,"you entered: " +output);
    

    // showConfirmDialog()
    // shoe yes/ no options to take confirmation
    // 0->user enters yes
    //1->1 user selects no
   // -1=>when user abnormally closes the pop-up window
   int choice=JOptionPane.showConfirmDialog(null,"select yes/no","choose",JOptionPane.YES_NO_CANCEL_OPTION);

   // JComboBox is used to show dropdown
   // menu items to user and let tehm choosse one
   // item from drop-down
   String[] items={"apple","orange","banana"};
   JComboBox box =new JComboBox(items);
   JOptionPane.showMessageDialog(null, box);
    String outpust =(String)box.getSelectedItem();
    JOptionPane.showMessageDialog(null,"you selected:  "+outpust);
    


    }
}
