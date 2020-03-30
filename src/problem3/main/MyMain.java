/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;
public class MyMain {

    public static void main(String[] args) {
        MyPriorityQueue m = new MyPriorityQueue();
        m.insert(20, 4);
        m.insert(30, 6);
        m.insert(40, 8);
        m.insert(10, 2);
        m.display();
    }
}