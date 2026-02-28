SwingStoreSystem
A Multi-Frame Store Manager built with Java Swing

This project is a simple store management system designed to handle shopping, inventory tracking, and sales logging. It was built as a student activity to demonstrate how to pass data between multiple windows using only fixed-size arrays.

How the App is Structured
The system is divided into three main windows, each with a specific job:

Store Transaction Frame (The Shop): 
This is where the customer picks products like Rice, Sugar, Coffee, or Milk. It calculates the total cost and checks if there is enough stock before finishing the sale.
Transaction Logs Frame (The History): 
This window keeps a running list of every successful sale. It shows the product name, how many were bought, and the final price.
Inventory Frame (The Warehouse): 
This frame lets the manager see how many units are left for each product. It updates automatically every time a checkout happens in the Shop.

The "Array-Only" Logic
Per the project requirements, no ArrayLists or Collections were used.
Data Persistence: All data is stored in a central class using static arrays. This acts as the "shared brain" of the app so that data isn't lost when you switch between windows.
Indexing: We use a manual counter (logIndex) to keep track of how many sales have been made and where to save the next one in the array.

Key Features
Stock Protection: You cannot buy more items than are currently in stock.
Error Alerts: The system uses popup dialogs to warn users about negative quantities or insufficient stock.
Live Updates: Inventory counts drop immediately after a successful checkout.

How to Run it
1. Clone this repository to your machine.
2. Open the project in NetBeans.
3. Run the StoreTransactionFrame.java file.
