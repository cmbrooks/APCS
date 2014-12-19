#!/bin/bash

### This file needs to be in the src folder of the Java files ###

echo "script started"

getTime() {
    date +%F" "%r
}

startWatch() {
    startTime=$(date +%T)
    echo "Clock started at: $startTime"
}

getElapsedTime() {
    stopTime=$(date +%T)
    elapsedTime=$($stopTime-$startTime)
    echo $elapsedTime
}

log() {
    NUMOFLOGS=$(ls -l | wc -l)
    LOGFIILE=runlog$NUMOFLOGS.txt
    echo "$FLNM.java" >> $LOGFIILE
    getTime >> $LOGFIILE
    echo "$OUTPUT" >> $LOGFIILE
    echo "Log Complete"
}

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
startTime
echo "###########"
OUTPUT=$(java $FLNM)
echo "$OUTPUT"
echo "###########"
getElapsedTime
echo "Program finished running"
#back to log folder
cd ../..
cd logFiles
log
echo "script finished"
