# ServiceAppContract

# Management System

This is a simple contract management system written in Java using Swing for the user interface. It allows users to log in, create contracts, and view a main window with various functionalities.

# Features

Login Screen: Allows users to log in as admin or regular users.
Signup Screen: New users can sign up for an account.
Main Window: Provides access to contract creation, reports, maps, pest control, and email functionalities.
Contracts Creation: Enables users to create contracts by entering details like account name, address, contact information, site name, visits per year, and price per quarter.
Save Contracts: Contracts are saved as text files in a folder named "contracts" with each file named after the site name.
How to Use

# Running the Application:

Compile the Java files and run the Login.java file to start the application.
Ensure the required libraries are accessible (e.g., Swing, AWT).
Login:

Use the provided username and password to log in as an admin or a regular user.
can signup details are saved username and password 

# Main Window:

After logging in, 
the main window provides access to different functionalities:

Contract Creation: Click the "Contracts" button to create new contracts.

Reports: Provides reporting functionalities.

Maps: Opens a map view.

Pest Control: Manages pest-related functionalities.

Email: Opens an email window.

# Create Contracts:

Click on the "Contracts" button on the main window to input contract details:
Account Name
Address
Phone Number
Email Address
Site Name
Visits per Year
Price per Quarter
Save Contracts:

After entering the details, click the "Save" button to save the contract as a text file in the "contracts" folder.
Exit:

Use the "Main Window" button on the contract creation window to return to the main window.

# Folder Structure
Login.java: Contains the login screen functionality.

Window.java: Manages the main window and its functionalities.contracts.java: Handles contract creation and saving to files.

Reports.java, Maps.java, Pest.java, Email.java: Corresponding

functionalities for the respective buttons in the main window.

users: Contains user information in a CSV file.

contracts: Contains saved contract information as text files.

# Requirements

Java Development Kit (JDK)
Swing and AWT libraries
Contributors
# James Scott

License
This project is licensed under the James Scott License - see the LICENSE file for details.
