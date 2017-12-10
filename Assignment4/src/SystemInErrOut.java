/*
 System.in:
System.in is an InputStream which is typically connected to keyboard input of console programs. 
System.in is not used as often since data is commonly passed to a command line Java application via command line arguments, or configuration files.
 In applications with GUI the input to the application is given via the GUI. This is a separate input mechanism from Java IO.

System.out:
System.out is a PrintStream. System.out normally outputs the data you write to it to the console.
 This is often used from console-only programs like command line tools. 
 This is also often used to print debug statements of from a program
  (though it may arguably not be the best way to get debug info out of a program).

System.err
System.err is a PrintStream. System.err works like System.out except it is normally only used to output error texts. 
Some programs (like Eclipse) will show the output to System.err in red text,
 to make it more obvious that it is error text.
 */
public class SystemInErrOut {

}
