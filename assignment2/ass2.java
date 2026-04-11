import java.util.Scanner;

public class ass2 {
    public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in);
        BankLinkedList list = new BankLinkedList();
        BankStack history = new BankStack();
        BankQueue bills = new BankQueue();
        BankAccount[] accounts = new BankAccount[3];
        BankQueue1 request = new BankQueue1();

        
            BankAccount user = new BankAccount();
            user.username = "Ali";
            user.balance = 150000;
            list.add(user);

            BankAccount user1 = new BankAccount();
            user1.username = "Sanzhar";
            user1.balance = 200000;
            list.add(user1);

            BankAccount user2 = new BankAccount();
            user2.username = "Merei";
            user2.balance = 300000;
            list.add(user2);

            //list.get();
            //list.find(user1.username);
            //list.deposit(input, history);
            //list.withdraw(input, history);
            //history.peek();
            //history.pop();
            //bills.addBill("Electricity Bill");
            //bills.addBill("Internet Bill");
            //bills.addBill("University Bill");
            //bills.processBill();
            //bills.display();

            //accounts[0] = new BankAccount();
            //accounts[0].username = "Ali";
            //accounts[0].balance = 150000;
        
            //accounts[1] = new BankAccount();
            //accounts[1].username = "Sanzhar";
            //accounts[1].balance = 200000;
        
            //accounts[2] = new BankAccount();
            //accounts[2].username = "Merei";
            //accounts[2].balance = 300000;

            //for (int i = 0; i < accounts.length; i++) {
            //    System.out.println(accounts[i].username + " - " + accounts[i].balance);
            //}

            //request.add("Gulnaz");
            //request.process(list);
            //list.get();

            //part3(input, request, history, list, bills);

            
    }
public static void part3(Scanner input, BankQueue1 request, BankStack history, BankLinkedList list, BankQueue bills){
        while (true) {  
            System.out.println(" ");
            System.out.println("_________PART THREE_________");
            System.out.println("Menu: ");
            System.out.println("1 - Enter Bank");
            System.out.println("2 - Enter ATM");
            System.out.println("3 - Admin Area");
            System.out.println("4 - Exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice==1){choice1(input, request, history, list, bills);}
            else if (choice==2){choice2(input, request, history, list, bills);}
            else if (choice==3){choice3(input, request, history, list, bills);}
            else if (choice==4){
                System.out.println(" ");
                System.out.println("Exiting...");
                System.out.println(".......");
                System.out.println("Exited successfully");
                break;
            }
        }
}

public static void choice1(Scanner input, BankQueue1 request, BankStack history, BankLinkedList list, BankQueue bills){
    System.out.println(" ");
    System.out.println("1 - Account opening request");
    System.out.println("2 - Deposit money");
    System.out.println("3 - Withdraw money");
    System.out.println("4 - Exit");
    int bankChoice = input.nextInt();
    input.nextLine();
    if (bankChoice==1){
        System.out.println(" ");
        System.out.println("Username: ");
        String req = input.nextLine();
        request.add(req);
         ;
    }
    else if (bankChoice==2){
        list.deposit(input, history);
        history.peek();
         
    }
    else if (bankChoice==3){
        list.withdraw(input, history);
        history.peek();
         
    }
    else if (bankChoice==4){
        System.out.println(" ");
        System.out.println("Exiting...");
        System.out.println(".......");
        System.out.println("Exited successfully");
         
    }
}

public static void choice2(Scanner input, BankQueue1 request, BankStack history, BankLinkedList list, BankQueue bills){
    System.out.println(" ");
                System.out.println("1 - Balance enquiry");
                System.out.println("2 - Withdraw");
                System.out.println("3 - Exit");
                int bankChoice = input.nextInt();
                input.nextLine();
                if (bankChoice==1){
                    System.out.println(" ");
                    System.out.println("Username: ");
                    String req = input.nextLine();
                    list.find(req);
                     
                }
                else if (bankChoice==2){
                    list.withdraw(input, history);
                    history.peek();
                     
                }
                else if (bankChoice==3){
                    System.out.println(" ");
                    System.out.println("Exiting...");
                    System.out.println(".......");
                    System.out.println("Exited successfully");
                     
                }

}

public static void choice3(Scanner input, BankQueue1 request, BankStack history, BankLinkedList list, BankQueue bills){
    System.out.println(" ");
                System.out.println("1 - Account queues");
                System.out.println("2 - View bill payment queue");
                System.out.println("3 - Exit");
                int bankChoice = input.nextInt();
                input.nextLine();
                if (bankChoice==1){
                    request.display();
                    System.out.println(" ");
                    System.out.println("Would like to process last request? 1-yes 2-no");
                    int adminChoice = input.nextInt();
                    input.nextLine();
                    if (adminChoice==1){
                        request.process(list);
                         
                    }
                    else if (adminChoice==2){
                        System.out.println(" ");
                        System.out.println("Exiting...");
                        System.out.println(".......");
                        System.out.println("Exited successfully");
                         
                    }
                }
                else if (bankChoice==2){
                    bills.display();
                     
                }
                else if (bankChoice==3){
                    System.out.println(" ");
                    System.out.println("Exiting...");
                    System.out.println(".......");
                    System.out.println("Exited successfully");
                     
                }
}


}




