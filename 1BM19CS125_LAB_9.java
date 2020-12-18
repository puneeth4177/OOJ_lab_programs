class NewThread extends Thread {
NewThread() {

super("Demo Thread");
System.out.println("Child thread: " + this);
start(); 
}
public void run() {
try {
for(int i=0;i<15;i++) {
System.out.println("Child Thread: CSE");
Thread.sleep(2000);
}
} catch (InterruptedException e) {
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
}
}
class Thread2 {
public static void main(String args[]) {
new NewThread();
try {
for(int i=0;i<3;i++) {
System.out.println("Main Thread: BMS college of Engneering");
Thread.sleep(10000);
}
} catch (InterruptedException e) {
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}
}