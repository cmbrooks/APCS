#!/bin/bash

echo "script started"

#Determine the number of times the java program is run
if [ $1 = ]; then
    RUNCOUNT=10
elif [ $1 = "-n" ]; then
    RUNCOUNT=10
elif [ $1 = "-e" ]; then
    RUNCOUNT=50
elif [ $1 = "-s" ]; then
    RUNCOUNT=5
elif [ $1 = "-u" ]; then
    RUNCOUNT=100
elif [ $1 = "-c" ]; then
    RUNCOUNT=$2
fi

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
STATUS=" is inconsistant."

EXPECT=$(java $FLNM)
while [  $COUNTER -lt $(($RUNCOUNT-1)) ]; do
    if [ "$(java $FLNM)" = "$EXPECT" ]; then
        STATUS=" is consistant."
    else
        STATUS=" is inconsistant."
        echo "Expected output: $EXPECT"
        break
    fi
    let COUNTER=COUNTER+1 
done

echo "Program was ran $RUNCOUNT times, and $STATUS"
echo "script finished"