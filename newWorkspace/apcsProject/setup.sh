#! /bin/bash

echo "Please enter the root folder of your project"
read ROOT
cd $ROOT

echo "Please enter your workspace name"
read WORKSPACE
if [ ! -d $WORKSPACE ]; then
	mkdir $WORKSPACE
fi
cd $WORKSPACE

echo "Please enter your project name"
read PROJ
if [ ! -d $PROJ ]; then
	mkdir $PROJ
fi
cd $PROJ

mkdir bin
mkdir src
mkdir logFiles

cd $ROOT/$WORKSPACE
mkdir config.txt
echo $ROOT >> config.txt

