These are a collection of scripts that will make programming java from a BASH terminal a lot easier.
These scripts are designed to work with the file structure used by the Eclipse IDE, so compiling and running
code will not mess up how Eclipse looks at your programs and other files.

**How to use the scripts:**
1. Place all scripts in the *project* level of the existing Eclipse file structure.
2. Navigate to the same directory as the scripts using the usual `cd` command
3. Run the scripts using the command `bash [insert filename here].sh`

**What the scripts do**

*comprun.sh*
This script asks for the name of the java program as well as the package it is a part of. It then compiles the .java file into a .class file, and runs the compiled .class version. You will see the output of the program like normal.

*durcheck.sh*
This script is designed to compile a program once, and run it numerous times and ensures that the output is the same each time.
durcheck.sh takes one of three arguments (used as `bash durcheck.sh -n`):
    [-n] *Normal* - Runs the program 10 times (the default number)
    [-s] *Short* - Runs the program 5 times, less than default
    [-e] *Extended* - Runs the program 50 times, more than default
    [-u] *Ultra* - Runs the program 100 times, much more than default
    
*If no argument is given, -n will be used*
