#!/bin/bash

set -e

echo "Downloading Java 23..."
wget https://download.oracle.com/java/23/latest/jdk-23_linux-x64_bin.deb

echo "Installing Java 23..."
sudo apt install -y ./jdk-23_linux-x64_bin.deb

echo "Registering Java 23..."
sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-23.0.2-oracle-x64/bin/java 1
sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-23.0.2-oracle-x64/bin/javac 1
sudo update-alternatives --set java /usr/lib/jvm/jdk-23.0.2-oracle-x64/bin/java
sudo update-alternatives --set javac /usr/lib/jvm/jdk-23.0.2-oracle-x64/bin/javac

echo "Setting environment variables..."

export JAVA_HOME=/usr/lib/jvm/jdk-23.0.2-oracle-x64
export PATH=$JAVA_HOME/bin:$PATH
echo 'export JAVA_HOME=/usr/lib/jvm/jdk-23.0.2-oracle-x64' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
source ~/.bashrc

export JAVA_HOME=/usr/lib/jvm/jdk-23.0.2-oracle-x64
export PATH=$JAVA_HOME/bin:$PATH

echo "Java installation complete!"
java --version