class BankAccount {
    int accountNumber;
    String username;
    int balance;
}

class BankLinkedList {
    private MyNode head;
    private MyNode tail;
    private int size;

    private static class MyNode {
        BankAccount data;
        MyNode next;

        MyNode(BankAccount data){
            this.data = data ;
        }
    }

    public void add(BankAccount account){
        MyNode newNode = new MyNode(account);
        if (head == null){
            head = tail = newNode;
            System.out.println("Account added successfully!");
        }
        else {
            tail.next = newNode;
            tail = newNode;
            System.out.println("Account added successfully!");
        }
        size++;
    }

    public void get(){
        MyNode current = head;
        while (current != null) {
            System.out.println(current.data.username + " - Balance: " + current.data.balance);
            current = current.next;
        }

    }

    public void find(String username){
        MyNode current = head;
        while (current != null) {
            if (current.data.username.equals(username)){
                System.out.println(current.data.username + " - Balance: " + current.data.balance);
            }
            current = current.next;
        }
    }

    public void deposit(Scanner input, BankStack history){
        System.out.println("Enter username: ");
        String userName = input.nextLine();
        System.out.println("Deposit: ");
        int userDeposit = input.nextInt();
        input.nextLine();

        MyNode current = head;
        while (current != null) {
            if (current.data.username.equals(userName)){
                current.data.balance = current.data.balance + userDeposit;
                System.out.println(current.data.username + " has new balance: " + current.data.balance);
                history.push("Deposit " + userDeposit + " to " + userName);
            }
            current = current.next;
        }
    }

    public void withdraw(Scanner input, BankStack history){
        System.out.println("Enter username: ");
        String userName = input.nextLine();
        System.out.println("Withdraw: ");
        int userWithdraw = input.nextInt();
        input.nextLine();

        MyNode current = head;
        while (current != null) {
            if (current.data.username.equals(userName)){
                current.data.balance = current.data.balance - userWithdraw;
                System.out.println(current.data.username + " has new balance: " + current.data.balance);
                history.push("Withdraw " + userWithdraw + " from " + userName);
            }
            current = current.next;
        }
    }
}

class BankStack {
    private MyNode top;

    private static class MyNode {
        String data;
        MyNode next;

        MyNode(String data){
            this.data = data;
        }
    }

    public void push(String transaction){
        MyNode newNode = new MyNode(transaction);
        newNode.next = top;
        top = newNode;
    }

    public void pop(){
        if (top==null) System.out.println("Null");

        String value = top.data;
        top = top.next;
        System.out.println("Undo -> "+value);
    }

    public void peek() {
        if (top == null) System.out.println("Null");;
        System.out.println("Last transaction: " + top.data);
    }

    public boolean isEmpty(){
        return top == null;
    }
}

class BankQueue {
    private MyNode front;
    private MyNode rear;

    private static class MyNode {
        String data;
        MyNode next;

        MyNode(String data){
            this.data = data;
        }
    }

    public void addBill(String bill){
        MyNode newNode = new MyNode(bill);

        if (rear == null) {
            front =  rear = newNode;
            System.out.println("Added: "+bill);
        }
        else {
            rear.next = newNode;
            rear = newNode;
            System.out.println("Added: "+bill);
        }
    }

    public void processBill() {
        if (front == null) System.out.println("Null");;

        String bill = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Processing: "+bill);
    }

    public void display() {
        MyNode current = front;
        System.out.println("Remaining: ");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class BankQueue1 {
    private MyNode front;
    private MyNode rear;

    private static class MyNode {
        String data;
        MyNode next;

        MyNode(String data){
            this.data = data;
        }
    }

    public void add(String user){
        MyNode newNode = new MyNode(user);

        if (rear == null) {
            front =  rear = newNode;
            System.out.println("Request added");
        }
        else {
            rear.next = newNode;
            rear = newNode;
            System.out.println("Request added");
        }
    }

    public void process(BankLinkedList list) {
        if (front == null) System.out.println("Null");;

        String user = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        
        BankAccount account = new BankAccount();
        account.username = user;
        list.add(account);
        System.out.println(user+" was added");
    }

    public void display() {
        MyNode current = front;
        System.out.println("Pending requests: ");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
