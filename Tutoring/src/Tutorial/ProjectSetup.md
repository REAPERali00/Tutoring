# Eclipse Tutorial for Java Development

## Table of Contents
- [Eclipse Tutorial for Java Development](#eclipse-tutorial-for-java-development)
  - [Table of Contents](#table-of-contents)
  - [Selecting the Workspace](#selecting-the-workspace)
  - [Creating Your Project](#creating-your-project)
  - [Creating Classes](#creating-classes)
  - [Running the Program](#running-the-program)
  - [Debugging](#debugging)
  - [Shortcuts](#shortcuts)

## Selecting the Workspace
- To start setting up a project: Start by selecting your workspace once you start up Eclipse.
- If you wish to change the workspace directory, you can simply select `File -> Workplace -> More Options` and then browse to select the new workspace.
- **NOTE**: The workspace is where your files and projects will be created. This is where you can find and submit your assignments.

## Creating Your Project
- How to set up dark mode: `Windows -> Preference -> General -> Appearance -> Theme: Dark`. Much better!
- Start by selecting `File -> New -> Java Project`.
- Enter the project name, try not to include special characters in the name such as `!`.
- Make sure to UNSELECT the 'create module-info.java file' option.
- Select finish.

## Creating Classes
- Now that the project is created, it's time to create a class. In short, you can imagine a class as a file to write the program in. More details will be provided as time goes on.
- Start by right-clicking on the project name in the Package Explorer (on the right side of the open application).
- Select `New -> Class`.
- Write a name for the class in PascalCase, e.g., `Main`, `ClassName`, `HelloWorld`, etc.
- If the class is where the program should start running (i.e., have a main method), you can select the 'public static void main(String[] args)' option from the menu. This will automatically add the main method to the class.
- Select finish once you are done.

## Running the Program
- The program ALWAYS starts running from the main method and ends on the closing bracket of the main method.
- Try typing `System.out.println("Hello World");` between the brackets of the main method.
- To start the program, select the green play button on the top of the screen, or press `F11` in Eclipse.
- You will be greeted with a prompt asking if you wish to save the changes, press on the 'remember my choice' and click 'Yes'.
- Congrats! You ran your first Java program!

## Debugging
- At times, you will run into problems, and the program doesn't work. We call this a 'Bug'.
- To fix this issue, the debugger is here to help you!
- The debugger helps you run the program step by step from the line you want, while showing you what is happening to the variables on the menu to the right-hand side.
- To use, first double-click on the line of code you want the program to stop at, right before the line number.
- You should see a small dot appear on the sideline. We call this a 'Breakpoint'.
- To start the debugger, run the program from the button next to the run button, which looks like a shining dot.
- The program will stop once it reaches the line where you placed the breakpoint.
- Hint: Sometimes, if the program does not stop at the breakpoint, that is a hint at what might be the problem! Check your method calls and make sure everything is called properly.
- To navigate the code, we have a few options: Step into, Step over, Step return, and Terminate.
  - **Step into**: This option will navigate to the method call, i.e., go to a different file if your code is there.
  - **Step Over**: This will go to the next line, skipping the method's code unlike Step into.
  - **Step return**: Will continue the program normally until it's stopped by another breakpoint.
  - **Terminate**: Stops running the program.
- Once you are done with debugging, you can go back to the normal Java development mode by selecting the Java package icon right next to the small bug on the top right corner of the application.

## Shortcuts
- `Ctrl + Space`: Auto completes your code. Ex: `syso` + `Ctrl + Space` will result in the printing statement being written.
- `Ctrl + I`: Corrects the indentation of your code.
- `Ctrl + Shift + F`: Formats your code, so that others can read your code without feeling mislead.
- `Ctrl + Shift + Numpad /`: Collapses the open methods, makes it easier to navigate the program. You can also do this by right-clicking on the small `-` option next to a method call => `Folding => Collapse All`.
- `Alt + Up/Down Arrow Key`: Moves the line up and down, great if you have misplaced a line of code!
- `Alt + Ctrl + Up/Down Arrow Key`: Copies the line to one line up/down.
- `Ctrlm + +/-`: Zooms in or out.
