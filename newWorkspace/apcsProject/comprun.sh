#!/bin/bash

### This file needs to be in the src folder of the Java files ###

echo "script started"

#Determine name of the Java file
echo "Please type the name of the file without the file extension:"
FLNM="test"
read FLNM
SRCNAME=$FLNM.java

#Determine name of the package the working file is in, and determine bin and scr folders
echo "Enter the package the file is a part of"
read PCKGDIR
MAINDIR="$PWD"
if [ $PCKGDIR = "default" ]; then
    COMPDIR="$MAINDIR/bin"
    SRCDIR="$MAINDIR/src"
else
    COMPDIR="$MAINDIR/bin/$PCKGDIR"
    SRCDIR="$MAINDIR/src/$PCKGDIR"
fi

#Compile .java file from the src folder into the bin folder and run the .class file
echo "Directory to compile into: $COMPDIR"
cd $SRCDIR
javac -d $COMPDIR $SRCNAME
echo "Compiled Successfuly, running program"
cd $COMPDIR
echo "###########"
OUTPUT=$(java $FLNM)
echo $OUTPUT
##Log Output to custom file
echo "###########"
echo "Program finished running"

echo "script finished"
