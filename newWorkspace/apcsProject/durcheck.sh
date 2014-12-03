#!/bin/bash

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
echo "Compiled Successfuly, checking program for consistancy."
cd $COMPDIR

COUNTER=0
STATUS="Program is inconsistant."
while [  $COUNTER -lt 10 ]; do
    if [ $(java $FLNM) = "true" ]; then
        STATUS="Program is consistant."
    else
        STATUS="Program is inconsistant."
        break
    fi
    let COUNTER=COUNTER+1 
done

echo $STATUS
echo "script finished"