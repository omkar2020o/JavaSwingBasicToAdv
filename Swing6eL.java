/*
Event handling
steps follows:
step 1: implement ActionListener interface
step 2: override method public void actionPerformed(ActionEvent e){}
step 3: bind the ActionListner to the components by using addActionListner() method

Event handling: simple event handling
class Myframe implement ActionListner
{
 Myframe()
{
  btn.addActionListner(this);
  }
  public vooid actionPerformed(ActionEvent e)
  {
  }
  }

  class Main
  {
  public static void main(String args[])
  Myframe f=new Myframe();
  }
 */



/*
Event handling: using anonymous inner class

class Main
{
    public static void main(String[] args) {
        btn.addActionListner(new ActionListener(){
            public void ActionPerformed(ActionEvent e)
            {

            }
        });
    }
}
*/
/*
Eb]vent Handling: using another class

class Main{
    public static void main(String[] args) {
        btn.addActionListner(new redclass());
    }
}

class redclass implement ActionListner{
    public void ActionPerformed(ActionEvent e){

    }
}
*/

